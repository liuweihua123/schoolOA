package schooloa.bean;

import schooloa.util.ExcelVOAttribute;

public class ToolsList {
    private Integer id;

    @ExcelVOAttribute(name = "年份", column = "A")
	private String time;
	@ExcelVOAttribute(name = "学期", column = "B")
	private String semester;//学期
	@ExcelVOAttribute(name = "专业", column = "C")
	private String professional;
	@ExcelVOAttribute(name = "教师姓名", column = "D")
	private String teachername;
	@ExcelVOAttribute(name = "蓝圆珠笔", column = "E")
	private String lyzb;
	@ExcelVOAttribute(name = "红圆珠笔", column = "F")
	private String hyzb;
	@ExcelVOAttribute(name = "蓝圆珠笔芯", column = "G")
	private String lyzbx;
	@ExcelVOAttribute(name = "红圆珠笔芯", column = "H")
	private String hyzbx;
	@ExcelVOAttribute(name = "晨光0.5中性笔（黑）", column = "I")
	private String cgfivezxbh;
	@ExcelVOAttribute(name = "晨光0.5中性笔（红）", column = "J")
	private String cgfivezxbhong;
	@ExcelVOAttribute(name = "晨光0.7中性笔", column = "K")
	private String cgsevenzxb;
	@ExcelVOAttribute(name = "晨光1.0中性笔", column = "L")
	private String cgonezxb;
	@ExcelVOAttribute(name = "红蓝铅笔", column = "M")
	private String hlqb;
	@ExcelVOAttribute(name = "铅笔（2B）", column = "N")
	private String twobqb;
	@ExcelVOAttribute(name = "彩色铅笔", column = "O")
	private String csqb;
	@ExcelVOAttribute(name = "白板笔", column = "P")
	private String baibanbi;
	@ExcelVOAttribute(name = "白板笔油", column = "Q")
	private String baibanbiyou;
	@ExcelVOAttribute(name = "晨光0.5中性笔芯（黑）", column = "R")
	private String chengguangwuzhongxingbixinhei;
	@ExcelVOAttribute(name = "晨光0.5中性笔芯（红）", column = "S")
	private String chengguangwuzhongxingbixinhong;
	@ExcelVOAttribute(name = "晨光0.7中性笔芯", column = "T")
	private String chenguangqizhongxingbixin;
	@ExcelVOAttribute(name = "晨光1.0中性笔芯", column = "U")
	private String chenguangyizhongxingbixin;
	@ExcelVOAttribute(name = "油性记号笔", column = "V")
	private String youxingjihaobi;
	@ExcelVOAttribute(name = "大信笺", column = "W")
	private String daxinfa;
	@ExcelVOAttribute(name = "稿纸", column = "X")
	private String gaozhi;
	@ExcelVOAttribute(name = "牛皮纸档案袋", column = "Y")
	private String niupizhidangandai;
	@ExcelVOAttribute(name = "塑料档案袋", column = "Z")
	private String suliaodangandai;
	@ExcelVOAttribute(name = "透明窄胶带", column = "AA")
	private String toumingzhaijiaodai;
	@ExcelVOAttribute(name = "透明宽胶带", column = "AB")
	private String toumingkuangjiaodai;
	@ExcelVOAttribute(name = "双面窄胶带", column = "AC")
	private String shuangmianzhaijiaodai;
	@ExcelVOAttribute(name = "双面宽胶带", column = "AD")
	private String shuangmiankuanjiaodai;
	@ExcelVOAttribute(name = "泡沫双面胶带", column = "AE")
	private String paomoshuangmianjiaodai;
	@ExcelVOAttribute(name = "大红纸", column = "AF")
	private String dahongzhi;
	@ExcelVOAttribute(name = "宣纸", column = "AG")
	private String xuanzhi;
	@ExcelVOAttribute(name = "3.5得力档案盒", column = "AH")
	private String sanwudelidanganhe;
	@ExcelVOAttribute(name = "5.5得力档案盒", column = "AI")
	private String wuwudelidanganhe;
	@ExcelVOAttribute(name = "文件夹", column = "AJ")
	private String wenjianjia;
	@ExcelVOAttribute(name = "A4抽杆夹", column = "AK")
	private String asichouganjia;
	@ExcelVOAttribute(name = "锥子", column = "AL")
	private String zhuizi;
	@ExcelVOAttribute(name = "胶水", column = "AM")
	private String jiaoshui;
	@ExcelVOAttribute(name = "胶棒", column = "AN")
	private String jiaobang;
	@ExcelVOAttribute(name = "橡皮", column = "AO")
	private String xiangpi;
	@ExcelVOAttribute(name = "浆糊", column = "AP")
	private String jianghu;
	@ExcelVOAttribute(name = "墨汁", column = "AQ")
	private String mozhi;
	@ExcelVOAttribute(name = "PU皮黑硬皮本", column = "AR")
	private String pupiheiyingpiben;
	@ExcelVOAttribute(name = "软皮本", column = "AS")
	private String ruanpiben;
	@ExcelVOAttribute(name = "速写本", column = "AT")
	private String suxieben;
	@ExcelVOAttribute(name = "红印泥", column = "AU")
	private String hongyinni;
	@ExcelVOAttribute(name = "转笔刀", column = "AV")
	private String zhuanbidao;
	@ExcelVOAttribute(name = "壁纸刀", column = "AW")
	private String bizhidao;
	@ExcelVOAttribute(name = "剪刀", column = "AX")
	private String jiandao;
	@ExcelVOAttribute(name = "小刀", column = "AY")
	private String xiaodao;
	@ExcelVOAttribute(name = "得力订书机", column = "AZ")
	private String delidingshuji;
	@ExcelVOAttribute(name = "得力订书钉", column = "BA")
	private String delidingshuding;
	@ExcelVOAttribute(name = "计算器", column = "BB")
	private String jisuanqi;
	@ExcelVOAttribute(name = "得力函数计算器", column = "BC")
	private String delihanshujisuanqi;
	@ExcelVOAttribute(name = "口取纸", column = "BD")
	private String kouquzhi;
	@ExcelVOAttribute(name = "塑料长直尺30cm", column = "BE")
	private String suliaochangzhichisanshi;
	@ExcelVOAttribute(name = "塑料长直尺40cm", column = "BF")
	private String suliaochangzhichisishi;
	@ExcelVOAttribute(name = "得力长尾夹（大）", column = "BG")
	private String delichangweijiada;
	@ExcelVOAttribute(name = "得力长尾夹（中）", column = "BH")
	private String delichangweijiazhong;
	@ExcelVOAttribute(name = "得力长尾夹（小）", column = "BI")
	private String delichangweijiaxiao;
	@ExcelVOAttribute(name = "5号南孚电池", column = "BJ")
	private String wuhaonanfudianchi;
	@ExcelVOAttribute(name = "7号南孚电池", column = "BK")
	private String qihaonanfudianchi;
	@ExcelVOAttribute(name = "9V双鹿电池", column = "BL")
	private String jiufushuangludianchi;
	@ExcelVOAttribute(name = "得力回形针", column = "BM")
	private String delihuixingzhen;
	@ExcelVOAttribute(name = "得力起钉器", column = "BN")
	private String deliqidingqi;
	@ExcelVOAttribute(name = "塑料文件架", column = "BO")
	private String suliaowenjianjia;
	@ExcelVOAttribute(name = "塑料笔筒", column = "BP")
	private String suliaobitong;
	@ExcelVOAttribute(name = "木质笔筒", column = "BQ")
	private String muzhibitong;
	@ExcelVOAttribute(name = "1.8米插排", column = "BR")
	private String yidianbamichapai;
	@ExcelVOAttribute(name = "3米插排", column = "BS")
	private String sanmichapai;
	@ExcelVOAttribute(name = "5米插排", column = "BT")
	private String wumichapai;
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester == null ? null : semester.trim();
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername == null ? null : teachername.trim();
    }

    public String getLyzb() {
        return lyzb;
    }

    public void setLyzb(String lyzb) {
        this.lyzb = lyzb == null ? null : lyzb.trim();
    }

    public String getHyzb() {
        return hyzb;
    }

    public void setHyzb(String hyzb) {
        this.hyzb = hyzb == null ? null : hyzb.trim();
    }

    public String getLyzbx() {
        return lyzbx;
    }

    public void setLyzbx(String lyzbx) {
        this.lyzbx = lyzbx == null ? null : lyzbx.trim();
    }

    public String getHyzbx() {
        return hyzbx;
    }

    public void setHyzbx(String hyzbx) {
        this.hyzbx = hyzbx == null ? null : hyzbx.trim();
    }

    public String getCgfivezxbh() {
        return cgfivezxbh;
    }

    public void setCgfivezxbh(String cgfivezxbh) {
        this.cgfivezxbh = cgfivezxbh == null ? null : cgfivezxbh.trim();
    }

    public String getCgfivezxbhong() {
        return cgfivezxbhong;
    }

    public void setCgfivezxbhong(String cgfivezxbhong) {
        this.cgfivezxbhong = cgfivezxbhong == null ? null : cgfivezxbhong.trim();
    }

    public String getCgsevenzxb() {
        return cgsevenzxb;
    }

    public void setCgsevenzxb(String cgsevenzxb) {
        this.cgsevenzxb = cgsevenzxb == null ? null : cgsevenzxb.trim();
    }

    public String getCgonezxb() {
        return cgonezxb;
    }

    public void setCgonezxb(String cgonezxb) {
        this.cgonezxb = cgonezxb == null ? null : cgonezxb.trim();
    }

    public String getHlqb() {
        return hlqb;
    }

    public void setHlqb(String hlqb) {
        this.hlqb = hlqb == null ? null : hlqb.trim();
    }

    public String getTwobqb() {
        return twobqb;
    }

    public void setTwobqb(String twobqb) {
        this.twobqb = twobqb == null ? null : twobqb.trim();
    }

    public String getCsqb() {
        return csqb;
    }

    public void setCsqb(String csqb) {
        this.csqb = csqb == null ? null : csqb.trim();
    }

    public String getBaibanbi() {
        return baibanbi;
    }

    public void setBaibanbi(String baibanbi) {
        this.baibanbi = baibanbi == null ? null : baibanbi.trim();
    }

    public String getBaibanbiyou() {
        return baibanbiyou;
    }

    public void setBaibanbiyou(String baibanbiyou) {
        this.baibanbiyou = baibanbiyou == null ? null : baibanbiyou.trim();
    }

    public String getChengguangwuzhongxingbixinhei() {
        return chengguangwuzhongxingbixinhei;
    }

    public void setChengguangwuzhongxingbixinhei(String chengguangwuzhongxingbixinhei) {
        this.chengguangwuzhongxingbixinhei = chengguangwuzhongxingbixinhei == null ? null : chengguangwuzhongxingbixinhei.trim();
    }

    public String getChengguangwuzhongxingbixinhong() {
        return chengguangwuzhongxingbixinhong;
    }

    public void setChengguangwuzhongxingbixinhong(String chengguangwuzhongxingbixinhong) {
        this.chengguangwuzhongxingbixinhong = chengguangwuzhongxingbixinhong == null ? null : chengguangwuzhongxingbixinhong.trim();
    }

    public String getChenguangqizhongxingbixin() {
        return chenguangqizhongxingbixin;
    }

    public void setChenguangqizhongxingbixin(String chenguangqizhongxingbixin) {
        this.chenguangqizhongxingbixin = chenguangqizhongxingbixin == null ? null : chenguangqizhongxingbixin.trim();
    }

    public String getChenguangyizhongxingbixin() {
        return chenguangyizhongxingbixin;
    }

    public void setChenguangyizhongxingbixin(String chenguangyizhongxingbixin) {
        this.chenguangyizhongxingbixin = chenguangyizhongxingbixin == null ? null : chenguangyizhongxingbixin.trim();
    }

    public String getYouxingjihaobi() {
        return youxingjihaobi;
    }

    public void setYouxingjihaobi(String youxingjihaobi) {
        this.youxingjihaobi = youxingjihaobi == null ? null : youxingjihaobi.trim();
    }

    public String getDaxinfa() {
        return daxinfa;
    }

    public void setDaxinfa(String daxinfa) {
        this.daxinfa = daxinfa == null ? null : daxinfa.trim();
    }

    public String getGaozhi() {
        return gaozhi;
    }

    public void setGaozhi(String gaozhi) {
        this.gaozhi = gaozhi == null ? null : gaozhi.trim();
    }

    public String getNiupizhidangandai() {
        return niupizhidangandai;
    }

    public void setNiupizhidangandai(String niupizhidangandai) {
        this.niupizhidangandai = niupizhidangandai == null ? null : niupizhidangandai.trim();
    }

    public String getSuliaodangandai() {
        return suliaodangandai;
    }

    public void setSuliaodangandai(String suliaodangandai) {
        this.suliaodangandai = suliaodangandai == null ? null : suliaodangandai.trim();
    }

    public String getToumingzhaijiaodai() {
        return toumingzhaijiaodai;
    }

    public void setToumingzhaijiaodai(String toumingzhaijiaodai) {
        this.toumingzhaijiaodai = toumingzhaijiaodai == null ? null : toumingzhaijiaodai.trim();
    }

    public String getToumingkuangjiaodai() {
        return toumingkuangjiaodai;
    }

    public void setToumingkuangjiaodai(String toumingkuangjiaodai) {
        this.toumingkuangjiaodai = toumingkuangjiaodai == null ? null : toumingkuangjiaodai.trim();
    }

    public String getShuangmianzhaijiaodai() {
        return shuangmianzhaijiaodai;
    }

    public void setShuangmianzhaijiaodai(String shuangmianzhaijiaodai) {
        this.shuangmianzhaijiaodai = shuangmianzhaijiaodai == null ? null : shuangmianzhaijiaodai.trim();
    }

    public String getShuangmiankuanjiaodai() {
        return shuangmiankuanjiaodai;
    }

    public void setShuangmiankuanjiaodai(String shuangmiankuanjiaodai) {
        this.shuangmiankuanjiaodai = shuangmiankuanjiaodai == null ? null : shuangmiankuanjiaodai.trim();
    }

    public String getPaomoshuangmianjiaodai() {
        return paomoshuangmianjiaodai;
    }

    public void setPaomoshuangmianjiaodai(String paomoshuangmianjiaodai) {
        this.paomoshuangmianjiaodai = paomoshuangmianjiaodai == null ? null : paomoshuangmianjiaodai.trim();
    }

    public String getDahongzhi() {
        return dahongzhi;
    }

    public void setDahongzhi(String dahongzhi) {
        this.dahongzhi = dahongzhi == null ? null : dahongzhi.trim();
    }

    public String getXuanzhi() {
        return xuanzhi;
    }

    public void setXuanzhi(String xuanzhi) {
        this.xuanzhi = xuanzhi == null ? null : xuanzhi.trim();
    }

    public String getSanwudelidanganhe() {
        return sanwudelidanganhe;
    }

    public void setSanwudelidanganhe(String sanwudelidanganhe) {
        this.sanwudelidanganhe = sanwudelidanganhe == null ? null : sanwudelidanganhe.trim();
    }

    public String getWuwudelidanganhe() {
        return wuwudelidanganhe;
    }

    public void setWuwudelidanganhe(String wuwudelidanganhe) {
        this.wuwudelidanganhe = wuwudelidanganhe == null ? null : wuwudelidanganhe.trim();
    }

    public String getWenjianjia() {
        return wenjianjia;
    }

    public void setWenjianjia(String wenjianjia) {
        this.wenjianjia = wenjianjia == null ? null : wenjianjia.trim();
    }

    public String getAsichouganjia() {
        return asichouganjia;
    }

    public void setAsichouganjia(String asichouganjia) {
        this.asichouganjia = asichouganjia == null ? null : asichouganjia.trim();
    }

    public String getJiaoshui() {
        return jiaoshui;
    }

    public void setJiaoshui(String jiaoshui) {
        this.jiaoshui = jiaoshui == null ? null : jiaoshui.trim();
    }

    public String getJiaobang() {
        return jiaobang;
    }

    public void setJiaobang(String jiaobang) {
        this.jiaobang = jiaobang == null ? null : jiaobang.trim();
    }

    public String getXiangpi() {
        return xiangpi;
    }

    public void setXiangpi(String xiangpi) {
        this.xiangpi = xiangpi == null ? null : xiangpi.trim();
    }

    public String getJianghu() {
        return jianghu;
    }

    public void setJianghu(String jianghu) {
        this.jianghu = jianghu == null ? null : jianghu.trim();
    }

    public String getMozhi() {
        return mozhi;
    }

    public void setMozhi(String mozhi) {
        this.mozhi = mozhi == null ? null : mozhi.trim();
    }

    public String getPupiheiyingpiben() {
        return pupiheiyingpiben;
    }

    public void setPupiheiyingpiben(String pupiheiyingpiben) {
        this.pupiheiyingpiben = pupiheiyingpiben == null ? null : pupiheiyingpiben.trim();
    }

    public String getRuanpiben() {
        return ruanpiben;
    }

    public void setRuanpiben(String ruanpiben) {
        this.ruanpiben = ruanpiben == null ? null : ruanpiben.trim();
    }

    public String getSuxieben() {
        return suxieben;
    }

    public void setSuxieben(String suxieben) {
        this.suxieben = suxieben == null ? null : suxieben.trim();
    }

    public String getHongyinni() {
        return hongyinni;
    }

    public void setHongyinni(String hongyinni) {
        this.hongyinni = hongyinni == null ? null : hongyinni.trim();
    }

    public String getZhuanbidao() {
        return zhuanbidao;
    }

    public void setZhuanbidao(String zhuanbidao) {
        this.zhuanbidao = zhuanbidao == null ? null : zhuanbidao.trim();
    }

    public String getBizhidao() {
        return bizhidao;
    }

    public void setBizhidao(String bizhidao) {
        this.bizhidao = bizhidao == null ? null : bizhidao.trim();
    }

    public String getJiandao() {
        return jiandao;
    }

    public void setJiandao(String jiandao) {
        this.jiandao = jiandao == null ? null : jiandao.trim();
    }

    public String getXiaodao() {
        return xiaodao;
    }

    public void setXiaodao(String xiaodao) {
        this.xiaodao = xiaodao == null ? null : xiaodao.trim();
    }

    public String getDelidingshuji() {
        return delidingshuji;
    }

    public void setDelidingshuji(String delidingshuji) {
        this.delidingshuji = delidingshuji == null ? null : delidingshuji.trim();
    }

    public String getDelidingshuding() {
        return delidingshuding;
    }

    public void setDelidingshuding(String delidingshuding) {
        this.delidingshuding = delidingshuding == null ? null : delidingshuding.trim();
    }

    public String getJisuanqi() {
        return jisuanqi;
    }

    public void setJisuanqi(String jisuanqi) {
        this.jisuanqi = jisuanqi == null ? null : jisuanqi.trim();
    }

    public String getDelihanshujisuanqi() {
        return delihanshujisuanqi;
    }

    public void setDelihanshujisuanqi(String delihanshujisuanqi) {
        this.delihanshujisuanqi = delihanshujisuanqi == null ? null : delihanshujisuanqi.trim();
    }

    public String getKouquzhi() {
        return kouquzhi;
    }

    public void setKouquzhi(String kouquzhi) {
        this.kouquzhi = kouquzhi == null ? null : kouquzhi.trim();
    }

    public String getSuliaochangzhichisanshi() {
        return suliaochangzhichisanshi;
    }

    public void setSuliaochangzhichisanshi(String suliaochangzhichisanshi) {
        this.suliaochangzhichisanshi = suliaochangzhichisanshi == null ? null : suliaochangzhichisanshi.trim();
    }

    public String getSuliaochangzhichisishi() {
        return suliaochangzhichisishi;
    }

    public void setSuliaochangzhichisishi(String suliaochangzhichisishi) {
        this.suliaochangzhichisishi = suliaochangzhichisishi == null ? null : suliaochangzhichisishi.trim();
    }

    public String getDelichangweijiada() {
        return delichangweijiada;
    }

    public void setDelichangweijiada(String delichangweijiada) {
        this.delichangweijiada = delichangweijiada == null ? null : delichangweijiada.trim();
    }

    public String getDelichangweijiazhong() {
        return delichangweijiazhong;
    }

    public void setDelichangweijiazhong(String delichangweijiazhong) {
        this.delichangweijiazhong = delichangweijiazhong == null ? null : delichangweijiazhong.trim();
    }

    public String getDelichangweijiaxiao() {
        return delichangweijiaxiao;
    }

    public void setDelichangweijiaxiao(String delichangweijiaxiao) {
        this.delichangweijiaxiao = delichangweijiaxiao == null ? null : delichangweijiaxiao.trim();
    }

    public String getWuhaonanfudianchi() {
        return wuhaonanfudianchi;
    }

    public void setWuhaonanfudianchi(String wuhaonanfudianchi) {
        this.wuhaonanfudianchi = wuhaonanfudianchi == null ? null : wuhaonanfudianchi.trim();
    }

    public String getQihaonanfudianchi() {
        return qihaonanfudianchi;
    }

    public void setQihaonanfudianchi(String qihaonanfudianchi) {
        this.qihaonanfudianchi = qihaonanfudianchi == null ? null : qihaonanfudianchi.trim();
    }

    public String getJiufushuangludianchi() {
        return jiufushuangludianchi;
    }

    public void setJiufushuangludianchi(String jiufushuangludianchi) {
        this.jiufushuangludianchi = jiufushuangludianchi == null ? null : jiufushuangludianchi.trim();
    }

    public String getDelihuixingzhen() {
        return delihuixingzhen;
    }

    public void setDelihuixingzhen(String delihuixingzhen) {
        this.delihuixingzhen = delihuixingzhen == null ? null : delihuixingzhen.trim();
    }

    public String getDeliqidingqi() {
        return deliqidingqi;
    }

    public void setDeliqidingqi(String deliqidingqi) {
        this.deliqidingqi = deliqidingqi == null ? null : deliqidingqi.trim();
    }

    public String getSuliaowenjianjia() {
        return suliaowenjianjia;
    }

    public void setSuliaowenjianjia(String suliaowenjianjia) {
        this.suliaowenjianjia = suliaowenjianjia == null ? null : suliaowenjianjia.trim();
    }

    public String getSuliaobitong() {
        return suliaobitong;
    }

    public void setSuliaobitong(String suliaobitong) {
        this.suliaobitong = suliaobitong == null ? null : suliaobitong.trim();
    }

    public String getMuzhibitong() {
        return muzhibitong;
    }

    public void setMuzhibitong(String muzhibitong) {
        this.muzhibitong = muzhibitong == null ? null : muzhibitong.trim();
    }

    public String getYidianbamichapai() {
        return yidianbamichapai;
    }

    public void setYidianbamichapai(String yidianbamichapai) {
        this.yidianbamichapai = yidianbamichapai == null ? null : yidianbamichapai.trim();
    }

    public String getSanmichapai() {
        return sanmichapai;
    }

    public void setSanmichapai(String sanmichapai) {
        this.sanmichapai = sanmichapai == null ? null : sanmichapai.trim();
    }

    public String getWumichapai() {
        return wumichapai;
    }

    public void setWumichapai(String wumichapai) {
        this.wumichapai = wumichapai == null ? null : wumichapai.trim();
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional == null ? null : professional.trim();
    }
}