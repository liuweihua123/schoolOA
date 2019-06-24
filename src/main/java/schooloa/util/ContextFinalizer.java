package schooloa.util;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.mysql.jdbc.AbandonedConnectionCleanupThread;
@WebListener
public class ContextFinalizer implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		Enumeration<Driver> drivers = DriverManager.getDrivers();
        Driver d = null;
        while (drivers.hasMoreElements()) {
            try {
                d = drivers.nextElement();
                DriverManager.deregisterDriver(d);
                System.out.println(String.format("ContextFinalizer:Driver %s deregistered", d));
            } catch (SQLException ex) {
                System.out.println(String.format("ContextFinalizer:Error deregistering driver %s", d) + ":" + ex);
            }
        }
        try {
            AbandonedConnectionCleanupThread.shutdown();
        } catch (Exception e) {
            System.out.println("ContextFinalizer:SEVERE problem cleaning up: " + e.getMessage());
            e.printStackTrace();
        }

	}

}
