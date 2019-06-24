package schooloa.util;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FilenameUtils;
import org.springframework.web.multipart.MultipartFile;

public class UpLoadUtil {
	
	public static String saveFile(MultipartFile file, String path) throws IllegalStateException, IOException {
		String name = UUID.randomUUID().toString().replaceAll("-", "");
		// jpg
		String ext = FilenameUtils.getExtension(file.getOriginalFilename());
		File f = new File(path + "upload/");
		if (!f.exists()) {
			f.mkdirs();
		}
		file.transferTo(new File(path + "upload/" + name + "." + ext));

		return "/upload/" + name + "." + ext;
	}
}
