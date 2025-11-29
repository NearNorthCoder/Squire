package c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.p000.p001.p002;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;
import net.unethicalite.plugins.logout.Clues;
/* renamed from: c.r.s.u.e.l.a.o.l.s.l.o.e.v.s.r.l.y.e.c.-.-.-.d  reason: invalid package */
/* loaded from: 7bb63fa7-229b-499f-b77f-e1768cbbcc1e.jar:c/r/s/u/e/l/a/o/l/s/l/o/e/v/s/r/l/y/e/c/-/-/-/d.class */
public class d {
    private static /* synthetic */ String[] lllII;
    private static /* synthetic */ int[] lllll;

    private static void lIIIllll() {
        lllII = new String[lllll[1194]];
        lllII[lllll[0]] = lIIIllII("IBMzDQwBBHYQBh0MOg9FDQwu", "ocVce");
        lllII[lllll[1]] = lIIIllIl("V6FWjSNHUxA=", "Pxppk");
        lllII[lllll[5]] = lIIIllIl("Wi2ZUVcU8W0=", "uTEsR");
        lllII[lllll[6]] = lIIIllII("FCcnIy0yOyY=", "UUCLX");
        lllII[lllll[7]] = lIIIllII("IA8gJB4=", "ljVAl");
        lllII[lllll[8]] = lIIIllII("MgoXBi0UFhY=", "sxsiX");
        lllII[lllll[10]] = lIIIllIl("2ONmTEnW4iAE3G6CLmtZfTcrpJgP4rmm", "TcoPO");
        lllII[lllll[11]] = lIIIllIl("N+V8LC5CgjE=", "PIkTX");
        lllII[lllll[13]] = lIIIllIl("svN8+4h6bLN1FDrctFZGynSWZo7yJRG8", "MEhZa");
        lllII[lllll[14]] = lIIIlllI("gwamUC4jY18=", "lQSBv");
        lllII[lllll[18]] = lIIIllII("IQIAbj4AQxAvJgMaVi04DhcTPQ==", "ocvNJ");
        lllII[lllll[19]] = lIIIllII("Ox0kAAYAESsVRQsKJAYAGw==", "hxEre");
        lllII[lllll[20]] = lIIIllIl("y5vu2yXsxIA=", "JtUHl");
        lllII[lllll[21]] = lIIIllIl("od4ps7gVImg=", "QHzzd");
        lllII[lllll[4]] = lIIIlllI("j5o9on4TM0IF26n/RAnIXGPa37zCOThR", "mQBno");
        lllII[lllll[25]] = lIIIllII("BTECJyI+PQ0yYTUmAiEkJQ==", "VTcUA");
        lllII[lllll[26]] = lIIIlllI("MKkEiMpmr4k=", "LpijA");
        lllII[lllll[30]] = lIIIllII("DRMDVwUsUhYWHyIUHARRLhcUA1EgABQDFA==", "Cruwq");
        lllII[lllll[31]] = lIIIllII("CSAsMAgyLCMlSzk3LDYOKQ==", "ZEMBk");
        lllII[lllll[32]] = lIIIlllI("qDbiJ3xiMYg=", "wvnMn");
        lllII[lllll[36]] = lIIIlllI("5AMArqImw88TmfazFlSzA1E7BSgeTg/4", "KjwvD");
        lllII[lllll[37]] = lIIIlllI("4nKymEjSkT9Bn6mGSz6IzRWvZ0/evOJU", "EtKmM");
        lllII[lllll[38]] = lIIIllII("Jx0rISwc", "txJSO");
        lllII[lllll[42]] = lIIIllIl("xEnzn89eJDISujpRexAf739VKTqgT5cUHseMWWVs0+A=", "EPWbp");
        lllII[lllll[43]] = lIIIllII("ISsvKDMaJyA9cBE8Ly41AQ==", "rNNZP");
        lllII[lllll[45]] = lIIIllII("ASAlMDo6", "REDBY");
        lllII[lllll[49]] = lIIIllIl("8eOmsyiaRZRrbC3pde4cR58AWwhndMjibVYj/dARyidHietquakmAg==", "kvzZM");
        lllII[lllll[50]] = lIIIllIl("S0gF0IfwBVHwQ3RqrGnrM57lW2aOG6rX", "pzdJA");
        lllII[lllll[51]] = lIIIllII("IiQoNzMS", "aVICV");
        lllII[lllll[52]] = lIIIllII("CgIwBzsx", "YgQuX");
        lllII[lllll[56]] = lIIIllII("BRIkbRokUzosGCIYIW0NORImKB0=", "KsRMn");
        lllII[lllll[57]] = lIIIllIl("Aa6X0591GldHLO4afDPOjUBV9VEj61og", "ezRrj");
        lllII[lllll[59]] = lIIIllII("IB8kPjEb", "szELR");
        lllII[lllll[63]] = lIIIlllI("fKqbTiZ0PS3jVyXb9Azol5QdXpdEAGAzdxRoIE22+oY=", "XTChQ");
        lllII[lllll[64]] = lIIIllII("FxI3ERAsHjgEUycFNxcWNw==", "DwVcs");
        lllII[lllll[65]] = lIIIlllI("rgy/+aCEi/M=", "XLRDe");
        lllII[lllll[66]] = lIIIllIl("i5a3VkWNCFQ=", "oQvjb");
        lllII[lllll[70]] = lIIIlllI("kSMyeqHwp+cWbeoV/pn5qJqWSlTNQo3YDo2YF0jfBT8=", "YVJqg");
        lllII[lllll[71]] = lIIIllIl("KgHEqrx4rXwS2JpSIHhYMiamgy2iOIaX", "dZrME");
        lllII[lllll[72]] = lIIIlllI("6qYl+6Fu54yYxdhbkKORZg==", "fkaPe");
        lllII[lllll[73]] = lIIIllII("IDUEJw4b", "sPeUm");
        lllII[lllll[77]] = lIIIllIl("ZCjV9gkAcO2jPG72OSiVu/ml8vTQbmr6bw4YhLjlNF4=", "Qezci");
        lllII[lllll[78]] = lIIIllIl("hrJxlPlVG97LYXOQy9hGIikU7z6TYgGn", "MqBGy");
        lllII[lllll[80]] = lIIIllIl("+lZr44k21wY=", "kwKJg");
        lllII[lllll[84]] = lIIIlllI("L+bQLeuTGA5mZ5YJXHvl/oZhtm3wQ0sRnYiPJ4nu5Ft4sfF+C4c2LA==", "Zyzsj");
        lllII[lllll[85]] = lIIIllIl("IAo2En2Go21aP6suyzgRxKeiAWq79cxW", "eUgoG");
        lllII[lllll[86]] = lIIIllII("LTc0Hz8=", "nEUkZ");
        lllII[lllll[87]] = lIIIllIl("VeoGKyo5Seo=", "KwBoT");
        lllII[lllll[91]] = lIIIllIl("HnDKy4lisYwHx9+OynRj3kBZ4r1MAVk+ZpfH7LRpPrk=", "ADbIR");
        lllII[lllll[92]] = lIIIllII("PQ4ZPBQGAhYpVw0ZGToSHQ==", "nkxNw");
        lllII[lllll[93]] = lIIIlllI("KKjoMSli6DI=", "ZlUcr");
        lllII[lllll[97]] = lIIIlllI("KDDxaWI/sVWOOl8YYTmnwNMRyRYiz7mGJMjKopP9OLI3PkIUWfxSCw==", "CPjvo");
        lllII[lllll[98]] = lIIIllII("Jy8bICQcIxQ1Zxc4GyYiBw==", "tJzRG");
        lllII[lllll[99]] = lIIIllII("KBYVAA4=", "kdttk");
        lllII[lllll[100]] = lIIIllII("OCEYFRQD", "kDygw");
        lllII[lllll[104]] = lIIIllII("LSQQaScMZQQoIQFlECA/DyQBLHMANwc9NhA=", "cEfIS");
        lllII[lllll[105]] = lIIIllIl("3+ggq/gYCxsUARXIYcYBlfJkpObWy9cc", "RDjKU");
        lllII[lllll[106]] = lIIIlllI("x8tDtg72ABc=", "tIZIt");
        lllII[lllll[107]] = lIIIllIl("YUzQz5ZhHKM=", "LtfdT");
        lllII[lllll[109]] = lIIIlllI("o1lcBfXKFjT9vdaeha7un1glZe9Za+Bs", "wunKJ");
        lllII[lllll[110]] = lIIIllIl("N50y8U3STdkRuapoBygezCqv/VdvaobE", "IYmCT");
        lllII[lllll[111]] = lIIIllIl("CdVB5YF3CTA=", "xfqOU");
        lllII[lllll[112]] = lIIIllIl("u5dmHYkmd14=", "qFxLD");
        lllII[lllll[116]] = lIIIllII("NxswbDIWWiQ5NA0SNCM2HFooO2YaGys8ZhsVPik1", "yzFLF");
        lllII[lllll[117]] = lIIIllII("MjYMCyQJOgMeZwM8FRw0", "aSmyG");
        lllII[lllll[118]] = lIIIllII("ERg3LT0=", "SwOHN");
        lllII[lllll[119]] = lIIIllIl("Rl5FNCQEcYQ=", "LeJyQ");
        lllII[lllll[123]] = lIIIllII("OgQlWhIbRTQVBBgMPVoOGxAgH0YWCisfFQ==", "teSzf");
        lllII[lllll[124]] = lIIIllIl("W5jJxWH4os9Dv5099NGunQ==", "PweMU");
        lllII[lllll[125]] = lIIIllIl("1xBVV3zNJTc=", "AHZqx");
        lllII[lllll[126]] = lIIIllII("HDEWJwsn", "OTwUh");
        lllII[lllll[130]] = lIIIllIl("5vq5tlw77TRJgXSVbrDBf+tgG0WS7/5Sv7DMkLotiZM=", "XSDtL");
        lllII[lllll[131]] = lIIIllII("EBQuIwArGCE2QyEeNzQQ", "CqOQc");
        lllII[lllll[132]] = lIIIllIl("m7Q+3A2dVak=", "tIzIv");
        lllII[lllll[133]] = lIIIllII("HBULKhMn", "OpjXp");
        lllII[lllll[137]] = lIIIllII("BgMfWDknQgoKNDsWCBRtKwoMCzloAAYAKDs=", "HbixM");
        lllII[lllll[138]] = lIIIllIl("gPG9njSXZDVswx1PMNXrFQ==", "adHjC");
        lllII[lllll[139]] = lIIIlllI("Zxs/8gjATTQ=", "wDUDE");
        lllII[lllll[140]] = lIIIllII("KQAMIQsS", "zemSh");
        lllII[lllll[144]] = lIIIllIl("x25RNrGla6m78gGyksTwSt26Bd661ADI", "DBuBG");
        lllII[lllll[145]] = lIIIlllI("dEDaN1QXrxn8SKlLZ6t10Q==", "kDCOG");
        lllII[lllll[146]] = lIIIlllI("7tlDajm9uzo=", "cuvCo");
        lllII[lllll[147]] = lIIIllII("OgErIhMB", "idJPp");
        lllII[lllll[151]] = lIIIllIl("nOaqRbJxxDAAGB7RnpITyoLX1h10ojFG8JhHEfG8avGSfb40UXnDTg==", "JJuye");
        lllII[lllll[152]] = lIIIllII("JyYsJBAcKiMxUxcxLCIW", "tCMVs");
        lllII[lllll[153]] = lIIIllII("MDgwEyA=", "sJQgE");
        lllII[lllll[154]] = lIIIllIl("gNTJ5j4l2p4=", "LzeAT");
        lllII[lllll[158]] = lIIIllIl("ZZAYzWCOY8SGvv6mUP97gVE9VpM/0km1I/NwxhP8t6U=", "JELZg");
        lllII[lllll[159]] = lIIIllII("CiQQCyExKB8eYjozEA0nKg==", "YAqyB");
        lllII[lllll[160]] = lIIIllIl("vSAIQEO5FZw=", "RRgZm");
        lllII[lllll[163]] = lIIIllIl("xyOJobNAMMIAusKT/Gt4moV0qocul0h7UnC5ZuDVrD8=", "kHMMK");
        lllII[lllll[164]] = lIIIllII("FTEQCwouPR8eSSUmEA0MNQ==", "FTqyi");
        lllII[lllll[165]] = lIIIllII("DTYTBCg=", "NDrpM");
        lllII[lllll[166]] = lIIIlllI("t1/hYrD8QoI=", "onmtR");
        lllII[lllll[169]] = lIIIllIl("tn/IpTl9exJPoNprdGjRHwIvyClTbLhM1DxfCExl244=", "fmtkR");
        lllII[lllll[170]] = lIIIllIl("43QHgoOagllhRyxSPn3bbw==", "SwHdZ");
        lllII[lllll[171]] = lIIIllIl("qGccFMj5qRU=", "RgixE");
        lllII[lllll[172]] = lIIIllIl("TDANQebvmfA=", "SoZcy");
        lllII[lllll[176]] = lIIIlllI("ENSlz5a1rIYUsqoiUGHqhiZ5uMuer29PzgXIzO11/dQ=", "fkwMk");
        lllII[lllll[177]] = lIIIllIl("ffO6mF4l7uWMOFCVJuGuOw==", "iUgwq");
        lllII[lllll[179]] = lIIIllII("ARwLMyA6", "RyjAC");
        lllII[lllll[183]] = lIIIllIl("Rwi7llSzTB3ztOij9YgGu4NmW86I6XzqIudG3RieM14=", "KaRos");
        lllII[lllll[184]] = lIIIllIl("XNMIi8cRfvw6oqjUo8P9aw==", "EbJEj");
        lllII[lllll[186]] = lIIIllII("CzMrCAkw", "XVJzj");
        lllII[lllll[190]] = lIIIlllI("+Pbma4CJryhVGzX2XTCgvf89Pcznja4CaPXvSSJmdXvMCYJGEnwMyg==", "SmGVx");
        lllII[lllll[194]] = lIIIlllI("nr6697Qn0n4=", "WGzGJ");
        lllII[lllll[199]] = lIIIllII("Bh8wGRc9Ez8MVDcVKQ4H", "UzQkt");
        lllII[lllll[200]] = lIIIlllI("J3BMJGt5+qk=", "TXEuX");
        lllII[lllll[204]] = lIIIlllI("wGEXgQ1UmbwSprFGeVZOzSgnMygjFy2fwzXY2LINznA9sxm230a2jA==", "DcKcS");
        lllII[lllll[205]] = lIIIllIl("8XePriHqetd8GzN1pHAFNg==", "pddHV");
        lllII[lllll[206]] = lIIIllII("JgoqPw==", "izOQZ");
        lllII[lllll[207]] = lIIIllII("BBMrCg==", "KcNdX");
        lllII[lllll[211]] = lIIIlllI("gsp36Rj3DY50FL/aoEKNdxI0eDf+1TLvy07brpHAdZm77/Pn+AByng==", "XVkHb");
        lllII[lllll[214]] = lIIIlllI("fRp4rPITW3w=", "RtbzL");
        lllII[lllll[215]] = lIIIllII("JywDKwwcIAw+TxchByob", "tIbYo");
        lllII[lllll[216]] = lIIIlllI("QvJRb5BvB/w=", "tkxGb");
        lllII[lllll[217]] = lIIIllII("LTUJBA==", "bEljz");
        lllII[lllll[221]] = lIIIlllI("+UQp1PeByzU05JLvrkEkqXlVnQvArRBhHo3v6Q2atC0=", "JRoRi");
        lllII[lllll[222]] = lIIIlllI("FUy9uEhMU46YyMV02X45YQ==", "GIOZH");
        lllII[lllll[223]] = lIIIllII("BSUzHQ==", "JUVsf");
        lllII[lllll[224]] = lIIIlllI("ngEgAGqRqBw=", "HAfwL");
        lllII[lllll[225]] = lIIIllIl("QCtg/9t3YPM=", "TphCH");
        lllII[lllll[226]] = lIIIlllI("wcK3tID7Tx4=", "DuzkQ");
        lllII[lllll[230]] = lIIIlllI("4U/DA26p3A3TkXLYEq/5w1d+1Oz4ty8u6K+lfjDYBIQ=", "xiZlc");
        lllII[lllll[231]] = lIIIllIl("coF8ieUS/BERvk6OF9IulQ==", "AZQfg");
        lllII[lllll[232]] = lIIIllIl("QAG/8lQrAIo=", "dkoAG");
        lllII[lllll[233]] = lIIIlllI("lN4ZZmdJd8E=", "hUaVc");
        lllII[lllll[237]] = lIIIllIl("PAJkezqUCpbYxDbIXfYMpmKIRCw9pq/GEHgbnqC87s8=", "kSadm");
        lllII[lllll[238]] = lIIIllII("Py4KJzYEIgUydRsqGTEnAykO", "lKkUU");
        lllII[lllll[239]] = lIIIlllI("jvN+tQbfYD4=", "pAZvA");
        lllII[lllll[240]] = lIIIlllI("vVOGc/zYxJw=", "nkthc");
        lllII[lllll[244]] = lIIIlllI("ZsAsXTKnsJYrARTGjXBsD25lEDCLXseM", "vttCv");
        lllII[lllll[245]] = lIIIllIl("av63MG89y5pTkMPp8TRZs9CDcgUAUd39", "bPghV");
        lllII[lllll[246]] = lIIIllIl("7PDeV+HhBIw=", "zzDKo");
        lllII[lllll[247]] = lIIIllII("AjoWJg==", "MJsHl");
        lllII[lllll[250]] = lIIIlllI("G5Kbhk6VIxiXCPrtA6a4XtSS6227FtIHsnF57hQenY4=", "jqKIB");
        lllII[lllll[251]] = lIIIllIl("LpH0ow6tWzr78v5R/zVtOQ==", "VideV");
        lllII[lllll[252]] = lIIIllIl("5njLEfUJMbY=", "WcSsc");
        lllII[lllll[253]] = lIIIllII("CB4ACg==", "GnedS");
        lllII[lllll[256]] = lIIIllIl("8fSXzhGlm29Y5ajTyhVPuqZbz2RpEkLpYdAfrls1OwJrHn89IhxcxA==", "LnNdV");
        lllII[lllll[257]] = lIIIlllI("2SeLfr6x2qFaDEAmckTe4g==", "qdHxg");
        lllII[lllll[258]] = lIIIlllI("xQx2FdqAuhY=", "zRRCb");
        lllII[lllll[259]] = lIIIllIl("Ky3Dr3y+u5Q=", "MTYjc");
        lllII[lllll[263]] = lIIIllII("DDIjYxAtczk2CSAqdXIXNnMzLwstIXUnESk2dSAMJyAh", "BSUCd");
        lllII[lllll[264]] = lIIIllIl("K88/YD2SoD+76IvLZXKr0A==", "VQERn");
        lllII[lllll[265]] = lIIIllIl("+86ldQ7mIaA=", "GmaRd");
        lllII[lllll[266]] = lIIIlllI("u+dSHnV9IhI=", "ueFeV");
        lllII[lllll[270]] = lIIIllII("ICw3ST0BbScbLAo+YQohCz41", "nMAiI");
        lllII[lllll[271]] = lIIIlllI("sOX488jSgeyBeVdMlM5vxg==", "KxMnB");
        lllII[lllll[272]] = lIIIllIl("Hgq/C4s0n9A=", "HophM");
        lllII[lllll[273]] = lIIIlllI("Z+gUiEGJa/A=", "JPdoz");
        lllII[lllll[274]] = lIIIllII("ED0EEQcr", "CXecd");
        lllII[lllll[275]] = lIIIllIl("y0I7I6IQH9U=", "CaCqt");
        lllII[lllll[279]] = lIIIllIl("CUIAv7TpmmWkXPz/2hsK4STee2m8wrDJPdFa4mQCc7Y=", "SWnRj");
        lllII[lllll[280]] = lIIIlllI("bwiD1NMNZ/6JUTlw/cLQpCVwgTY1SjX/", "GwoTh");
        lllII[lllll[282]] = lIIIlllI("DcoYNRwrJgU=", "XAlgy");
        lllII[lllll[286]] = lIIIllII("JzYxUAcGdzMRBQwlKwlTGjomHB9JNDURBww=", "iWGps");
        lllII[lllll[287]] = lIIIlllI("FdcOrESQUut3RRiIM11f5x9DAUzIR1Vg", "HtATI");
        lllII[lllll[288]] = lIIIllII("FgQPGAwt", "Eanjo");
        lllII[lllll[292]] = lIIIlllI("HChC2+zQVS6WFjj2aJyJkCkg4PhbM0UjZSIC24SFhAw=", "lBWTQ");
        lllII[lllll[293]] = lIIIllIl("0g/MTDFMOP7uIkMqGaZMzAFBZmUc2+xD", "qwhfu");
        lllII[lllll[295]] = lIIIlllI("fE7RwBQNpVs=", "SmdQv");
        lllII[lllll[299]] = lIIIllIl("7JNGhh30GJ1aNE/2j8Ixce57kwSkkgmwohpvohL7foA=", "SRSFT");
        lllII[lllll[300]] = lIIIllIl("Gc71DgYFI3upr6+HP0qlr7rxcPMiNQQN", "vdrQp");
        lllII[lllll[302]] = lIIIllII("Kzw5OQUQ", "xYXKf");
        lllII[lllll[306]] = lIIIllIl("PEPEHyNLeUHFcw6ZYuJxv3xQP2J6ok1c3UB7EcMRITI=", "CVgxB");
        lllII[lllll[307]] = lIIIllIl("Xx2/HAuEkrOsdGSkTXHwTxr6LRpbwKiI", "jgIaV");
        lllII[lllll[308]] = lIIIllIl("lZt/LtTv6SM=", "iiRrd");
        lllII[lllll[311]] = lIIIllII("JxcFaiAGVgUrJhsZECF0ChcAPjgMVhgjIAoeFiQ=", "ivsJT");
        lllII[lllll[312]] = lIIIlllI("r/a4Ouu9m8o2Tk8wdL/5bA==", "FWAwe");
        lllII[lllll[314]] = lIIIllII("JyQXNgQc", "tAvDg");
        lllII[lllll[318]] = lIIIlllI("AXo8H1UmLjwfPZ3jaZOOvgEfz6F+560qjV8agsj1YFk=", "wnRJV");
        lllII[lllll[319]] = lIIIllII("GS0APxUiIQ8qVik6ADkT", "JHaMv");
        lllII[lllll[321]] = lIIIllII("PTQUHyYG", "nQumE");
        lllII[lllll[325]] = lIIIlllI("GPo+Dqgukp56HO2qOPqQzaP4BnL5rq6ZixuRZHI/sem4jETn4aAiiQ==", "tBtPn");
        lllII[lllll[326]] = lIIIllIl("Wgsz+Jly91RGlLBX94EQHg==", "BiWry");
        lllII[lllll[327]] = lIIIllII("CxYoHA8=", "HdIhj");
        lllII[lllll[328]] = lIIIllIl("USh+rtEAhTQ=", "wnmDu");
        lllII[lllll[332]] = lIIIlllI("58I1yTohnpBdb8TBaqr/yZJ67bKo7erTvPFnLOTT8CA=", "kyxtc");
        lllII[lllll[333]] = lIIIlllI("hXrs+YHZkqjIxxnX+VOn8w==", "Llufy");
        lllII[lllll[335]] = lIIIllIl("HFf1OgbBwxg=", "QYviJ");
        lllII[lllll[339]] = lIIIllIl("ZKn4D6bXy9DGSVqjNDnJO7d01V21WKezhVyijIHNOnw=", "huPgp");
        lllII[lllll[340]] = lIIIlllI("/oVdq9EaS0ktNof4SlS3+Q==", "suXkw");
        lllII[lllll[341]] = lIIIllIl("dbKJH/k0G3E=", "pvrVt");
        lllII[lllll[342]] = lIIIllIl("tQq5npDgQZ0=", "eXSSN");
        lllII[lllll[343]] = lIIIllIl("G8Fm1Fqr/w0=", "KeHZu");
        lllII[lllll[347]] = lIIIllII("Ky49YRAKbyYuCgQ8PyQWHG8pLgsOLCoyAQ==", "eOKAd");
        lllII[lllll[348]] = lIIIllIl("JkPVUIC4oYmyYklC86Sdem4Pihf+FX4M", "vYObO");
        lllII[lllll[349]] = lIIIllIl("UsWHQ79pn3/aRAJfncjwhA==", "LibnL");
        lllII[lllll[350]] = lIIIllIl("Ghl0aYVJHAo=", "LqCSd");
        lllII[lllll[353]] = lIIIlllI("wcRswJ5uqk40PQbP5cttI7zlbqNgndPX9NWihRc09rE=", "oMoNy");
        lllII[lllll[354]] = lIIIlllI("hHapU1wcqEpI4OGopgKSVtSh1wI3pl/9", "dhHXU");
        lllII[lllll[355]] = lIIIllIl("Vn6rZdVHEFe94+H0t94b1g==", "JFJWm");
        lllII[lllll[356]] = lIIIllII("PxM2JxoE", "lvWUy");
        lllII[lllll[360]] = lIIIllIl("J9CooFGQJ84ZRobd+ZakeIjafqTAh3lyCVpilvEXL2g=", "QKtYf");
        lllII[lllll[361]] = lIIIllII("ISQIIQYaKAc0RRAuBjgGEzIM", "rAiSe");
        lllII[lllll[362]] = lIIIlllI("OzEDhOwUl2Q=", "bSeAi");
        lllII[lllll[365]] = lIIIllII("HwkVYgY+SAUjBjkNEWIHIwANJwtxBBYvEChIEDUTPBhDIB0+AwAjATQ=", "QhcBr");
        lllII[lllll[366]] = lIIIllII("AyA7ODc4LDQtdDIqNSE3MTY/", "PEZJT");
        lllII[lllll[367]] = lIIIllII("FRYaDhQ2ChA=", "Wyuew");
        lllII[lllll[368]] = lIIIllII("GT8uERAi", "JZOcs");
        lllII[lllll[372]] = lIIIllIl("Le2gy5Yu7vRvbV2AbPOOgV7zV2cGLbI1", "blKtt");
        lllII[lllll[373]] = lIIIllIl("HmJzYaeywH1iTJruLraa5LQeP/0+1mMw", "QwMYv");
        lllII[lllll[374]] = lIIIlllI("S009ara18JQ=", "ZoovR");
        lllII[lllll[375]] = lIIIllIl("N6B+LrVRj6Q=", "BuLdr");
        lllII[lllll[376]] = lIIIllIl("jcu/dEq3Cdg=", "UeCkv");
        lllII[lllll[377]] = lIIIlllI("pT9dKzzTfqY=", "BpEDR");
        lllII[lllll[378]] = lIIIlllI("JA/PImBprBc=", "yGMDS");
        lllII[lllll[379]] = lIIIlllI("z4hEcGFxlWc=", "QMsoY");
        lllII[lllll[382]] = lIIIllIl("e+vYWeYSMN67eYp31x3EwnXW4/yW9TfbGvqI7H73nv8=", "lRKxZ");
        lllII[lllll[383]] = lIIIlllI("dLJZjX3E1ge4TntlRfGMDH7XdiB7g/ey", "kmxlq");
        lllII[lllll[384]] = lIIIlllI("cF4muDT/AYY=", "rAcEz");
        lllII[lllll[385]] = lIIIlllI("A+c4lCUiFeQ=", "rBokA");
        lllII[lllll[386]] = lIIIllIl("cLkQ+JysbOg=", "koCZm");
        lllII[lllll[387]] = lIIIllII("FysFNRcs", "DNdGt");
        lllII[lllll[388]] = lIIIlllI("1vvefh/vols=", "GaZGE");
        lllII[lllll[392]] = lIIIlllI("1vjB+H/J/TcbYu0J/aukPj1UQxxZjriihsx5P7DAXg8=", "tuzml");
        lllII[lllll[393]] = lIIIllII("OSgKEwoCJAUGSQ4/ChYMGD4=", "jMkai");
        lllII[lllll[394]] = lIIIllIl("oVdOYNH+9Mk=", "VTXnI");
        lllII[lllll[395]] = lIIIllIl("nzajEevtCOk=", "mGXFv");
        lllII[lllll[396]] = lIIIllII("Fz4GJg==", "XNcHR");
        lllII[lllll[397]] = lIIIlllI("WIIOanegamA=", "FoOAb");
        lllII[lllll[398]] = lIIIllII("BDUqMAs/", "WPKBh");
        lllII[lllll[402]] = lIIIlllI("Sh6+nVl56tOwAboQ+X1aswefV5GzpB3O1W/hHiS0kXo=", "Bhdlm");
        lllII[lllll[403]] = lIIIllIl("BNW1tDABQkQOthwuCI503MycS+N0GkvJ", "NurED");
        lllII[lllll[404]] = lIIIlllI("9aagHy4I8hw=", "mAidG");
        lllII[lllll[405]] = lIIIlllI("f9KU6sWnAIU=", "CtnyP");
        lllII[lllll[406]] = lIIIllIl("QBUYFIW4gHs=", "CTHRA");
        lllII[lllll[407]] = lIIIllII("NwsPAwcM", "dnnqd");
        lllII[lllll[408]] = lIIIllIl("Eh+tHnoCV4Y=", "pvftG");
        lllII[lllll[412]] = lIIIllII("DQUZeR8sRAsrCjoKACtLLQsdLQNjAB04HCYWHA==", "CdoYk");
        lllII[lllll[413]] = lIIIllIl("pI7AX9tIMAksPi6L/bpXp6zF5MVM97lB", "lRBou");
        lllII[lllll[414]] = lIIIllII("BDEwOw==", "KAUUY");
        lllII[lllll[415]] = lIIIlllI("TNakNIETXxc=", "wbcUu");
        lllII[lllll[416]] = lIIIllII("CjojAw==", "EJFmX");
        lllII[lllll[417]] = lIIIllII("GDI3Cw==", "WBReY");
        lllII[lllll[418]] = lIIIlllI("JS0NL8+4u2M=", "NLuHc");
        lllII[lllll[419]] = lIIIlllI("oC4WderBiyg=", "opqUo");
        lllII[lllll[422]] = lIIIllII("PRMOZTgcUhogOAcLWCgtFBdYNiQcAlghPhIFHTc/", "srxEL");
        lllII[lllll[423]] = lIIIllII("OCgKKykDJAU+ag8/Ci4vGT4=", "kMkYJ");
        lllII[lllll[424]] = lIIIllIl("RR8WX0FAXLY=", "IoRgL");
        lllII[lllll[425]] = lIIIllIl("rBhaqUdjG7s=", "DFTLb");
        lllII[lllll[426]] = lIIIllII("OwMjJg==", "tsFHZ");
        lllII[lllll[427]] = lIIIlllI("XMBBnZXynl0=", "GoJqo");
        lllII[lllll[428]] = lIIIlllI("MPP5UnWwu54=", "MsVUR");
        lllII[lllll[432]] = lIIIllII("JBQXQSIFVQcAOgYMQRI5HwEJQT4FABIEdg4HABYzGAY=", "juaaV");
        lllII[lllll[433]] = lIIIlllI("K9XLuIqDwhvHOOFnuDujSq+OsUmTWcVa", "yauSP");
        lllII[lllll[434]] = lIIIlllI("NbZbOk/ZJsU=", "VFXJE");
        lllII[lllll[435]] = lIIIlllI("gqLXgV7YEAw=", "Sxaoe");
        lllII[lllll[436]] = lIIIlllI("ZbA6M0od0hc=", "eEiJd");
        lllII[lllll[437]] = lIIIllII("Hy8JMBYk", "LJhBu");
        lllII[lllll[440]] = lIIIllIl("u7eGyKVHaLlaqxqXi8VvqBLhPp+BR8VzyYYRfy7Svfj1MOlw77Psaw==", "bOeqp");
        lllII[lllll[441]] = lIIIllIl("uQsMafVoNP6ySy09afWxan1NH0TgCHRl", "mDeLu");
        lllII[lllll[442]] = lIIIllII("DRAwHi87EQ==", "IbQiJ");
        lllII[lllll[443]] = lIIIllII("FjsDJw==", "YKfIT");
        lllII[lllll[444]] = lIIIllII("CzcnJA==", "DGBJM");
        lllII[lllll[445]] = lIIIlllI("aToY9w5sVSY=", "aOEbX");
        lllII[lllll[446]] = lIIIlllI("KaXhk/gRZvw=", "NzxZH");
        lllII[lllll[448]] = lIIIlllI("Aul5ehsn36GBZ+Iui/76QrLpbRyyuHV5oJVovr53HToYZf7l+x9NIw==", "jkXTv");
        lllII[lllll[449]] = lIIIllIl("2yuVbYAUMpMAHQHoBimeSU+sIiR1hcRA", "sNeNN");
        lllII[lllll[450]] = lIIIlllI("dKYJu1cXaVU=", "ixFht");
        lllII[lllll[451]] = lIIIlllI("q7jNzmSuBqU=", "MxAef");
        lllII[lllll[452]] = lIIIlllI("DXEkZRrcPX8=", "XsYGw");
        lllII[lllll[453]] = lIIIlllI("/IIocOkizY4=", "NeeBF");
        lllII[lllll[454]] = lIIIllIl("x7mGVJqnZx4=", "SrFZb");
        lllII[lllll[458]] = lIIIlllI("3O9U3IQPoqnXXACscsw+I8BCmw0JZHSnMa9NRkD5ESM=", "xdgHg");
        lllII[lllll[459]] = lIIIlllI("u45Pwbj1mdjgasS1uwSPfMoLQQOX1sV5", "RwlYI");
        lllII[lllll[460]] = lIIIllIl("XiwpYIVhvEs=", "Qipbt");
        lllII[lllll[461]] = lIIIllIl("JOj5Gu5i9pQ=", "jQXev");
        lllII[lllll[462]] = lIIIllII("LRsDPA==", "bkfRE");
        lllII[lllll[463]] = lIIIllII("JiAkAyYd", "uEEqE");
        lllII[lllll[464]] = lIIIllII("PQElHggG", "ndDlk");
        lllII[lllll[468]] = lIIIllIl("jP0L7v0MxyqPYLD9iQAbWEA7135TCbWf7vhdspfG2mpscjRLPrer5g==", "DSWKj");
        lllII[lllll[469]] = lIIIlllI("ZG2Lf/TklUPr7DUk1ibNfpicOEBIREWU", "JtECr");
        lllII[lllll[470]] = lIIIllII("KwMpDyEdAg==", "oqHxD");
        lllII[lllll[471]] = lIIIlllI("kKVCHQgWkP8=", "BZucZ");
        lllII[lllll[472]] = lIIIllII("PScdHw==", "rWxqw");
        lllII[lllll[473]] = lIIIlllI("6u82hL6px1Y=", "vTPVA");
        lllII[lllll[474]] = lIIIllII("JzwmNhcc", "tYGDt");
        lllII[lllll[478]] = lIIIllII("CCAkSDwnLT4ReiUpMwE0KyA7BHoiMzMfPzQy", "FARhZ");
        lllII[lllll[479]] = lIIIllIl("mmDs6RWkPzPvcud4OEsil10gRgnU3ogG", "aqvNH");
        lllII[lllll[480]] = lIIIllII("JyIyCg==", "hRWdI");
        lllII[lllll[481]] = lIIIlllI("bTjgjbhrSzU=", "LzBMX");
        lllII[lllll[482]] = lIIIlllI("PYsNDIOYA9g=", "vFIvH");
        lllII[lllll[483]] = lIIIllII("NSsDBBUO", "fNbvv");
        lllII[lllll[486]] = lIIIllIl("eo/Q2OKtntiKocvcYg5b3PX028JMH2EJ", "VWXcH");
        lllII[lllll[487]] = lIIIllIl("XBZuDsUoCudT5Cmrt06Ld3MjWeZsrMSV", "jWBJF");
        lllII[lllll[488]] = lIIIlllI("BENHj9vEZtI=", "fwFkt");
        lllII[lllll[489]] = lIIIlllI("JnlybJx4TPY=", "lPTBs");
        lllII[lllll[490]] = lIIIllII("KSMALw==", "fSeAg");
        lllII[lllll[491]] = lIIIlllI("3QsQImVKP2s=", "UNTUD");
        lllII[lllll[492]] = lIIIllII("FBctAicv", "GrLpD");
        lllII[lllll[496]] = lIIIlllI("RdujFd87jGGBXE6oAhp0H306eZVz59wwPKxtRfSWo78=", "fTnQw");
        lllII[lllll[497]] = lIIIlllI("e52uG4cJSTk9VghbzE4UhTHCDdUdcLX9", "KClQU");
        lllII[lllll[498]] = lIIIllII("IAYjJjIWBw==", "dtBQW");
        lllII[lllll[499]] = lIIIllIl("V0lmC8CmlmA=", "AkyEH");
        lllII[lllll[500]] = lIIIllIl("LIU0ytmIgkQ=", "MaqbF");
        lllII[lllll[501]] = lIIIlllI("hDlzDLxckys=", "QfExM");
        lllII[lllll[502]] = lIIIllIl("UjyJXIv3igM=", "qVNWW");
        lllII[lllll[506]] = lIIIllII("BRMdaxEkUgMkFiIWAj4WawEEPhEjUh8uCz9SDzkEPBcZOA==", "KrkKe");
        lllII[lllll[507]] = lIIIlllI("gO1Tg9vIWqtWNSs7c8+V/ReZqIK1lkxE", "drSXi");
        lllII[lllll[508]] = lIIIllIl("5ys6+nl0/1w=", "CVnhB");
        lllII[lllll[509]] = lIIIlllI("Z4O7iM61+Z8=", "kAuwZ");
        lllII[lllll[510]] = lIIIllIl("7fsVZ+1lpoU=", "LFWBq");
        lllII[lllll[511]] = lIIIlllI("3lPlNm5SAI0=", "KFguT");
        lllII[lllll[512]] = lIIIlllI("TKb2nnIOv4s=", "TnCFC");
        lllII[lllll[515]] = lIIIllII("AxQgSA4sGDMEAjlVJRgEI1UhAAgoGXYMHywCMxoe", "MuVhm");
        lllII[lllll[516]] = lIIIllII("IiQbHTEZKBQIchUzGxg3AzI=", "qAzoR");
        lllII[lllll[517]] = lIIIllII("LgoPHS8YCw==", "jxnjJ");
        lllII[lllll[518]] = lIIIllIl("hKUVS6i0YpY=", "MUMvF");
        lllII[lllll[519]] = lIIIlllI("hlWCcHnhZ4c=", "QQhfE");
        lllII[lllll[520]] = lIIIllIl("Cs3NbW1Xzbc=", "srfWC");
        lllII[lllll[521]] = lIIIlllI("LYmz+DXBM7M=", "TZJZq");
        lllII[lllll[524]] = lIIIlllI("R1QXfrV8X9i4xyr+Jy7vaAWy2FtMyKGSxouaK/U2jpw=", "CFDOq");
        lllII[lllll[525]] = lIIIllII("PhYUORUFGhssVgkBFDwTHwA=", "msuKv");
        lllII[lllll[526]] = lIIIllII("BQE8Pw==", "JqYQe");
        lllII[lllll[527]] = lIIIllII("CD0vEgc+PA==", "LONeb");
        lllII[lllll[528]] = lIIIllIl("L+AMqZJGuw4=", "cKVqF");
        lllII[lllll[529]] = lIIIllII("ITMKKQ==", "nCoGh");
        lllII[lllll[530]] = lIIIllIl("Epcvj39oW38=", "XTLQC");
        lllII[lllll[531]] = lIIIllIl("Sogo/FfpWWk=", "hiEsu");
        lllII[lllll[534]] = lIIIllII("DQs4aTMsSjwgKi4DIC4zLARuLTUiHSs7NA==", "CjNIG");
        lllII[lllll[535]] = lIIIllII("FTYzKxEuOjw+UiIhMy4XNCA=", "FSRYr");
        lllII[lllll[536]] = lIIIllII("KgQRGjAcBQ==", "nvpmU");
        lllII[lllll[537]] = lIIIllIl("vOUR/JG7eVs=", "URrPg");
        lllII[lllll[538]] = lIIIlllI("c8YoEY6Qi8U=", "zsZPD");
        lllII[lllll[539]] = lIIIllII("Pi0sBgEF", "mHMtb");
        lllII[lllll[540]] = lIIIllIl("9+qqW097i8Y=", "LIAjI");
        lllII[lllll[544]] = lIIIlllI("NXq09BNcVMK8pzTtBDg+cEadEGY3Fv+72bHwIhUpS/A=", "krjGR");
        lllII[lllll[547]] = lIIIllIl("+h8mbUCBcMU=", "nSQiG");
        lllII[lllll[548]] = lIIIllIl("qFUbgrer1hw=", "vkqsV");
        lllII[lllll[549]] = lIIIlllI("TD3WUC+scsM=", "plFlp");
        lllII[lllll[550]] = lIIIllIl("euaMtNeUNdzHLEWvDlJqiNRTD+tJ2z/Q", "kXTxI");
        lllII[lllll[551]] = lIIIllII("C1MqJlQmFi0iGisHLicNYhIlaxs3BycqA25TOzkRMhI5LlQ2HGsvHSdS", "BsKKt");
        lllII[lllll[552]] = lIIIllIl("fBRNmvOwS0KNUwchcIBl0pyOfniG2+2ebczwAmgLN93Z2IQepM1Z8g==", "kKWPJ");
        lllII[lllll[553]] = lIIIllII("Aw11VQMiQiAaEj9CLhoVPhZ4", "MbYug");
        lllII[lllll[554]] = lIIIllIl("+4+n7/Suc+jQJ8IycV3XEpyPLMbgN615", "Irqki");
        lllII[lllll[555]] = lIIIllIl("ujzzCSSGFiE=", "dpoMg");
        lllII[lllll[556]] = lIIIlllI("RDXEANUFmco=", "WhNmf");
        lllII[lllll[557]] = lIIIllIl("OXsmy11cVzY=", "FEQaK");
        lllII[lllll[561]] = lIIIllII("DRM3ByM=", "ZrNiF");
        lllII[lllll[562]] = lIIIllIl("mYxHh1JE7Bc5wMhMU18DJA==", "qofAe");
        lllII[lllll[563]] = lIIIllIl("+WR4IhF+bQY=", "coIfQ");
        lllII[lllll[564]] = lIIIllIl("115TTQnKoTA=", "tFRkz");
        lllII[lllll[567]] = lIIIlllI("YKNm2wEtttg=", "sYBAB");
        lllII[lllll[568]] = lIIIlllI("5T8DgB34WGxMM1ZIK0hNgQ==", "QjGNw");
        lllII[lllll[569]] = lIIIllII("LiIHHw==", "fCili");
        lllII[lllll[570]] = lIIIllII("IBkJIg==", "hxgQL");
        lllII[lllll[574]] = lIIIlllI("j5jySAmkq20=", "SqeQC");
        lllII[lllll[575]] = lIIIlllI("vdm1Zj0RF0V4NXL8OdjWfQ==", "QaAoX");
        lllII[lllll[576]] = lIIIllII("LTo6OCY=", "hHWQH");
        lllII[lllll[577]] = lIIIllII("JBscCCw=", "aiqaB");
        lllII[lllll[580]] = lIIIllII("JioGSSkUOg==", "uCtib");
        lllII[lllll[581]] = lIIIlllI("rjbHOHhRmRgLn40/xRI7LQ==", "EcvDU");
        lllII[lllll[79]] = lIIIlllI("b6ePjhaIFJU=", "JUKLb");
        lllII[lllll[301]] = lIIIllIl("LJcxL/IL04E=", "sbVHm");
        lllII[lllll[281]] = lIIIlllI("ssvI3SjKZ4K08m/k6OFFHw==", "Nrsbl");
        lllII[lllll[44]] = lIIIllII("JgcTBwQQ", "uvfnv");
        lllII[lllll[586]] = lIIIllII("CRwEPg==", "EigGW");
        lllII[lllll[587]] = lIIIllIl("IIQkwifk2YXNdmiba+zs9w==", "WyPVT");
        lllII[lllll[588]] = lIIIlllI("I1bdlHO7BhM=", "TEPiV");
        lllII[lllll[178]] = lIIIllIl("c7+zpOGUJXs=", "FgLzd");
        lllII[lllll[592]] = lIIIllII("PgEbESs=", "ltheR");
        lllII[lllll[593]] = lIIIllIl("0Ve+MyLBF2TatLlR/jvcyw==", "gDFvc");
        lllII[lllll[594]] = lIIIllII("IQMKNRw=", "svyAe");
        lllII[lllll[595]] = lIIIlllI("eMsDvJ6QhtQ=", "sWGVz");
        lllII[lllll[598]] = lIIIllIl("5CteUqhvDK0=", "fmsPp");
        lllII[lllll[599]] = lIIIllIl("l6XYluK1wwktdpZXmFxR8Q==", "OVtbB");
        lllII[lllll[600]] = lIIIlllI("AsJRbIoa43c=", "VdFPB");
        lllII[lllll[601]] = lIIIlllI("QzWl1CUwtaQ=", "cpOYU");
        lllII[lllll[605]] = lIIIllII("BSQRFSQjPw==", "FLpgH");
        lllII[lllll[606]] = lIIIlllI("6fLeOafC8mddquRH1Z/lfQ==", "sFIHz");
        lllII[lllll[607]] = lIIIlllI("NkerCQpdThw=", "hDObj");
        lllII[lllll[608]] = lIIIlllI("OT/xQArO0Rg=", "cUWLK");
        lllII[lllll[611]] = lIIIllIl("hxR63nh68b4=", "joeiX");
        lllII[lllll[612]] = lIIIllII("JAMyaCUFQgU6OQ8LKg==", "jbDHQ");
        lllII[lllll[613]] = lIIIlllI("WBBGzwkPR3w=", "BBCGZ");
        lllII[lllll[614]] = lIIIllII("DSIJCgAi", "LPaoi");
        lllII[lllll[617]] = lIIIlllI("i60z+IOeLqE=", "nXzXA");
        lllII[lllll[618]] = lIIIllIl("VykVTd8GLAzE3+U3lXbwIA==", "EPgck");
        lllII[lllll[619]] = lIIIllIl("wm8ieW8WBGc=", "sRImx");
        lllII[lllll[620]] = lIIIllIl("HF37jzReKYw=", "Grltx");
        lllII[lllll[624]] = lIIIlllI("VnLY9hutSFM=", "zkNGm");
        lllII[lllll[625]] = lIIIlllI("iQhJEI/GbriJXUGz6me7cg==", "gWCam");
        lllII[lllll[626]] = lIIIllIl("3N0JbCEC7dg=", "kBDsq");
        lllII[lllll[627]] = lIIIlllI("mMngFRsKO/8=", "gzfFs");
        lllII[lllll[631]] = lIIIlllI("99u23Mdr+KpIE2kjmxCcA+Lw95dYlh7J9kbJi7FilT8=", "VjGBT");
        lllII[lllll[632]] = lIIIllII("NTEfOgQZNAg8", "wPmNa");
        lllII[lllll[636]] = lIIIllIl("JecxL6RTAQXfSKdyUyDV19A6ZSLWr3E7", "xCRLJ");
        lllII[lllll[637]] = lIIIllII("DwkwLCAjDCcq", "MhBXE");
        lllII[lllll[641]] = lIIIllIl("TObc5auXeHQ=", "xLZbz");
        lllII[lllll[642]] = lIIIlllI("ZzHmNjZsf+Vflr0NOy4CWQ==", "tFBmA");
        lllII[lllll[643]] = lIIIllII("Fi4aNx8w", "UOiDv");
        lllII[lllll[644]] = lIIIlllI("TMTWRWE+YZI=", "SCZHq");
        lllII[lllll[645]] = lIIIlllI("UruynUya4SU=", "kgpVa");
        lllII[lllll[649]] = lIIIllIl("kX8V2/K9i2aEy0dNg7zO3A==", "UdXWl");
        lllII[lllll[650]] = lIIIlllI("GOe1Ze+F2CiNaKj5VwLb7h+HLDpnPjzH", "YaTZS");
        lllII[lllll[651]] = lIIIllII("EzcOACM2IQQf", "WXamP");
        lllII[lllll[652]] = lIIIllIl("GtWvdaz1fVVEAek6zmbyJw==", "ukZTI");
        lllII[lllll[656]] = lIIIlllI("hEC9i58BBubR0dY3AQ5VhkNErtlkzlF4", "kxRAG");
        lllII[lllll[657]] = lIIIlllI("6Bc8/PrkuiuBDQQCCtwk5JUnxwA3dhC0y4i/z79IVTw=", "mudVM");
        lllII[lllll[658]] = lIIIllII("KDoZZRoBM1AJCwgwHCAaSRICKh4ZMwI=", "iVpEn");
        lllII[lllll[659]] = lIIIllIl("l0hh+cHQ/aXxdyrOP2hBcJZF6FJI4/rb", "aYxzA");
        lllII[lllll[662]] = lIIIllII("HCkFFBo=", "OHwur");
        lllII[lllll[663]] = lIIIllII("PAkSaB4dSDcpGBMA", "rhdHj");
        lllII[lllll[664]] = lIIIllII("Ay0UGD4=", "PLfyV");
        lllII[lllll[665]] = lIIIllII("KhMQBCk=", "yrbeA");
        lllII[lllll[669]] = lIIIlllI("hiL1adS1Lms0p+z3ulEenw==", "kxGDG");
        lllII[lllll[670]] = lIIIllIl("QB/mJSmVVLjUUAXA+R058Q==", "CsRSi");
        lllII[lllll[671]] = lIIIlllI("dfUUn3RcxLo7jFP4rT8McA==", "TJQxv");
        lllII[lllll[672]] = lIIIllII("ISoMThAUIQw=", "uBinV");
        lllII[lllll[675]] = lIIIllIl("lnXgw+WrRWJmb+4MQkplVMcDzyuUu6aA", "RvWTS");
        lllII[lllll[676]] = lIIIllII("AQEgCkIZCz8UBzYGLhMM", "UnOfb");
        lllII[lllll[680]] = lIIIllII("PQosBCM=", "isBeM");
        lllII[lllll[681]] = lIIIllIl("wAgZGpcgXhw/XBm/NA4ljg==", "StYyz");
        lllII[lllll[682]] = lIIIlllI("B4hEFLLSdW8=", "UzXxD");
        lllII[lllll[683]] = lIIIllII("Nx4WEBs=", "cgxqu");
        lllII[lllll[687]] = lIIIllII("JxQc", "iqxAb");
        lllII[lllll[688]] = lIIIllII("FzUaYwY2dCImFg==", "YTlCr");
        lllII[lllll[689]] = lIIIlllI("HQHGpQ3oo7Q=", "rtlTM");
        lllII[lllll[690]] = lIIIllII("PwIh", "qgEcW");
        lllII[lllll[694]] = lIIIlllI("X00VVw5NIoM=", "hvZIG");
        lllII[lllll[695]] = lIIIlllI("9bF48xxdq40WiTA6ZDSFdA==", "MhTrg");
        lllII[lllll[696]] = lIIIllII("BCsuJgQ=", "AGBOw");
        lllII[lllll[697]] = lIIIllIl("NwMQJ+l5RCs=", "TsRhr");
        lllII[lllll[700]] = lIIIllII("HS8+GzMgLw==", "KNPuR");
        lllII[lllll[701]] = lIIIllIl("Dc+sO7j6xpFeIIjmy3yPug==", "TNUrs");
        lllII[lllll[702]] = lIIIlllI("+uhKWwRA40E=", "AzQeB");
        lllII[lllll[703]] = lIIIllIl("dOID7g/vWkc=", "ihScD");
        lllII[lllll[706]] = lIIIllII("FTgHJCU=", "QWuMV");
        lllII[lllll[707]] = lIIIllII("NC8QbTwVbiIiOhM9", "zNfMH");
        lllII[lllll[708]] = lIIIllIl("Do1Qjggpa28=", "YMUoS");
        lllII[lllll[709]] = lIIIlllI("CRbFIwc1yNE=", "yURgy");
        lllII[lllll[713]] = lIIIlllI("WuBE7veJWbo=", "hLQER");
        lllII[lllll[714]] = lIIIllII("DygYWjkuaSUVIy4m", "AInzM");
        lllII[lllll[739]] = lIIIlllI("eCbyGBnfesjfSojJ+bNKfrkqA+r6Zd+Q", "AvnMc");
        lllII[lllll[740]] = lIIIllII("HyU/Bi0=", "TJQiB");
        lllII[lllll[741]] = lIIIlllI("SYoNan6er9Q=", "WCYbQ");
        lllII[lllll[745]] = lIIIllIl("mIcbIYB74qJ2om68/yicOQ==", "ldkwF");
        lllII[lllll[746]] = lIIIllIl("Bwtkvac6u8icC91TvImH4+ir/y56zBAl", "qbFwx");
        lllII[lllll[747]] = lIIIllIl("pBCrz9FGqKxXT+LTq5Lunw==", "IGVuc");
        lllII[lllll[748]] = lIIIlllI("iS5Ojt6pOweCxMY4VDn/vg==", "MxLEE");
        lllII[lllll[751]] = lIIIllII("OAgUZzsZSSEoIB0=", "vibGO");
        lllII[lllll[752]] = lIIIlllI("FH6W8ZM8HnA=", "YpUmh");
        lllII[lllll[756]] = lIIIllII("OA4gAh8=", "roTkg");
        lllII[lllll[757]] = lIIIllIl("we63o2tt6hJFSLHsneHAvg==", "LiGDz");
        lllII[lllll[758]] = lIIIllII("JDEHKzI=", "nPsBJ");
        lllII[lllll[759]] = lIIIlllI("7IdYpEJDcEE=", "AdpxO");
        lllII[lllll[762]] = lIIIllIl("6PvKv66yYTs=", "RLdoc");
        lllII[lllll[763]] = lIIIlllI("d+6N/hW0HGxZYrcthkO9RA==", "yTGSc");
        lllII[lllll[764]] = lIIIllII("KhsAGDEaBw==", "iseuX");
        lllII[lllll[765]] = lIIIllII("Kho2PjAaBg==", "irSSY");
        lllII[lllll[769]] = lIIIllII("FRslHB8hWhsRGz0=", "SzQtz");
        lllII[lllll[770]] = lIIIlllI("5+NBfKzaR8kiR3NV4FlvwOEdv9gj3JEM", "AfESe");
        lllII[lllll[771]] = lIIIlllI("Din/AgjUXui0jU4RNaVKeg==", "dojHe");
        lllII[lllll[772]] = lIIIllIl("F1TrV6KHaF75uitL4bJ9hg==", "XqgVm");
        lllII[lllll[776]] = lIIIllIl("e+MlRnYn3mFF+J0TcFIWp16+wVx4dYHT", "wPsbL");
        lllII[lllll[777]] = lIIIllIl("pk+kX23WcRjJ2lAlQRRVe1ZR9uE3P+z9r+fE4MNuN7E=", "KHElB");
        lllII[lllll[781]] = lIIIllIl("5jMQlLEM2fhVg8OUxKCZhnYdG1LW6YUw", "jwYSX");
        lllII[lllll[782]] = lIIIllIl("D4hwdWlzFnxOLait9VclO4chd1Yr0x1r", "QiQUg");
        lllII[lllll[786]] = lIIIllII("FT0lBwM4", "YRPnp");
        lllII[lllll[787]] = lIIIllIl("WcYqRCHZPDsD5EryXkG2bA==", "iINlF");
        lllII[lllll[788]] = lIIIllIl("tfexJze64BU=", "XFUtW");
        lllII[lllll[789]] = lIIIllIl("IYzyR9aBt1o=", "gWzxF");
        lllII[lllll[793]] = lIIIlllI("CqgKyCdNy9Q=", "dQqSx");
        lllII[lllll[794]] = lIIIlllI("KBPg3RxNLE/UkvaIdFiHLw==", "Uxkst");
        lllII[lllll[795]] = lIIIllIl("IwcmKoa3VlI=", "cPFkq");
        lllII[lllll[796]] = lIIIllII("IwYxIw4b", "wsCBk");
        lllII[lllll[799]] = lIIIlllI("87pNN9sypXKM2HxtvvavjVrtRJH/7mXH", "kTyym");
        lllII[lllll[800]] = lIIIllII("OxEbUT4aUCEQLgxQAhdqARgIUQYUGwg=", "upmqJ");
        lllII[lllll[801]] = lIIIlllI("KxOPpdZLWSd1jEzQBDr2cQH69O9IN6iU", "VLzzi");
        lllII[lllll[802]] = lIIIllIl("QGQNYWLzflycfYnXFBeerrURAgR7CZUp", "qJbic");
        lllII[lllll[806]] = lIIIllIl("BjoB8lHGdWk=", "GzDBC");
        lllII[lllll[807]] = lIIIllIl("XDOWIHV0N3oAg5CpjwncBA==", "vHXzl");
        lllII[lllll[808]] = lIIIllII("LTUKCAUMPg==", "ePxyp");
        lllII[lllll[809]] = lIIIllIl("sdwVxE9cAog=", "elWsl");
        lllII[lllll[812]] = lIIIllIl("tgKEcSR/cH/xsBQ7QdFajw==", "dhxjY");
        lllII[lllll[813]] = lIIIlllI("eGeMZac4Tms5lSsBZ1zuc2ZM1SGK342M", "aFtoa");
        lllII[lllll[814]] = lIIIllII("AQkoNQw7DTI0DTs=", "IhAGh");
        lllII[lllll[815]] = lIIIlllI("pyFboDQHWU5lygoc7QznFg==", "SQJUH");
        lllII[lllll[818]] = lIIIllIl("SIOEBMsctjg=", "nNjOb");
        lllII[lllll[819]] = lIIIllIl("0eWguU+swy0blEqIJ3oKxQ==", "FwhuJ");
        lllII[lllll[820]] = lIIIllII("GBEUIw==", "RtqGT");
        lllII[lllll[821]] = lIIIlllI("YsMZnwrIQIk=", "QoUNZ");
        lllII[lllll[824]] = lIIIllIl("z91GkNDEM7k=", "CqtiN");
        lllII[lllll[825]] = lIIIlllI("BOjzBQ7B55DT19Y8twSn5A==", "eZaxa");
        lllII[lllll[826]] = lIIIllII("Py0dNyUc", "rBoPD");
        lllII[lllll[827]] = lIIIlllI("Ifgvjok/CPA=", "dicPT");
        lllII[lllll[831]] = lIIIllIl("FKj/QCOTvmbsx4a2/7geWg==", "grKLt");
        lllII[lllll[832]] = lIIIllII("GyYvbx46ZxouGiEmMCFKASg7Jgsm", "UGYOj");
        lllII[lllll[833]] = lIIIllIl("9UliQU4MZEdFSYjgz0DfQA==", "vczJc");
        lllII[lllll[834]] = lIIIlllI("yYiaaapa1LHVvAbyiFCR9w==", "VVPgK");
        lllII[lllll[837]] = lIIIlllI("B6nkSY9nNKo=", "PXDkN");
        lllII[lllll[838]] = lIIIllII("NBYsWh8VVxkfCBMbMxs=", "zwZzk");
        lllII[lllll[839]] = lIIIlllI("Dtn3TOFUs6E=", "nnYso");
        lllII[lllll[840]] = lIIIllIl("0zL3+IWN3Xw=", "dSQCA");
        lllII[lllll[841]] = lIIIlllI("+j+P0IKZxpk=", "bynVL");
        lllII[lllll[842]] = lIIIllII("JQE6BTkPBQ==", "fdYlU");
        lllII[lllll[843]] = lIIIllIl("0aV94cQkl6I2rSJEjnxDlQ==", "iskLN");
        lllII[lllll[844]] = lIIIllII("IBQxbVcwUSogARxf", "yqBAw");
        lllII[lllll[845]] = lIIIllII("EgYVKyY4Ag==", "QcvBJ");
        lllII[lllll[846]] = lIIIlllI("ItLpdmDqxYc=", "jnpxa");
        lllII[lllll[847]] = lIIIllII("PgoGW1MuTx0WBQJB", "gouws");
        lllII[lllll[849]] = lIIIlllI("cjqP1f4YLdQ=", "YCSpH");
        lllII[lllll[850]] = lIIIlllI("CnlDHufSGHnCwMDZQH+yyw==", "dLCqm");
        lllII[lllll[851]] = lIIIllIl("+2DwIh0oYd0=", "zHVEh");
        lllII[lllll[852]] = lIIIllIl("eFUmZwAh/g4=", "QYmkL");
        lllII[lllll[853]] = lIIIllII("HjQwAgAoYQMAFz4gPgs=", "LAWee");
        lllII[lllll[854]] = lIIIlllI("B436Hv+Zbn8=", "Wkjns");
        lllII[lllll[855]] = lIIIllII("NAYwQ1QkQysOAghN", "mcCot");
        lllII[lllll[856]] = lIIIllII("MAMYY0kgRgMuHwxI", "ifkOi");
        lllII[lllll[857]] = lIIIllIl("DE05qLysueI=", "jftUJ");
        lllII[lllll[858]] = lIIIllIl("lImnptDnQlo=", "HLQIN");
        lllII[lllll[859]] = lIIIllIl("IY09E3wg5Y69D4KWYHr0nA==", "dHjcD");
        lllII[lllll[861]] = lIIIllII("NiApBg4cJA==", "uEJob");
        lllII[lllll[862]] = lIIIlllI("wRg7rrc03chM3sz4+8yyDQ==", "yhspR");
        lllII[lllll[863]] = lIIIllII("ESsvIBU7Lw==", "RNLIy");
        lllII[lllll[864]] = lIIIlllI("vw6OYO6KTnc=", "TIPxM");
        lllII[lllll[865]] = lIIIllII("PyQ2UTAEPj8eBAVsGx4bDj8nFBcP", "kLSqv");
        lllII[lllll[866]] = lIIIllII("MA0RDisaCQ==", "shrgG");
        lllII[lllll[867]] = lIIIlllI("hfbqPJzsdBDLwgijhs8mBA==", "afLDK");
        lllII[lllll[868]] = lIIIllIl("Ko+DzN5DjLg=", "uIMPL");
        lllII[lllll[869]] = lIIIlllI("LGEzAuSR2HU=", "YfpIV");
        lllII[lllll[870]] = lIIIllIl("tnYM1RDjpR5jTxXiJpTFFA==", "GcAte");
        lllII[lllll[872]] = lIIIllII("FDIUOSM+Ng==", "WWwPO");
        lllII[lllll[873]] = lIIIllIl("qAVg5QZZ3gC1xwtOK3F7rA==", "YPMKU");
        lllII[lllll[874]] = lIIIllII("FRMHIhQ/Fw==", "VvdKx");
        lllII[lllll[875]] = lIIIllIl("qb8i3n80y08=", "wZVTS");
        lllII[lllll[876]] = lIIIllIl("E0DhYk7qhGFiNl/SySnaCQ==", "pVgTR");
        lllII[lllll[877]] = lIIIllIl("1/Kdk9idUMI=", "mOgqC");
        lllII[lllll[878]] = lIIIlllI("D8IuoWxhE/GPe8OGDX5oiQ==", "RVMbr");
        lllII[lllll[879]] = lIIIlllI("4qmIcMHLoeyoRtCFFolvPA==", "lGbOY");
        lllII[lllll[880]] = lIIIllIl("5QscJ6mA6i4=", "Vzbvq");
        lllII[lllll[881]] = lIIIllIl("Lj5woCDVVYQ=", "JEBDN");
        lllII[lllll[882]] = lIIIllIl("eIJY40ar+s4XL9+gAdFAWw==", "HMdbf");
        lllII[lllll[884]] = lIIIllII("FikWIzQ8LQ==", "ULuJX");
        lllII[lllll[885]] = lIIIllII("PA0mdxkdTBMyDhsAOTY=", "rlPWm");
        lllII[lllll[886]] = lIIIllII("LTMmEBQHNw==", "nVEyx");
        lllII[lllll[887]] = lIIIlllI("rVyw1Or95FY=", "lpEtI");
        lllII[lllll[888]] = lIIIllIl("GlL/g/U3aKw=", "WJiPo");
        lllII[lllll[889]] = lIIIllIl("1jeGukhBEG4=", "CTNaL");
        lllII[lllll[890]] = lIIIllIl("QOpAHYe+uXqP7QWGw7dL1g==", "YjRAs");
        lllII[lllll[891]] = lIIIlllI("VzrTrF590CAfo5TlTe3OsA==", "uqwNF");
        lllII[lllll[892]] = lIIIlllI("IeIhIwf0Wrw=", "PHziw");
        lllII[lllll[893]] = lIIIlllI("3Q4pWLjORAk=", "oEXuo");
        lllII[lllll[894]] = lIIIllII("PiIBekQuZxo3EgJp", "gGrVd");
        lllII[lllll[896]] = lIIIllIl("WqY8IDlXG9A=", "AofSr");
        lllII[lllll[897]] = lIIIllII("BiQ5chonZQw3DSEpJjM=", "HEORn");
        lllII[lllll[898]] = lIIIlllI("apvot3G+zAE=", "VMlyM");
        lllII[lllll[899]] = lIIIlllI("c5xZrpUqTAw=", "WhXtT");
        lllII[lllll[900]] = lIIIllIl("GQ7VZwXiv9s=", "TjZhW");
        lllII[lllll[901]] = lIIIlllI("xSt+s1mNIGA=", "SeDYH");
        lllII[lllll[902]] = lIIIlllI("dnHxUEALAChHaJ5Tpa85JA==", "GMtYi");
        lllII[lllll[903]] = lIIIllII("IwsJW0MzThIWFR9A", "znzwc");
        lllII[lllll[904]] = lIIIllIl("MqO1JMO/fgw=", "JTUob");
        lllII[lllll[198]] = lIIIlllI("1ySJniqR6IE=", "TAEMu");
        lllII[lllll[197]] = lIIIllII("CT8jYEMZejgtFTV0", "PZPLc");
        lllII[lllll[911]] = lIIIllII("AzAcdTwicR46OG0+DHUlJD0GdSk/NRM=", "MQjUH");
        lllII[lllll[917]] = lIIIllII("IBggSQEBWSEBEA8Ndg8cCxUySRkbFDQQ", "nyViu");
        lllII[lllll[928]] = lIIIllIl("QhhGrUPab6f/9JoYFrQMWAsJniVpZOSX", "fbFYg");
        lllII[lllll[935]] = lIIIllII("CQkiUScoSDIQPysRdAEyNRwtUSEoBzk=", "GhTqS");
        lllII[lllll[942]] = lIIIllII("BCUwTiMlZCsbMzkvLx4nLzZmHjgjKjI=", "JDFnW");
        lllII[lllll[953]] = lIIIlllI("LyL3/jPq7b0iOrTKfYr5+gfrMKxej7Ya", "dMNYm");
        lllII[lllll[196]] = lIIIllIl("2pSo+3uCdCrWqz5SFt14w5YPdzulvRnZ", "FqBGd");
        lllII[lllll[958]] = lIIIllIl("48xxQms5tZocZkinOQiy7HKW/61PCcKA4ObBnNcVfXM=", "bvyfu");
        lllII[lllll[963]] = lIIIllIl("A7JH11IELX7duIF2uM8PeZPskLOSdI2z", "ftqXo");
        lllII[lllll[969]] = lIIIlllI("oNgAn4sGnGO5FrS3arnThM5F9o2+d4QGOV4HcHn8WSU=", "vwqzO");
        lllII[lllll[975]] = lIIIlllI("AKPuAavCwQ2BI3dUuLqn916QXltc0ExRz97ufiiJaBo=", "WglGz");
        lllII[lllll[982]] = lIIIllII("ASIbdyMgYwEyMCotCSR3KDYEOzNjYw84IA==", "OCmWW");
        lllII[lllll[989]] = lIIIllIl("58HhaLrAEUD+MTaQV3BqRXd1kbTtmKTawy44WW8lkBRQ1aDVaIigpw==", "NBwSE");
        lllII[lllll[995]] = lIIIllII("HzIRSzY+cxQCLDI/BgIwcT4GBTE4PAlHYj0yEgwq", "QSgkB");
        lllII[lllll[1000]] = lIIIlllI("pTf+JuFGiOPOjurUxqIWhMwJ5RjT1VeO2NcuO2Cnip4=", "nUWke");
        lllII[lllll[1005]] = lIIIlllI("/N3mj1nvhwQ1Cn1NIWft2C9KirCrT467VYDb/uKKoqM=", "QxWwN");
        lllII[lllll[1011]] = lIIIllII("By08VyQmbCweIyElJBBwLjkjGzRlbCAeNw==", "ILJwP");
        lllII[lllll[1016]] = lIIIlllI("tt6b+UI8/A4UVJlyl3FZpLI/Cf3OAHbA", "aSEaN");
        lllII[lllll[1022]] = lIIIlllI("52z9fzfkgA7748byqrGV6af1GYyEJFs5iqZsRt1bpIE=", "uAGXd");
        lllII[lllll[1026]] = lIIIlllI("l9YyHUQ1iFar3DIZaNej+L+iv5nhH6uOj+Mlzg5N4zc=", "aBNrB");
        lllII[lllll[992]] = lIIIllII("FCgPZT41aQ0kPD87FTxqKWkNKiQ/aRosODklHGlqOSEcIDg=", "ZIyEJ");
        lllII[lllll[1035]] = lIIIlllI("NFSBDqpu4b2H5myaqnrIhJmicAG2Tyw6N9zfwKMpf3ZbDm5gSi5qUA==", "IUXbz");
        lllII[lllll[1028]] = lIIIlllI("0oI8syDCS+U=", "HzOSa");
        lllII[lllll[1036]] = lIIIllII("OQYnKQcO", "kcJFq");
        lllII[lllll[1039]] = lIIIllIl("uI+t0t7jK+cLOkSCr257sPa0HG10hgMkGto/CQ6o2z8=", "EPamX");
        lllII[lllll[1040]] = lIIIllII("DTcoMQ==", "IEGAy");
        lllII[lllll[1041]] = lIIIllII("AA4uCS43", "RkCfX");
        lllII[lllll[1045]] = lIIIlllI("A1OTCg53Qp1gUr56VmzclwwlM47w/Vk/VLPmwe5vVaw=", "paxbR");
        lllII[lllll[1051]] = lIIIllIl("qf8iyHRPv5d2Ej+GpxgmnESIx32ojsXDZiYuzzX0XNw=", "Xuqbj");
        lllII[lllll[1056]] = lIIIlllI("GHVmP+X4kqjLkxJIsmWrXmK9i3RpxkDGIFQajOzvUsM=", "HFabr");
        lllII[lllll[1061]] = lIIIlllI("yINR2Nuyrf7L5BBWAXy9cqjmu8iVUKsdO3H+XlKu4OE=", "hYWAJ");
        lllII[lllll[1064]] = lIIIllII("PQM7QzAcQiwPZBgKLBEtF05tCyESBi8CKhQ=", "sbMcD");
        lllII[lllll[1070]] = lIIIllIl("WE8ej0IkBkU=", "RgjHA");
        lllII[lllll[1071]] = lIIIllII("JDUjRSQFdCUKIh50JgQiAzl5RTMCMTAX", "jTUeP");
        lllII[lllll[1077]] = lIIIlllI("KSxutIbiCD9rvY5nQzkJFZMrzgdQJeiz5pl+X+j1D6A=", "boAdN");
        lllII[lllll[1084]] = lIIIllII("IzACViECNgYXOwlxEQ42BTAaETBBcRAXOw40", "mQtvU");
        lllII[lllll[1089]] = lIIIllIl("KEQUvP2XTSJHl9mMGSNBBuhCoA+xXdZc7zv+j+qaW+E=", "wWWhF");
        lllII[lllll[1093]] = lIIIlllI("nmj3Gt4NhWHiekJO/OlxA9DX9+4YBohMkchyCxT1po4=", "vvWWU");
        lllII[lllll[1095]] = lIIIllII("LQUj", "ilDAA");
        lllII[lllll[1098]] = lIIIllIl("4xQ4mx1YogwW9b6P7psqK2ob8slBGcFG", "cezlk");
        lllII[lllll[1099]] = lIIIllII("ChkI", "NpoWe");
        lllII[lllll[1102]] = lIIIllIl("Xb2CngoOkjgtX1p7OM/oL0h9W4cb+pV08QChq4IS8io=", "mzLFG");
        lllII[lllll[1103]] = lIIIllIl("zM59AsBA2qg=", "aEcAv");
        lllII[lllll[1106]] = lIIIlllI("KfwpU3ydc3pCZb8FYukbEqNq2Fb803WZZWRT9eSNiyo=", "hdqIk");
        lllII[lllll[1107]] = lIIIllIl("z2BzWEJ+sVQ=", "IrmPk");
        lllII[lllll[1114]] = lIIIllII("HCUbchs9ZAEzBDdkAD0DMSxNKAozLE02BjU=", "RDmRo");
        lllII[lllll[1115]] = lIIIllII("Jj4/", "bWXdC");
        lllII[lllll[1119]] = lIIIlllI("4bu4VOKXEnJ+4IyWH7LhmQywc2pKnDUViutXNu1o3DA=", "tOgBr");
        lllII[lllll[1120]] = lIIIllII("CyQ+", "OMYkT");
        lllII[lllll[1124]] = lIIIllII("IQk0dxIASCsjBQcHKyRGDAkgPghPDCsw", "ohBWf");
        lllII[lllll[1125]] = lIIIllII("NwAe", "siyVb");
        lllII[lllll[1128]] = lIIIllIl("sfxZm+uZsHhuKPKmPeZNBIqa3QlkdaaH", "xWaJQ");
        lllII[lllll[1129]] = lIIIlllI("bESuTltyhy4=", "wJCBQ");
        lllII[lllll[1131]] = lIIIllII("Iic+WgcDZjsOEgIiIRQUTDU8FR0JNWgcEgAqMVoXBSE=", "lFHzs");
        lllII[lllll[1132]] = lIIIllIl("3hZOYJpAjYM=", "PVTbc");
        lllII[lllll[1136]] = lIIIllII("Hhc5Uxw/VgIQLyIDLRYaI1Y4HAc0VisaDw==", "PvOsh");
        lllII[lllll[1139]] = lIIIllIl("eIjZWuXElGs=", "ILsoo");
        lllII[lllll[1140]] = lIIIlllI("Z/L9rl86svU=", "rOsau");
        lllII[lllll[1143]] = lIIIlllI("8HqR1rHK1aVXiCQpJneWJxMz77FypFtt+ugHbp3v0CuGDzAOSeiMpA==", "HcjiB");
        lllII[lllll[1144]] = lIIIllII("BzAO", "CYimG");
        lllII[lllll[1147]] = lIIIllIl("WnPpKFpI9FMtdQblU5c7omotSIC++VXijTrDOXkDTas=", "iQYWH");
        lllII[lllll[1148]] = lIIIllIl("LELuWfzuNLs=", "xSASj");
        lllII[lllll[1151]] = lIIIlllI("y6iuJYkGlAeALqHptB1f1TsVRYioDuSNInsTgXCSbXE=", "rkvCe");
        lllII[lllll[1152]] = lIIIlllI("cUaRVrVhvZ8=", "qFEPI");
        lllII[lllll[1153]] = lIIIllII("KS44Zmw5ayMrOhVl", "pKKJL");
        lllII[lllll[1154]] = lIIIlllI("9Zk7BSkX6QE=", "bCoHH");
        lllII[lllll[1155]] = lIIIllII("EzQuDQEZJg==", "wAKah");
        lllII[lllll[1156]] = lIIIllII("BSQ2HAgeMy4=", "qAZyx");
        lllII[lllll[1157]] = lIIIlllI("E6CHRV2p5HDLuA8py11enA==", "wasbD");
        lllII[lllll[1158]] = lIIIlllI("sJkqwy37iA8=", "rIoVc");
        lllII[lllll[1159]] = lIIIllIl("oCxRaHYpkks=", "FkVmU");
        lllII[lllll[1058]] = lIIIllII("MTcqGWkpPTUHLAYwJAAn", "eXEuI");
        lllII[lllll[1160]] = lIIIlllI("cj3H9XBYLWt8aa3WYIz7zQ==", "VKSXs");
        lllII[lllll[1161]] = lIIIllIl("aIyGA3ct1Aw1yV9SEtfSyQ==", "ZqbpG");
        lllII[lllll[1162]] = lIIIlllI("CxfNRzEM6ZEjWJPhYZZTzA==", "gVQrU");
        lllII[lllll[1163]] = lIIIllIl("SfBB+wTEJzJV9lTJC30QkQ==", "lDfZS");
        lllII[lllll[1164]] = lIIIllIl("hFYXU/kL36cFjL0jPazXeg==", "lHhZP");
        lllII[lllll[1165]] = lIIIllIl("Z0dhJJwUd5s=", "dPdwS");
        lllII[lllll[1166]] = lIIIlllI("d6/lbAZwBWU=", "VtlJC");
        lllII[lllll[1080]] = lIIIllIl("5CnydNoDsxM=", "hfeKA");
        lllII[lllll[1168]] = lIIIlllI("n69fCUPbO9w=", "tRwga");
        lllII[lllll[1043]] = lIIIlllI("Bko2VOzKfU0=", "TemRS");
        lllII[lllll[1171]] = lIIIlllI("CEYzpqg9Yfc=", "FUEan");
        lllII[lllll[906]] = lIIIllII("KiQBIQ==", "eTdOZ");
        lllII[lllll[1172]] = lIIIllII("BgAKJw==", "BoeUd");
        lllII[lllll[1014]] = lIIIllIl("szw5Z2HoJr0=", "BcpzA");
        lllII[lllll[1174]] = lIIIlllI("9qJQqE6VIpc=", "mrpFj");
        lllII[lllll[1175]] = lIIIllII("HSg0Jw==", "RXQIM");
        lllII[lllll[1176]] = lIIIlllI("stLnY8CRlR6i+iojyaphmg==", "ngQjm");
        lllII[lllll[1177]] = lIIIlllI("Qs9rniLO9Yo=", "oqsIs");
        lllII[lllll[1178]] = lIIIllII("PxE9CA==", "paXfK");
        lllII[lllll[985]] = lIIIllII("FzwrJAU=", "tTNWq");
        lllII[lllll[1179]] = lIIIllIl("GLYDCxi1heY=", "kzaYy");
        lllII[lllll[1180]] = lIIIllII("Jh8IMDk=", "EwmCM");
        lllII[lllll[1181]] = lIIIlllI("HrzQkMkRZ7w=", "isjNf");
        lllII[lllll[1182]] = lIIIllII("MyoCIgwe", "pEdDe");
        lllII[lllll[1183]] = lIIIlllI("IIhxjvq+1nDJ8yGAfAOMbg==", "oPVUE");
        lllII[lllll[913]] = lIIIllIl("XYDvP16iUKY=", "lgTtv");
        lllII[lllll[1184]] = lIIIlllI("QkgXJ0yh1tI=", "tiIzp");
        lllII[lllll[1185]] = lIIIllIl("ptQefPLs8S8=", "kaQLS");
        lllII[lllll[1186]] = lIIIllIl("XfCCf6k1bWA=", "wbmVn");
        lllII[lllll[1013]] = lIIIllII("GgUTMgQ=", "YwrFa");
        lllII[lllll[1187]] = lIIIlllI("tCcjwZtwKoc=", "qRelQ");
        lllII[lllll[1188]] = lIIIllII("BwgsAAA=", "DzMte");
        lllII[lllll[1190]] = lIIIlllI("bcCVPMViVVYRMOfHsZJbug==", "JJGIk");
        lllII[lllll[1191]] = lIIIlllI("K7kbCtNSJGs=", "dkDuO");
        lllII[lllll[1192]] = lIIIlllI("7wSuZkWbXDc//VaDMTITGg==", "Idwby");
        lllII[lllll[1193]] = lIIIllIl("0BoZw6zJA+w=", "VwKRJ");
    }

    private static String lIIIllIl(String llllIlIlIlllllI, String llllIlIlIllllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIlIlIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllIlIllIIIIII = Cipher.getInstance("Blowfish");
            llllIlIllIIIIII.init(lllll[5], secretKeySpec);
            return new String(llllIlIllIIIIII.doFinal(Base64.getDecoder().decode(llllIlIlIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIlIlIllllll) {
            llllIlIlIllllll.printStackTrace();
            return null;
        }
    }

    private static String lIIIlllI(String llllIlIllIIlIll, String llllIlIllIIlIlI) {
        try {
            SecretKeySpec llllIlIllIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIlIllIIlIlI.getBytes(StandardCharsets.UTF_8)), lllll[13]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllll[5], llllIlIllIIlllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllIlIllIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIlIllIIllII) {
            llllIlIllIIllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable search skipped. Vars limit reached: 11611 (expected less than 5000) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5416, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v5417, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5427, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v5428, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1137, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1138, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1145, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1146, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1163, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1164, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1171, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1172, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1189, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1190, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1197, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1198, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1215, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1216, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1221, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1222, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1239, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1240, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1247, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1248, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1265, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1266, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1273, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1274, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1284, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1285, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1295, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1296, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1315, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1316, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1326, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1327, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1337, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1338, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1348, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1349, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1359, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1360, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1370, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1371, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1388, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1389, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1399, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1400, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1410, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1411, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1417, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1418, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1428, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1429, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1439, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1440, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1489, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1490, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1500, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1501, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1511, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1512, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1522, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1523, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1533, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1534, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1540, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1541, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1551, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1552, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1564, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1565, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1575, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1576, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1586, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1587, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1600, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1601, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1607, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1608, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1614, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1615, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1625, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1626, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1636, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1637, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1647, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1648, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1658, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1659, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1669, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1670, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1680, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1681, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1691, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1692, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1700, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1701, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1711, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1712, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1722, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1723, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1733, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1734, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1744, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1745, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1769, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v1770, types: [boolean] */
    public static void r() {
        if (lIIlIIIl(Inventory.contains(item -> {
            if (lIIlIIIl(item.getName().contains(lllII[lllll[1192]]) ? 1 : 0) && lIIlIIIl(item.getName().contains(lllII[lllll[1193]]) ? 1 : 0)) {
                ?? r0 = lllll[1];
                "".length();
                return (-" ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lllll[0];
        }) ? 1 : 0)) {
            Clues.f0c = lllII[lllll[0]];
            Inventory.getFirst(item2 -> {
                if (lIIlIIIl(item2.getName().contains(lllII[lllll[1190]]) ? 1 : 0) && lIIlIIIl(item2.getName().contains(lllII[lllll[1191]]) ? 1 : 0)) {
                    ?? r0 = lllll[1];
                    "".length();
                    return ((169 ^ 132) & ((36 ^ 9) ^ (-1))) == "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lllll[0];
            }).interact(lllII[lllll[1]]);
            return;
        }
        if (lIIlIIlI(s() ? 1 : 0)) {
            e.x();
        }
        if (lIIlIIIl(s() ? 1 : 0)) {
            if (lIIlIIIl(new WorldArea(lllll[2], lllll[3], lllll[4], lllll[4], lllll[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                String[] strArr = new String[lllll[1]];
                strArr[lllll[0]] = lllII[lllll[5]];
                TileObject nearest = TileObjects.getNearest(strArr);
                if (lIIlIIll(nearest)) {
                    String[] strArr2 = new String[lllll[1]];
                    strArr2[lllll[0]] = lllII[lllll[6]];
                    if (lIIlIIIl(nearest.hasAction(strArr2) ? 1 : 0)) {
                        String[] strArr3 = new String[lllll[1]];
                        strArr3[lllll[0]] = lllII[lllll[7]];
                        TileObjects.getNearest(strArr3).interact(lllII[lllll[8]]);
                        Time.sleepTicks(k.c(lllll[6], lllll[7]));
                        "".length();
                    }
                }
            }
            int[] iArr = new int[lllll[1]];
            iArr[lllll[0]] = lllll[9];
            if (lIIlIIIl(Inventory.contains(iArr) ? 1 : 0)) {
                System.out.println(lllII[lllll[10]]);
                int[] iArr2 = new int[lllll[1]];
                iArr2[lllll[0]] = lllll[9];
                Inventory.getFirst(iArr2).interact(lllII[lllll[11]]);
                c.E = lllll[0];
                Time.sleepTicks(k.c(lllll[6], lllll[7]));
                "".length();
                return;
            }
            int[] iArr3 = new int[lllll[1]];
            iArr3[lllll[0]] = lllll[12];
            if (lIIlIIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                System.out.println(lllII[lllll[13]]);
                int[] iArr4 = new int[lllll[1]];
                iArr4[lllll[0]] = lllll[12];
                Inventory.getFirst(iArr4).interact(lllII[lllll[14]]);
                c.E = lllll[0];
                Time.sleepTicks(k.c(lllll[6], lllll[7]));
                "".length();
                return;
            }
            int[] iArr5 = new int[lllll[1]];
            iArr5[lllll[0]] = lllll[15];
            if (lIIlIIIl(Inventory.contains(iArr5) ? 1 : 0)) {
                WorldPoint worldPoint = new WorldPoint(lllll[16], lllll[17], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lllll[5])) {
                    Clues.f0c = lllII[lllll[18]];
                    k.d(worldPoint);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lllll[5])) {
                    Clues.f0c = lllII[lllll[19]];
                    String[] strArr4 = new String[lllll[1]];
                    strArr4[lllll[0]] = lllII[lllll[20]];
                    TileObjects.getNearest(strArr4).interact(lllII[lllll[21]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr6 = new int[lllll[1]];
            iArr6[lllll[0]] = lllll[22];
            if (lIIlIIIl(Inventory.contains(iArr6) ? 1 : 0)) {
                WorldPoint worldPoint2 = new WorldPoint(lllll[23], lllll[24], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lllll[5])) {
                    Clues.f0c = lllII[lllll[4]];
                    k.d(worldPoint2);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lllll[5])) {
                    Clues.f0c = lllII[lllll[25]];
                    TileObjects.getNearest(tileObject -> {
                        if (lIIlIIIl(tileObject.getName().contains(lllII[lllll[1188]]) ? 1 : 0) && lIIlIIIl(tileObject.getWorldLocation().equals(new WorldPoint(lllll[1189], lllll[24], lllll[0])) ? 1 : 0)) {
                            ?? r0 = lllll[1];
                            "".length();
                            return (((((28 + 14) - (-47)) + 71) ^ (((101 + 103) - 85) + 38)) & (((21 ^ 6) ^ (114 ^ 92)) ^ (-" ".length()))) < 0 ? ((209 ^ 182) ^ (111 ^ 71)) & (((121 ^ 35) ^ (89 ^ 76)) ^ (-" ".length())) : r0;
                        }
                        return lllll[0];
                    }).interact(lllII[lllll[26]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr7 = new int[lllll[1]];
            iArr7[lllll[0]] = lllll[27];
            if (lIIlIIIl(Inventory.contains(iArr7) ? 1 : 0)) {
                WorldPoint worldPoint3 = new WorldPoint(lllll[28], lllll[29], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), lllll[5])) {
                    Clues.f0c = lllII[lllll[30]];
                    k.d(worldPoint3);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), lllll[5])) {
                    Clues.f0c = lllII[lllll[31]];
                    TileObjects.getNearest(tileObject2 -> {
                        if (lIIlIIIl(tileObject2.getName().contains(lllII[lllll[1187]]) ? 1 : 0) && lIIlIIIl(tileObject2.getWorldLocation().equals(new WorldPoint(lllll[33], lllll[29], lllll[0])) ? 1 : 0)) {
                            ?? r0 = lllll[1];
                            "".length();
                            return "   ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lllll[0];
                    }).interact(lllII[lllll[32]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr8 = new int[lllll[1]];
            iArr8[lllll[0]] = lllll[33];
            if (lIIlIIIl(Inventory.contains(iArr8) ? 1 : 0)) {
                WorldPoint worldPoint4 = new WorldPoint(lllll[34], lllll[35], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint4), lllll[5])) {
                    Clues.f0c = lllII[lllll[36]];
                    k.d(worldPoint4);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint4), lllll[5])) {
                    Clues.f0c = lllII[lllll[37]];
                    TileObjects.getNearest(tileObject3 -> {
                        return tileObject3.getName().contains(lllII[lllll[1013]]);
                    }).interact(lllII[lllll[38]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr9 = new int[lllll[1]];
            iArr9[lllll[0]] = lllll[39];
            if (lIIlIIIl(Inventory.contains(iArr9) ? 1 : 0)) {
                WorldPoint worldPoint5 = new WorldPoint(lllll[40], lllll[41], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint5), lllll[5])) {
                    Clues.f0c = lllII[lllll[42]];
                    k.d(worldPoint5);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint5), lllll[5])) {
                    Clues.f0c = lllII[lllll[43]];
                    int[] iArr10 = new int[lllll[1]];
                    iArr10[lllll[0]] = lllll[44];
                    TileObjects.getNearest(iArr10).interact(lllII[lllll[45]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr11 = new int[lllll[1]];
            iArr11[lllll[0]] = lllll[46];
            if (lIIlIIIl(Inventory.contains(iArr11) ? 1 : 0)) {
                WorldPoint worldPoint6 = new WorldPoint(lllll[47], lllll[48], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint6), lllll[1])) {
                    Clues.f0c = lllII[lllll[49]];
                    k.a(worldPoint6);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint6), lllll[1])) {
                    Clues.f0c = lllII[lllll[50]];
                    String[] strArr5 = new String[lllll[1]];
                    strArr5[lllll[0]] = lllII[lllll[51]];
                    TileObjects.getNearest(strArr5).interact(lllII[lllll[52]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr12 = new int[lllll[1]];
            iArr12[lllll[0]] = lllll[53];
            if (lIIlIIIl(Inventory.contains(iArr12) ? 1 : 0)) {
                WorldPoint worldPoint7 = new WorldPoint(lllll[54], lllll[55], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint7), lllll[5])) {
                    Clues.f0c = lllII[lllll[56]];
                    k.d(worldPoint7);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint7), lllll[5])) {
                    Clues.f0c = lllII[lllll[57]];
                    int[] iArr13 = new int[lllll[1]];
                    iArr13[lllll[0]] = lllll[58];
                    TileObjects.getNearest(iArr13).interact(lllII[lllll[59]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr14 = new int[lllll[1]];
            iArr14[lllll[0]] = lllll[60];
            if (lIIlIIIl(Inventory.contains(iArr14) ? 1 : 0)) {
                WorldPoint worldPoint8 = new WorldPoint(lllll[61], lllll[62], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint8), lllll[1])) {
                    Clues.f0c = lllII[lllll[63]];
                    k.a(worldPoint8);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint8), lllll[1])) {
                    Clues.f0c = lllII[lllll[64]];
                    String[] strArr6 = new String[lllll[1]];
                    strArr6[lllll[0]] = lllII[lllll[65]];
                    TileObjects.getNearest(strArr6).interact(lllII[lllll[66]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr15 = new int[lllll[1]];
            iArr15[lllll[0]] = lllll[67];
            if (lIIlIIIl(Inventory.contains(iArr15) ? 1 : 0)) {
                WorldPoint worldPoint9 = new WorldPoint(lllll[68], lllll[69], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint9), lllll[5])) {
                    Clues.f0c = lllII[lllll[70]];
                    k.d(worldPoint9);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint9), lllll[5])) {
                    Clues.f0c = lllII[lllll[71]];
                    String[] strArr7 = new String[lllll[1]];
                    strArr7[lllll[0]] = lllII[lllll[72]];
                    TileObjects.getNearest(strArr7).interact(lllII[lllll[73]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr16 = new int[lllll[1]];
            iArr16[lllll[0]] = lllll[74];
            if (lIIlIIIl(Inventory.contains(iArr16) ? 1 : 0)) {
                WorldPoint worldPoint10 = new WorldPoint(lllll[75], lllll[76], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint10), lllll[1])) {
                    Clues.f0c = lllII[lllll[77]];
                    k.d(worldPoint10);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint10), lllll[1]) && lIIlIIlI(Players.getLocal().isMoving() ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[78]];
                    int[] iArr17 = new int[lllll[1]];
                    iArr17[lllll[0]] = lllll[79];
                    TileObjects.getNearest(iArr17).interact(lllII[lllll[80]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr18 = new int[lllll[1]];
            iArr18[lllll[0]] = lllll[81];
            if (lIIlIIIl(Inventory.contains(iArr18) ? 1 : 0)) {
                WorldPoint worldPoint11 = new WorldPoint(lllll[82], lllll[83], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint11), lllll[5])) {
                    Clues.f0c = lllII[lllll[84]];
                    k.d(worldPoint11);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint11), lllll[5])) {
                    Clues.f0c = lllII[lllll[85]];
                    String[] strArr8 = new String[lllll[1]];
                    strArr8[lllll[0]] = lllII[lllll[86]];
                    TileObjects.getNearest(strArr8).interact(lllII[lllll[87]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr19 = new int[lllll[1]];
            iArr19[lllll[0]] = lllll[88];
            if (lIIlIIIl(Inventory.contains(iArr19) ? 1 : 0)) {
                WorldPoint worldPoint12 = new WorldPoint(lllll[89], lllll[90], lllll[1]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint12), lllll[5])) {
                    Clues.f0c = lllII[lllll[91]];
                    k.d(worldPoint12);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint12), lllll[5])) {
                    Clues.f0c = lllII[lllll[92]];
                    int[] iArr20 = new int[lllll[1]];
                    iArr20[lllll[0]] = lllll[44];
                    TileObjects.getNearest(iArr20).interact(lllII[lllll[93]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr21 = new int[lllll[1]];
            iArr21[lllll[0]] = lllll[94];
            if (lIIlIIIl(Inventory.contains(iArr21) ? 1 : 0)) {
                WorldPoint worldPoint13 = new WorldPoint(lllll[95], lllll[96], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint13), lllll[5])) {
                    Clues.f0c = lllII[lllll[97]];
                    k.d(worldPoint13);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint13), lllll[5])) {
                    Clues.f0c = lllII[lllll[98]];
                    String[] strArr9 = new String[lllll[1]];
                    strArr9[lllll[0]] = lllII[lllll[99]];
                    TileObjects.getNearest(strArr9).interact(lllII[lllll[100]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr22 = new int[lllll[1]];
            iArr22[lllll[0]] = lllll[101];
            if (lIIlIIIl(Inventory.contains(iArr22) ? 1 : 0)) {
                WorldPoint worldPoint14 = new WorldPoint(lllll[102], lllll[103], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint14), lllll[1])) {
                    Clues.f0c = lllII[lllll[104]];
                    k.d(worldPoint14);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint14), lllll[1])) {
                    Clues.f0c = lllII[lllll[105]];
                    String[] strArr10 = new String[lllll[1]];
                    strArr10[lllll[0]] = lllII[lllll[106]];
                    TileObjects.getNearest(strArr10).interact(lllII[lllll[107]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr23 = new int[lllll[1]];
            iArr23[lllll[0]] = lllll[108];
            if (lIIlIIIl(Inventory.contains(iArr23) ? 1 : 0)) {
                WorldPoint worldPoint15 = new WorldPoint(lllll[16], lllll[17], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint15), lllll[5])) {
                    Clues.f0c = lllII[lllll[109]];
                    k.d(worldPoint15);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint15), lllll[5])) {
                    Clues.f0c = lllII[lllll[110]];
                    String[] strArr11 = new String[lllll[1]];
                    strArr11[lllll[0]] = lllII[lllll[111]];
                    TileObjects.getNearest(strArr11).interact(lllII[lllll[112]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr24 = new int[lllll[1]];
            iArr24[lllll[0]] = lllll[113];
            if (lIIlIIIl(Inventory.contains(iArr24) ? 1 : 0)) {
                WorldPoint worldPoint16 = new WorldPoint(lllll[114], lllll[115], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint16), lllll[5])) {
                    Clues.f0c = lllII[lllll[116]];
                    k.d(worldPoint16);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint16), lllll[5])) {
                    Clues.f0c = lllII[lllll[117]];
                    String[] strArr12 = new String[lllll[1]];
                    strArr12[lllll[0]] = lllII[lllll[118]];
                    TileObjects.getNearest(strArr12).interact(lllII[lllll[119]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr25 = new int[lllll[1]];
            iArr25[lllll[0]] = lllll[120];
            if (lIIlIIIl(Inventory.contains(iArr25) ? 1 : 0)) {
                WorldPoint worldPoint17 = new WorldPoint(lllll[121], lllll[122], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint17), lllll[1])) {
                    Clues.f0c = lllII[lllll[123]];
                    k.d(worldPoint17);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint17), lllll[1])) {
                    Clues.f0c = lllII[lllll[124]];
                    String[] strArr13 = new String[lllll[1]];
                    strArr13[lllll[0]] = lllII[lllll[125]];
                    TileObjects.getNearest(strArr13).interact(lllII[lllll[126]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr26 = new int[lllll[1]];
            iArr26[lllll[0]] = lllll[127];
            if (lIIlIIIl(Inventory.contains(iArr26) ? 1 : 0)) {
                WorldPoint worldPoint18 = new WorldPoint(lllll[128], lllll[129], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint18), lllll[5])) {
                    Clues.f0c = lllII[lllll[130]];
                    k.d(worldPoint18);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint18), lllll[5])) {
                    Clues.f0c = lllII[lllll[131]];
                    String[] strArr14 = new String[lllll[1]];
                    strArr14[lllll[0]] = lllII[lllll[132]];
                    TileObjects.getNearest(strArr14).interact(lllII[lllll[133]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr27 = new int[lllll[1]];
            iArr27[lllll[0]] = lllll[134];
            if (lIIlIIIl(Inventory.contains(iArr27) ? 1 : 0)) {
                WorldPoint worldPoint19 = new WorldPoint(lllll[135], lllll[136], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint19), lllll[1])) {
                    Clues.f0c = lllII[lllll[137]];
                    k.d(worldPoint19);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint19), lllll[1])) {
                    Clues.f0c = lllII[lllll[138]];
                    String[] strArr15 = new String[lllll[1]];
                    strArr15[lllll[0]] = lllII[lllll[139]];
                    TileObjects.getNearest(strArr15).interact(lllII[lllll[140]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr28 = new int[lllll[1]];
            iArr28[lllll[0]] = lllll[141];
            if (lIIlIIIl(Inventory.contains(iArr28) ? 1 : 0)) {
                WorldPoint worldPoint20 = new WorldPoint(lllll[142], lllll[143], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint20), lllll[1])) {
                    Clues.f0c = lllII[lllll[144]];
                    k.d(worldPoint20);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint20), lllll[1]) && lIIlIIlI(Players.getLocal().isMoving() ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[145]];
                    String[] strArr16 = new String[lllll[1]];
                    strArr16[lllll[0]] = lllII[lllll[146]];
                    TileObjects.getNearest(strArr16).interact(lllII[lllll[147]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr29 = new int[lllll[1]];
            iArr29[lllll[0]] = lllll[148];
            if (lIIlIIIl(Inventory.contains(iArr29) ? 1 : 0)) {
                WorldPoint worldPoint21 = new WorldPoint(lllll[149], lllll[150], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint21), lllll[5])) {
                    Clues.f0c = lllII[lllll[151]];
                    k.d(worldPoint21);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint21), lllll[5])) {
                    Clues.f0c = lllII[lllll[152]];
                    String[] strArr17 = new String[lllll[1]];
                    strArr17[lllll[0]] = lllII[lllll[153]];
                    TileObjects.getNearest(strArr17).interact(lllII[lllll[154]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr30 = new int[lllll[1]];
            iArr30[lllll[0]] = lllll[155];
            if (lIIlIIIl(Inventory.contains(iArr30) ? 1 : 0)) {
                WorldPoint worldPoint22 = new WorldPoint(lllll[156], lllll[157], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint22), lllll[5])) {
                    Clues.f0c = lllII[lllll[158]];
                    k.d(worldPoint22);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint22), lllll[5])) {
                    Clues.f0c = lllII[lllll[159]];
                    int[] iArr31 = new int[lllll[1]];
                    iArr31[lllll[0]] = lllll[58];
                    TileObjects.getNearest(iArr31).interact(lllII[lllll[160]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr32 = new int[lllll[1]];
            iArr32[lllll[0]] = lllll[161];
            if (lIIlIIIl(Inventory.contains(iArr32) ? 1 : 0)) {
                WorldPoint worldPoint23 = new WorldPoint(lllll[156], lllll[162], lllll[1]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint23), lllll[5])) {
                    Clues.f0c = lllII[lllll[163]];
                    k.d(worldPoint23);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint23), lllll[5])) {
                    Clues.f0c = lllII[lllll[164]];
                    String[] strArr18 = new String[lllll[1]];
                    strArr18[lllll[0]] = lllII[lllll[165]];
                    TileObjects.getNearest(strArr18).interact(lllII[lllll[166]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr33 = new int[lllll[1]];
            iArr33[lllll[0]] = lllll[167];
            if (lIIlIIIl(Inventory.contains(iArr33) ? 1 : 0)) {
                WorldPoint worldPoint24 = new WorldPoint(lllll[114], lllll[168], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint24), lllll[1])) {
                    Clues.f0c = lllII[lllll[169]];
                    k.d(worldPoint24);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint24), lllll[1])) {
                    Clues.f0c = lllII[lllll[170]];
                    String[] strArr19 = new String[lllll[1]];
                    strArr19[lllll[0]] = lllII[lllll[171]];
                    TileObjects.getNearest(strArr19).interact(lllII[lllll[172]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr34 = new int[lllll[1]];
            iArr34[lllll[0]] = lllll[173];
            if (lIIlIIIl(Inventory.contains(iArr34) ? 1 : 0)) {
                WorldPoint worldPoint25 = new WorldPoint(lllll[174], lllll[175], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint25), lllll[5])) {
                    Clues.f0c = lllII[lllll[176]];
                    k.d(worldPoint25);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint25), lllll[5])) {
                    Clues.f0c = lllII[lllll[177]];
                    int[] iArr35 = new int[lllll[1]];
                    iArr35[lllll[0]] = lllll[178];
                    TileObjects.getNearest(iArr35).interact(lllII[lllll[179]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr36 = new int[lllll[1]];
            iArr36[lllll[0]] = lllll[180];
            if (lIIlIIIl(Inventory.contains(iArr36) ? 1 : 0)) {
                WorldPoint worldPoint26 = new WorldPoint(lllll[181], lllll[182], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint26), lllll[5])) {
                    Clues.f0c = lllII[lllll[183]];
                    k.d(worldPoint26);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint26), lllll[5])) {
                    Clues.f0c = lllII[lllll[184]];
                    int[] iArr37 = new int[lllll[1]];
                    iArr37[lllll[0]] = lllll[185];
                    TileObjects.getNearest(iArr37).interact(lllII[lllll[186]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr38 = new int[lllll[1]];
            iArr38[lllll[0]] = lllll[187];
            if (lIIlIIIl(Inventory.contains(iArr38) ? 1 : 0)) {
                WorldPoint worldPoint27 = new WorldPoint(lllll[188], lllll[189], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint27), lllll[5])) {
                    Clues.f0c = lllII[lllll[190]];
                    WorldArea worldArea = new WorldArea(lllll[191], lllll[192], lllll[31], lllll[20], lllll[0]);
                    if (lIIlIIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        int[] iArr39 = new int[lllll[1]];
                        iArr39[lllll[0]] = lllll[193];
                        if (lIIlIIIl(Inventory.contains(iArr39) ? 1 : 0)) {
                            int[] iArr40 = new int[lllll[1]];
                            iArr40[lllll[0]] = lllll[193];
                            Inventory.getFirst(iArr40).interact(lllII[lllll[194]]);
                            Time.sleepUntil(() -> {
                                if (lIIlIIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    ?? r0 = lllll[1];
                                    "".length();
                                    return !((true ^ true) ^ (true ^ true)) ? ((((15 + 26) - 28) + 203) ^ (((72 + 74) - 55) + 66)) & (((161 ^ 155) ^ (((92 + 42) - 127) + 120)) ^ (-" ".length())) : r0;
                                }
                                return lllll[0];
                            }, lllll[195]);
                            "".length();
                        }
                        int[] iArr41 = new int[lllll[1]];
                        iArr41[lllll[0]] = lllll[193];
                        if (lIIlIIlI(Inventory.contains(iArr41) ? 1 : 0)) {
                            int[] iArr42 = new int[lllll[1]];
                            iArr42[lllll[0]] = lllll[196];
                            if (lIIlIIIl(Inventory.contains(iArr42) ? 1 : 0)) {
                                int[] iArr43 = new int[lllll[1]];
                                iArr43[lllll[0]] = lllll[197];
                                if (lIIlIIIl(Inventory.contains(iArr43) ? 1 : 0)) {
                                    int[] iArr44 = new int[lllll[1]];
                                    iArr44[lllll[0]] = lllll[198];
                                    if (lIIlIIIl(Inventory.contains(iArr44) ? 1 : 0)) {
                                        Magic.cast(SpellBook.Standard.FALADOR_TELEPORT);
                                        Time.sleepUntil(() -> {
                                            if (lIIlIIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                ?? r0 = lllll[1];
                                                "".length();
                                                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                            }
                                            return lllll[0];
                                        }, lllll[195]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                    k.d(worldPoint27);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint27), lllll[5]) && lIIlIIlI(Players.getLocal().isMoving() ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[199]];
                    int[] iArr45 = new int[lllll[1]];
                    iArr45[lllll[0]] = lllll[44];
                    TileObjects.getNearest(iArr45).interact(lllII[lllll[200]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr46 = new int[lllll[1]];
            iArr46[lllll[0]] = lllll[201];
            if (lIIlIIIl(Inventory.contains(iArr46) ? 1 : 0)) {
                WorldPoint worldPoint28 = new WorldPoint(lllll[202], lllll[203], lllll[1]);
                if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint28) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[204]];
                    k.d(worldPoint28);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint28) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[205]];
                    TileObject nearest2 = TileObjects.getNearest(tileObject4 -> {
                        return tileObject4.getName().contains(lllII[lllll[1186]]);
                    });
                    if (lIIlIIll(nearest2)) {
                        String[] strArr20 = new String[lllll[1]];
                        strArr20[lllll[0]] = lllII[lllll[206]];
                        if (lIIlIIIl(nearest2.hasAction(strArr20) ? 1 : 0)) {
                            nearest2.interact(lllII[lllll[207]]);
                            Time.sleepTicks(k.c(lllll[5], lllll[6]));
                            "".length();
                        }
                    }
                }
            }
            int[] iArr47 = new int[lllll[1]];
            iArr47[lllll[0]] = lllll[208];
            if (lIIlIIIl(Inventory.contains(iArr47) ? 1 : 0)) {
                WorldPoint worldPoint29 = new WorldPoint(lllll[209], lllll[210], lllll[0]);
                if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint29) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[211]];
                    if (lIIlIIIl(new WorldArea(lllll[212], lllll[213], lllll[71], lllll[31], lllll[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lIIlIIlI(Clues.e ? 1 : 0)) {
                            int[] iArr48 = new int[lllll[1]];
                            iArr48[lllll[0]] = lllll[193];
                            if (lIIlIIIl(Inventory.contains(iArr48) ? 1 : 0)) {
                                int[] iArr49 = new int[lllll[1]];
                                iArr49[lllll[0]] = lllll[193];
                                Inventory.getFirst(iArr49).interact(lllII[lllll[214]]);
                                Time.sleepTicks(k.c(lllll[10], lllll[11]));
                                "".length();
                            }
                        }
                        if (lIIlIIIl(Clues.e ? 1 : 0)) {
                            Magic.cast(SpellBook.Standard.FALADOR_TELEPORT);
                            Time.sleepTicks(k.c(lllll[10], lllll[11]));
                            "".length();
                        }
                    }
                    k.d(worldPoint29);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint29) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[215]];
                    TileObject nearest3 = TileObjects.getNearest(tileObject5 -> {
                        return tileObject5.getName().contains(lllII[lllll[1185]]);
                    });
                    if (lIIlIIll(nearest3)) {
                        String[] strArr21 = new String[lllll[1]];
                        strArr21[lllll[0]] = lllII[lllll[216]];
                        if (lIIlIIIl(nearest3.hasAction(strArr21) ? 1 : 0)) {
                            nearest3.interact(lllII[lllll[217]]);
                            Time.sleepTicks(k.c(lllll[5], lllll[6]));
                            "".length();
                        }
                    }
                }
            }
            int[] iArr50 = new int[lllll[1]];
            iArr50[lllll[0]] = lllll[218];
            if (lIIlIIIl(Inventory.contains(iArr50) ? 1 : 0)) {
                WorldPoint worldPoint30 = new WorldPoint(lllll[219], lllll[220], lllll[5]);
                if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint30) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[221]];
                    k.d(worldPoint30);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint30) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[222]];
                    TileObject nearest4 = TileObjects.getNearest(tileObject6 -> {
                        return tileObject6.getName().contains(lllII[lllll[1184]]);
                    });
                    if (lIIlIIll(nearest4)) {
                        String[] strArr22 = new String[lllll[1]];
                        strArr22[lllll[0]] = lllII[lllll[223]];
                        if (lIIlIIIl(nearest4.hasAction(strArr22) ? 1 : 0)) {
                            nearest4.interact(lllII[lllll[224]]);
                            Time.sleepTicks(k.c(lllll[5], lllll[6]));
                            "".length();
                        }
                        String[] strArr23 = new String[lllll[1]];
                        strArr23[lllll[0]] = lllII[lllll[225]];
                        if (lIIlIIIl(nearest4.hasAction(strArr23) ? 1 : 0)) {
                            nearest4.interact(lllII[lllll[226]]);
                            Time.sleepTicks(k.c(lllll[5], lllll[6]));
                            "".length();
                        }
                    }
                }
            }
            int[] iArr51 = new int[lllll[1]];
            iArr51[lllll[0]] = lllll[227];
            if (lIIlIIIl(Inventory.contains(iArr51) ? 1 : 0)) {
                WorldPoint worldPoint31 = new WorldPoint(lllll[228], lllll[229], lllll[0]);
                if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint31) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[230]];
                    k.d(worldPoint31);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint31) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[231]];
                    TileObject nearest5 = TileObjects.getNearest(tileObject7 -> {
                        return tileObject7.getName().contains(lllII[lllll[913]]);
                    });
                    if (lIIlIIll(nearest5)) {
                        String[] strArr24 = new String[lllll[1]];
                        strArr24[lllll[0]] = lllII[lllll[232]];
                        if (lIIlIIIl(nearest5.hasAction(strArr24) ? 1 : 0)) {
                            nearest5.interact(lllII[lllll[233]]);
                            Time.sleepTicks(k.c(lllll[5], lllll[6]));
                            "".length();
                        }
                    }
                }
            }
            int[] iArr52 = new int[lllll[1]];
            iArr52[lllll[0]] = lllll[234];
            if (lIIlIIIl(Inventory.contains(iArr52) ? 1 : 0)) {
                WorldPoint worldPoint32 = new WorldPoint(lllll[235], lllll[236], lllll[0]);
                if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint32) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[237]];
                    k.d(worldPoint32);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint32) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[238]];
                    TileObject nearest6 = TileObjects.getNearest(tileObject8 -> {
                        return tileObject8.getName().contains(lllII[lllll[1183]]);
                    });
                    if (lIIlIIll(nearest6)) {
                        String[] strArr25 = new String[lllll[1]];
                        strArr25[lllll[0]] = lllII[lllll[239]];
                        if (lIIlIIIl(nearest6.hasAction(strArr25) ? 1 : 0)) {
                            nearest6.interact(lllII[lllll[240]]);
                            Time.sleepTicks(k.c(lllll[5], lllll[6]));
                            "".length();
                        }
                    }
                }
            }
            int[] iArr53 = new int[lllll[1]];
            iArr53[lllll[0]] = lllll[241];
            if (lIIlIIIl(Inventory.contains(iArr53) ? 1 : 0)) {
                WorldPoint worldPoint33 = new WorldPoint(lllll[242], lllll[243], lllll[0]);
                if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint33) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[244]];
                    k.d(worldPoint33);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint33) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[245]];
                    TileObject nearest7 = TileObjects.getNearest(tileObject9 -> {
                        return tileObject9.getName().contains(lllII[lllll[1182]]);
                    });
                    if (lIIlIIll(nearest7)) {
                        String[] strArr26 = new String[lllll[1]];
                        strArr26[lllll[0]] = lllII[lllll[246]];
                        if (lIIlIIIl(nearest7.hasAction(strArr26) ? 1 : 0)) {
                            nearest7.interact(lllII[lllll[247]]);
                            Time.sleepTicks(k.c(lllll[5], lllll[6]));
                            "".length();
                        }
                    }
                }
            }
            int[] iArr54 = new int[lllll[1]];
            iArr54[lllll[0]] = lllll[29];
            if (lIIlIIIl(Inventory.contains(iArr54) ? 1 : 0)) {
                WorldPoint worldPoint34 = new WorldPoint(lllll[248], lllll[249], lllll[1]);
                if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint34) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[250]];
                    k.d(worldPoint34);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint34) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[251]];
                    TileObject nearest8 = TileObjects.getNearest(tileObject10 -> {
                        return tileObject10.getName().contains(lllII[lllll[1181]]);
                    });
                    if (lIIlIIll(nearest8)) {
                        String[] strArr27 = new String[lllll[1]];
                        strArr27[lllll[0]] = lllII[lllll[252]];
                        if (lIIlIIIl(nearest8.hasAction(strArr27) ? 1 : 0)) {
                            nearest8.interact(lllII[lllll[253]]);
                            Time.sleepTicks(k.c(lllll[5], lllll[6]));
                            "".length();
                        }
                    }
                }
            }
            int[] iArr55 = new int[lllll[1]];
            iArr55[lllll[0]] = lllll[254];
            if (lIIlIIIl(Inventory.contains(iArr55) ? 1 : 0)) {
                WorldPoint worldPoint35 = new WorldPoint(lllll[255], lllll[129], lllll[1]);
                if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint35) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[256]];
                    k.d(worldPoint35);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint35) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[257]];
                    TileObject nearest9 = TileObjects.getNearest(tileObject11 -> {
                        return tileObject11.getName().contains(lllII[lllll[1180]]);
                    });
                    if (lIIlIIll(nearest9)) {
                        String[] strArr28 = new String[lllll[1]];
                        strArr28[lllll[0]] = lllII[lllll[258]];
                        if (lIIlIIIl(nearest9.hasAction(strArr28) ? 1 : 0)) {
                            nearest9.interact(lllII[lllll[259]]);
                            Time.sleepTicks(k.c(lllll[5], lllll[6]));
                            "".length();
                        }
                    }
                }
            }
            int[] iArr56 = new int[lllll[1]];
            iArr56[lllll[0]] = lllll[260];
            if (lIIlIIIl(Inventory.contains(iArr56) ? 1 : 0)) {
                WorldPoint worldPoint36 = new WorldPoint(lllll[261], lllll[262], lllll[1]);
                if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint36) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[263]];
                    k.d(worldPoint36);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint36) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[264]];
                    TileObject nearest10 = TileObjects.getNearest(tileObject12 -> {
                        return tileObject12.getName().contains(lllII[lllll[1179]]);
                    });
                    if (lIIlIIll(nearest10)) {
                        String[] strArr29 = new String[lllll[1]];
                        strArr29[lllll[0]] = lllII[lllll[265]];
                        if (lIIlIIIl(nearest10.hasAction(strArr29) ? 1 : 0)) {
                            nearest10.interact(lllII[lllll[266]]);
                            Time.sleepTicks(k.c(lllll[5], lllll[6]));
                            "".length();
                        }
                    }
                }
            }
            int[] iArr57 = new int[lllll[1]];
            iArr57[lllll[0]] = lllll[267];
            if (lIIlIIIl(Inventory.contains(iArr57) ? 1 : 0)) {
                WorldPoint worldPoint37 = new WorldPoint(lllll[268], lllll[269], lllll[0]);
                if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint37) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[270]];
                    k.d(worldPoint37);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint37) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[271]];
                    TileObject nearest11 = TileObjects.getNearest(tileObject13 -> {
                        return tileObject13.getName().contains(lllII[lllll[985]]);
                    });
                    if (lIIlIIll(nearest11)) {
                        String[] strArr30 = new String[lllll[1]];
                        strArr30[lllll[0]] = lllII[lllll[272]];
                        if (lIIlIIIl(nearest11.hasAction(strArr30) ? 1 : 0)) {
                            nearest11.interact(lllII[lllll[273]]);
                            Time.sleepTicks(k.c(lllll[5], lllll[6]));
                            "".length();
                        }
                        String[] strArr31 = new String[lllll[1]];
                        strArr31[lllll[0]] = lllII[lllll[274]];
                        if (lIIlIIIl(nearest11.hasAction(strArr31) ? 1 : 0)) {
                            nearest11.interact(lllII[lllll[275]]);
                            Time.sleepTicks(k.c(lllll[5], lllll[6]));
                            "".length();
                        }
                    }
                }
            }
            int[] iArr58 = new int[lllll[1]];
            iArr58[lllll[0]] = lllll[276];
            if (lIIlIIIl(Inventory.contains(iArr58) ? 1 : 0)) {
                WorldPoint worldPoint38 = new WorldPoint(lllll[277], lllll[278], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint38), lllll[5])) {
                    Clues.f0c = lllII[lllll[279]];
                    k.d(worldPoint38);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint38), lllll[5])) {
                    Clues.f0c = lllII[lllll[280]];
                    int[] iArr59 = new int[lllll[1]];
                    iArr59[lllll[0]] = lllll[281];
                    TileObjects.getNearest(iArr59).interact(lllII[lllll[282]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr60 = new int[lllll[1]];
            iArr60[lllll[0]] = lllll[283];
            if (lIIlIIIl(Inventory.contains(iArr60) ? 1 : 0)) {
                WorldPoint worldPoint39 = new WorldPoint(lllll[284], lllll[285], lllll[0]);
                if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint39) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[286]];
                    k.d(worldPoint39);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint39) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[287]];
                    int[] iArr61 = new int[lllll[1]];
                    iArr61[lllll[0]] = lllll[44];
                    TileObjects.getNearest(iArr61).interact(lllII[lllll[288]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr62 = new int[lllll[1]];
            iArr62[lllll[0]] = lllll[289];
            if (lIIlIIIl(Inventory.contains(iArr62) ? 1 : 0)) {
                WorldPoint worldPoint40 = new WorldPoint(lllll[290], lllll[291], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint40), lllll[5])) {
                    Clues.f0c = lllII[lllll[292]];
                    k.d(worldPoint40);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint40), lllll[5])) {
                    Clues.f0c = lllII[lllll[293]];
                    int[] iArr63 = new int[lllll[1]];
                    iArr63[lllll[0]] = lllll[294];
                    TileObjects.getNearest(iArr63).interact(lllII[lllll[295]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr64 = new int[lllll[1]];
            iArr64[lllll[0]] = lllll[296];
            if (lIIlIIIl(Inventory.contains(iArr64) ? 1 : 0)) {
                WorldPoint worldPoint41 = new WorldPoint(lllll[297], lllll[298], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint41), lllll[1])) {
                    Clues.f0c = lllII[lllll[299]];
                    k.d(worldPoint41);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint41), lllll[1])) {
                    Clues.f0c = lllII[lllll[300]];
                    int[] iArr65 = new int[lllll[1]];
                    iArr65[lllll[0]] = lllll[301];
                    TileObjects.getNearest(iArr65).interact(lllII[lllll[302]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr66 = new int[lllll[1]];
            iArr66[lllll[0]] = lllll[303];
            if (lIIlIIIl(Inventory.contains(iArr66) ? 1 : 0)) {
                WorldPoint worldPoint42 = new WorldPoint(lllll[304], lllll[305], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint42), lllll[5])) {
                    Clues.f0c = lllII[lllll[306]];
                    k.d(worldPoint42);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint42), lllll[5])) {
                    Clues.f0c = lllII[lllll[307]];
                    int[] iArr67 = new int[lllll[1]];
                    iArr67[lllll[0]] = lllll[44];
                    TileObjects.getNearest(iArr67).interact(lllII[lllll[308]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr68 = new int[lllll[1]];
            iArr68[lllll[0]] = lllll[309];
            if (lIIlIIIl(Inventory.contains(iArr68) ? 1 : 0)) {
                WorldPoint worldPoint43 = new WorldPoint(lllll[310], lllll[208], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint43), lllll[5])) {
                    Clues.f0c = lllII[lllll[311]];
                    k.d(worldPoint43);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint43), lllll[5])) {
                    Clues.f0c = lllII[lllll[312]];
                    int[] iArr69 = new int[lllll[1]];
                    iArr69[lllll[0]] = lllll[313];
                    TileObjects.getNearest(iArr69).interact(lllII[lllll[314]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr70 = new int[lllll[1]];
            iArr70[lllll[0]] = lllll[315];
            if (lIIlIIIl(Inventory.contains(iArr70) ? 1 : 0)) {
                WorldPoint worldPoint44 = new WorldPoint(lllll[316], lllll[317], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint44), lllll[5])) {
                    Clues.f0c = lllII[lllll[318]];
                    k.d(worldPoint44);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint44), lllll[5])) {
                    Clues.f0c = lllII[lllll[319]];
                    int[] iArr71 = new int[lllll[1]];
                    iArr71[lllll[0]] = lllll[320];
                    TileObjects.getNearest(iArr71).interact(lllII[lllll[321]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr72 = new int[lllll[1]];
            iArr72[lllll[0]] = lllll[322];
            if (lIIlIIIl(Inventory.contains(iArr72) ? 1 : 0)) {
                WorldPoint worldPoint45 = new WorldPoint(lllll[323], lllll[324], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint45), lllll[5])) {
                    Clues.f0c = lllII[lllll[325]];
                    k.d(worldPoint45);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint45), lllll[5])) {
                    Clues.f0c = lllII[lllll[326]];
                    String[] strArr32 = new String[lllll[1]];
                    strArr32[lllll[0]] = lllII[lllll[327]];
                    TileObjects.getNearest(strArr32).interact(lllII[lllll[328]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr73 = new int[lllll[1]];
            iArr73[lllll[0]] = lllll[329];
            if (lIIlIIIl(Inventory.contains(iArr73) ? 1 : 0)) {
                WorldPoint worldPoint46 = new WorldPoint(lllll[330], lllll[331], lllll[5]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint46), lllll[5])) {
                    Clues.f0c = lllII[lllll[332]];
                    k.d(worldPoint46);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint46), lllll[5])) {
                    Clues.f0c = lllII[lllll[333]];
                    int[] iArr74 = new int[lllll[1]];
                    iArr74[lllll[0]] = lllll[334];
                    TileObjects.getNearest(iArr74).interact(lllII[lllll[335]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr75 = new int[lllll[1]];
            iArr75[lllll[0]] = lllll[336];
            if (lIIlIIIl(Inventory.contains(iArr75) ? 1 : 0)) {
                WorldPoint worldPoint47 = new WorldPoint(lllll[337], lllll[338], lllll[0]);
                if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint47) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[339]];
                    k.d(worldPoint47);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint47) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[340]];
                    TileObject nearest12 = TileObjects.getNearest(tileObject14 -> {
                        if (lIIlIIIl(tileObject14.getName().contains(lllII[lllll[1177]]) ? 1 : 0)) {
                            String[] strArr33 = new String[lllll[1]];
                            strArr33[lllll[0]] = lllII[lllll[1178]];
                            if (lIIlIIIl(tileObject14.hasAction(strArr33) ? 1 : 0) && lIIlIlIl(tileObject14.getWorldLocation().distanceTo(new WorldPoint(lllll[337], lllll[338], lllll[0])), lllll[5])) {
                                ?? r0 = lllll[1];
                                "".length();
                                return (-((((76 + 83) - 66) + 75) ^ (((15 + 114) - (-40)) + 3))) > 0 ? ((((33 + 121) - 148) + 127) ^ (((103 + 15) - (-29)) + 6)) & (((((91 + 14) - 71) + 111) ^ (((120 + 71) - 109) + 59)) ^ (-" ".length())) : r0;
                            }
                        }
                        return lllll[0];
                    });
                    if (lIIlIIll(nearest12)) {
                        nearest12.interact(lllII[lllll[341]]);
                        Time.sleepTicks(lllll[6]);
                        "".length();
                    }
                    if (lIIlIllI(nearest12)) {
                        String[] strArr33 = new String[lllll[1]];
                        strArr33[lllll[0]] = lllII[lllll[342]];
                        TileObjects.getNearest(strArr33).interact(lllII[lllll[343]]);
                        Time.sleepTicks(lllll[6]);
                        "".length();
                    }
                }
            }
            int[] iArr76 = new int[lllll[1]];
            iArr76[lllll[0]] = lllll[344];
            if (lIIlIIIl(Inventory.contains(iArr76) ? 1 : 0)) {
                WorldPoint worldPoint48 = new WorldPoint(lllll[345], lllll[346], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint48), lllll[5])) {
                    Clues.f0c = lllII[lllll[347]];
                    k.d(worldPoint48);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint48), lllll[5])) {
                    Clues.f0c = lllII[lllll[348]];
                    String[] strArr34 = new String[lllll[1]];
                    strArr34[lllll[0]] = lllII[lllll[349]];
                    TileObjects.getNearest(strArr34).interact(lllII[lllll[350]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr77 = new int[lllll[1]];
            iArr77[lllll[0]] = lllll[351];
            if (lIIlIIIl(Inventory.contains(iArr77) ? 1 : 0)) {
                WorldPoint worldPoint49 = new WorldPoint(lllll[2], lllll[352], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint49), lllll[1])) {
                    Clues.f0c = lllII[lllll[353]];
                    k.d(worldPoint49);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint49), lllll[1])) {
                    Clues.f0c = lllII[lllll[354]];
                    String[] strArr35 = new String[lllll[1]];
                    strArr35[lllll[0]] = lllII[lllll[355]];
                    TileObjects.getNearest(strArr35).interact(lllII[lllll[356]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr78 = new int[lllll[1]];
            iArr78[lllll[0]] = lllll[357];
            if (lIIlIIIl(Inventory.contains(iArr78) ? 1 : 0)) {
                WorldPoint worldPoint50 = new WorldPoint(lllll[358], lllll[359], lllll[0]);
                if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint50) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[360]];
                    k.d(worldPoint50);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint50) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[361]];
                    TileObjects.getNearest(tileObject15 -> {
                        return tileObject15.getName().contains(lllII[lllll[1176]]);
                    }).interact(lllII[lllll[362]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr79 = new int[lllll[1]];
            iArr79[lllll[0]] = lllll[363];
            if (lIIlIIIl(Inventory.contains(iArr79) ? 1 : 0)) {
                WorldPoint worldPoint51 = new WorldPoint(lllll[364], lllll[352], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint51), lllll[5])) {
                    Clues.f0c = lllII[lllll[365]];
                    k.d(worldPoint51);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint51), lllll[5])) {
                    Clues.f0c = lllII[lllll[366]];
                    String[] strArr36 = new String[lllll[1]];
                    strArr36[lllll[0]] = lllII[lllll[367]];
                    TileObjects.getNearest(strArr36).interact(lllII[lllll[368]]);
                    Time.sleepTicks(lllll[6]);
                    "".length();
                }
            }
            int[] iArr80 = new int[lllll[1]];
            iArr80[lllll[0]] = lllll[369];
            if (lIIlIIIl(Inventory.contains(iArr80) ? 1 : 0)) {
                WorldPoint worldPoint52 = new WorldPoint(lllll[370], lllll[371], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint52), lllll[5])) {
                    Clues.f0c = lllII[lllll[372]];
                    k.d(worldPoint52);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint52), lllll[5])) {
                    Clues.f0c = lllII[lllll[373]];
                    TileObject nearest13 = TileObjects.getNearest(tileObject16 -> {
                        if (lIIlIIIl(tileObject16.getName().contains(lllII[lllll[1174]]) ? 1 : 0)) {
                            String[] strArr37 = new String[lllll[1]];
                            strArr37[lllll[0]] = lllII[lllll[1175]];
                            if (lIIlIIIl(tileObject16.hasAction(strArr37) ? 1 : 0) && lIIlIlIl(tileObject16.getWorldLocation().distanceTo(new WorldPoint(lllll[370], lllll[467], lllll[0])), lllll[5])) {
                                ?? r0 = lllll[1];
                                "".length();
                                return "  ".length() < 0 ? ((((130 + 108) - 155) + 49) ^ (((68 + 62) - 105) + 137)) & (((119 ^ 94) ^ (37 ^ 42)) ^ (-" ".length())) : r0;
                            }
                        }
                        return lllll[0];
                    });
                    if (lIIlIIll(nearest13)) {
                        nearest13.interact(lllII[lllll[374]]);
                        Time.sleepTicks(lllll[6]);
                        "".length();
                    }
                    if (lIIlIllI(nearest13)) {
                        String[] strArr37 = new String[lllll[1]];
                        strArr37[lllll[0]] = lllII[lllll[375]];
                        TileObject nearest14 = TileObjects.getNearest(strArr37);
                        if (lIIlIIll(nearest14)) {
                            String[] strArr38 = new String[lllll[1]];
                            strArr38[lllll[0]] = lllII[lllll[376]];
                            if (lIIlIIIl(nearest14.hasAction(strArr38) ? 1 : 0)) {
                                nearest14.interact(lllII[lllll[377]]);
                                Time.sleepTicks(lllll[6]);
                                "".length();
                            }
                            String[] strArr39 = new String[lllll[1]];
                            strArr39[lllll[0]] = lllII[lllll[378]];
                            if (lIIlIIIl(nearest14.hasAction(strArr39) ? 1 : 0)) {
                                nearest14.interact(lllII[lllll[379]]);
                                Time.sleepTicks(lllll[6]);
                                "".length();
                            }
                        }
                    }
                }
            }
            int[] iArr81 = new int[lllll[1]];
            iArr81[lllll[0]] = lllll[380];
            if (lIIlIIIl(Inventory.contains(iArr81) ? 1 : 0)) {
                WorldPoint worldPoint53 = new WorldPoint(lllll[381], lllll[228], lllll[0]);
                if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint53) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[382]];
                    k.d(worldPoint53);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint53) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[383]];
                    String[] strArr40 = new String[lllll[1]];
                    strArr40[lllll[0]] = lllII[lllll[384]];
                    TileObject nearest15 = TileObjects.getNearest(strArr40);
                    if (lIIlIIll(nearest15)) {
                        String[] strArr41 = new String[lllll[1]];
                        strArr41[lllll[0]] = lllII[lllll[385]];
                        if (lIIlIIIl(nearest15.hasAction(strArr41) ? 1 : 0)) {
                            nearest15.interact(lllII[lllll[386]]);
                            Time.sleepTicks(lllll[6]);
                            "".length();
                        }
                        String[] strArr42 = new String[lllll[1]];
                        strArr42[lllll[0]] = lllII[lllll[387]];
                        if (lIIlIIIl(nearest15.hasAction(strArr42) ? 1 : 0)) {
                            nearest15.interact(lllII[lllll[388]]);
                            Time.sleepTicks(lllll[6]);
                            "".length();
                        }
                    }
                }
            }
            int[] iArr82 = new int[lllll[1]];
            iArr82[lllll[0]] = lllll[389];
            if (lIIlIIIl(Inventory.contains(iArr82) ? 1 : 0)) {
                WorldPoint worldPoint54 = new WorldPoint(lllll[390], lllll[391], lllll[0]);
                if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint54) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[392]];
                    k.d(worldPoint54);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint54) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[393]];
                    String[] strArr43 = new String[lllll[1]];
                    strArr43[lllll[0]] = lllII[lllll[394]];
                    TileObject nearest16 = TileObjects.getNearest(strArr43);
                    if (lIIlIIll(nearest16)) {
                        String[] strArr44 = new String[lllll[1]];
                        strArr44[lllll[0]] = lllII[lllll[395]];
                        if (lIIlIIIl(nearest16.hasAction(strArr44) ? 1 : 0)) {
                            nearest16.interact(lllII[lllll[396]]);
                            Time.sleepTicks(lllll[6]);
                            "".length();
                        }
                        String[] strArr45 = new String[lllll[1]];
                        strArr45[lllll[0]] = lllII[lllll[397]];
                        if (lIIlIIIl(nearest16.hasAction(strArr45) ? 1 : 0)) {
                            nearest16.interact(lllII[lllll[398]]);
                            Time.sleepTicks(lllll[6]);
                            "".length();
                        }
                    }
                }
            }
            int[] iArr83 = new int[lllll[1]];
            iArr83[lllll[0]] = lllll[399];
            if (lIIlIIIl(Inventory.contains(iArr83) ? 1 : 0)) {
                WorldPoint worldPoint55 = new WorldPoint(lllll[400], lllll[401], lllll[1]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint55), lllll[5])) {
                    Clues.f0c = lllII[lllll[402]];
                    k.d(worldPoint55);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint55), lllll[5])) {
                    Clues.f0c = lllII[lllll[403]];
                    String[] strArr46 = new String[lllll[1]];
                    strArr46[lllll[0]] = lllII[lllll[404]];
                    TileObject nearest17 = TileObjects.getNearest(strArr46);
                    if (lIIlIIll(nearest17)) {
                        String[] strArr47 = new String[lllll[1]];
                        strArr47[lllll[0]] = lllII[lllll[405]];
                        if (lIIlIIIl(nearest17.hasAction(strArr47) ? 1 : 0)) {
                            nearest17.interact(lllII[lllll[406]]);
                            Time.sleepTicks(lllll[6]);
                            "".length();
                        }
                        String[] strArr48 = new String[lllll[1]];
                        strArr48[lllll[0]] = lllII[lllll[407]];
                        if (lIIlIIIl(nearest17.hasAction(strArr48) ? 1 : 0)) {
                            nearest17.interact(lllII[lllll[408]]);
                            Time.sleepTicks(lllll[6]);
                            "".length();
                        }
                    }
                }
            }
            int[] iArr84 = new int[lllll[1]];
            iArr84[lllll[0]] = lllll[409];
            if (lIIlIIIl(Inventory.contains(iArr84) ? 1 : 0)) {
                WorldPoint worldPoint56 = new WorldPoint(lllll[410], lllll[411], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint56), lllll[5])) {
                    Clues.f0c = lllII[lllll[412]];
                    k.d(worldPoint56);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint56), lllll[5])) {
                    Clues.f0c = lllII[lllll[413]];
                    TileObject nearest18 = TileObjects.getNearest(tileObject17 -> {
                        if (lIIlIIIl(tileObject17.getName().contains(lllII[lllll[1172]]) ? 1 : 0)) {
                            String[] strArr49 = new String[lllll[1]];
                            strArr49[lllll[0]] = lllII[lllll[1014]];
                            if (lIIlIIIl(tileObject17.hasAction(strArr49) ? 1 : 0) && lIIlIlIl(tileObject17.getWorldLocation().distanceTo(new WorldPoint(lllll[1173], lllll[692], lllll[0])), lllll[5])) {
                                ?? r0 = lllll[1];
                                "".length();
                                return (-" ".length()) != (-" ".length()) ? ((209 ^ 183) ^ (25 ^ 94)) & (((240 ^ 177) ^ (100 ^ 4)) ^ (-" ".length())) : r0;
                            }
                        }
                        return lllll[0];
                    });
                    if (lIIlIIll(nearest18)) {
                        nearest18.interact(lllII[lllll[414]]);
                        Time.sleepTicks(lllll[6]);
                        "".length();
                    }
                    if (lIIlIllI(nearest18)) {
                        String[] strArr49 = new String[lllll[1]];
                        strArr49[lllll[0]] = lllII[lllll[415]];
                        TileObject nearest19 = TileObjects.getNearest(strArr49);
                        if (lIIlIIll(nearest19)) {
                            String[] strArr50 = new String[lllll[1]];
                            strArr50[lllll[0]] = lllII[lllll[416]];
                            if (lIIlIIIl(nearest19.hasAction(strArr50) ? 1 : 0)) {
                                nearest19.interact(lllII[lllll[417]]);
                                Time.sleepTicks(lllll[6]);
                                "".length();
                            }
                            String[] strArr51 = new String[lllll[1]];
                            strArr51[lllll[0]] = lllII[lllll[418]];
                            if (lIIlIIIl(nearest19.hasAction(strArr51) ? 1 : 0)) {
                                nearest19.interact(lllII[lllll[419]]);
                                Time.sleepTicks(lllll[6]);
                                "".length();
                            }
                        }
                    }
                }
            }
            int[] iArr85 = new int[lllll[1]];
            iArr85[lllll[0]] = lllll[420];
            if (lIIlIIIl(Inventory.contains(iArr85) ? 1 : 0)) {
                WorldPoint worldPoint57 = new WorldPoint(lllll[421], lllll[236], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint57), lllll[5])) {
                    Clues.f0c = lllII[lllll[422]];
                    k.d(worldPoint57);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint57), lllll[5])) {
                    Clues.f0c = lllII[lllll[423]];
                    TileObject nearest20 = TileObjects.getNearest(tileObject18 -> {
                        if (lIIlIIIl(tileObject18.getName().contains(lllII[lllll[1171]]) ? 1 : 0)) {
                            String[] strArr52 = new String[lllll[1]];
                            strArr52[lllll[0]] = lllII[lllll[906]];
                            if (lIIlIIIl(tileObject18.hasAction(strArr52) ? 1 : 0) && lIIlIlIl(tileObject18.getWorldLocation().distanceTo(new WorldPoint(lllll[337], lllll[1170], lllll[0])), lllll[5])) {
                                ?? r0 = lllll[1];
                                "".length();
                                return (-" ".length()) != (-" ".length()) ? ((((18 + 60) - (-64)) + 1) ^ (((188 + 104) - 223) + 121)) & (((((25 + 114) - (-48)) + 60) ^ (((150 + 150) - 181) + 79)) ^ (-" ".length())) : r0;
                            }
                        }
                        return lllll[0];
                    });
                    if (lIIlIIll(nearest20)) {
                        nearest20.interact(lllII[lllll[424]]);
                        Time.sleepTicks(lllll[6]);
                        "".length();
                    }
                    if (lIIlIllI(nearest20)) {
                        TileObject nearest21 = TileObjects.getNearest(tileObject19 -> {
                            if (lIIlIIIl(tileObject19.getName().contains(lllII[lllll[1043]]) ? 1 : 0) && lIIlIIIl(tileObject19.getWorldLocation().equals(new WorldPoint(lllll[421], lllll[1170], lllll[0])) ? 1 : 0)) {
                                ?? r0 = lllll[1];
                                "".length();
                                return ((((108 + 136) - 225) + 121) ^ (((54 + 65) - 12) + 30)) <= 0 ? ((163 ^ 186) ^ (115 ^ 56)) & (((((112 + 95) - 197) + 241) ^ (((95 + 6) - (-45)) + 23)) ^ (-" ".length())) : r0;
                            }
                            return lllll[0];
                        });
                        if (lIIlIIll(nearest21)) {
                            String[] strArr52 = new String[lllll[1]];
                            strArr52[lllll[0]] = lllII[lllll[425]];
                            if (lIIlIIIl(nearest21.hasAction(strArr52) ? 1 : 0)) {
                                nearest21.interact(lllII[lllll[426]]);
                                Time.sleepTicks(lllll[6]);
                                "".length();
                            }
                            String[] strArr53 = new String[lllll[1]];
                            strArr53[lllll[0]] = lllII[lllll[427]];
                            if (lIIlIIIl(nearest21.hasAction(strArr53) ? 1 : 0)) {
                                nearest21.interact(lllII[lllll[428]]);
                                Time.sleepTicks(lllll[6]);
                                "".length();
                            }
                        }
                    }
                }
            }
            int[] iArr86 = new int[lllll[1]];
            iArr86[lllll[0]] = lllll[429];
            if (lIIlIIIl(Inventory.contains(iArr86) ? 1 : 0)) {
                WorldPoint worldPoint58 = new WorldPoint(lllll[430], lllll[431], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint58), lllll[5])) {
                    Clues.f0c = lllII[lllll[432]];
                    k.d(worldPoint58);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint58), lllll[5])) {
                    Clues.f0c = lllII[lllll[433]];
                    TileObject nearest22 = TileObjects.getNearest(tileObject20 -> {
                        if (lIIlIIIl(tileObject20.getName().contains(lllII[lllll[1168]]) ? 1 : 0) && lIIlIIIl(tileObject20.getWorldLocation().equals(new WorldPoint(lllll[430], lllll[1169], lllll[0])) ? 1 : 0)) {
                            ?? r0 = lllll[1];
                            "".length();
                            return "   ".length() < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lllll[0];
                    });
                    if (lIIlIIll(nearest22)) {
                        String[] strArr54 = new String[lllll[1]];
                        strArr54[lllll[0]] = lllII[lllll[434]];
                        if (lIIlIIIl(nearest22.hasAction(strArr54) ? 1 : 0)) {
                            nearest22.interact(lllII[lllll[435]]);
                            Time.sleepTicks(lllll[6]);
                            "".length();
                        }
                        String[] strArr55 = new String[lllll[1]];
                        strArr55[lllll[0]] = lllII[lllll[436]];
                        if (lIIlIIIl(nearest22.hasAction(strArr55) ? 1 : 0)) {
                            nearest22.interact(lllII[lllll[437]]);
                            Time.sleepTicks(lllll[6]);
                            "".length();
                        }
                    }
                }
            }
            int[] iArr87 = new int[lllll[1]];
            iArr87[lllll[0]] = lllll[34];
            if (lIIlIIIl(Inventory.contains(iArr87) ? 1 : 0)) {
                WorldPoint worldPoint59 = new WorldPoint(lllll[438], lllll[439], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint59), lllll[5])) {
                    Clues.f0c = lllII[lllll[440]];
                    k.d(worldPoint59);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint59), lllll[5])) {
                    Clues.f0c = lllII[lllll[441]];
                    String[] strArr56 = new String[lllll[1]];
                    strArr56[lllll[0]] = lllII[lllll[442]];
                    TileObject nearest23 = TileObjects.getNearest(strArr56);
                    if (lIIlIIll(nearest23)) {
                        String[] strArr57 = new String[lllll[1]];
                        strArr57[lllll[0]] = lllII[lllll[443]];
                        if (lIIlIIIl(nearest23.hasAction(strArr57) ? 1 : 0)) {
                            nearest23.interact(lllII[lllll[444]]);
                            Time.sleepTicks(lllll[6]);
                            "".length();
                        }
                        String[] strArr58 = new String[lllll[1]];
                        strArr58[lllll[0]] = lllII[lllll[445]];
                        if (lIIlIIIl(nearest23.hasAction(strArr58) ? 1 : 0)) {
                            nearest23.interact(lllII[lllll[446]]);
                            Time.sleepTicks(lllll[6]);
                            "".length();
                        }
                    }
                }
            }
            int[] iArr88 = new int[lllll[1]];
            iArr88[lllll[0]] = lllll[447];
            if (lIIlIIIl(Inventory.contains(iArr88) ? 1 : 0)) {
                WorldPoint worldPoint60 = new WorldPoint(lllll[96], lllll[371], lllll[1]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint60), lllll[5])) {
                    Clues.f0c = lllII[lllll[448]];
                    k.d(worldPoint60);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint60), lllll[5])) {
                    Clues.f0c = lllII[lllll[449]];
                    String[] strArr59 = new String[lllll[1]];
                    strArr59[lllll[0]] = lllII[lllll[450]];
                    TileObject nearest24 = TileObjects.getNearest(strArr59);
                    if (lIIlIIll(nearest24)) {
                        String[] strArr60 = new String[lllll[1]];
                        strArr60[lllll[0]] = lllII[lllll[451]];
                        if (lIIlIIIl(nearest24.hasAction(strArr60) ? 1 : 0)) {
                            nearest24.interact(lllII[lllll[452]]);
                            Time.sleepTicks(lllll[6]);
                            "".length();
                        }
                        String[] strArr61 = new String[lllll[1]];
                        strArr61[lllll[0]] = lllII[lllll[453]];
                        if (lIIlIIIl(nearest24.hasAction(strArr61) ? 1 : 0)) {
                            nearest24.interact(lllII[lllll[454]]);
                            Time.sleepTicks(lllll[6]);
                            "".length();
                        }
                    }
                }
            }
            int[] iArr89 = new int[lllll[1]];
            iArr89[lllll[0]] = lllll[455];
            if (lIIlIIIl(Inventory.contains(iArr89) ? 1 : 0)) {
                WorldPoint worldPoint61 = new WorldPoint(lllll[456], lllll[457], lllll[1]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint61), lllll[5])) {
                    Clues.f0c = lllII[lllll[458]];
                    k.d(worldPoint61);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint61), lllll[5])) {
                    Clues.f0c = lllII[lllll[459]];
                    String[] strArr62 = new String[lllll[1]];
                    strArr62[lllll[0]] = lllII[lllll[460]];
                    TileObject nearest25 = TileObjects.getNearest(strArr62);
                    if (lIIlIIll(nearest25)) {
                        String[] strArr63 = new String[lllll[1]];
                        strArr63[lllll[0]] = lllII[lllll[461]];
                        if (lIIlIIIl(nearest25.hasAction(strArr63) ? 1 : 0)) {
                            nearest25.interact(lllII[lllll[462]]);
                            Time.sleepTicks(lllll[6]);
                            "".length();
                        }
                        String[] strArr64 = new String[lllll[1]];
                        strArr64[lllll[0]] = lllII[lllll[463]];
                        if (lIIlIIIl(nearest25.hasAction(strArr64) ? 1 : 0)) {
                            nearest25.interact(lllII[lllll[464]]);
                            Time.sleepTicks(lllll[6]);
                            "".length();
                        }
                    }
                }
            }
            int[] iArr90 = new int[lllll[1]];
            iArr90[lllll[0]] = lllll[465];
            if (lIIlIIIl(Inventory.contains(iArr90) ? 1 : 0)) {
                WorldPoint worldPoint62 = new WorldPoint(lllll[466], lllll[467], lllll[1]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint62), lllll[5])) {
                    Clues.f0c = lllII[lllll[468]];
                    k.d(worldPoint62);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint62), lllll[5])) {
                    Clues.f0c = lllII[lllll[469]];
                    String[] strArr65 = new String[lllll[1]];
                    strArr65[lllll[0]] = lllII[lllll[470]];
                    TileObject nearest26 = TileObjects.getNearest(strArr65);
                    if (lIIlIIll(nearest26)) {
                        String[] strArr66 = new String[lllll[1]];
                        strArr66[lllll[0]] = lllII[lllll[471]];
                        if (lIIlIIIl(nearest26.hasAction(strArr66) ? 1 : 0)) {
                            nearest26.interact(lllII[lllll[472]]);
                            Time.sleepTicks(lllll[6]);
                            "".length();
                        }
                        String[] strArr67 = new String[lllll[1]];
                        strArr67[lllll[0]] = lllII[lllll[473]];
                        if (lIIlIIIl(nearest26.hasAction(strArr67) ? 1 : 0)) {
                            nearest26.interact(lllII[lllll[474]]);
                            Time.sleepTicks(lllll[6]);
                            "".length();
                        }
                    }
                }
            }
            int[] iArr91 = new int[lllll[1]];
            iArr91[lllll[0]] = lllll[475];
            if (lIIlIIIl(Inventory.contains(iArr91) ? 1 : 0)) {
                WorldPoint worldPoint63 = new WorldPoint(lllll[476], lllll[477], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint63), lllll[5])) {
                    Clues.f0c = lllII[lllll[478]];
                    k.d(worldPoint63);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint63), lllll[5])) {
                    Clues.f0c = lllII[lllll[479]];
                    TileObject nearest27 = TileObjects.getNearest(tileObject21 -> {
                        if (lIIlIIIl(tileObject21.getName().contains(lllII[lllll[1080]]) ? 1 : 0) && lIIlIIIl(tileObject21.getWorldLocation().equals(new WorldPoint(lllll[532], lllll[477], lllll[0])) ? 1 : 0)) {
                            ?? r0 = lllll[1];
                            "".length();
                            return "   ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lllll[0];
                    });
                    if (lIIlIIll(nearest27)) {
                        String[] strArr68 = new String[lllll[1]];
                        strArr68[lllll[0]] = lllII[lllll[480]];
                        if (lIIlIIIl(nearest27.hasAction(strArr68) ? 1 : 0)) {
                            nearest27.interact(lllII[lllll[481]]);
                            Time.sleepTicks(lllll[6]);
                            "".length();
                        }
                        String[] strArr69 = new String[lllll[1]];
                        strArr69[lllll[0]] = lllII[lllll[482]];
                        if (lIIlIIIl(nearest27.hasAction(strArr69) ? 1 : 0)) {
                            nearest27.interact(lllII[lllll[483]]);
                            Time.sleepTicks(lllll[6]);
                            "".length();
                        }
                    }
                }
            }
            int[] iArr92 = new int[lllll[1]];
            iArr92[lllll[0]] = lllll[484];
            if (lIIlIIIl(Inventory.contains(iArr92) ? 1 : 0)) {
                WorldPoint worldPoint64 = new WorldPoint(lllll[485], lllll[291], lllll[1]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint64), lllll[5])) {
                    Clues.f0c = lllII[lllll[486]];
                    k.d(worldPoint64);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint64), lllll[5])) {
                    Clues.f0c = lllII[lllll[487]];
                    String[] strArr70 = new String[lllll[1]];
                    strArr70[lllll[0]] = lllII[lllll[488]];
                    TileObject nearest28 = TileObjects.getNearest(strArr70);
                    if (lIIlIIll(nearest28)) {
                        String[] strArr71 = new String[lllll[1]];
                        strArr71[lllll[0]] = lllII[lllll[489]];
                        if (lIIlIIIl(nearest28.hasAction(strArr71) ? 1 : 0)) {
                            nearest28.interact(lllII[lllll[490]]);
                            Time.sleepTicks(lllll[6]);
                            "".length();
                        }
                        String[] strArr72 = new String[lllll[1]];
                        strArr72[lllll[0]] = lllII[lllll[491]];
                        if (lIIlIIIl(nearest28.hasAction(strArr72) ? 1 : 0)) {
                            nearest28.interact(lllII[lllll[492]]);
                            Time.sleepTicks(lllll[6]);
                            "".length();
                        }
                    }
                }
            }
            int[] iArr93 = new int[lllll[1]];
            iArr93[lllll[0]] = lllll[493];
            if (lIIlIIIl(Inventory.contains(iArr93) ? 1 : 0)) {
                WorldPoint worldPoint65 = new WorldPoint(lllll[494], lllll[495], lllll[0]);
                if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint65) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[496]];
                    k.d(worldPoint65);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint65) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[497]];
                    String[] strArr73 = new String[lllll[1]];
                    strArr73[lllll[0]] = lllII[lllll[498]];
                    TileObject nearest29 = TileObjects.getNearest(strArr73);
                    if (lIIlIIll(nearest29)) {
                        String[] strArr74 = new String[lllll[1]];
                        strArr74[lllll[0]] = lllII[lllll[499]];
                        if (lIIlIIIl(nearest29.hasAction(strArr74) ? 1 : 0)) {
                            nearest29.interact(lllII[lllll[500]]);
                            Time.sleepTicks(lllll[6]);
                            "".length();
                        }
                        String[] strArr75 = new String[lllll[1]];
                        strArr75[lllll[0]] = lllII[lllll[501]];
                        if (lIIlIIIl(nearest29.hasAction(strArr75) ? 1 : 0)) {
                            nearest29.interact(lllII[lllll[502]]);
                            Time.sleepTicks(lllll[6]);
                            "".length();
                        }
                    }
                }
            }
            int[] iArr94 = new int[lllll[1]];
            iArr94[lllll[0]] = lllll[503];
            if (lIIlIIIl(Inventory.contains(iArr94) ? 1 : 0)) {
                WorldPoint worldPoint66 = new WorldPoint(lllll[504], lllll[505], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint66), lllll[5])) {
                    Clues.f0c = lllII[lllll[506]];
                    k.d(worldPoint66);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint66), lllll[5])) {
                    Clues.f0c = lllII[lllll[507]];
                    String[] strArr76 = new String[lllll[1]];
                    strArr76[lllll[0]] = lllII[lllll[508]];
                    TileObject nearest30 = TileObjects.getNearest(strArr76);
                    if (lIIlIIll(nearest30)) {
                        String[] strArr77 = new String[lllll[1]];
                        strArr77[lllll[0]] = lllII[lllll[509]];
                        if (lIIlIIIl(nearest30.hasAction(strArr77) ? 1 : 0)) {
                            nearest30.interact(lllII[lllll[510]]);
                            Time.sleepTicks(lllll[6]);
                            "".length();
                        }
                        String[] strArr78 = new String[lllll[1]];
                        strArr78[lllll[0]] = lllII[lllll[511]];
                        if (lIIlIIIl(nearest30.hasAction(strArr78) ? 1 : 0)) {
                            nearest30.interact(lllII[lllll[512]]);
                            Time.sleepTicks(lllll[6]);
                            "".length();
                        }
                    }
                }
            }
            int[] iArr95 = new int[lllll[1]];
            iArr95[lllll[0]] = lllll[28];
            if (lIIlIIIl(Inventory.contains(iArr95) ? 1 : 0)) {
                WorldPoint worldPoint67 = new WorldPoint(lllll[513], lllll[514], lllll[1]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint67), lllll[5])) {
                    Clues.f0c = lllII[lllll[515]];
                    k.d(worldPoint67);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint67), lllll[5])) {
                    Clues.f0c = lllII[lllll[516]];
                    String[] strArr79 = new String[lllll[1]];
                    strArr79[lllll[0]] = lllII[lllll[517]];
                    TileObject nearest31 = TileObjects.getNearest(strArr79);
                    if (lIIlIIll(nearest31)) {
                        String[] strArr80 = new String[lllll[1]];
                        strArr80[lllll[0]] = lllII[lllll[518]];
                        if (lIIlIIIl(nearest31.hasAction(strArr80) ? 1 : 0)) {
                            nearest31.interact(lllII[lllll[519]]);
                            Time.sleepTicks(lllll[6]);
                            "".length();
                        }
                        String[] strArr81 = new String[lllll[1]];
                        strArr81[lllll[0]] = lllII[lllll[520]];
                        if (lIIlIIIl(nearest31.hasAction(strArr81) ? 1 : 0)) {
                            nearest31.interact(lllII[lllll[521]]);
                            Time.sleepTicks(lllll[6]);
                            "".length();
                        }
                    }
                }
            }
            int[] iArr96 = new int[lllll[1]];
            iArr96[lllll[0]] = lllll[505];
            if (lIIlIIIl(Inventory.contains(iArr96) ? 1 : 0)) {
                WorldPoint worldPoint68 = new WorldPoint(lllll[522], lllll[523], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint68), lllll[5])) {
                    Clues.f0c = lllII[lllll[524]];
                    k.d(worldPoint68);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint68), lllll[5])) {
                    Clues.f0c = lllII[lllll[525]];
                    TileObject nearest32 = TileObjects.getNearest(tileObject22 -> {
                        if (lIIlIIIl(tileObject22.getName().contains(lllII[lllll[1165]]) ? 1 : 0)) {
                            String[] strArr82 = new String[lllll[1]];
                            strArr82[lllll[0]] = lllII[lllll[1166]];
                            if (lIIlIIIl(tileObject22.hasAction(strArr82) ? 1 : 0) && lIIlIlIl(tileObject22.getWorldLocation().distanceTo(new WorldPoint(lllll[761], lllll[1167], lllll[0])), lllll[5])) {
                                ?? r0 = lllll[1];
                                "".length();
                                return " ".length() < 0 ? ((65 ^ 48) ^ (205 ^ 169)) & (((5 ^ 75) ^ (55 ^ 108)) ^ (-" ".length())) : r0;
                            }
                        }
                        return lllll[0];
                    });
                    if (lIIlIIll(nearest32)) {
                        nearest32.interact(lllII[lllll[526]]);
                        Time.sleepTicks(lllll[6]);
                        "".length();
                    }
                    if (lIIlIllI(nearest32)) {
                        String[] strArr82 = new String[lllll[1]];
                        strArr82[lllll[0]] = lllII[lllll[527]];
                        TileObject nearest33 = TileObjects.getNearest(strArr82);
                        if (lIIlIIll(nearest33)) {
                            String[] strArr83 = new String[lllll[1]];
                            strArr83[lllll[0]] = lllII[lllll[528]];
                            if (lIIlIIIl(nearest33.hasAction(strArr83) ? 1 : 0)) {
                                nearest33.interact(lllII[lllll[529]]);
                                Time.sleepTicks(lllll[6]);
                                "".length();
                            }
                            String[] strArr84 = new String[lllll[1]];
                            strArr84[lllll[0]] = lllII[lllll[530]];
                            if (lIIlIIIl(nearest33.hasAction(strArr84) ? 1 : 0)) {
                                nearest33.interact(lllII[lllll[531]]);
                                Time.sleepTicks(lllll[6]);
                                "".length();
                            }
                        }
                    }
                }
            }
            int[] iArr97 = new int[lllll[1]];
            iArr97[lllll[0]] = lllll[220];
            if (lIIlIIIl(Inventory.contains(iArr97) ? 1 : 0)) {
                WorldPoint worldPoint69 = new WorldPoint(lllll[532], lllll[533], lllll[1]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint69), lllll[5])) {
                    Clues.f0c = lllII[lllll[534]];
                    k.d(worldPoint69);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint69), lllll[5])) {
                    Clues.f0c = lllII[lllll[535]];
                    String[] strArr85 = new String[lllll[1]];
                    strArr85[lllll[0]] = lllII[lllll[536]];
                    TileObject nearest34 = TileObjects.getNearest(strArr85);
                    if (lIIlIIll(nearest34)) {
                        String[] strArr86 = new String[lllll[1]];
                        strArr86[lllll[0]] = lllII[lllll[537]];
                        if (lIIlIIIl(nearest34.hasAction(strArr86) ? 1 : 0)) {
                            nearest34.interact(lllII[lllll[538]]);
                            Time.sleepTicks(lllll[6]);
                            "".length();
                        }
                        String[] strArr87 = new String[lllll[1]];
                        strArr87[lllll[0]] = lllII[lllll[539]];
                        if (lIIlIIIl(nearest34.hasAction(strArr87) ? 1 : 0)) {
                            nearest34.interact(lllII[lllll[540]]);
                            Time.sleepTicks(lllll[6]);
                            "".length();
                        }
                    }
                }
            }
            int[] iArr98 = new int[lllll[1]];
            iArr98[lllll[0]] = lllll[541];
            if (lIIlIIIl(Inventory.contains(iArr98) ? 1 : 0)) {
                WorldArea worldArea2 = new WorldArea(lllll[542], lllll[543], lllll[8], lllll[7], lllll[0]);
                if (lIIlIIlI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[544]];
                    WorldPoint worldPoint70 = new WorldPoint(lllll[545], lllll[546], lllll[0]);
                    String[] strArr88 = new String[lllll[1]];
                    strArr88[lllll[0]] = lllII[lllll[547]];
                    if (lIIlIllI(NPCs.getNearest(strArr88))) {
                        k.d(worldPoint70);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                    String[] strArr89 = new String[lllll[1]];
                    strArr89[lllll[0]] = lllII[lllll[548]];
                    if (lIIlIIll(NPCs.getNearest(strArr89))) {
                        String str = lllII[lllll[549]];
                        String[] strArr90 = new String[lllll[7]];
                        strArr90[lllll[0]] = lllII[lllll[550]];
                        strArr90[lllll[1]] = lllII[lllll[551]];
                        strArr90[lllll[5]] = lllII[lllll[552]];
                        strArr90[lllll[6]] = lllII[lllll[553]];
                        n.a(str, strArr90, lllll[1]);
                    }
                }
                if (lIIlIIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[554]];
                    String[] strArr91 = new String[lllll[1]];
                    strArr91[lllll[0]] = lllII[lllll[555]];
                    TileObject nearest35 = TileObjects.getNearest(strArr91);
                    if (lIIlIIll(nearest35)) {
                        String[] strArr92 = new String[lllll[1]];
                        strArr92[lllll[0]] = lllII[lllll[556]];
                        if (lIIlIIIl(nearest35.hasAction(strArr92) ? 1 : 0)) {
                            nearest35.interact(lllII[lllll[557]]);
                            Time.sleepTicks(lllll[6]);
                            "".length();
                        }
                    }
                }
            }
            int[] iArr99 = new int[lllll[1]];
            iArr99[lllll[0]] = lllll[558];
            if (lIIlIIIl(Inventory.contains(iArr99) ? 1 : 0)) {
                WorldPoint worldPoint71 = new WorldPoint(lllll[559], lllll[560], lllll[0]);
                String[] strArr93 = new String[lllll[1]];
                strArr93[lllll[0]] = lllII[lllll[561]];
                if (lIIlIllI(NPCs.getNearest(strArr93))) {
                    Clues.f0c = lllII[lllll[562]];
                    k.d(worldPoint71);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr94 = new String[lllll[1]];
                strArr94[lllll[0]] = lllII[lllll[563]];
                if (lIIlIIll(NPCs.getNearest(strArr94))) {
                    n.a(lllII[lllll[564]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr100 = new int[lllll[1]];
            iArr100[lllll[0]] = lllll[565];
            if (lIIlIIIl(Inventory.contains(iArr100) ? 1 : 0)) {
                WorldPoint worldPoint72 = new WorldPoint(lllll[566], lllll[317], lllll[0]);
                String[] strArr95 = new String[lllll[1]];
                strArr95[lllll[0]] = lllII[lllll[567]];
                if (lIIlIllI(NPCs.getNearest(strArr95))) {
                    Clues.f0c = lllII[lllll[568]];
                    k.d(worldPoint72);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr96 = new String[lllll[1]];
                strArr96[lllll[0]] = lllII[lllll[569]];
                if (lIIlIIll(NPCs.getNearest(strArr96))) {
                    n.a(lllII[lllll[570]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr101 = new int[lllll[1]];
            iArr101[lllll[0]] = lllll[571];
            if (lIIlIIIl(Inventory.contains(iArr101) ? 1 : 0)) {
                WorldPoint worldPoint73 = new WorldPoint(lllll[572], lllll[573], lllll[1]);
                String[] strArr97 = new String[lllll[1]];
                strArr97[lllll[0]] = lllII[lllll[574]];
                if (lIIlIllI(NPCs.getNearest(strArr97))) {
                    Clues.f0c = lllII[lllll[575]];
                    k.b(worldPoint73);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr98 = new String[lllll[1]];
                strArr98[lllll[0]] = lllII[lllll[576]];
                if (lIIlIIll(NPCs.getNearest(strArr98))) {
                    n.a(lllII[lllll[577]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr102 = new int[lllll[1]];
            iArr102[lllll[0]] = lllll[578];
            if (lIIlIIIl(Inventory.contains(iArr102) ? 1 : 0)) {
                WorldPoint worldPoint74 = new WorldPoint(lllll[579], lllll[29], lllll[0]);
                String[] strArr99 = new String[lllll[1]];
                strArr99[lllll[0]] = lllII[lllll[580]];
                if (lIIlIllI(NPCs.getNearest(strArr99))) {
                    Clues.f0c = lllII[lllll[581]];
                    k.d(worldPoint74);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr100 = new String[lllll[1]];
                strArr100[lllll[0]] = lllII[lllll[79]];
                if (lIIlIIll(NPCs.getNearest(strArr100))) {
                    n.a(lllII[lllll[301]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr103 = new int[lllll[1]];
            iArr103[lllll[0]] = lllll[582];
            if (lIIlIIIl(Inventory.contains(iArr103) ? 1 : 0)) {
                WorldPoint worldPoint75 = new WorldPoint(lllll[68], lllll[431], lllll[0]);
                if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint75), lllll[10])) {
                    Clues.f0c = lllII[lllll[281]];
                    k.d(worldPoint75);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint75), lllll[10])) {
                    n.a(lllII[lllll[44]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr104 = new int[lllll[1]];
            iArr104[lllll[0]] = lllll[583];
            if (lIIlIIIl(Inventory.contains(iArr104) ? 1 : 0)) {
                WorldPoint worldPoint76 = new WorldPoint(lllll[584], lllll[585], lllll[1]);
                String[] strArr101 = new String[lllll[1]];
                strArr101[lllll[0]] = lllII[lllll[586]];
                if (lIIlIllI(NPCs.getNearest(strArr101))) {
                    Clues.f0c = lllII[lllll[587]];
                    k.d(worldPoint76);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr102 = new String[lllll[1]];
                strArr102[lllll[0]] = lllII[lllll[588]];
                if (lIIlIIll(NPCs.getNearest(strArr102))) {
                    n.a(lllII[lllll[178]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr105 = new int[lllll[1]];
            iArr105[lllll[0]] = lllll[589];
            if (lIIlIIIl(Inventory.contains(iArr105) ? 1 : 0)) {
                WorldPoint worldPoint77 = new WorldPoint(lllll[590], lllll[591], lllll[0]);
                String[] strArr103 = new String[lllll[1]];
                strArr103[lllll[0]] = lllII[lllll[592]];
                if (lIIlIllI(NPCs.getNearest(strArr103))) {
                    Clues.f0c = lllII[lllll[593]];
                    k.d(worldPoint77);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr104 = new String[lllll[1]];
                strArr104[lllll[0]] = lllII[lllll[594]];
                if (lIIlIIll(NPCs.getNearest(strArr104))) {
                    n.a(lllII[lllll[595]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr106 = new int[lllll[1]];
            iArr106[lllll[0]] = lllll[596];
            if (lIIlIIIl(Inventory.contains(iArr106) ? 1 : 0)) {
                WorldPoint worldPoint78 = new WorldPoint(lllll[597], lllll[136], lllll[0]);
                String[] strArr105 = new String[lllll[1]];
                strArr105[lllll[0]] = lllII[lllll[598]];
                if (lIIlIllI(NPCs.getNearest(strArr105))) {
                    Clues.f0c = lllII[lllll[599]];
                    k.d(worldPoint78);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr106 = new String[lllll[1]];
                strArr106[lllll[0]] = lllII[lllll[600]];
                if (lIIlIIll(NPCs.getNearest(strArr106))) {
                    n.a(lllII[lllll[601]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr107 = new int[lllll[1]];
            iArr107[lllll[0]] = lllll[602];
            if (lIIlIIIl(Inventory.contains(iArr107) ? 1 : 0)) {
                WorldPoint worldPoint79 = new WorldPoint(lllll[603], lllll[604], lllll[0]);
                String[] strArr107 = new String[lllll[1]];
                strArr107[lllll[0]] = lllII[lllll[605]];
                if (lIIlIllI(NPCs.getNearest(strArr107))) {
                    Clues.f0c = lllII[lllll[606]];
                    k.a(worldPoint79);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr108 = new String[lllll[1]];
                strArr108[lllll[0]] = lllII[lllll[607]];
                if (lIIlIIll(NPCs.getNearest(strArr108))) {
                    n.a(lllII[lllll[608]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr108 = new int[lllll[1]];
            iArr108[lllll[0]] = lllll[609];
            if (lIIlIIIl(Inventory.contains(iArr108) ? 1 : 0)) {
                WorldPoint worldPoint80 = new WorldPoint(lllll[610], lllll[103], lllll[0]);
                String[] strArr109 = new String[lllll[1]];
                strArr109[lllll[0]] = lllII[lllll[611]];
                if (lIIlIllI(NPCs.getNearest(strArr109))) {
                    Clues.f0c = lllII[lllll[612]];
                    k.d(worldPoint80);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr110 = new String[lllll[1]];
                strArr110[lllll[0]] = lllII[lllll[613]];
                if (lIIlIIll(NPCs.getNearest(strArr110))) {
                    n.a(lllII[lllll[614]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr109 = new int[lllll[1]];
            iArr109[lllll[0]] = lllll[615];
            if (lIIlIIIl(Inventory.contains(iArr109) ? 1 : 0)) {
                WorldPoint worldPoint81 = new WorldPoint(lllll[616], lllll[168], lllll[0]);
                String[] strArr111 = new String[lllll[1]];
                strArr111[lllll[0]] = lllII[lllll[617]];
                if (lIIlIllI(NPCs.getNearest(strArr111))) {
                    Clues.f0c = lllII[lllll[618]];
                    k.d(worldPoint81);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr112 = new String[lllll[1]];
                strArr112[lllll[0]] = lllII[lllll[619]];
                if (lIIlIIll(NPCs.getNearest(strArr112))) {
                    n.a(lllII[lllll[620]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr110 = new int[lllll[1]];
            iArr110[lllll[0]] = lllll[621];
            if (lIIlIIIl(Inventory.contains(iArr110) ? 1 : 0)) {
                WorldPoint worldPoint82 = new WorldPoint(lllll[622], lllll[623], lllll[0]);
                String[] strArr113 = new String[lllll[1]];
                strArr113[lllll[0]] = lllII[lllll[624]];
                if (lIIlIllI(NPCs.getNearest(strArr113))) {
                    Clues.f0c = lllII[lllll[625]];
                    k.d(worldPoint82);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr114 = new String[lllll[1]];
                strArr114[lllll[0]] = lllII[lllll[626]];
                if (lIIlIIll(NPCs.getNearest(strArr114))) {
                    n.a(lllII[lllll[627]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr111 = new int[lllll[1]];
            iArr111[lllll[0]] = lllll[628];
            if (lIIlIIIl(Inventory.contains(iArr111) ? 1 : 0)) {
                WorldPoint worldPoint83 = new WorldPoint(lllll[629], lllll[630], lllll[0]);
                if (lIIlIllI(NPCs.getNearest(npc -> {
                    if (lIIlIIIl(npc.getName().contains(lllII[lllll[1164]]) ? 1 : 0) && lIIlIlIl(npc.getWorldLocation().distanceTo(worldPoint83), lllll[36])) {
                        ?? r0 = lllll[1];
                        "".length();
                        return "   ".length() == ((104 ^ 116) ^ (170 ^ 178)) ? ((194 ^ 134) ^ "  ".length()) & (((70 ^ 119) ^ (224 ^ 151)) ^ (-" ".length())) : r0;
                    }
                    return lllll[0];
                }))) {
                    Clues.f0c = lllII[lllll[631]];
                    k.d(worldPoint83);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIIll(NPCs.getNearest(npc2 -> {
                    if (lIIlIIIl(npc2.getName().contains(lllII[lllll[1163]]) ? 1 : 0) && lIIlIlIl(npc2.getWorldLocation().distanceTo(worldPoint83), lllll[36])) {
                        ?? r0 = lllll[1];
                        "".length();
                        return !(true ^ true) ? " ".length() & (" ".length() ^ (-1)) : r0;
                    }
                    return lllll[0];
                }))) {
                    n.a(lllII[lllll[632]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr112 = new int[lllll[1]];
            iArr112[lllll[0]] = lllll[633];
            if (lIIlIIIl(Inventory.contains(iArr112) ? 1 : 0)) {
                WorldPoint worldPoint84 = new WorldPoint(lllll[634], lllll[635], lllll[0]);
                if (lIIlIllI(NPCs.getNearest(npc3 -> {
                    if (lIIlIIIl(npc3.getName().contains(lllII[lllll[1162]]) ? 1 : 0) && lIIlIlIl(npc3.getWorldLocation().distanceTo(worldPoint84), lllll[36])) {
                        ?? r0 = lllll[1];
                        "".length();
                        return 0 != 0 ? ((75 ^ 83) ^ (68 ^ 4)) & (((((77 + 188) - 127) + 102) ^ (((71 + 48) - (-4)) + 45)) ^ (-" ".length())) : r0;
                    }
                    return lllll[0];
                }))) {
                    Clues.f0c = lllII[lllll[636]];
                    k.d(worldPoint84);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIIll(NPCs.getNearest(npc4 -> {
                    if (lIIlIIIl(npc4.getName().contains(lllII[lllll[1161]]) ? 1 : 0) && lIIlIlIl(npc4.getWorldLocation().distanceTo(worldPoint84), lllll[36])) {
                        ?? r0 = lllll[1];
                        "".length();
                        return (((2 ^ 79) ^ (64 ^ 95)) & (((46 ^ 90) ^ (55 ^ 17)) ^ (-" ".length()))) < 0 ? ((((28 + 205) - 145) + 139) ^ (((127 + 73) - 196) + 124)) & (((26 ^ 82) ^ (150 ^ 189)) ^ (-" ".length())) & ((((((30 + 90) - 104) + 133) ^ (((107 + 132) - 81) + 31)) & (((((46 + 31) - (-19)) + 49) ^ (((135 + 117) - 244) + 177)) ^ (-" ".length()))) ^ (-" ".length())) : r0;
                    }
                    return lllll[0];
                }))) {
                    n.a(lllII[lllll[637]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr113 = new int[lllll[1]];
            iArr113[lllll[0]] = lllll[638];
            if (lIIlIIIl(Inventory.contains(iArr113) ? 1 : 0)) {
                WorldPoint worldPoint85 = new WorldPoint(lllll[639], lllll[640], lllll[0]);
                String[] strArr115 = new String[lllll[1]];
                strArr115[lllll[0]] = lllII[lllll[641]];
                if (lIIlIllI(NPCs.getNearest(strArr115))) {
                    Clues.f0c = lllII[lllll[642]];
                    k.d(worldPoint85);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr116 = new String[lllll[1]];
                strArr116[lllll[0]] = lllII[lllll[643]];
                if (lIIlIIll(NPCs.getNearest(strArr116))) {
                    String[] strArr117 = new String[lllll[1]];
                    strArr117[lllll[0]] = lllII[lllll[644]];
                    if (lIIlIlII(NPCs.getNearest(strArr117).getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lllll[8])) {
                        Dialog.close();
                    }
                    n.a(lllII[lllll[645]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr114 = new int[lllll[1]];
            iArr114[lllll[0]] = lllll[646];
            if (lIIlIIIl(Inventory.contains(iArr114) ? 1 : 0)) {
                WorldPoint worldPoint86 = new WorldPoint(lllll[647], lllll[648], lllll[0]);
                String[] strArr118 = new String[lllll[1]];
                strArr118[lllll[0]] = lllII[lllll[649]];
                if (lIIlIllI(NPCs.getNearest(strArr118))) {
                    Clues.f0c = lllII[lllll[650]];
                    k.d(worldPoint86);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr119 = new String[lllll[1]];
                strArr119[lllll[0]] = lllII[lllll[651]];
                if (lIIlIIll(NPCs.getNearest(strArr119))) {
                    n.a(lllII[lllll[652]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr115 = new int[lllll[1]];
            iArr115[lllll[0]] = lllll[653];
            if (lIIlIIIl(Inventory.contains(iArr115) ? 1 : 0)) {
                WorldPoint worldPoint87 = new WorldPoint(lllll[654], lllll[655], lllll[0]);
                String[] strArr120 = new String[lllll[1]];
                strArr120[lllll[0]] = lllII[lllll[656]];
                if (lIIlIllI(NPCs.getNearest(strArr120))) {
                    Clues.f0c = lllII[lllll[657]];
                    k.d(worldPoint87);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr121 = new String[lllll[1]];
                strArr121[lllll[0]] = lllII[lllll[658]];
                if (lIIlIIll(NPCs.getNearest(strArr121))) {
                    n.a(lllII[lllll[659]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr116 = new int[lllll[1]];
            iArr116[lllll[0]] = lllll[660];
            if (lIIlIIIl(Inventory.contains(iArr116) ? 1 : 0)) {
                WorldPoint worldPoint88 = new WorldPoint(lllll[430], lllll[661], lllll[0]);
                String[] strArr122 = new String[lllll[1]];
                strArr122[lllll[0]] = lllII[lllll[662]];
                if (!lIIlIIll(NPCs.getNearest(strArr122)) || lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint88), lllll[14])) {
                    Clues.f0c = lllII[lllll[663]];
                    k.d(worldPoint88);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr123 = new String[lllll[1]];
                strArr123[lllll[0]] = lllII[lllll[664]];
                if (lIIlIIll(NPCs.getNearest(strArr123)) && lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint88), lllll[14])) {
                    n.a(lllII[lllll[665]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr117 = new int[lllll[1]];
            iArr117[lllll[0]] = lllll[666];
            if (lIIlIIIl(Inventory.contains(iArr117) ? 1 : 0)) {
                WorldPoint worldPoint89 = new WorldPoint(lllll[667], lllll[668], lllll[0]);
                String[] strArr124 = new String[lllll[1]];
                strArr124[lllll[0]] = lllII[lllll[669]];
                if (lIIlIllI(NPCs.getNearest(strArr124))) {
                    Clues.f0c = lllII[lllll[670]];
                    k.d(worldPoint89);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr125 = new String[lllll[1]];
                strArr125[lllll[0]] = lllII[lllll[671]];
                if (lIIlIIll(NPCs.getNearest(strArr125))) {
                    n.a(lllII[lllll[672]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr118 = new int[lllll[1]];
            iArr118[lllll[0]] = lllll[673];
            if (lIIlIIIl(Inventory.contains(iArr118) ? 1 : 0)) {
                WorldPoint worldPoint90 = new WorldPoint(lllll[235], lllll[674], lllll[0]);
                if (lIIlIllI(NPCs.getNearest(npc5 -> {
                    if (lIIlIIIl(npc5.getName().contains(lllII[lllll[1160]]) ? 1 : 0) && lIIlIlIl(npc5.getWorldLocation().distanceTo(worldPoint90), lllll[56])) {
                        ?? r0 = lllll[1];
                        "".length();
                        return 0 != 0 ? ((((77 + 118) - 137) + 178) ^ (((153 + 33) - 97) + 99)) & (((75 ^ 59) ^ (30 ^ 62)) ^ (-" ".length())) : r0;
                    }
                    return lllll[0];
                }))) {
                    Clues.f0c = lllII[lllll[675]];
                    k.d(worldPoint90);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIIll(NPCs.getNearest(npc6 -> {
                    if (lIIlIIIl(npc6.getName().contains(lllII[lllll[1058]]) ? 1 : 0) && lIIlIlIl(npc6.getWorldLocation().distanceTo(worldPoint90), lllll[56])) {
                        ?? r0 = lllll[1];
                        "".length();
                        return (true ^ true) & ((true ^ true) ^ true) ? "  ".length() & ("  ".length() ^ (-1)) : r0;
                    }
                    return lllll[0];
                }))) {
                    n.a(lllII[lllll[676]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr119 = new int[lllll[1]];
            iArr119[lllll[0]] = lllll[677];
            if (lIIlIIIl(Inventory.contains(iArr119) ? 1 : 0)) {
                WorldPoint worldPoint91 = new WorldPoint(lllll[678], lllll[679], lllll[0]);
                String[] strArr126 = new String[lllll[1]];
                strArr126[lllll[0]] = lllII[lllll[680]];
                if (lIIlIllI(NPCs.getNearest(strArr126))) {
                    Clues.f0c = lllII[lllll[681]];
                    k.d(worldPoint91);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr127 = new String[lllll[1]];
                strArr127[lllll[0]] = lllII[lllll[682]];
                if (lIIlIIll(NPCs.getNearest(strArr127))) {
                    n.a(lllII[lllll[683]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr120 = new int[lllll[1]];
            iArr120[lllll[0]] = lllll[684];
            if (lIIlIIIl(Inventory.contains(iArr120) ? 1 : 0)) {
                WorldPoint worldPoint92 = new WorldPoint(lllll[685], lllll[686], lllll[0]);
                String[] strArr128 = new String[lllll[1]];
                strArr128[lllll[0]] = lllII[lllll[687]];
                if (lIIlIllI(NPCs.getNearest(strArr128))) {
                    Clues.f0c = lllII[lllll[688]];
                    k.d(worldPoint92);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr129 = new String[lllll[1]];
                strArr129[lllll[0]] = lllII[lllll[689]];
                if (lIIlIIll(NPCs.getNearest(strArr129))) {
                    n.a(lllII[lllll[690]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr121 = new int[lllll[1]];
            iArr121[lllll[0]] = lllll[691];
            if (lIIlIIIl(Inventory.contains(iArr121) ? 1 : 0)) {
                WorldPoint worldPoint93 = new WorldPoint(lllll[692], lllll[693], lllll[0]);
                String[] strArr130 = new String[lllll[1]];
                strArr130[lllll[0]] = lllII[lllll[694]];
                if (lIIlIllI(NPCs.getNearest(strArr130))) {
                    Clues.f0c = lllII[lllll[695]];
                    k.d(worldPoint93);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr131 = new String[lllll[1]];
                strArr131[lllll[0]] = lllII[lllll[696]];
                if (lIIlIIll(NPCs.getNearest(strArr131))) {
                    n.a(lllII[lllll[697]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr122 = new int[lllll[1]];
            iArr122[lllll[0]] = lllll[698];
            if (lIIlIIIl(Inventory.contains(iArr122) ? 1 : 0)) {
                WorldPoint worldPoint94 = new WorldPoint(lllll[364], lllll[699], lllll[0]);
                String[] strArr132 = new String[lllll[1]];
                strArr132[lllll[0]] = lllII[lllll[700]];
                if (lIIlIllI(NPCs.getNearest(strArr132))) {
                    Clues.f0c = lllII[lllll[701]];
                    k.d(worldPoint94);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr133 = new String[lllll[1]];
                strArr133[lllll[0]] = lllII[lllll[702]];
                if (lIIlIIll(NPCs.getNearest(strArr133))) {
                    n.a(lllII[lllll[703]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr123 = new int[lllll[1]];
            iArr123[lllll[0]] = lllll[704];
            if (lIIlIIIl(Inventory.contains(iArr123) ? 1 : 0)) {
                WorldPoint worldPoint95 = new WorldPoint(lllll[705], lllll[208], lllll[0]);
                String[] strArr134 = new String[lllll[1]];
                strArr134[lllll[0]] = lllII[lllll[706]];
                if (lIIlIllI(NPCs.getNearest(strArr134))) {
                    Clues.f0c = lllII[lllll[707]];
                    k.d(worldPoint95);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr135 = new String[lllll[1]];
                strArr135[lllll[0]] = lllII[lllll[708]];
                if (lIIlIIll(NPCs.getNearest(strArr135))) {
                    n.a(lllII[lllll[709]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr124 = new int[lllll[1]];
            iArr124[lllll[0]] = lllll[710];
            if (lIIlIIIl(Inventory.contains(iArr124) ? 1 : 0)) {
                WorldPoint worldPoint96 = new WorldPoint(lllll[711], lllll[712], lllll[0]);
                String[] strArr136 = new String[lllll[1]];
                strArr136[lllll[0]] = lllII[lllll[713]];
                if (lIIlIllI(NPCs.getNearest(strArr136))) {
                    Clues.f0c = lllII[lllll[714]];
                    if (lIIlIIIl(new WorldArea(lllll[191], lllll[192], lllll[31], lllll[20], lllll[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        k.c(new WorldPoint(lllll[715], lllll[604], lllll[0]));
                        Time.sleepTicks(k.c(lllll[7], lllll[10]));
                        "".length();
                    }
                    WorldArea worldArea3 = new WorldArea(lllll[716], lllll[717], lllll[51], lllll[91], lllll[0]);
                    if (lIIlIIIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint[] worldPointArr = new WorldPoint[lllll[4]];
                        worldPointArr[lllll[0]] = new WorldPoint(lllll[718], lllll[719], lllll[0]);
                        worldPointArr[lllll[1]] = new WorldPoint(lllll[720], lllll[721], lllll[0]);
                        worldPointArr[lllll[5]] = new WorldPoint(lllll[722], lllll[723], lllll[0]);
                        worldPointArr[lllll[6]] = new WorldPoint(lllll[722], lllll[724], lllll[0]);
                        worldPointArr[lllll[7]] = new WorldPoint(lllll[725], lllll[726], lllll[0]);
                        worldPointArr[lllll[8]] = new WorldPoint(lllll[727], lllll[728], lllll[0]);
                        worldPointArr[lllll[10]] = new WorldPoint(lllll[729], lllll[730], lllll[0]);
                        worldPointArr[lllll[11]] = new WorldPoint(lllll[729], lllll[731], lllll[0]);
                        worldPointArr[lllll[13]] = new WorldPoint(lllll[729], lllll[732], lllll[0]);
                        worldPointArr[lllll[14]] = new WorldPoint(lllll[733], lllll[113], lllll[0]);
                        worldPointArr[lllll[18]] = new WorldPoint(lllll[734], lllll[113], lllll[0]);
                        worldPointArr[lllll[19]] = new WorldPoint(lllll[735], lllll[731], lllll[0]);
                        worldPointArr[lllll[20]] = new WorldPoint(lllll[736], lllll[717], lllll[0]);
                        worldPointArr[lllll[21]] = new WorldPoint(lllll[737], lllll[738], lllll[0]);
                        Walker.walkAlong(Arrays.asList(worldPointArr), new HashMap());
                        "".length();
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                    if (lIIlIIlI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        k.a(worldPoint96);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                    if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint96), lllll[25]) && lIIlIIlI(Players.getLocal().isMoving() ? 1 : 0)) {
                        Clues.f0c = lllII[lllll[739]];
                        k.ao();
                        Time.sleepTicks(k.c(lllll[6], lllll[7]));
                        "".length();
                    }
                }
                String[] strArr137 = new String[lllll[1]];
                strArr137[lllll[0]] = lllII[lllll[740]];
                if (lIIlIIll(NPCs.getNearest(strArr137))) {
                    n.a(lllII[lllll[741]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr125 = new int[lllll[1]];
            iArr125[lllll[0]] = lllll[742];
            if (lIIlIIIl(Inventory.contains(iArr125) ? 1 : 0)) {
                WorldPoint worldPoint97 = new WorldPoint(lllll[743], lllll[744], lllll[0]);
                String[] strArr138 = new String[lllll[1]];
                strArr138[lllll[0]] = lllII[lllll[745]];
                if (lIIlIllI(NPCs.getNearest(strArr138))) {
                    Clues.f0c = lllII[lllll[746]];
                    k.d(worldPoint97);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr139 = new String[lllll[1]];
                strArr139[lllll[0]] = lllII[lllll[747]];
                if (lIIlIIll(NPCs.getNearest(strArr139))) {
                    n.a(lllII[lllll[748]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr126 = new int[lllll[1]];
            iArr126[lllll[0]] = lllll[749];
            if (lIIlIIIl(Inventory.contains(iArr126) ? 1 : 0)) {
                WorldPoint worldPoint98 = new WorldPoint(lllll[668], lllll[750], lllll[0]);
                if (lIIlIllI(NPCs.getNearest(npc7 -> {
                    if (lIIlIIIl(npc7.getName().contains(lllII[lllll[1159]]) ? 1 : 0) && lIIlIlIl(npc7.getWorldLocation().distanceTo(worldPoint98), lllll[56])) {
                        ?? r0 = lllll[1];
                        "".length();
                        return "  ".length() == (((231 ^ 180) ^ (18 ^ 126)) & (((117 ^ 105) ^ (164 ^ 135)) ^ (-" ".length()))) ? ((64 ^ 39) ^ (6 ^ 113)) & (("  ".length() ^ (8 ^ 26)) ^ (-" ".length())) : r0;
                    }
                    return lllll[0];
                }))) {
                    Clues.f0c = lllII[lllll[751]];
                    k.d(worldPoint98);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIIll(NPCs.getNearest(npc8 -> {
                    if (lIIlIIIl(npc8.getName().contains(lllII[lllll[1158]]) ? 1 : 0) && lIIlIlIl(npc8.getWorldLocation().distanceTo(worldPoint98), lllll[56])) {
                        ?? r0 = lllll[1];
                        "".length();
                        return ((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true)) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lllll[0];
                }))) {
                    n.a(lllII[lllll[752]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr127 = new int[lllll[1]];
            iArr127[lllll[0]] = lllll[753];
            if (lIIlIIIl(Inventory.contains(iArr127) ? 1 : 0)) {
                WorldPoint worldPoint99 = new WorldPoint(lllll[754], lllll[755], lllll[0]);
                String[] strArr140 = new String[lllll[1]];
                strArr140[lllll[0]] = lllII[lllll[756]];
                if (lIIlIllI(NPCs.getNearest(strArr140))) {
                    Clues.f0c = lllII[lllll[757]];
                    k.d(worldPoint99);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr141 = new String[lllll[1]];
                strArr141[lllll[0]] = lllII[lllll[758]];
                if (lIIlIIll(NPCs.getNearest(strArr141))) {
                    n.a(lllII[lllll[759]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr128 = new int[lllll[1]];
            iArr128[lllll[0]] = lllll[760];
            if (lIIlIIIl(Inventory.contains(iArr128) ? 1 : 0)) {
                WorldPoint worldPoint100 = new WorldPoint(lllll[761], lllll[261], lllll[0]);
                String[] strArr142 = new String[lllll[1]];
                strArr142[lllll[0]] = lllII[lllll[762]];
                if (lIIlIllI(NPCs.getNearest(strArr142))) {
                    Clues.f0c = lllII[lllll[763]];
                    k.d(worldPoint100);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr143 = new String[lllll[1]];
                strArr143[lllll[0]] = lllII[lllll[764]];
                if (lIIlIIll(NPCs.getNearest(strArr143))) {
                    n.a(lllII[lllll[765]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr129 = new int[lllll[1]];
            iArr129[lllll[0]] = lllll[766];
            if (lIIlIIIl(Inventory.contains(iArr129) ? 1 : 0)) {
                WorldPoint worldPoint101 = new WorldPoint(lllll[767], lllll[768], lllll[0]);
                String[] strArr144 = new String[lllll[1]];
                strArr144[lllll[0]] = lllII[lllll[769]];
                if (lIIlIllI(NPCs.getNearest(strArr144))) {
                    Clues.f0c = lllII[lllll[770]];
                    k.a(worldPoint101);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr145 = new String[lllll[1]];
                strArr145[lllll[0]] = lllII[lllll[771]];
                if (lIIlIIll(NPCs.getNearest(strArr145))) {
                    n.a(lllII[lllll[772]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr130 = new int[lllll[1]];
            iArr130[lllll[0]] = lllll[773];
            if (lIIlIIIl(Inventory.contains(iArr130) ? 1 : 0)) {
                WorldPoint worldPoint102 = new WorldPoint(lllll[774], lllll[775], lllll[1]);
                String[] strArr146 = new String[lllll[1]];
                strArr146[lllll[0]] = lllII[lllll[776]];
                if (lIIlIllI(NPCs.getNearest(strArr146))) {
                    Clues.f0c = lllII[lllll[777]];
                    WorldArea worldArea4 = new WorldArea(lllll[778], lllll[779], lllll[77], lllll[45], lllll[0]);
                    if (lIIlIIIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint worldPoint103 = new WorldPoint(lllll[780], lllll[775], lllll[0]);
                        if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint103), lllll[6])) {
                            k.d(worldPoint103);
                        }
                    }
                    if (!lIIlIIIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lllll[780], lllll[775], lllll[0])), lllll[6])) {
                        k.d(worldPoint102);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                }
                String[] strArr147 = new String[lllll[1]];
                strArr147[lllll[0]] = lllII[lllll[781]];
                if (lIIlIIll(NPCs.getNearest(strArr147))) {
                    n.a(lllII[lllll[782]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr131 = new int[lllll[1]];
            iArr131[lllll[0]] = lllll[783];
            if (lIIlIIIl(Inventory.contains(iArr131) ? 1 : 0)) {
                WorldPoint worldPoint104 = new WorldPoint(lllll[784], lllll[785], lllll[0]);
                String[] strArr148 = new String[lllll[1]];
                strArr148[lllll[0]] = lllII[lllll[786]];
                if (lIIlIllI(NPCs.getNearest(strArr148))) {
                    Clues.f0c = lllII[lllll[787]];
                    k.d(worldPoint104);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr149 = new String[lllll[1]];
                strArr149[lllll[0]] = lllII[lllll[788]];
                if (lIIlIIll(NPCs.getNearest(strArr149))) {
                    n.a(lllII[lllll[789]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr132 = new int[lllll[1]];
            iArr132[lllll[0]] = lllll[790];
            if (lIIlIIIl(Inventory.contains(iArr132) ? 1 : 0)) {
                WorldPoint worldPoint105 = new WorldPoint(lllll[791], lllll[792], lllll[0]);
                String[] strArr150 = new String[lllll[1]];
                strArr150[lllll[0]] = lllII[lllll[793]];
                if (lIIlIllI(NPCs.getNearest(strArr150))) {
                    Clues.f0c = lllII[lllll[794]];
                    k.d(worldPoint105);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr151 = new String[lllll[1]];
                strArr151[lllll[0]] = lllII[lllll[795]];
                if (lIIlIIll(NPCs.getNearest(strArr151))) {
                    n.a(lllII[lllll[796]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr133 = new int[lllll[1]];
            iArr133[lllll[0]] = lllll[797];
            if (lIIlIIIl(Inventory.contains(iArr133) ? 1 : 0)) {
                WorldPoint worldPoint106 = new WorldPoint(lllll[798], lllll[391], lllll[0]);
                String[] strArr152 = new String[lllll[1]];
                strArr152[lllll[0]] = lllII[lllll[799]];
                if (lIIlIllI(NPCs.getNearest(strArr152))) {
                    Clues.f0c = lllII[lllll[800]];
                    k.d(worldPoint106);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr153 = new String[lllll[1]];
                strArr153[lllll[0]] = lllII[lllll[801]];
                if (lIIlIIll(NPCs.getNearest(strArr153))) {
                    n.a(lllII[lllll[802]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr134 = new int[lllll[1]];
            iArr134[lllll[0]] = lllll[803];
            if (lIIlIIIl(Inventory.contains(iArr134) ? 1 : 0)) {
                WorldPoint worldPoint107 = new WorldPoint(lllll[804], lllll[805], lllll[0]);
                String[] strArr154 = new String[lllll[1]];
                strArr154[lllll[0]] = lllII[lllll[806]];
                if (lIIlIllI(NPCs.getNearest(strArr154))) {
                    Clues.f0c = lllII[lllll[807]];
                    k.d(worldPoint107);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr155 = new String[lllll[1]];
                strArr155[lllll[0]] = lllII[lllll[808]];
                if (lIIlIIll(NPCs.getNearest(strArr155))) {
                    n.a(lllII[lllll[809]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr135 = new int[lllll[1]];
            iArr135[lllll[0]] = lllll[810];
            if (lIIlIIIl(Inventory.contains(iArr135) ? 1 : 0)) {
                WorldPoint worldPoint108 = new WorldPoint(lllll[804], lllll[811], lllll[0]);
                String[] strArr156 = new String[lllll[1]];
                strArr156[lllll[0]] = lllII[lllll[812]];
                if (lIIlIllI(NPCs.getNearest(strArr156))) {
                    Clues.f0c = lllII[lllll[813]];
                    k.d(worldPoint108);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr157 = new String[lllll[1]];
                strArr157[lllll[0]] = lllII[lllll[814]];
                if (lIIlIIll(NPCs.getNearest(strArr157))) {
                    n.a(lllII[lllll[815]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr136 = new int[lllll[1]];
            iArr136[lllll[0]] = lllll[816];
            if (lIIlIIIl(Inventory.contains(iArr136) ? 1 : 0)) {
                WorldPoint worldPoint109 = new WorldPoint(lllll[331], lllll[817], lllll[0]);
                String[] strArr158 = new String[lllll[1]];
                strArr158[lllll[0]] = lllII[lllll[818]];
                if (lIIlIllI(NPCs.getNearest(strArr158))) {
                    Clues.f0c = lllII[lllll[819]];
                    k.d(worldPoint109);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr159 = new String[lllll[1]];
                strArr159[lllll[0]] = lllII[lllll[820]];
                if (lIIlIIll(NPCs.getNearest(strArr159))) {
                    n.a(lllII[lllll[821]], new String[lllll[0]]);
                }
            }
            int[] iArr137 = new int[lllll[1]];
            iArr137[lllll[0]] = lllll[822];
            if (lIIlIIIl(Inventory.contains(iArr137) ? 1 : 0)) {
                WorldPoint worldPoint110 = new WorldPoint(lllll[410], lllll[823], lllll[0]);
                String[] strArr160 = new String[lllll[1]];
                strArr160[lllll[0]] = lllII[lllll[824]];
                if (lIIlIllI(NPCs.getNearest(strArr160))) {
                    Clues.f0c = lllII[lllll[825]];
                    k.d(worldPoint110);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr161 = new String[lllll[1]];
                strArr161[lllll[0]] = lllII[lllll[826]];
                if (lIIlIIll(NPCs.getNearest(strArr161))) {
                    n.a(lllII[lllll[827]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr138 = new int[lllll[1]];
            iArr138[lllll[0]] = lllll[828];
            if (lIIlIIIl(Inventory.contains(iArr138) ? 1 : 0)) {
                WorldPoint worldPoint111 = new WorldPoint(lllll[829], lllll[830], lllll[0]);
                String[] strArr162 = new String[lllll[1]];
                strArr162[lllll[0]] = lllII[lllll[831]];
                if (lIIlIllI(NPCs.getNearest(strArr162))) {
                    Clues.f0c = lllII[lllll[832]];
                    k.d(worldPoint111);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr163 = new String[lllll[1]];
                strArr163[lllll[0]] = lllII[lllll[833]];
                if (lIIlIIll(NPCs.getNearest(strArr163))) {
                    n.a(lllII[lllll[834]], new String[lllll[0]], lllll[1]);
                }
            }
            int[] iArr139 = new int[lllll[1]];
            iArr139[lllll[0]] = lllll[835];
            if (lIIlIIIl(Inventory.contains(iArr139) ? 1 : 0)) {
                WorldPoint worldPoint112 = new WorldPoint(lllll[836], lllll[182], lllll[0]);
                String[] strArr164 = new String[lllll[1]];
                strArr164[lllll[0]] = lllII[lllll[837]];
                if (lIIlIllI(NPCs.getNearest(strArr164))) {
                    Clues.f0c = lllII[lllll[838]];
                    if (lIIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    k.d(worldPoint112);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr165 = new String[lllll[1]];
                strArr165[lllll[0]] = lllII[lllll[839]];
                if (lIIlIIll(NPCs.getNearest(strArr165))) {
                    WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                    String[] strArr166 = new String[lllll[1]];
                    strArr166[lllll[0]] = lllII[lllll[840]];
                    if (lIIlIlIl(worldLocation.distanceTo(NPCs.getNearest(strArr166).getWorldLocation()), lllll[7])) {
                        if (lIIlIIlI(Tabs.isOpen(Tab.MUSIC) ? 1 : 0)) {
                            Tabs.open(Tab.MUSIC);
                            Time.sleepTicks(lllll[5]);
                            "".length();
                        }
                        if (lIIlIIIl(Tabs.isOpen(Tab.MUSIC) ? 1 : 0)) {
                            a.a(lllII[lllll[841]]);
                            if (lIIlIIlI(Dialog.isOpen() ? 1 : 0)) {
                                String str2 = lllII[lllll[842]];
                                String[] strArr167 = new String[lllll[1]];
                                strArr167[lllll[0]] = lllII[lllll[843]];
                                n.a(str2, strArr167, lllll[1]);
                            }
                            String[] strArr168 = new String[lllll[1]];
                            strArr168[lllll[0]] = lllII[lllll[844]];
                            n.c(strArr168);
                        }
                    }
                    WorldPoint worldLocation2 = Players.getLocal().getWorldLocation();
                    String[] strArr169 = new String[lllll[1]];
                    strArr169[lllll[0]] = lllII[lllll[845]];
                    if (lIIlIlII(worldLocation2.distanceTo(NPCs.getNearest(strArr169).getWorldLocation()), lllll[7])) {
                        String str3 = lllII[lllll[846]];
                        String[] strArr170 = new String[lllll[1]];
                        strArr170[lllll[0]] = lllII[lllll[847]];
                        n.a(str3, strArr170, lllll[1]);
                    }
                }
            }
            int[] iArr140 = new int[lllll[1]];
            iArr140[lllll[0]] = lllll[848];
            if (lIIlIIIl(Inventory.contains(iArr140) ? 1 : 0)) {
                WorldPoint worldPoint113 = new WorldPoint(lllll[836], lllll[182], lllll[0]);
                String[] strArr171 = new String[lllll[1]];
                strArr171[lllll[0]] = lllII[lllll[849]];
                if (lIIlIllI(NPCs.getNearest(strArr171))) {
                    Clues.f0c = lllII[lllll[850]];
                    if (lIIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    k.d(worldPoint113);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr172 = new String[lllll[1]];
                strArr172[lllll[0]] = lllII[lllll[851]];
                if (lIIlIIll(NPCs.getNearest(strArr172))) {
                    WorldPoint worldLocation3 = Players.getLocal().getWorldLocation();
                    String[] strArr173 = new String[lllll[1]];
                    strArr173[lllll[0]] = lllII[lllll[852]];
                    if (lIIlIlIl(worldLocation3.distanceTo(NPCs.getNearest(strArr173).getWorldLocation()), lllll[7])) {
                        if (lIIlIIlI(Tabs.isOpen(Tab.MUSIC) ? 1 : 0)) {
                            Tabs.open(Tab.MUSIC);
                            Time.sleepTicks(lllll[5]);
                            "".length();
                        }
                        if (lIIlIIIl(Tabs.isOpen(Tab.MUSIC) ? 1 : 0)) {
                            a.a(lllII[lllll[853]]);
                            if (lIIlIIlI(Dialog.isOpen() ? 1 : 0)) {
                                String str4 = lllII[lllll[854]];
                                String[] strArr174 = new String[lllll[1]];
                                strArr174[lllll[0]] = lllII[lllll[855]];
                                n.a(str4, strArr174, lllll[1]);
                            }
                            String[] strArr175 = new String[lllll[1]];
                            strArr175[lllll[0]] = lllII[lllll[856]];
                            n.c(strArr175);
                        }
                    }
                    WorldPoint worldLocation4 = Players.getLocal().getWorldLocation();
                    String[] strArr176 = new String[lllll[1]];
                    strArr176[lllll[0]] = lllII[lllll[857]];
                    if (lIIlIlII(worldLocation4.distanceTo(NPCs.getNearest(strArr176).getWorldLocation()), lllll[7])) {
                        String str5 = lllII[lllll[858]];
                        String[] strArr177 = new String[lllll[1]];
                        strArr177[lllll[0]] = lllII[lllll[859]];
                        n.a(str5, strArr177, lllll[1]);
                    }
                }
            }
            int[] iArr141 = new int[lllll[1]];
            iArr141[lllll[0]] = lllll[860];
            if (lIIlIIIl(Inventory.contains(iArr141) ? 1 : 0)) {
                WorldPoint worldPoint114 = new WorldPoint(lllll[836], lllll[182], lllll[0]);
                String[] strArr178 = new String[lllll[1]];
                strArr178[lllll[0]] = lllII[lllll[861]];
                if (lIIlIllI(NPCs.getNearest(strArr178))) {
                    Clues.f0c = lllII[lllll[862]];
                    if (lIIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    k.d(worldPoint114);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr179 = new String[lllll[1]];
                strArr179[lllll[0]] = lllII[lllll[863]];
                if (lIIlIIll(NPCs.getNearest(strArr179))) {
                    WorldPoint worldLocation5 = Players.getLocal().getWorldLocation();
                    String[] strArr180 = new String[lllll[1]];
                    strArr180[lllll[0]] = lllII[lllll[864]];
                    if (lIIlIlIl(worldLocation5.distanceTo(NPCs.getNearest(strArr180).getWorldLocation()), lllll[7])) {
                        if (lIIlIIlI(Tabs.isOpen(Tab.MUSIC) ? 1 : 0)) {
                            Tabs.open(Tab.MUSIC);
                            Time.sleepTicks(lllll[5]);
                            "".length();
                        }
                        if (lIIlIIIl(Tabs.isOpen(Tab.MUSIC) ? 1 : 0)) {
                            a.a(lllII[lllll[865]]);
                            if (lIIlIIlI(Dialog.isOpen() ? 1 : 0)) {
                                String str6 = lllII[lllll[866]];
                                String[] strArr181 = new String[lllll[1]];
                                strArr181[lllll[0]] = lllII[lllll[867]];
                                n.a(str6, strArr181, lllll[1]);
                            }
                        }
                    }
                    WorldPoint worldLocation6 = Players.getLocal().getWorldLocation();
                    String[] strArr182 = new String[lllll[1]];
                    strArr182[lllll[0]] = lllII[lllll[868]];
                    if (lIIlIlII(worldLocation6.distanceTo(NPCs.getNearest(strArr182).getWorldLocation()), lllll[7])) {
                        String str7 = lllII[lllll[869]];
                        String[] strArr183 = new String[lllll[1]];
                        strArr183[lllll[0]] = lllII[lllll[870]];
                        n.a(str7, strArr183, lllll[1]);
                    }
                }
            }
            int[] iArr142 = new int[lllll[1]];
            iArr142[lllll[0]] = lllll[871];
            if (lIIlIIIl(Inventory.contains(iArr142) ? 1 : 0)) {
                WorldPoint worldPoint115 = new WorldPoint(lllll[836], lllll[182], lllll[0]);
                String[] strArr184 = new String[lllll[1]];
                strArr184[lllll[0]] = lllII[lllll[872]];
                if (lIIlIllI(NPCs.getNearest(strArr184))) {
                    Clues.f0c = lllII[lllll[873]];
                    if (lIIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    k.d(worldPoint115);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr185 = new String[lllll[1]];
                strArr185[lllll[0]] = lllII[lllll[874]];
                if (lIIlIIll(NPCs.getNearest(strArr185))) {
                    WorldPoint worldLocation7 = Players.getLocal().getWorldLocation();
                    String[] strArr186 = new String[lllll[1]];
                    strArr186[lllll[0]] = lllII[lllll[875]];
                    if (lIIlIlIl(worldLocation7.distanceTo(NPCs.getNearest(strArr186).getWorldLocation()), lllll[7])) {
                        if (lIIlIIlI(Tabs.isOpen(Tab.MUSIC) ? 1 : 0)) {
                            Tabs.open(Tab.MUSIC);
                            Time.sleepTicks(lllll[5]);
                            "".length();
                        }
                        if (lIIlIIIl(Tabs.isOpen(Tab.MUSIC) ? 1 : 0)) {
                            a.a(lllII[lllll[876]]);
                            if (lIIlIIlI(Dialog.isOpen() ? 1 : 0)) {
                                String str8 = lllII[lllll[877]];
                                String[] strArr187 = new String[lllll[1]];
                                strArr187[lllll[0]] = lllII[lllll[878]];
                                n.a(str8, strArr187, lllll[1]);
                            }
                            String[] strArr188 = new String[lllll[1]];
                            strArr188[lllll[0]] = lllII[lllll[879]];
                            n.c(strArr188);
                        }
                    }
                    WorldPoint worldLocation8 = Players.getLocal().getWorldLocation();
                    String[] strArr189 = new String[lllll[1]];
                    strArr189[lllll[0]] = lllII[lllll[880]];
                    if (lIIlIlII(worldLocation8.distanceTo(NPCs.getNearest(strArr189).getWorldLocation()), lllll[7])) {
                        String str9 = lllII[lllll[881]];
                        String[] strArr190 = new String[lllll[1]];
                        strArr190[lllll[0]] = lllII[lllll[882]];
                        n.a(str9, strArr190, lllll[1]);
                    }
                }
            }
            int[] iArr143 = new int[lllll[1]];
            iArr143[lllll[0]] = lllll[883];
            if (lIIlIIIl(Inventory.contains(iArr143) ? 1 : 0)) {
                WorldPoint worldPoint116 = new WorldPoint(lllll[836], lllll[182], lllll[0]);
                String[] strArr191 = new String[lllll[1]];
                strArr191[lllll[0]] = lllII[lllll[884]];
                if (lIIlIllI(NPCs.getNearest(strArr191))) {
                    Clues.f0c = lllII[lllll[885]];
                    if (lIIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    k.d(worldPoint116);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr192 = new String[lllll[1]];
                strArr192[lllll[0]] = lllII[lllll[886]];
                if (lIIlIIll(NPCs.getNearest(strArr192))) {
                    WorldPoint worldLocation9 = Players.getLocal().getWorldLocation();
                    String[] strArr193 = new String[lllll[1]];
                    strArr193[lllll[0]] = lllII[lllll[887]];
                    if (lIIlIlIl(worldLocation9.distanceTo(NPCs.getNearest(strArr193).getWorldLocation()), lllll[7])) {
                        if (lIIlIIlI(Tabs.isOpen(Tab.MUSIC) ? 1 : 0)) {
                            Tabs.open(Tab.MUSIC);
                            Time.sleepTicks(lllll[5]);
                            "".length();
                        }
                        if (lIIlIIIl(Tabs.isOpen(Tab.MUSIC) ? 1 : 0)) {
                            a.a(lllII[lllll[888]]);
                            if (lIIlIIlI(Dialog.isOpen() ? 1 : 0)) {
                                String str10 = lllII[lllll[889]];
                                String[] strArr194 = new String[lllll[1]];
                                strArr194[lllll[0]] = lllII[lllll[890]];
                                n.a(str10, strArr194, lllll[1]);
                            }
                            String[] strArr195 = new String[lllll[1]];
                            strArr195[lllll[0]] = lllII[lllll[891]];
                            n.c(strArr195);
                        }
                    }
                    WorldPoint worldLocation10 = Players.getLocal().getWorldLocation();
                    String[] strArr196 = new String[lllll[1]];
                    strArr196[lllll[0]] = lllII[lllll[892]];
                    if (lIIlIlII(worldLocation10.distanceTo(NPCs.getNearest(strArr196).getWorldLocation()), lllll[7])) {
                        String str11 = lllII[lllll[893]];
                        String[] strArr197 = new String[lllll[1]];
                        strArr197[lllll[0]] = lllII[lllll[894]];
                        n.a(str11, strArr197, lllll[1]);
                    }
                }
            }
            int[] iArr144 = new int[lllll[1]];
            iArr144[lllll[0]] = lllll[895];
            if (lIIlIIIl(Inventory.contains(iArr144) ? 1 : 0)) {
                WorldPoint worldPoint117 = new WorldPoint(lllll[836], lllll[182], lllll[0]);
                String[] strArr198 = new String[lllll[1]];
                strArr198[lllll[0]] = lllII[lllll[896]];
                if (lIIlIllI(NPCs.getNearest(strArr198))) {
                    Clues.f0c = lllII[lllll[897]];
                    if (lIIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    k.d(worldPoint117);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                String[] strArr199 = new String[lllll[1]];
                strArr199[lllll[0]] = lllII[lllll[898]];
                if (lIIlIIll(NPCs.getNearest(strArr199))) {
                    WorldPoint worldLocation11 = Players.getLocal().getWorldLocation();
                    String[] strArr200 = new String[lllll[1]];
                    strArr200[lllll[0]] = lllII[lllll[899]];
                    if (lIIlIlIl(worldLocation11.distanceTo(NPCs.getNearest(strArr200).getWorldLocation()), lllll[7])) {
                        if (lIIlIIlI(Tabs.isOpen(Tab.MUSIC) ? 1 : 0)) {
                            Tabs.open(Tab.MUSIC);
                            Time.sleepTicks(lllll[5]);
                            "".length();
                        }
                        if (lIIlIIIl(Tabs.isOpen(Tab.MUSIC) ? 1 : 0)) {
                            a.a(lllII[lllll[900]]);
                            if (lIIlIIlI(Dialog.isOpen() ? 1 : 0)) {
                                String str12 = lllII[lllll[901]];
                                String[] strArr201 = new String[lllll[1]];
                                strArr201[lllll[0]] = lllII[lllll[902]];
                                n.a(str12, strArr201, lllll[1]);
                            }
                            String[] strArr202 = new String[lllll[1]];
                            strArr202[lllll[0]] = lllII[lllll[903]];
                            n.c(strArr202);
                        }
                    }
                    WorldPoint worldLocation12 = Players.getLocal().getWorldLocation();
                    String[] strArr203 = new String[lllll[1]];
                    strArr203[lllll[0]] = lllII[lllll[904]];
                    if (lIIlIlII(worldLocation12.distanceTo(NPCs.getNearest(strArr203).getWorldLocation()), lllll[7])) {
                        String str13 = lllII[lllll[198]];
                        String[] strArr204 = new String[lllll[1]];
                        strArr204[lllll[0]] = lllII[lllll[197]];
                        n.a(str13, strArr204, lllll[1]);
                    }
                }
            }
            int[] iArr145 = new int[lllll[1]];
            iArr145[lllll[0]] = lllll[905];
            if (lIIlIIIl(Inventory.contains(iArr145) ? 1 : 0)) {
                int[] iArr146 = new int[lllll[6]];
                iArr146[lllll[0]] = lllll[906];
                iArr146[lllll[1]] = lllll[907];
                iArr146[lllll[5]] = lllll[908];
                if (lIIlIIlI(a.a(iArr146) ? 1 : 0)) {
                    e.x();
                }
                int[] iArr147 = new int[lllll[6]];
                iArr147[lllll[0]] = lllll[906];
                iArr147[lllll[1]] = lllll[907];
                iArr147[lllll[5]] = lllll[908];
                if (lIIlIIIl(a.a(iArr147) ? 1 : 0)) {
                    WorldPoint worldPoint118 = new WorldPoint(lllll[909], lllll[910], lllll[5]);
                    if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint118), lllll[8])) {
                        Clues.f0c = lllII[lllll[911]];
                        k.d(worldPoint118);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                    if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint118), lllll[8])) {
                        int[] iArr148 = new int[lllll[6]];
                        iArr148[lllll[0]] = lllll[906];
                        iArr148[lllll[1]] = lllll[907];
                        iArr148[lllll[5]] = lllll[908];
                        k.d(iArr148);
                        a.a();
                    }
                }
            }
            int[] iArr149 = new int[lllll[1]];
            iArr149[lllll[0]] = lllll[912];
            if (lIIlIIIl(Inventory.contains(iArr149) ? 1 : 0)) {
                int[] iArr150 = new int[lllll[6]];
                iArr150[lllll[0]] = lllll[906];
                iArr150[lllll[1]] = lllll[913];
                iArr150[lllll[5]] = lllll[914];
                if (lIIlIIlI(a.a(iArr150) ? 1 : 0)) {
                    e.x();
                }
                int[] iArr151 = new int[lllll[6]];
                iArr151[lllll[0]] = lllll[906];
                iArr151[lllll[1]] = lllll[913];
                iArr151[lllll[5]] = lllll[914];
                if (lIIlIIIl(a.a(iArr151) ? 1 : 0)) {
                    WorldPoint worldPoint119 = new WorldPoint(lllll[915], lllll[916], lllll[0]);
                    if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint119) ? 1 : 0)) {
                        Clues.f0c = lllII[lllll[917]];
                        if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(lllll[918], lllll[919], lllll[0])) ? 1 : 0) && lIIlIIlI(Players.getLocal().isAnimating() ? 1 : 0)) {
                            k.c(new WorldPoint(lllll[920], lllll[921], lllll[0]));
                            Time.sleepUntil(() -> {
                                return Players.getLocal().getWorldLocation().equals(new WorldPoint(lllll[920], lllll[921], lllll[0]));
                            }, lllll[195]);
                            "".length();
                        }
                        k.d(worldPoint119);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                    if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint119) ? 1 : 0)) {
                        int[] iArr152 = new int[lllll[6]];
                        iArr152[lllll[0]] = lllll[906];
                        iArr152[lllll[1]] = lllll[913];
                        iArr152[lllll[5]] = lllll[914];
                        k.d(iArr152);
                        a.c();
                    }
                }
            }
            int[] iArr153 = new int[lllll[1]];
            iArr153[lllll[0]] = lllll[922];
            if (lIIlIIIl(Inventory.contains(iArr153) ? 1 : 0)) {
                int[] iArr154 = new int[lllll[6]];
                iArr154[lllll[0]] = lllll[923];
                iArr154[lllll[1]] = lllll[924];
                iArr154[lllll[5]] = lllll[925];
                if (lIIlIIlI(a.a(iArr154) ? 1 : 0)) {
                    e.x();
                }
                int[] iArr155 = new int[lllll[6]];
                iArr155[lllll[0]] = lllll[923];
                iArr155[lllll[1]] = lllll[924];
                iArr155[lllll[5]] = lllll[925];
                if (lIIlIIIl(a.a(iArr155) ? 1 : 0)) {
                    WorldPoint worldPoint120 = new WorldPoint(lllll[926], lllll[927], lllll[0]);
                    if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint120) ? 1 : 0)) {
                        Clues.f0c = lllII[lllll[928]];
                        k.d(worldPoint120);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                    if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint120) ? 1 : 0)) {
                        int[] iArr156 = new int[lllll[6]];
                        iArr156[lllll[0]] = lllll[923];
                        iArr156[lllll[1]] = lllll[924];
                        iArr156[lllll[5]] = lllll[925];
                        k.d(iArr156);
                        a.a();
                    }
                }
            }
            int[] iArr157 = new int[lllll[1]];
            iArr157[lllll[0]] = lllll[929];
            if (lIIlIIIl(Inventory.contains(iArr157) ? 1 : 0)) {
                int[] iArr158 = new int[lllll[6]];
                iArr158[lllll[0]] = lllll[930];
                iArr158[lllll[1]] = lllll[931];
                iArr158[lllll[5]] = lllll[932];
                if (lIIlIIlI(a.a(iArr158) ? 1 : 0)) {
                    e.x();
                }
                int[] iArr159 = new int[lllll[6]];
                iArr159[lllll[0]] = lllll[930];
                iArr159[lllll[1]] = lllll[931];
                iArr159[lllll[5]] = lllll[932];
                if (lIIlIIIl(a.a(iArr159) ? 1 : 0)) {
                    WorldPoint worldPoint121 = new WorldPoint(lllll[933], lllll[934], lllll[0]);
                    if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint121) ? 1 : 0)) {
                        Clues.f0c = lllII[lllll[935]];
                        k.d(worldPoint121);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                    if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint121) ? 1 : 0)) {
                        int[] iArr160 = new int[lllll[6]];
                        iArr160[lllll[0]] = lllll[930];
                        iArr160[lllll[1]] = lllll[931];
                        iArr160[lllll[5]] = lllll[932];
                        k.d(iArr160);
                        a.d();
                    }
                }
            }
            int[] iArr161 = new int[lllll[1]];
            iArr161[lllll[0]] = lllll[936];
            if (lIIlIIIl(Inventory.contains(iArr161) ? 1 : 0)) {
                int[] iArr162 = new int[lllll[6]];
                iArr162[lllll[0]] = lllll[937];
                iArr162[lllll[1]] = lllll[938];
                iArr162[lllll[5]] = lllll[939];
                if (lIIlIIlI(a.a(iArr162) ? 1 : 0)) {
                    e.x();
                }
                int[] iArr163 = new int[lllll[6]];
                iArr163[lllll[0]] = lllll[937];
                iArr163[lllll[1]] = lllll[938];
                iArr163[lllll[5]] = lllll[939];
                if (lIIlIIIl(a.a(iArr163) ? 1 : 0)) {
                    WorldPoint worldPoint122 = new WorldPoint(lllll[940], lllll[941], lllll[0]);
                    if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint122) ? 1 : 0)) {
                        Clues.f0c = lllII[lllll[942]];
                        if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(lllll[943], lllll[944], lllll[0])) ? 1 : 0)) {
                            k.c(new WorldPoint(lllll[945], lllll[946], lllll[0]));
                            Time.sleepUntil(() -> {
                                return Players.getLocal().getWorldLocation().equals(new WorldPoint(lllll[945], lllll[946], lllll[0]));
                            }, lllll[947]);
                            "".length();
                        }
                        k.d(worldPoint122);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                    if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint122) ? 1 : 0)) {
                        int[] iArr164 = new int[lllll[6]];
                        iArr164[lllll[0]] = lllll[937];
                        iArr164[lllll[1]] = lllll[938];
                        iArr164[lllll[5]] = lllll[939];
                        k.d(iArr164);
                        a.e();
                    }
                }
            }
            int[] iArr165 = new int[lllll[1]];
            iArr165[lllll[0]] = lllll[948];
            if (lIIlIIIl(Inventory.contains(iArr165) ? 1 : 0)) {
                int[] iArr166 = new int[lllll[6]];
                iArr166[lllll[0]] = lllll[949];
                iArr166[lllll[1]] = lllll[950];
                iArr166[lllll[5]] = lllll[951];
                if (lIIlIIlI(a.a(iArr166) ? 1 : 0)) {
                    e.x();
                }
                int[] iArr167 = new int[lllll[6]];
                iArr167[lllll[0]] = lllll[949];
                iArr167[lllll[1]] = lllll[950];
                iArr167[lllll[5]] = lllll[951];
                if (lIIlIIIl(a.a(iArr167) ? 1 : 0)) {
                    WorldPoint worldPoint123 = new WorldPoint(lllll[150], lllll[952], lllll[0]);
                    if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint123) ? 1 : 0)) {
                        Clues.f0c = lllII[lllll[953]];
                        k.d(worldPoint123);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                        if (lIIlIIIl(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr205 = new String[lllll[1]];
                            strArr205[lllll[0]] = lllII[lllll[196]];
                            n.c(strArr205);
                        }
                    }
                    if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint123) ? 1 : 0)) {
                        int[] iArr168 = new int[lllll[6]];
                        iArr168[lllll[0]] = lllll[949];
                        iArr168[lllll[1]] = lllll[950];
                        iArr168[lllll[5]] = lllll[951];
                        k.d(iArr168);
                        a.d();
                    }
                }
            }
            int[] iArr169 = new int[lllll[1]];
            iArr169[lllll[0]] = lllll[954];
            if (lIIlIIIl(Inventory.contains(iArr169) ? 1 : 0)) {
                int[] iArr170 = new int[lllll[6]];
                iArr170[lllll[0]] = lllll[955];
                iArr170[lllll[1]] = lllll[956];
                iArr170[lllll[5]] = lllll[957];
                if (lIIlIIlI(a.a(iArr170) ? 1 : 0)) {
                    e.x();
                }
                int[] iArr171 = new int[lllll[6]];
                iArr171[lllll[0]] = lllll[955];
                iArr171[lllll[1]] = lllll[956];
                iArr171[lllll[5]] = lllll[957];
                if (lIIlIIIl(a.a(iArr171) ? 1 : 0)) {
                    WorldPoint worldPoint124 = new WorldPoint(lllll[804], lllll[805], lllll[0]);
                    if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint124) ? 1 : 0)) {
                        Clues.f0c = lllII[lllll[958]];
                        k.d(worldPoint124);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                    if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint124) ? 1 : 0)) {
                        int[] iArr172 = new int[lllll[6]];
                        iArr172[lllll[0]] = lllll[955];
                        iArr172[lllll[1]] = lllll[956];
                        iArr172[lllll[5]] = lllll[957];
                        k.d(iArr172);
                        a.e();
                    }
                }
            }
            int[] iArr173 = new int[lllll[1]];
            iArr173[lllll[0]] = lllll[959];
            if (lIIlIIIl(Inventory.contains(iArr173) ? 1 : 0)) {
                int[] iArr174 = new int[lllll[6]];
                iArr174[lllll[0]] = lllll[960];
                iArr174[lllll[1]] = lllll[938];
                iArr174[lllll[5]] = lllll[961];
                if (lIIlIIlI(a.a(iArr174) ? 1 : 0)) {
                    e.x();
                }
                int[] iArr175 = new int[lllll[6]];
                iArr175[lllll[0]] = lllll[960];
                iArr175[lllll[1]] = lllll[938];
                iArr175[lllll[5]] = lllll[961];
                if (lIIlIIIl(a.a(iArr175) ? 1 : 0)) {
                    WorldPoint worldPoint125 = new WorldPoint(lllll[962], lllll[69], lllll[0]);
                    if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint125) ? 1 : 0)) {
                        Clues.f0c = lllII[lllll[963]];
                        k.d(worldPoint125);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                    if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint125) ? 1 : 0)) {
                        int[] iArr176 = new int[lllll[6]];
                        iArr176[lllll[0]] = lllll[960];
                        iArr176[lllll[1]] = lllll[938];
                        iArr176[lllll[5]] = lllll[961];
                        k.d(iArr176);
                        a.f();
                    }
                }
            }
            int[] iArr177 = new int[lllll[1]];
            iArr177[lllll[0]] = lllll[964];
            if (lIIlIIIl(Inventory.contains(iArr177) ? 1 : 0)) {
                int[] iArr178 = new int[lllll[6]];
                iArr178[lllll[0]] = lllll[965];
                iArr178[lllll[1]] = lllll[966];
                iArr178[lllll[5]] = lllll[967];
                if (lIIlIIlI(a.a(iArr178) ? 1 : 0)) {
                    e.x();
                }
                int[] iArr179 = new int[lllll[6]];
                iArr179[lllll[0]] = lllll[965];
                iArr179[lllll[1]] = lllll[966];
                iArr179[lllll[5]] = lllll[967];
                if (lIIlIIIl(a.a(iArr179) ? 1 : 0)) {
                    WorldPoint worldPoint126 = new WorldPoint(lllll[968], lllll[654], lllll[0]);
                    if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint126) ? 1 : 0)) {
                        Clues.f0c = lllII[lllll[969]];
                        k.d(worldPoint126);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                    if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint126) ? 1 : 0)) {
                        int[] iArr180 = new int[lllll[6]];
                        iArr180[lllll[0]] = lllll[965];
                        iArr180[lllll[1]] = lllll[966];
                        iArr180[lllll[5]] = lllll[967];
                        k.d(iArr180);
                        a.g();
                    }
                }
            }
            int[] iArr181 = new int[lllll[1]];
            iArr181[lllll[0]] = lllll[970];
            if (lIIlIIIl(Inventory.contains(iArr181) ? 1 : 0)) {
                int[] iArr182 = new int[lllll[5]];
                iArr182[lllll[0]] = lllll[971];
                iArr182[lllll[1]] = lllll[972];
                if (lIIlIIlI(a.a(iArr182) ? 1 : 0)) {
                    e.x();
                }
                int[] iArr183 = new int[lllll[5]];
                iArr183[lllll[0]] = lllll[971];
                iArr183[lllll[1]] = lllll[972];
                if (lIIlIIIl(a.a(iArr183) ? 1 : 0)) {
                    WorldPoint worldPoint127 = new WorldPoint(lllll[973], lllll[974], lllll[0]);
                    if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint127) ? 1 : 0)) {
                        Clues.f0c = lllII[lllll[975]];
                        k.d(worldPoint127);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                    if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint127) ? 1 : 0)) {
                        int[] iArr184 = new int[lllll[5]];
                        iArr184[lllll[0]] = lllll[971];
                        iArr184[lllll[1]] = lllll[972];
                        k.d(iArr184);
                        a.o();
                    }
                }
            }
            int[] iArr185 = new int[lllll[1]];
            iArr185[lllll[0]] = lllll[976];
            if (lIIlIIIl(Inventory.contains(iArr185) ? 1 : 0)) {
                int[] iArr186 = new int[lllll[6]];
                iArr186[lllll[0]] = lllll[977];
                iArr186[lllll[1]] = lllll[978];
                iArr186[lllll[5]] = lllll[979];
                if (lIIlIIlI(a.a(iArr186) ? 1 : 0)) {
                    e.x();
                }
                int[] iArr187 = new int[lllll[6]];
                iArr187[lllll[0]] = lllll[977];
                iArr187[lllll[1]] = lllll[978];
                iArr187[lllll[5]] = lllll[979];
                if (lIIlIIIl(a.a(iArr187) ? 1 : 0)) {
                    WorldPoint worldPoint128 = new WorldPoint(lllll[980], lllll[981], lllll[0]);
                    if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint128) ? 1 : 0)) {
                        Clues.f0c = lllII[lllll[982]];
                        k.d(worldPoint128);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                    if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint128) ? 1 : 0)) {
                        int[] iArr188 = new int[lllll[6]];
                        iArr188[lllll[0]] = lllll[977];
                        iArr188[lllll[1]] = lllll[978];
                        iArr188[lllll[5]] = lllll[979];
                        k.d(iArr188);
                        a.f();
                    }
                }
            }
            int[] iArr189 = new int[lllll[1]];
            iArr189[lllll[0]] = lllll[983];
            if (lIIlIIIl(Inventory.contains(iArr189) ? 1 : 0)) {
                int[] iArr190 = new int[lllll[6]];
                iArr190[lllll[0]] = lllll[984];
                iArr190[lllll[1]] = lllll[985];
                iArr190[lllll[5]] = lllll[986];
                if (lIIlIIlI(a.a(iArr190) ? 1 : 0)) {
                    e.x();
                }
                int[] iArr191 = new int[lllll[6]];
                iArr191[lllll[0]] = lllll[984];
                iArr191[lllll[1]] = lllll[985];
                iArr191[lllll[5]] = lllll[986];
                if (lIIlIIIl(a.a(iArr191) ? 1 : 0)) {
                    WorldPoint worldPoint129 = new WorldPoint(lllll[987], lllll[988], lllll[0]);
                    if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint129) ? 1 : 0)) {
                        Clues.f0c = lllII[lllll[989]];
                        k.d(worldPoint129);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                    if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint129) ? 1 : 0)) {
                        int[] iArr192 = new int[lllll[6]];
                        iArr192[lllll[0]] = lllll[984];
                        iArr192[lllll[1]] = lllll[985];
                        iArr192[lllll[5]] = lllll[986];
                        k.d(iArr192);
                        a.n();
                    }
                }
            }
            int[] iArr193 = new int[lllll[1]];
            iArr193[lllll[0]] = lllll[990];
            if (lIIlIIIl(Inventory.contains(iArr193) ? 1 : 0)) {
                int[] iArr194 = new int[lllll[6]];
                iArr194[lllll[0]] = lllll[991];
                iArr194[lllll[1]] = lllll[992];
                iArr194[lllll[5]] = lllll[993];
                if (lIIlIIlI(a.a(iArr194) ? 1 : 0)) {
                    e.x();
                }
                int[] iArr195 = new int[lllll[6]];
                iArr195[lllll[0]] = lllll[991];
                iArr195[lllll[1]] = lllll[992];
                iArr195[lllll[5]] = lllll[993];
                if (lIIlIIIl(a.a(iArr195) ? 1 : 0)) {
                    WorldPoint worldPoint130 = new WorldPoint(lllll[994], lllll[792], lllll[0]);
                    if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint130) ? 1 : 0)) {
                        Clues.f0c = lllII[lllll[995]];
                        k.d(worldPoint130);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                    if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint130) ? 1 : 0)) {
                        int[] iArr196 = new int[lllll[6]];
                        iArr196[lllll[0]] = lllll[991];
                        iArr196[lllll[1]] = lllll[992];
                        iArr196[lllll[5]] = lllll[993];
                        k.d(iArr196);
                        a.k();
                    }
                }
            }
            int[] iArr197 = new int[lllll[1]];
            iArr197[lllll[0]] = lllll[996];
            if (lIIlIIIl(Inventory.contains(iArr197) ? 1 : 0)) {
                int[] iArr198 = new int[lllll[6]];
                iArr198[lllll[0]] = lllll[997];
                iArr198[lllll[1]] = lllll[957];
                iArr198[lllll[5]] = lllll[998];
                if (lIIlIIlI(a.a(iArr198) ? 1 : 0)) {
                    e.x();
                }
                int[] iArr199 = new int[lllll[6]];
                iArr199[lllll[0]] = lllll[997];
                iArr199[lllll[1]] = lllll[957];
                iArr199[lllll[5]] = lllll[998];
                if (lIIlIIIl(a.a(iArr199) ? 1 : 0)) {
                    WorldPoint worldPoint131 = new WorldPoint(lllll[999], lllll[973], lllll[0]);
                    if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint131) ? 1 : 0)) {
                        Clues.f0c = lllII[lllll[1000]];
                        k.d(worldPoint131);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                    if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint131) ? 1 : 0)) {
                        int[] iArr200 = new int[lllll[6]];
                        iArr200[lllll[0]] = lllll[997];
                        iArr200[lllll[1]] = lllll[957];
                        iArr200[lllll[5]] = lllll[998];
                        k.d(iArr200);
                        a.l();
                    }
                }
            }
            int[] iArr201 = new int[lllll[1]];
            iArr201[lllll[0]] = lllll[1001];
            if (lIIlIIIl(Inventory.contains(iArr201) ? 1 : 0)) {
                int[] iArr202 = new int[lllll[6]];
                iArr202[lllll[0]] = lllll[1002];
                iArr202[lllll[1]] = lllll[961];
                iArr202[lllll[5]] = lllll[1003];
                if (lIIlIIlI(a.a(iArr202) ? 1 : 0)) {
                    e.x();
                }
                int[] iArr203 = new int[lllll[6]];
                iArr203[lllll[0]] = lllll[1002];
                iArr203[lllll[1]] = lllll[961];
                iArr203[lllll[5]] = lllll[1003];
                if (lIIlIIIl(a.a(iArr203) ? 1 : 0)) {
                    WorldPoint worldPoint132 = new WorldPoint(lllll[162], lllll[1004], lllll[0]);
                    if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint132) ? 1 : 0)) {
                        Clues.f0c = lllII[lllll[1005]];
                        k.d(worldPoint132);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                    if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint132) ? 1 : 0)) {
                        int[] iArr204 = new int[lllll[6]];
                        iArr204[lllll[0]] = lllll[1002];
                        iArr204[lllll[1]] = lllll[961];
                        iArr204[lllll[5]] = lllll[1003];
                        k.d(iArr204);
                        a.m();
                    }
                }
            }
            int[] iArr205 = new int[lllll[1]];
            iArr205[lllll[0]] = lllll[1006];
            if (lIIlIIIl(Inventory.contains(iArr205) ? 1 : 0)) {
                int[] iArr206 = new int[lllll[6]];
                iArr206[lllll[0]] = lllll[924];
                iArr206[lllll[1]] = lllll[1007];
                iArr206[lllll[5]] = lllll[1008];
                if (lIIlIIlI(a.a(iArr206) ? 1 : 0)) {
                    e.x();
                }
                int[] iArr207 = new int[lllll[6]];
                iArr207[lllll[0]] = lllll[924];
                iArr207[lllll[1]] = lllll[1007];
                iArr207[lllll[5]] = lllll[1008];
                if (lIIlIIIl(a.a(iArr207) ? 1 : 0)) {
                    WorldPoint worldPoint133 = new WorldPoint(lllll[1009], lllll[1010], lllll[0]);
                    if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint133) ? 1 : 0)) {
                        Clues.f0c = lllII[lllll[1011]];
                        k.d(worldPoint133);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                    if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint133) ? 1 : 0)) {
                        int[] iArr208 = new int[lllll[6]];
                        iArr208[lllll[0]] = lllll[924];
                        iArr208[lllll[1]] = lllll[1007];
                        iArr208[lllll[5]] = lllll[1008];
                        k.d(iArr208);
                        a.o();
                    }
                }
            }
            int[] iArr209 = new int[lllll[1]];
            iArr209[lllll[0]] = lllll[1012];
            if (lIIlIIIl(Inventory.contains(iArr209) ? 1 : 0)) {
                int[] iArr210 = new int[lllll[6]];
                iArr210[lllll[0]] = lllll[1013];
                iArr210[lllll[1]] = lllll[1014];
                iArr210[lllll[5]] = lllll[938];
                if (lIIlIIlI(a.a(iArr210) ? 1 : 0)) {
                    e.x();
                }
                int[] iArr211 = new int[lllll[6]];
                iArr211[lllll[0]] = lllll[1013];
                iArr211[lllll[1]] = lllll[1014];
                iArr211[lllll[5]] = lllll[938];
                if (lIIlIIIl(a.a(iArr211) ? 1 : 0)) {
                    WorldPoint worldPoint134 = new WorldPoint(lllll[1015], lllll[692], lllll[0]);
                    if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint134) ? 1 : 0)) {
                        Clues.f0c = lllII[lllll[1016]];
                        if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(lllll[943], lllll[944], lllll[0])) ? 1 : 0)) {
                            k.c(new WorldPoint(lllll[597], lllll[175], lllll[0]));
                            Time.sleepUntil(() -> {
                                return Players.getLocal().getWorldLocation().equals(new WorldPoint(lllll[597], lllll[175], lllll[0]));
                            }, lllll[195]);
                            "".length();
                        }
                        k.d(worldPoint134);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                    if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint134) ? 1 : 0)) {
                        int[] iArr212 = new int[lllll[6]];
                        iArr212[lllll[0]] = lllll[1013];
                        iArr212[lllll[1]] = lllll[1014];
                        iArr212[lllll[5]] = lllll[938];
                        k.d(iArr212);
                        a.m();
                    }
                }
            }
            int[] iArr213 = new int[lllll[1]];
            iArr213[lllll[0]] = lllll[1017];
            if (lIIlIIIl(Inventory.contains(iArr213) ? 1 : 0)) {
                int[] iArr214 = new int[lllll[6]];
                iArr214[lllll[0]] = lllll[1018];
                iArr214[lllll[1]] = lllll[997];
                iArr214[lllll[5]] = lllll[1019];
                if (lIIlIIlI(a.a(iArr214) ? 1 : 0)) {
                    e.x();
                }
                int[] iArr215 = new int[lllll[6]];
                iArr215[lllll[0]] = lllll[1018];
                iArr215[lllll[1]] = lllll[997];
                iArr215[lllll[5]] = lllll[1019];
                if (lIIlIIIl(a.a(iArr215) ? 1 : 0)) {
                    WorldPoint worldPoint135 = new WorldPoint(lllll[1020], lllll[1021], lllll[0]);
                    if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint135) ? 1 : 0)) {
                        Clues.f0c = lllII[lllll[1022]];
                        k.d(worldPoint135);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                    if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint135) ? 1 : 0)) {
                        int[] iArr216 = new int[lllll[6]];
                        iArr216[lllll[0]] = lllll[1018];
                        iArr216[lllll[1]] = lllll[997];
                        iArr216[lllll[5]] = lllll[1019];
                        k.d(iArr216);
                        a.m();
                    }
                }
            }
            int[] iArr217 = new int[lllll[1]];
            iArr217[lllll[0]] = lllll[1023];
            if (lIIlIIIl(Inventory.contains(iArr217) ? 1 : 0)) {
                int[] iArr218 = new int[lllll[6]];
                iArr218[lllll[0]] = lllll[1018];
                iArr218[lllll[1]] = lllll[961];
                iArr218[lllll[5]] = lllll[1024];
                if (lIIlIIlI(a.a(iArr218) ? 1 : 0)) {
                    e.x();
                }
                int[] iArr219 = new int[lllll[6]];
                iArr219[lllll[0]] = lllll[1018];
                iArr219[lllll[1]] = lllll[961];
                iArr219[lllll[5]] = lllll[1024];
                if (lIIlIIIl(a.a(iArr219) ? 1 : 0)) {
                    WorldPoint worldPoint136 = new WorldPoint(lllll[1025], lllll[974], lllll[0]);
                    if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint136) ? 1 : 0)) {
                        Clues.f0c = lllII[lllll[1026]];
                        k.d(worldPoint136);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                    if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint136) ? 1 : 0)) {
                        int[] iArr220 = new int[lllll[6]];
                        iArr220[lllll[0]] = lllll[1018];
                        iArr220[lllll[1]] = lllll[961];
                        iArr220[lllll[5]] = lllll[1024];
                        k.d(iArr220);
                        a.g();
                    }
                }
            }
            int[] iArr221 = new int[lllll[1]];
            iArr221[lllll[0]] = lllll[1027];
            if (lIIlIIIl(Inventory.contains(iArr221) ? 1 : 0)) {
                int[] iArr222 = new int[lllll[6]];
                iArr222[lllll[0]] = lllll[1028];
                iArr222[lllll[1]] = lllll[1029];
                iArr222[lllll[5]] = lllll[1030];
                if (lIIlIIlI(a.a(iArr222) ? 1 : 0)) {
                    e.x();
                }
                int[] iArr223 = new int[lllll[6]];
                iArr223[lllll[0]] = lllll[1028];
                iArr223[lllll[1]] = lllll[1029];
                iArr223[lllll[5]] = lllll[1030];
                if (lIIlIIIl(a.a(iArr223) ? 1 : 0)) {
                    WorldPoint worldPoint137 = new WorldPoint(lllll[798], lllll[1031], lllll[0]);
                    if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint137) ? 1 : 0)) {
                        Clues.f0c = lllII[lllll[992]];
                        k.d(worldPoint137);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                    if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint137) ? 1 : 0)) {
                        int[] iArr224 = new int[lllll[6]];
                        iArr224[lllll[0]] = lllll[1028];
                        iArr224[lllll[1]] = lllll[1029];
                        iArr224[lllll[5]] = lllll[1030];
                        k.d(iArr224);
                        a.h();
                    }
                }
            }
            int[] iArr225 = new int[lllll[1]];
            iArr225[lllll[0]] = lllll[1032];
            if (lIIlIIIl(Inventory.contains(iArr225) ? 1 : 0)) {
                if (lIIlIIlI(a.a(new int[lllll[0]]) ? 1 : 0)) {
                    e.x();
                }
                if (lIIlIIIl(a.a(new int[lllll[0]]) ? 1 : 0)) {
                    k.d(new int[lllll[0]]);
                    WorldPoint worldPoint138 = new WorldPoint(lllll[1033], lllll[1034], lllll[0]);
                    if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint138) ? 1 : 0)) {
                        Clues.f0c = lllII[lllll[1035]];
                        k.d(worldPoint138);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                    if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint138) ? 1 : 0)) {
                        if (lIIlIIIl(Inventory.isFull() ? 1 : 0)) {
                            int[] iArr226 = new int[lllll[1]];
                            iArr226[lllll[0]] = Clues.k;
                            Inventory.getFirst(iArr226).interact(lllII[lllll[1028]]);
                            Time.sleepTicks(lllll[1]);
                            "".length();
                        }
                        List all = Equipment.getAll();
                        if (lIIlIlll(all.size())) {
                            int i = lllll[0];
                            do {
                                if (lIIllIII(i, all.size())) {
                                    ((Item) all.get(i)).interact(lllII[lllll[1036]]);
                                    Time.sleepTicks(lllll[1]);
                                    "".length();
                                    if (lIIlIIIl(Inventory.isFull() ? 1 : 0)) {
                                        "".length();
                                        if (" ".length() > "   ".length()) {
                                            return;
                                        }
                                    } else {
                                        i++;
                                        "".length();
                                    }
                                }
                            } while (0 == 0);
                            return;
                        }
                        a.h();
                    }
                }
            }
            int[] iArr227 = new int[lllll[1]];
            iArr227[lllll[0]] = lllll[1037];
            if (lIIlIIIl(Inventory.contains(iArr227) ? 1 : 0)) {
                if (lIIlIIlI(a.a(new int[lllll[0]]) ? 1 : 0)) {
                    e.x();
                }
                if (lIIlIIIl(a.a(new int[lllll[0]]) ? 1 : 0)) {
                    k.d(new int[lllll[0]]);
                    WorldPoint worldPoint139 = new WorldPoint(lllll[1038], lllll[952], lllll[0]);
                    if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint139) ? 1 : 0)) {
                        Clues.f0c = lllII[lllll[1039]];
                        k.d(worldPoint139);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                    if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint139) ? 1 : 0)) {
                        if (lIIlIIIl(Inventory.isFull() ? 1 : 0)) {
                            int[] iArr228 = new int[lllll[1]];
                            iArr228[lllll[0]] = Clues.k;
                            Inventory.getFirst(iArr228).interact(lllII[lllll[1040]]);
                            Time.sleepTicks(lllll[1]);
                            "".length();
                        }
                        List all2 = Equipment.getAll();
                        if (lIIlIlll(all2.size())) {
                            int i2 = lllll[0];
                            do {
                                if (lIIllIII(i2, all2.size())) {
                                    ((Item) all2.get(i2)).interact(lllII[lllll[1041]]);
                                    Time.sleepTicks(lllll[1]);
                                    "".length();
                                    if (lIIlIIIl(Inventory.isFull() ? 1 : 0)) {
                                        "".length();
                                        if (((140 ^ 164) & ((152 ^ 176) ^ (-1))) == (-" ".length())) {
                                            return;
                                        }
                                    } else {
                                        i2++;
                                        "".length();
                                    }
                                }
                            } while ((-" ".length()) != "   ".length());
                            return;
                        }
                        a.j();
                    }
                }
            }
            int[] iArr229 = new int[lllll[1]];
            iArr229[lllll[0]] = lllll[1042];
            if (lIIlIIIl(Inventory.contains(iArr229) ? 1 : 0)) {
                int[] iArr230 = new int[lllll[6]];
                iArr230[lllll[0]] = lllll[1043];
                iArr230[lllll[1]] = lllll[907];
                iArr230[lllll[5]] = lllll[1044];
                if (lIIlIIlI(a.a(iArr230) ? 1 : 0)) {
                    e.x();
                }
                int[] iArr231 = new int[lllll[6]];
                iArr231[lllll[0]] = lllll[1043];
                iArr231[lllll[1]] = lllll[907];
                iArr231[lllll[5]] = lllll[1044];
                if (lIIlIIIl(a.a(iArr231) ? 1 : 0)) {
                    WorldPoint worldPoint140 = new WorldPoint(lllll[261], lllll[380], lllll[0]);
                    if (lIIlIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint140), lllll[1])) {
                        Clues.f0c = lllII[lllll[1045]];
                        k.d(worldPoint140);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                    if (lIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint140), lllll[1])) {
                        int[] iArr232 = new int[lllll[6]];
                        iArr232[lllll[0]] = lllll[1043];
                        iArr232[lllll[1]] = lllll[907];
                        iArr232[lllll[5]] = lllll[1044];
                        k.d(iArr232);
                        a.l();
                    }
                }
            }
            int[] iArr233 = new int[lllll[1]];
            iArr233[lllll[0]] = lllll[1046];
            if (lIIlIIIl(Inventory.contains(iArr233) ? 1 : 0)) {
                int[] iArr234 = new int[lllll[6]];
                iArr234[lllll[0]] = lllll[960];
                iArr234[lllll[1]] = lllll[1047];
                iArr234[lllll[5]] = lllll[1048];
                if (lIIlIIlI(a.a(iArr234) ? 1 : 0)) {
                    e.x();
                }
                int[] iArr235 = new int[lllll[6]];
                iArr235[lllll[0]] = lllll[960];
                iArr235[lllll[1]] = lllll[1047];
                iArr235[lllll[5]] = lllll[1048];
                if (lIIlIIIl(a.a(iArr235) ? 1 : 0)) {
                    WorldPoint worldPoint141 = new WorldPoint(lllll[1049], lllll[1050], lllll[0]);
                    if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint141) ? 1 : 0)) {
                        Clues.f0c = lllII[lllll[1051]];
                        k.d(worldPoint141);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                    if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint141) ? 1 : 0)) {
                        int[] iArr236 = new int[lllll[6]];
                        iArr236[lllll[0]] = lllll[960];
                        iArr236[lllll[1]] = lllll[1047];
                        iArr236[lllll[5]] = lllll[1048];
                        k.d(iArr236);
                        a.d();
                    }
                }
            }
            int[] iArr237 = new int[lllll[1]];
            iArr237[lllll[0]] = lllll[1052];
            if (lIIlIIIl(Inventory.contains(iArr237) ? 1 : 0)) {
                int[] iArr238 = new int[lllll[6]];
                iArr238[lllll[0]] = lllll[1053];
                iArr238[lllll[1]] = lllll[938];
                iArr238[lllll[5]] = lllll[1054];
                if (lIIlIIlI(a.a(iArr238) ? 1 : 0)) {
                    e.x();
                }
                int[] iArr239 = new int[lllll[6]];
                iArr239[lllll[0]] = lllll[1053];
                iArr239[lllll[1]] = lllll[938];
                iArr239[lllll[5]] = lllll[1054];
                if (lIIlIIIl(a.a(iArr239) ? 1 : 0)) {
                    WorldPoint worldPoint142 = new WorldPoint(lllll[1055], lllll[22], lllll[0]);
                    if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint142) ? 1 : 0)) {
                        Clues.f0c = lllII[lllll[1056]];
                        k.d(worldPoint142);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                    if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint142) ? 1 : 0)) {
                        int[] iArr240 = new int[lllll[6]];
                        iArr240[lllll[0]] = lllll[1053];
                        iArr240[lllll[1]] = lllll[938];
                        iArr240[lllll[5]] = lllll[1054];
                        k.d(iArr240);
                        a.e();
                    }
                }
            }
            int[] iArr241 = new int[lllll[1]];
            iArr241[lllll[0]] = lllll[1057];
            if (lIIlIIIl(Inventory.contains(iArr241) ? 1 : 0)) {
                int[] iArr242 = new int[lllll[6]];
                iArr242[lllll[0]] = lllll[925];
                iArr242[lllll[1]] = lllll[1058];
                iArr242[lllll[5]] = lllll[1024];
                if (lIIlIIlI(a.a(iArr242) ? 1 : 0)) {
                    e.x();
                }
                int[] iArr243 = new int[lllll[6]];
                iArr243[lllll[0]] = lllll[925];
                iArr243[lllll[1]] = lllll[1058];
                iArr243[lllll[5]] = lllll[1024];
                if (lIIlIIIl(a.a(iArr243) ? 1 : 0)) {
                    WorldPoint worldPoint143 = new WorldPoint(lllll[1059], lllll[1060], lllll[0]);
                    if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint143) ? 1 : 0)) {
                        Clues.f0c = lllII[lllll[1061]];
                        k.d(worldPoint143);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                    if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint143) ? 1 : 0)) {
                        int[] iArr244 = new int[lllll[6]];
                        iArr244[lllll[0]] = lllll[925];
                        iArr244[lllll[1]] = lllll[1058];
                        iArr244[lllll[5]] = lllll[1024];
                        k.d(iArr244);
                        a.a();
                    }
                }
            }
            int[] iArr245 = new int[lllll[1]];
            iArr245[lllll[0]] = lllll[1062];
            if (lIIlIIIl(Inventory.contains(iArr245) ? 1 : 0)) {
                int[] iArr246 = new int[lllll[6]];
                iArr246[lllll[0]] = lllll[984];
                iArr246[lllll[1]] = lllll[1024];
                iArr246[lllll[5]] = lllll[1063];
                if (lIIlIIlI(a.a(iArr246) ? 1 : 0)) {
                    e.x();
                }
                int[] iArr247 = new int[lllll[6]];
                iArr247[lllll[0]] = lllll[984];
                iArr247[lllll[1]] = lllll[1024];
                iArr247[lllll[5]] = lllll[1063];
                if (lIIlIIIl(a.a(iArr247) ? 1 : 0)) {
                    WorldPoint worldPoint144 = new WorldPoint(lllll[175], lllll[149], lllll[0]);
                    if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint144) ? 1 : 0)) {
                        Clues.f0c = lllII[lllll[1064]];
                        k.d(worldPoint144);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                    if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint144) ? 1 : 0)) {
                        int[] iArr248 = new int[lllll[6]];
                        iArr248[lllll[0]] = lllll[984];
                        iArr248[lllll[1]] = lllll[1024];
                        iArr248[lllll[5]] = lllll[1063];
                        k.d(iArr248);
                        a.b();
                    }
                }
            }
            int[] iArr249 = new int[lllll[1]];
            iArr249[lllll[0]] = lllll[1065];
            if (lIIlIIIl(Inventory.contains(iArr249) ? 1 : 0)) {
                int[] iArr250 = new int[lllll[6]];
                iArr250[lllll[0]] = lllll[961];
                iArr250[lllll[1]] = lllll[1066];
                iArr250[lllll[5]] = lllll[1067];
                if (lIIlIIlI(a.a(iArr250) ? 1 : 0)) {
                    e.x();
                }
                int[] iArr251 = new int[lllll[6]];
                iArr251[lllll[0]] = lllll[961];
                iArr251[lllll[1]] = lllll[1066];
                iArr251[lllll[5]] = lllll[1067];
                if (lIIlIIIl(a.a(iArr251) ? 1 : 0)) {
                    WorldPoint worldPoint145 = new WorldPoint(lllll[629], lllll[1068], lllll[0]);
                    if (lIIlIIIl(new WorldArea(lllll[212], lllll[1069], lllll[43], lllll[38], lllll[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIIIl(Inventory.contains(item3 -> {
                        return item3.getName().contains(lllII[lllll[1157]]);
                    }) ? 1 : 0)) {
                        Inventory.getFirst(item4 -> {
                            return item4.getName().contains(lllII[lllll[1156]]);
                        }).interact(lllII[lllll[1070]]);
                        Time.sleepTicks(k.c(lllll[10], lllll[11]));
                        "".length();
                    }
                    if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint145) ? 1 : 0)) {
                        Clues.f0c = lllII[lllll[1071]];
                        k.d(worldPoint145);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                    if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint145) ? 1 : 0)) {
                        int[] iArr252 = new int[lllll[6]];
                        iArr252[lllll[0]] = lllll[961];
                        iArr252[lllll[1]] = lllll[1066];
                        iArr252[lllll[5]] = lllll[1067];
                        k.d(iArr252);
                        a.h();
                    }
                }
            }
            int[] iArr253 = new int[lllll[1]];
            iArr253[lllll[0]] = lllll[1072];
            if (lIIlIIIl(Inventory.contains(iArr253) ? 1 : 0)) {
                int[] iArr254 = new int[lllll[6]];
                iArr254[lllll[0]] = lllll[1073];
                iArr254[lllll[1]] = lllll[951];
                iArr254[lllll[5]] = lllll[1074];
                if (lIIlIIlI(a.a(iArr254) ? 1 : 0)) {
                    e.x();
                }
                int[] iArr255 = new int[lllll[6]];
                iArr255[lllll[0]] = lllll[1073];
                iArr255[lllll[1]] = lllll[951];
                iArr255[lllll[5]] = lllll[1074];
                if (lIIlIIIl(a.a(iArr255) ? 1 : 0)) {
                    WorldPoint worldPoint146 = new WorldPoint(lllll[1075], lllll[1076], lllll[0]);
                    if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint146) ? 1 : 0)) {
                        Clues.f0c = lllII[lllll[1077]];
                        k.d(worldPoint146);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                    if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint146) ? 1 : 0)) {
                        int[] iArr256 = new int[lllll[6]];
                        iArr256[lllll[0]] = lllll[1073];
                        iArr256[lllll[1]] = lllll[951];
                        iArr256[lllll[5]] = lllll[1074];
                        k.d(iArr256);
                        a.i();
                    }
                }
            }
            int[] iArr257 = new int[lllll[1]];
            iArr257[lllll[0]] = lllll[1078];
            if (lIIlIIIl(Inventory.contains(iArr257) ? 1 : 0)) {
                int[] iArr258 = new int[lllll[6]];
                iArr258[lllll[0]] = lllll[1079];
                iArr258[lllll[1]] = lllll[1080];
                iArr258[lllll[5]] = lllll[1081];
                if (lIIlIIlI(a.a(iArr258) ? 1 : 0)) {
                    e.x();
                }
                int[] iArr259 = new int[lllll[6]];
                iArr259[lllll[0]] = lllll[1079];
                iArr259[lllll[1]] = lllll[1080];
                iArr259[lllll[5]] = lllll[1081];
                if (lIIlIIIl(a.a(iArr259) ? 1 : 0)) {
                    WorldPoint worldPoint147 = new WorldPoint(lllll[1082], lllll[1083], lllll[0]);
                    if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint147) ? 1 : 0)) {
                        Clues.f0c = lllII[lllll[1084]];
                        k.d(worldPoint147);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                    if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint147) ? 1 : 0)) {
                        int[] iArr260 = new int[lllll[6]];
                        iArr260[lllll[0]] = lllll[1079];
                        iArr260[lllll[1]] = lllll[1080];
                        iArr260[lllll[5]] = lllll[1081];
                        k.d(iArr260);
                        a.d();
                    }
                }
            }
            int[] iArr261 = new int[lllll[1]];
            iArr261[lllll[0]] = lllll[1085];
            if (lIIlIIIl(Inventory.contains(iArr261) ? 1 : 0)) {
                int[] iArr262 = new int[lllll[6]];
                iArr262[lllll[0]] = lllll[966];
                iArr262[lllll[1]] = lllll[1086];
                iArr262[lllll[5]] = lllll[1087];
                if (lIIlIIlI(a.a(iArr262) ? 1 : 0)) {
                    e.x();
                }
                int[] iArr263 = new int[lllll[6]];
                iArr263[lllll[0]] = lllll[966];
                iArr263[lllll[1]] = lllll[1086];
                iArr263[lllll[5]] = lllll[1087];
                if (lIIlIIIl(a.a(iArr263) ? 1 : 0)) {
                    WorldPoint worldPoint148 = new WorldPoint(lllll[1088], lllll[429], lllll[0]);
                    if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint148) ? 1 : 0)) {
                        Clues.f0c = lllII[lllll[1089]];
                        k.d(worldPoint148);
                        Time.sleepTicks(lllll[1]);
                        "".length();
                    }
                    if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint148) ? 1 : 0)) {
                        int[] iArr264 = new int[lllll[6]];
                        iArr264[lllll[0]] = lllll[966];
                        iArr264[lllll[1]] = lllll[1086];
                        iArr264[lllll[5]] = lllll[1087];
                        k.d(iArr264);
                        a.j();
                    }
                }
            }
            int[] iArr265 = new int[lllll[1]];
            iArr265[lllll[0]] = lllll[1090];
            if (lIIlIIIl(Inventory.contains(iArr265) ? 1 : 0)) {
                WorldPoint worldPoint149 = new WorldPoint(lllll[1091], lllll[1092], lllll[0]);
                if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint149) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[1093]];
                    k.d(worldPoint149);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint149) ? 1 : 0)) {
                    int[] iArr266 = new int[lllll[1]];
                    iArr266[lllll[0]] = lllll[1094];
                    if (lIIlIIIl(Inventory.contains(iArr266) ? 1 : 0)) {
                        int[] iArr267 = new int[lllll[1]];
                        iArr267[lllll[0]] = lllll[1094];
                        Inventory.getFirst(iArr267).interact(lllII[lllll[1095]]);
                        Time.sleepTicks(k.c(lllll[6], lllll[7]));
                        "".length();
                    }
                }
            }
            int[] iArr268 = new int[lllll[1]];
            iArr268[lllll[0]] = lllll[1096];
            if (lIIlIIIl(Inventory.contains(iArr268) ? 1 : 0)) {
                WorldPoint worldPoint150 = new WorldPoint(lllll[1097], lllll[262], lllll[0]);
                if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint150) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[1098]];
                    k.d(worldPoint150);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint150) ? 1 : 0)) {
                    int[] iArr269 = new int[lllll[1]];
                    iArr269[lllll[0]] = lllll[1094];
                    if (lIIlIIIl(Inventory.contains(iArr269) ? 1 : 0)) {
                        int[] iArr270 = new int[lllll[1]];
                        iArr270[lllll[0]] = lllll[1094];
                        Inventory.getFirst(iArr270).interact(lllII[lllll[1099]]);
                        Time.sleepTicks(k.c(lllll[6], lllll[7]));
                        "".length();
                    }
                }
            }
            int[] iArr271 = new int[lllll[1]];
            iArr271[lllll[0]] = lllll[1100];
            if (lIIlIIIl(Inventory.contains(iArr271) ? 1 : 0)) {
                WorldPoint worldPoint151 = new WorldPoint(lllll[476], lllll[1101], lllll[0]);
                if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint151) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[1102]];
                    k.d(worldPoint151);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint151) ? 1 : 0)) {
                    int[] iArr272 = new int[lllll[1]];
                    iArr272[lllll[0]] = lllll[1094];
                    if (lIIlIIIl(Inventory.contains(iArr272) ? 1 : 0)) {
                        int[] iArr273 = new int[lllll[1]];
                        iArr273[lllll[0]] = lllll[1094];
                        Inventory.getFirst(iArr273).interact(lllII[lllll[1103]]);
                        Time.sleepTicks(k.c(lllll[6], lllll[7]));
                        "".length();
                    }
                }
            }
            int[] iArr274 = new int[lllll[1]];
            iArr274[lllll[0]] = lllll[1104];
            if (lIIlIIIl(Inventory.contains(iArr274) ? 1 : 0)) {
                WorldPoint worldPoint152 = new WorldPoint(lllll[1105], lllll[1059], lllll[0]);
                if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint152) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[1106]];
                    k.d(worldPoint152);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint152) ? 1 : 0)) {
                    int[] iArr275 = new int[lllll[1]];
                    iArr275[lllll[0]] = lllll[1094];
                    if (lIIlIIIl(Inventory.contains(iArr275) ? 1 : 0)) {
                        int[] iArr276 = new int[lllll[1]];
                        iArr276[lllll[0]] = lllll[1094];
                        Inventory.getFirst(iArr276).interact(lllII[lllll[1107]]);
                        Time.sleepTicks(k.c(lllll[6], lllll[7]));
                        "".length();
                    }
                }
            }
            int[] iArr277 = new int[lllll[1]];
            iArr277[lllll[0]] = lllll[1108];
            if (lIIlIIIl(Inventory.contains(iArr277) ? 1 : 0)) {
                WorldPoint worldPoint153 = new WorldPoint(lllll[1109], lllll[1110], lllll[0]);
                if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint153) ? 1 : 0)) {
                    if (lIIlIIIl(new WorldArea(lllll[1111], lllll[1112], lllll[25], lllll[18], lllll[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        k.c(new WorldPoint(lllll[1113], lllll[604], lllll[0]));
                        Time.sleepTicks(k.c(lllll[8], lllll[11]));
                        "".length();
                    }
                    Clues.f0c = lllII[lllll[1114]];
                    k.a(worldPoint153);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint153) ? 1 : 0)) {
                    int[] iArr278 = new int[lllll[1]];
                    iArr278[lllll[0]] = lllll[1094];
                    if (lIIlIIIl(Inventory.contains(iArr278) ? 1 : 0)) {
                        int[] iArr279 = new int[lllll[1]];
                        iArr279[lllll[0]] = lllll[1094];
                        Inventory.getFirst(iArr279).interact(lllII[lllll[1115]]);
                        Time.sleepTicks(k.c(lllll[6], lllll[7]));
                        "".length();
                    }
                }
            }
            int[] iArr280 = new int[lllll[1]];
            iArr280[lllll[0]] = lllll[1116];
            if (lIIlIIIl(Inventory.contains(iArr280) ? 1 : 0)) {
                WorldPoint worldPoint154 = new WorldPoint(lllll[1117], lllll[1118], lllll[0]);
                if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint154) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[1119]];
                    k.d(worldPoint154);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint154) ? 1 : 0)) {
                    int[] iArr281 = new int[lllll[1]];
                    iArr281[lllll[0]] = lllll[1094];
                    if (lIIlIIIl(Inventory.contains(iArr281) ? 1 : 0)) {
                        int[] iArr282 = new int[lllll[1]];
                        iArr282[lllll[0]] = lllll[1094];
                        Inventory.getFirst(iArr282).interact(lllII[lllll[1120]]);
                        Time.sleepTicks(k.c(lllll[6], lllll[7]));
                        "".length();
                    }
                }
            }
            int[] iArr283 = new int[lllll[1]];
            iArr283[lllll[0]] = lllll[1121];
            if (lIIlIIIl(Inventory.contains(iArr283) ? 1 : 0)) {
                WorldPoint worldPoint155 = new WorldPoint(lllll[1122], lllll[1123], lllll[0]);
                if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint155) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[1124]];
                    k.d(worldPoint155);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint155) ? 1 : 0)) {
                    int[] iArr284 = new int[lllll[1]];
                    iArr284[lllll[0]] = lllll[1094];
                    if (lIIlIIIl(Inventory.contains(iArr284) ? 1 : 0)) {
                        int[] iArr285 = new int[lllll[1]];
                        iArr285[lllll[0]] = lllll[1094];
                        Inventory.getFirst(iArr285).interact(lllII[lllll[1125]]);
                        Time.sleepTicks(k.c(lllll[6], lllll[7]));
                        "".length();
                    }
                }
            }
            int[] iArr286 = new int[lllll[1]];
            iArr286[lllll[0]] = lllll[1126];
            if (lIIlIIIl(Inventory.contains(iArr286) ? 1 : 0)) {
                WorldPoint worldPoint156 = new WorldPoint(lllll[941], lllll[1127], lllll[0]);
                if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint156) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[1128]];
                    k.d(worldPoint156);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint156) ? 1 : 0)) {
                    int[] iArr287 = new int[lllll[1]];
                    iArr287[lllll[0]] = lllll[1094];
                    if (lIIlIIIl(Inventory.contains(iArr287) ? 1 : 0)) {
                        int[] iArr288 = new int[lllll[1]];
                        iArr288[lllll[0]] = lllll[1094];
                        Inventory.getFirst(iArr288).interact(lllII[lllll[1129]]);
                        Time.sleepTicks(k.c(lllll[6], lllll[7]));
                        "".length();
                    }
                }
            }
            int[] iArr289 = new int[lllll[1]];
            iArr289[lllll[0]] = lllll[1130];
            if (lIIlIIIl(Inventory.contains(iArr289) ? 1 : 0)) {
                WorldPoint worldPoint157 = new WorldPoint(lllll[248], lllll[750], lllll[0]);
                if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint157) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[1131]];
                    k.d(worldPoint157);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint157) ? 1 : 0)) {
                    int[] iArr290 = new int[lllll[1]];
                    iArr290[lllll[0]] = lllll[1094];
                    if (lIIlIIIl(Inventory.contains(iArr290) ? 1 : 0)) {
                        int[] iArr291 = new int[lllll[1]];
                        iArr291[lllll[0]] = lllll[1094];
                        Inventory.getFirst(iArr291).interact(lllII[lllll[1132]]);
                        Time.sleepTicks(k.c(lllll[6], lllll[7]));
                        "".length();
                    }
                }
            }
            int[] iArr292 = new int[lllll[1]];
            iArr292[lllll[0]] = lllll[1133];
            if (lIIlIIIl(Inventory.contains(iArr292) ? 1 : 0)) {
                WorldPoint worldPoint158 = new WorldPoint(lllll[1134], lllll[1135], lllll[0]);
                if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint158) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[1136]];
                    WorldArea worldArea5 = new WorldArea(lllll[1137], lllll[113], lllll[38], lllll[32], lllll[0]);
                    if (lIIllIII(k.h(lllll[273]), lllll[293]) && lIIlIIIl(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        int[] iArr293 = new int[lllll[1]];
                        iArr293[lllll[0]] = lllll[1138];
                        if (lIIlIIIl(Inventory.contains(iArr293) ? 1 : 0)) {
                            int[] iArr294 = new int[lllll[1]];
                            iArr294[lllll[0]] = lllll[1138];
                            Inventory.getFirst(iArr294).interact(lllII[lllll[1139]]);
                            Time.sleepUntil(() -> {
                                if (lIIlIIlI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    ?? r0 = lllll[1];
                                    "".length();
                                    return (-(167 ^ 163)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return lllll[0];
                            }, lllll[195]);
                            "".length();
                        }
                    }
                    k.d(worldPoint158);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint158) ? 1 : 0)) {
                    int[] iArr295 = new int[lllll[1]];
                    iArr295[lllll[0]] = lllll[1094];
                    if (lIIlIIIl(Inventory.contains(iArr295) ? 1 : 0)) {
                        int[] iArr296 = new int[lllll[1]];
                        iArr296[lllll[0]] = lllll[1094];
                        Inventory.getFirst(iArr296).interact(lllII[lllll[1140]]);
                        Time.sleepTicks(k.c(lllll[6], lllll[7]));
                        "".length();
                    }
                }
            }
            int[] iArr297 = new int[lllll[1]];
            iArr297[lllll[0]] = lllll[1141];
            if (lIIlIIIl(Inventory.contains(iArr297) ? 1 : 0)) {
                WorldPoint worldPoint159 = new WorldPoint(lllll[1142], lllll[635], lllll[0]);
                if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint159) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[1143]];
                    k.d(worldPoint159);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint159) ? 1 : 0)) {
                    int[] iArr298 = new int[lllll[1]];
                    iArr298[lllll[0]] = lllll[1094];
                    if (lIIlIIIl(Inventory.contains(iArr298) ? 1 : 0)) {
                        int[] iArr299 = new int[lllll[1]];
                        iArr299[lllll[0]] = lllll[1094];
                        Inventory.getFirst(iArr299).interact(lllII[lllll[1144]]);
                        Time.sleepTicks(k.c(lllll[6], lllll[7]));
                        "".length();
                    }
                }
            }
            int[] iArr300 = new int[lllll[1]];
            iArr300[lllll[0]] = lllll[1145];
            if (lIIlIIIl(Inventory.contains(iArr300) ? 1 : 0)) {
                WorldPoint worldPoint160 = new WorldPoint(lllll[1146], lllll[81], lllll[0]);
                if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint160) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[1147]];
                    k.b(worldPoint160);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint160) ? 1 : 0)) {
                    int[] iArr301 = new int[lllll[1]];
                    iArr301[lllll[0]] = lllll[1094];
                    if (lIIlIIIl(Inventory.contains(iArr301) ? 1 : 0)) {
                        int[] iArr302 = new int[lllll[1]];
                        iArr302[lllll[0]] = lllll[1094];
                        Inventory.getFirst(iArr302).interact(lllII[lllll[1148]]);
                        Time.sleepTicks(k.c(lllll[6], lllll[7]));
                        "".length();
                    }
                }
            }
            int[] iArr303 = new int[lllll[1]];
            iArr303[lllll[0]] = lllll[1149];
            if (lIIlIIIl(Inventory.contains(iArr303) ? 1 : 0)) {
                WorldPoint worldPoint161 = new WorldPoint(lllll[924], lllll[1150], lllll[0]);
                if (lIIlIIlI(Players.getLocal().getWorldLocation().equals(worldPoint161) ? 1 : 0)) {
                    Clues.f0c = lllII[lllll[1151]];
                    k.a(worldPoint161);
                    Time.sleepTicks(lllll[1]);
                    "".length();
                }
                if (lIIlIIIl(Players.getLocal().getWorldLocation().equals(worldPoint161) ? 1 : 0)) {
                    int[] iArr304 = new int[lllll[1]];
                    iArr304[lllll[0]] = lllll[1094];
                    if (lIIlIIIl(Inventory.contains(iArr304) ? 1 : 0)) {
                        int[] iArr305 = new int[lllll[1]];
                        iArr305[lllll[0]] = lllll[1094];
                        Inventory.getFirst(iArr305).interact(lllII[lllll[1152]]);
                        Time.sleepTicks(k.c(lllll[6], lllll[7]));
                        "".length();
                    }
                }
            }
            String[] strArr206 = new String[lllll[1]];
            strArr206[lllll[0]] = lllII[lllll[1153]];
            n.c(strArr206);
        }
    }

    private static boolean lIIlIIIl(int i) {
        return i != 0;
    }

    private static boolean lIIlIIll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    private static boolean s() {
        if (lIIlIIIl(Clues.e ? 1 : 0)) {
            int[] iArr = new int[lllll[1]];
            iArr[lllll[0]] = lllll[1094];
            return Inventory.contains(iArr);
        }
        if (!lIIlIIlI(Inventory.contains(item -> {
            return item.getName().contains(lllII[lllll[1155]]);
        }) ? 1 : 0) || lIIlIIIl(Equipment.contains(item2 -> {
            return item2.getName().contains(lllII[lllll[1154]]);
        }) ? 1 : 0)) {
            int[] iArr2 = new int[lllll[1]];
            iArr2[lllll[0]] = lllll[1094];
            if (lIIlIIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                ?? r0 = lllll[1];
                "".length();
                return (-" ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return lllll[0];
    }

    private static boolean lIIlIIlI(int i) {
        return i == 0;
    }

    private static boolean lIIlIlIl(int i, int i2) {
        return i <= i2;
    }

    private static String lIIIllII(String llllIlIlIlIlllI, String llllIlIlIlIllIl) {
        String str = new String(Base64.getDecoder().decode(llllIlIlIlIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllIlIlIlIllII = new StringBuilder();
        char[] charArray = llllIlIlIlIllIl.toCharArray();
        int llllIlIlIlIlIlI = lllll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lllll[0];
        while (lIIllIII(i, length)) {
            char llllIlIlIlIllll = charArray2[i];
            llllIlIlIlIllII.append((char) (llllIlIlIlIllll ^ charArray[llllIlIlIlIlIlI % charArray.length]));
            "".length();
            llllIlIlIlIlIlI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllIlIlIlIllII);
    }

    private static boolean lIIlIlII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIlIlll(int i) {
        return i > 0;
    }

    static {
        lIIlIIII();
        lIIIllll();
    }

    private static boolean lIIlIllI(Object obj) {
        return obj == null;
    }

    private static void lIIlIIII() {
        lllll = new int[1195];
        lllll[0] = (90 ^ 24) & ((54 ^ 116) ^ (-1));
        lllll[1] = " ".length();
        lllll[2] = (-4737) & 7885;
        lllll[3] = (-28833) & 32749;
        lllll[4] = 74 ^ 68;
        lllll[5] = "  ".length();
        lllll[6] = "   ".length();
        lllll[7] = (159 ^ 197) ^ (87 ^ 9);
        lllll[8] = (145 ^ 176) ^ (65 ^ 101);
        lllll[9] = (-1033) & 29945;
        lllll[10] = (((28 + 27) - 20) + 126) ^ (((147 + 129) - 194) + 85);
        lllll[11] = (37 ^ 45) ^ (137 ^ 134);
        lllll[12] = (-((-8355) & 11695)) & (-514) & 32767;
        lllll[13] = (24 ^ 90) ^ (48 ^ 122);
        lllll[14] = 33 ^ 40;
        lllll[15] = (-((-4650) & 29307)) & (-265) & 27613;
        lllll[16] = (-((-43) & 5231)) & (-16417) & 24559;
        lllll[17] = (-12803) & 16191;
        lllll[18] = 91 ^ 81;
        lllll[19] = 88 ^ 83;
        lllll[20] = (((149 + 84) - 119) + 55) ^ (((79 + 89) - 162) + 159);
        lllll[21] = 63 ^ 50;
        lllll[22] = (-((-18305) & 30677)) & (-9) & 15871;
        lllll[23] = (-((-10663) & 28159)) & (-8323) & 28415;
        lllll[24] = (-20509) & 23613;
        lllll[25] = (45 ^ 117) ^ (234 ^ 189);
        lllll[26] = (90 ^ 28) ^ (194 ^ 148);
        lllll[27] = (-9145) & 16382;
        lllll[28] = (-((-2453) & 31191)) & (-10) & 32255;
        lllll[29] = (-((-10913) & 27363)) & (-4117) & 24063;
        lllll[30] = (60 ^ 116) ^ (65 ^ 24);
        lllll[31] = 79 ^ 93;
        lllll[32] = (168 ^ 191) ^ (97 ^ 101);
        lllll[33] = (-((-10805) & 14911)) & (-513) & 8127;
        lllll[34] = (-((-9349) & 30087)) & (-9282) & 32719;
        lllll[35] = (-4626) & 8095;
        lllll[36] = (134 ^ 154) ^ (163 ^ 171);
        lllll[37] = 74 ^ 95;
        lllll[38] = 68 ^ 82;
        lllll[39] = (-((-8891) & 29435)) & (-8194) & 32243;
        lllll[40] = (-4515) & 7151;
        lllll[41] = (-((-8673) & 29667)) & (-8193) & 32639;
        lllll[42] = 38 ^ 49;
        lllll[43] = (((153 + 73) - 149) + 92) ^ (((7 + 94) - 5) + 81);
        lllll[44] = (-7825) & 8181;
        lllll[45] = 175 ^ 182;
        lllll[46] = (-515) & 26303;
        lllll[47] = (-8337) & 10134;
        lllll[48] = (-((-3997) & 32767)) & (-385) & 32767;
        lllll[49] = 124 ^ 102;
        lllll[50] = (55 ^ 21) ^ (42 ^ 19);
        lllll[51] = (((131 + 73) - 129) + 96) ^ (((163 + 86) - 126) + 60);
        lllll[52] = 79 ^ 82;
        lllll[53] = (-((-19165) & 28383)) & (-138) & 32507;
        lllll[54] = (-((-18465) & 31265)) & (-16385) & 32413;
        lllll[55] = (-29185) & 32617;
        lllll[56] = (((77 + 158) - 70) + 11) ^ (((32 + 65) - 87) + 164);
        lllll[57] = 36 ^ 59;
        lllll[58] = (-24586) & 29691;
        lllll[59] = 33 ^ 1;
        lllll[60] = (-((-7543) & 16383)) & (-4099) & 32767;
        lllll[61] = (-((-434) & 23039)) & (-257) & 24543;
        lllll[62] = (-24789) & 28404;
        lllll[63] = 26 ^ 59;
        lllll[64] = 24 ^ 58;
        lllll[65] = (145 ^ 165) ^ (152 ^ 143);
        lllll[66] = 54 ^ 18;
        lllll[67] = (-((-27665) & 31793)) & (-3) & 16319;
        lllll[68] = (-16406) & 19383;
        lllll[69] = (-((-3249) & 28407)) & (-4113) & 32511;
        lllll[70] = (((170 + 64) - 80) + 33) ^ (((33 + 40) - 34) + 119);
        lllll[71] = (84 ^ 58) ^ (210 ^ 154);
        lllll[72] = (((105 + 46) - 101) + 116) ^ (((5 + 48) - 48) + 124);
        lllll[73] = 123 ^ 83;
        lllll[74] = (-4197) & 16381;
        lllll[75] = (-((-2305) & 18709)) & (-13443) & 32759;
        lllll[76] = (-((-2833) & 15163)) & (-513) & 16379;
        lllll[77] = 10 ^ 35;
        lllll[78] = 184 ^ 146;
        lllll[79] = (-((-18733) & 28589)) & (-18433) & 28642;
        lllll[80] = 19 ^ 56;
        lllll[81] = (-3) & 3506;
        lllll[82] = (-((-7345) & 31932)) & (-4353) & 31599;
        lllll[83] = (-20881) & 24030;
        lllll[84] = (((53 + 160) - 128) + 97) ^ (((112 + 129) - 224) + 137);
        lllll[85] = (39 ^ 84) ^ (215 ^ 137);
        lllll[86] = 45 ^ 3;
        lllll[87] = 130 ^ 173;
        lllll[88] = (-((-2059) & 28011)) & (-4097) & 32759;
        lllll[89] = (-(83 ^ 94)) & (-25857) & 28479;
        lllll[90] = (-((-9352) & 30623)) & (-8193) & 32767;
        lllll[91] = (((122 + 32) - (-4)) + 11) ^ (((80 + 134) - 108) + 47);
        lllll[92] = (12 ^ 118) ^ (61 ^ 118);
        lllll[93] = 87 ^ 101;
        lllll[94] = (-((-5113) & 14333)) & (-139) & 32511;
        lllll[95] = (-1078) & 4023;
        lllll[96] = (-12618) & 15823;
        lllll[97] = 119 ^ 68;
        lllll[98] = 35 ^ 23;
        lllll[99] = (101 ^ 112) ^ (29 ^ 61);
        lllll[100] = 80 ^ 102;
        lllll[101] = (-((-3073) & 23901)) & (-1026) & 24543;
        lllll[102] = (-((-11275) & 32239)) & (-8729) & 32766;
        lllll[103] = (-((-3493) & 19893)) & (-650) & 20479;
        lllll[104] = 151 ^ 160;
        lllll[105] = 78 ^ 118;
        lllll[106] = (((14 + 114) - 100) + 133) ^ (((12 + 80) - 65) + 125);
        lllll[107] = 74 ^ 112;
        lllll[108] = (-((-450) & 9679)) & (-385) & 32767;
        lllll[109] = (42 ^ 80) ^ (125 ^ 60);
        lllll[110] = 92 ^ 96;
        lllll[111] = (228 ^ 130) ^ (90 ^ 1);
        lllll[112] = 44 ^ 18;
        lllll[113] = (-4161) & 7663;
        lllll[114] = (-1042) & 3927;
        lllll[115] = (-((-2085) & 10789)) & (-16396) & 28639;
        lllll[116] = 31 ^ 32;
        lllll[117] = (((150 + 30) - 16) + 39) ^ (((103 + 0) - 64) + 100);
        lllll[118] = (30 ^ 19) ^ (60 ^ 112);
        lllll[119] = (124 ^ 5) ^ (102 ^ 93);
        lllll[120] = (-((-67) & 24643)) & (-393) & 27647;
        lllll[121] = (-((-18463) & 31327)) & (-16641) & 32750;
        lllll[122] = (-((-17961) & 26155)) & (-4433) & 15871;
        lllll[123] = (222 ^ 168) ^ (148 ^ 161);
        lllll[124] = 113 ^ 53;
        lllll[125] = 98 ^ 39;
        lllll[126] = 222 ^ 152;
        lllll[127] = (-16465) & 19965;
        lllll[128] = (-8706) & 12013;
        lllll[129] = (-627) & 3831;
        lllll[130] = 130 ^ 197;
        lllll[131] = 207 ^ 135;
        lllll[132] = 61 ^ 116;
        lllll[133] = (((237 + 222) - 441) + 231) ^ (((8 + 84) - (-61)) + 26);
        lllll[134] = (-((-14913) & 16337)) & (-8195) & 32767;
        lllll[135] = (-((-641) & 25237)) & (-4105) & 31615;
        lllll[136] = (-4737) & 8187;
        lllll[137] = (((30 + 22) - (-78)) + 11) ^ (((96 + 93) - 76) + 85);
        lllll[138] = (((155 + 3) - 19) + 53) ^ (((50 + 54) - 50) + 86);
        lllll[139] = 100 ^ 41;
        lllll[140] = 254 ^ 176;
        lllll[141] = (-((-11339) & 31867)) & (-1) & 32703;
        lllll[142] = (-((-21557) & 22207)) & (-20517) & 24510;
        lllll[143] = (-12493) & 15870;
        lllll[144] = 84 ^ 27;
        lllll[145] = 242 ^ 162;
        lllll[146] = 196 ^ 149;
        lllll[147] = 220 ^ 142;
        lllll[148] = (-((-20641) & 21921)) & (-4097) & 8058;
        lllll[149] = (-((-12825) & 29499)) & (-8197) & 28159;
        lllll[150] = (-21021) & 24223;
        lllll[151] = (70 ^ 98) ^ (252 ^ 139);
        lllll[152] = (220 ^ 149) ^ (105 ^ 116);
        lllll[153] = (214 ^ 138) ^ (202 ^ 195);
        lllll[154] = (((203 + 73) - 167) + 140) ^ (((105 + 55) - 124) + 139);
        lllll[155] = (-28979) & 31666;
        lllll[156] = (-((-15609) & 32250)) & (-8769) & 28637;
        lllll[157] = (-((-6547) & 31642)) & (-17) & 28543;
        lllll[158] = (((55 + 90) - (-33)) + 43) ^ (((81 + 46) - 11) + 22);
        lllll[159] = (74 ^ 23) ^ (20 ^ 17);
        lllll[160] = (((159 + 13) - (-9)) + 64) ^ (((165 + 92) - 156) + 71);
        lllll[161] = (-138) & 2815;
        lllll[162] = (-24691) & 27903;
        lllll[163] = 66 ^ 24;
        lllll[164] = (((95 + 116) - 43) + 48) ^ (((92 + 0) - 22) + 61);
        lllll[165] = (246 ^ 159) ^ (244 ^ 193);
        lllll[166] = (75 ^ 2) ^ (68 ^ 80);
        lllll[167] = (-16977) & 20475;
        lllll[168] = (-((-131) & 25219)) & (-130) & 28667;
        lllll[169] = 237 ^ 179;
        lllll[170] = (29 ^ 114) ^ (3 ^ 51);
        lllll[171] = 5 ^ 101;
        lllll[172] = (232 ^ 182) ^ (103 ^ 88);
        lllll[173] = (-16429) & 19133;
        lllll[174] = (-417) & 3071;
        lllll[175] = (-28933) & 32231;
        lllll[176] = 52 ^ 86;
        lllll[177] = (21 ^ 3) ^ (236 ^ 153);
        lllll[178] = (-8341) & 8701;
        lllll[179] = 94 ^ 58;
        lllll[180] = (-"   ".length()) & (-24961) & 27647;
        lllll[181] = (-((-3186) & 24437)) & (-8281) & 32735;
        lllll[182] = (-24646) & 28029;
        lllll[183] = 45 ^ 72;
        lllll[184] = (154 ^ 198) ^ (6 ^ 60);
        lllll[185] = (-(64 ^ 73)) & (-1025) & 6143;
        lllll[186] = (146 ^ 137) ^ (89 ^ 37);
        lllll[187] = (-16457) & 28634;
        lllll[188] = (-((-12677) & 13733)) & (-16389) & 20479;
        lllll[189] = (-6273) & 16120;
        lllll[190] = 217 ^ 177;
        lllll[191] = (-((-17223) & 25447)) & (-2121) & 12158;
        lllll[192] = (-((-6369) & 14585)) & (-129) & 12028;
        lllll[193] = (-((-23705) & 31935)) & (-17) & 16255;
        lllll[194] = 84 ^ 61;
        lllll[195] = (-((-5225) & 13435)) & (-1666) & 16375;
        lllll[196] = (-((-3253) & 32253)) & (-5) & 29567;
        lllll[197] = (-19) & 574;
        lllll[198] = (-((-9319) & 15591)) & (-8465) & 15291;
        lllll[199] = 91 ^ 49;
        lllll[200] = 122 ^ 17;
        lllll[201] = (-((-8225) & 29861)) & (-1) & 24316;
        lllll[202] = (-16403) & 19703;
        lllll[203] = (-12291) & 15458;
        lllll[204] = (252 ^ 156) ^ (118 ^ 122);
        lllll[205] = (((179 + 71) - 49) + 15) ^ (((25 + 71) - 49) + 134);
        lllll[206] = (47 ^ 10) ^ (199 ^ 140);
        lllll[207] = (100 ^ 32) ^ (30 ^ 53);
        lllll[208] = (-12363) & 15855;
        lllll[209] = (-(112 ^ 53)) & (-28673) & 31741;
        lllll[210] = (-((-9281) & 28146)) & (-1) & 28663;
        lllll[211] = 52 ^ 68;
        lllll[212] = (-20617) & 22410;
        lllll[213] = (-16781) & 20463;
        lllll[214] = (120 ^ 0) ^ (151 ^ 158);
        lllll[215] = 213 ^ 167;
        lllll[216] = (123 ^ 84) ^ (34 ^ 126);
        lllll[217] = (((56 + 204) - 63) + 12) ^ (((132 + 12) - 71) + 92);
        lllll[218] = (-((-1121) & 5233)) & (-9217) & 16031;
        lllll[219] = (-20740) & 23487;
        lllll[220] = (-8281) & 11774;
        lllll[221] = (74 ^ 84) ^ (16 ^ 123);
        lllll[222] = 221 ^ 171;
        lllll[223] = 195 ^ 180;
        lllll[224] = 90 ^ 34;
        lllll[225] = (186 ^ 158) ^ (252 ^ 161);
        lllll[226] = (((16 + 228) - 14) + 10) ^ (((60 + 65) - 120) + 133);
        lllll[227] = (-" ".length()) & (-16436) & 28607;
        lllll[228] = (-17346) & 20429;
        lllll[229] = (-4243) & 7671;
        lllll[230] = 220 ^ 167;
        lllll[231] = (((100 + 23) - (-38)) + 65) ^ (((76 + 43) - 74) + 113);
        lllll[232] = 92 ^ 33;
        lllll[233] = 185 ^ 199;
        lllll[234] = (-20530) & 32697;
        lllll[235] = (-12657) & 15743;
        lllll[236] = (-((-4547) & 20931)) & (-8706) & 28349;
        lllll[237] = ((95 + 33) - 75) + 74;
        lllll[238] = ((46 + 109) - 147) + 120;
        lllll[239] = (((251 ^ 183) + (183 ^ 172)) - (197 ^ 133)) + (225 ^ 187);
        lllll[240] = ((120 + 67) - 111) + 54;
        lllll[241] = (-((-27321) & 31482)) & (-33) & 16367;
        lllll[242] = (-((-14113) & 30625)) & (-4905) & 24507;
        lllll[243] = (-20545) & 24019;
        lllll[244] = (((198 ^ 168) + (((59 + 30) - 63) + 101)) - (((197 + 12) - 14) + 6)) + (37 ^ 122);
        lllll[245] = (((((91 + 12) - 8) + 33) + (30 ^ 15)) - (33 ^ 10)) + (13 ^ 19);
        lllll[246] = (((154 ^ 183) + (107 ^ 47)) - (217 ^ 198)) + (144 ^ 163);
        lllll[247] = (((95 ^ 6) + (31 ^ 44)) - (32 ^ 20)) + (19 ^ 61);
        lllll[248] = (-4098) & 7137;
        lllll[249] = (-20556) & 23919;
        lllll[250] = ((17 + 119) - 74) + 73;
        lllll[251] = (((101 ^ 75) + (176 ^ 188)) - (-(52 ^ 116))) + (162 ^ 172);
        lllll[252] = (((194 ^ 196) + (((124 + 18) - 91) + 78)) - (18 ^ 99)) + (247 ^ 132);
        lllll[253] = (((41 ^ 94) + (203 ^ 130)) - (((75 + 56) - (-7)) + 20)) + (36 ^ 76);
        lllll[254] = (-4633) & 8127;
        lllll[255] = (-((-2177) & 23713)) & (-25) & 24575;
        lllll[256] = ((7 + 106) - 107) + 133;
        lllll[257] = ((129 + 89) - 210) + 132;
        lllll[258] = ((61 + 1) - 57) + 136;
        lllll[259] = ((107 + 36) - 121) + 120;
        lllll[260] = (-((-117) & 25975)) & (-137) & 28671;
        lllll[261] = (-4657) & 7865;
        lllll[262] = (-((-91) & 17279)) & (-4105) & 24511;
        lllll[263] = (((120 ^ 12) + (0 ^ 50)) - (((82 + 27) - 53) + 73)) + (112 ^ 26);
        lllll[264] = ((22 + 120) - 82) + 84;
        lllll[265] = ((57 + 32) - 59) + 115;
        lllll[266] = ((32 + 55) - 11) + 70;
        lllll[267] = (-(((12 + 49) - (-1)) + 83)) & (-9473) & 32767;
        lllll[268] = (-((-11285) & 32029)) & (-8321) & 32249;
        lllll[269] = (-((-129) & 21397)) & (-33) & 24573;
        lllll[270] = ((5 + 93) - (-30)) + 19;
        lllll[271] = ((124 + 8) - 118) + 134;
        lllll[272] = ((15 + 15) - (-118)) + 1;
        lllll[273] = (((13 ^ 66) + (28 ^ 115)) - (((95 + 34) - 60) + 113)) + ((92 + 50) - 75) + 75;
        lllll[274] = ((99 + 113) - 114) + 53;
        lllll[275] = (((19 ^ 32) + (85 ^ 57)) - (222 ^ 189)) + (90 ^ 6);
        lllll[276] = (-((-18681) & 22778)) & (-1389) & 8189;
        lllll[277] = (-((-1629) & 30463)) & (-9) & 31487;
        lllll[278] = (-21123) & 24459;
        lllll[279] = ((21 + 106) - 88) + 114;
        lllll[280] = (((65 ^ 42) + (((31 + 82) - 52) + 78)) - (30 ^ 104)) + (139 ^ 145);
        lllll[281] = (-19610) & 19965;
        lllll[282] = (((50 ^ 24) + (((104 + 5) - 87) + 110)) - (38 ^ 57)) + (172 ^ 160);
        lllll[283] = (-4129) & 16319;
        lllll[284] = (-28825) & 31738;
        lllll[285] = (-28689) & 32122;
        lllll[286] = ((149 + 134) - 240) + 113;
        lllll[287] = ((19 + 1) - (-90)) + 47;
        lllll[288] = (((89 ^ 95) + (183 ^ 192)) - (98 ^ 8)) + ((84 + 8) - 30) + 77;
        lllll[289] = (-((-24081) & 32379)) & (-257) & 11263;
        lllll[290] = (-((-257) & 21349)) & (-259) & 24575;
        lllll[291] = (-8834) & 12285;
        lllll[292] = ((105 + 101) - 180) + 133;
        lllll[293] = ((36 + 133) - 31) + 22;
        lllll[294] = (-((-12681) & 32137)) & (-9) & 24571;
        lllll[295] = ((59 + 21) - 36) + 117;
        lllll[296] = (-28681) & 31387;
        lllll[297] = (-4103) & 6719;
        lllll[298] = (-(32 ^ 73)) & (-28673) & 32122;
        lllll[299] = ((41 + 91) - 26) + 56;
        lllll[300] = (((213 ^ 144) + (75 ^ 97)) - (-(116 ^ 108))) + (138 ^ 150);
        lllll[301] = (-((-5665) & 24245)) & (-513) & 19447;
        lllll[302] = ((104 + 64) - 9) + 5;
        lllll[303] = (-16458) & 19163;
        lllll[304] = (-((-2159) & 14703)) & (-16585) & 31743;
        lllll[305] = (-16931) & 20222;
        lllll[306] = (((125 ^ 31) + (65 ^ 20)) - (2 ^ 40)) + (105 ^ 113);
        lllll[307] = ((31 + 157) - 30) + 8;
        lllll[308] = (((251 ^ 173) + (247 ^ 192)) - (139 ^ 154)) + (159 ^ 180);
        lllll[309] = (-((-3361) & 32613)) & (-1) & 32767;
        lllll[310] = (-((-12098) & 16233)) & (-8513) & 15871;
        lllll[311] = (((212 ^ 184) + (((13 + 0) - (-27)) + 104)) - (90 ^ 40)) + (184 ^ 166);
        lllll[312] = (((73 ^ 119) + (62 ^ 77)) - (((73 + 14) - 16) + 104)) + ((83 + 19) - 23) + 88;
        lllll[313] = (-10243) & 15355;
        lllll[314] = ((49 + 125) - 166) + 162;
        lllll[315] = (-((-2209) & 15609)) & (-16641) & 32735;
        lllll[316] = (-((-7717) & 15919)) & (-1057) & 12271;
        lllll[317] = (-((-27033) & 31225)) & (-770) & 8183;
        lllll[318] = (((0 ^ 106) + (30 ^ 45)) - (((42 + 110) - 96) + 86)) + ((24 + 126) - 22) + 28;
        lllll[319] = (((104 ^ 85) + (189 ^ 192)) - (105 ^ 74)) + (42 ^ 63);
        lllll[320] = (-((-10010) & 28507)) & (-513) & 28543;
        lllll[321] = (((72 ^ 8) + (18 ^ 75)) - (-(153 ^ 144))) + (206 ^ 197);
        lllll[322] = (-((-3757) & 20143)) & (-4106) & 32667;
        lllll[323] = (-((-2131) & 31198)) & (-1) & 32255;
        lllll[324] = (-22541) & 32365;
        lllll[325] = ((14 + 163) - 131) + 128;
        lllll[326] = ((61 + 164) - 194) + 144;
        lllll[327] = ((75 + 106) - 106) + 101;
        lllll[328] = ((18 + 119) - 119) + 159;
        lllll[329] = (-((-5441) & 21842)) & (-8769) & 28671;
        lllll[330] = (-((-24577) & 29661)) & (-2) & 8191;
        lllll[331] = (-29331) & 32698;
        lllll[332] = ((17 + 86) - (-40)) + 35;
        lllll[333] = ((124 + 73) - 107) + 89;
        lllll[334] = (-4609) & 16093;
        lllll[335] = (((134 ^ 142) + (87 ^ 49)) - (-(56 ^ 124))) + "  ".length();
        lllll[336] = (-24935) & 27646;
        lllll[337] = (-((-1105) & 13402)) & (-1057) & 16381;
        lllll[338] = (-((-1811) & 26551)) & (-577) & 28671;
        lllll[339] = ((148 + 83) - 124) + 74;
        lllll[340] = ((61 + 169) - 157) + 109;
        lllll[341] = ((18 + 173) - 133) + 125;
        lllll[342] = ((51 + 74) - 98) + 157;
        lllll[343] = ((6 + 183) - 121) + 117;
        lllll[344] = (-((-13217) & 29679)) & (-4129) & 32767;
        lllll[345] = (-12305) & 15359;
        lllll[346] = (-((-12225) & 16323)) & (-98) & 7679;
        lllll[347] = (((126 ^ 85) + (((12 + 122) - 4) + 42)) - (110 ^ 38)) + (18 ^ 57);
        lllll[348] = ((40 + 123) - 90) + 114;
        lllll[349] = (((((112 + 147) - 214) + 126) + (81 ^ 117)) - (227 ^ 183)) + (106 ^ 43);
        lllll[350] = (((59 ^ 115) + (103 ^ 84)) - (-(199 ^ 194))) + (97 ^ 92);
        lllll[351] = (-((-14339) & 14723)) & (-9234) & 32767;
        lllll[352] = (-((-1081) & 22461)) & (-2) & 24557;
        lllll[353] = ((28 + 81) - 41) + 122;
        lllll[354] = ((48 + 65) - (-8)) + 70;
        lllll[355] = (((((13 + 88) - (-7)) + 78) + (((43 + 58) - 42) + 76)) - (((130 + 114) - 118) + 31)) + (175 ^ 179);
        lllll[356] = ((181 + 170) - 261) + 103;
        lllll[357] = (-20569) & 32735;
        lllll[358] = (-((-1129) & 30457)) & (-263) & 32702;
        lllll[359] = (-((-9223) & 14255)) & (-16386) & 24575;
        lllll[360] = ((47 + 61) - 45) + 131;
        lllll[361] = ((131 + 116) - 148) + 96;
        lllll[362] = (((((111 + 54) - 36) + 42) + (((98 + 69) - 127) + 130)) - (((37 + 106) - 94) + 114)) + (92 ^ 78);
        lllll[363] = (-((-10133) & 30717)) & (-18) & 32767;
        lllll[364] = (-((-3078) & 15671)) & (-17025) & 32763;
        lllll[365] = ((99 + 91) - (-2)) + 5;
        lllll[366] = (((((67 + 124) - 109) + 64) + (253 ^ 195)) - (((96 + 67) - 68) + 102)) + ((126 + 74) - 57) + 44;
        lllll[367] = ((71 + 75) - 109) + 162;
        lllll[368] = ((51 + 84) - 121) + 186;
        lllll[369] = (-((-6558) & 23455)) & (-12289) & 32685;
        lllll[370] = (-24721) & 27613;
        lllll[371] = (-((-5145) & 29881)) & (-5) & 28158;
        lllll[372] = (((((26 + 92) - 51) + 100) + (((172 + 178) - 335) + 169)) - ((-28355) & 28658)) + ((39 + 37) - 60) + 138;
        lllll[373] = ((86 + 123) - 89) + 82;
        lllll[374] = ((192 + 90) - 231) + 152;
        lllll[375] = ((81 + 101) - 91) + 113;
        lllll[376] = (((((39 + 182) - 178) + 144) + (113 ^ 96)) - (((150 + 117) - 248) + 169)) + ((96 + 45) - 129) + 177;
        lllll[377] = ((163 + 101) - 216) + 158;
        lllll[378] = (((((47 + 39) - 20) + 66) + (133 ^ 152)) - (-(15 ^ 40))) + (88 ^ 95);
        lllll[379] = (((231 ^ 162) + (((91 + 32) - 101) + 110)) - (31 ^ 26)) + (30 ^ 18);
        lllll[380] = (-((-2437) & 27615)) & (-1) & 28670;
        lllll[381] = (-466) & 3035;
        lllll[382] = (((48 ^ 100) + (((125 + 59) - 116) + 118)) - (((168 + 161) - 213) + 87)) + ((77 + 38) - 7) + 34;
        lllll[383] = ((95 + 185) - 271) + 201;
        lllll[384] = (((92 ^ 112) + (150 ^ 167)) - (-(93 ^ 59))) + (163 ^ 179);
        lllll[385] = ((56 + 104) - (-11)) + 41;
        lllll[386] = (((114 ^ 26) + (((103 + 26) - 73) + 91)) - (244 ^ 129)) + (210 ^ 157);
        lllll[387] = (((231 ^ 157) + (31 ^ 23)) - (-(36 ^ 7))) + (179 ^ 130);
        lllll[388] = (((98 ^ 20) + (226 ^ 176)) - (-(123 ^ 125))) + (76 ^ 69);
        lllll[389] = (-16679) & 19367;
        lllll[390] = (-((-22537) & 31657)) & (-1) & 12275;
        lllll[391] = (-((-3417) & 24538)) & (-8241) & 32767;
        lllll[392] = ((127 + 130) - 130) + 89;
        lllll[393] = ((115 + 212) - 177) + 67;
        lllll[394] = (((52 ^ 117) + (195 ^ 177)) - (71 ^ 99)) + (123 ^ 48);
        lllll[395] = ((185 + 136) - 133) + 31;
        lllll[396] = ((191 + 159) - 166) + 36;
        lllll[397] = (((102 ^ 6) + (60 ^ 105)) - (90 ^ 52)) + ((25 + 33) - (-86)) + 6;
        lllll[398] = ((92 + 7) - 88) + 211;
        lllll[399] = (-((-6150) & 23919)) & (-8193) & 28671;
        lllll[400] = (-24866) & 27439;
        lllll[401] = (-4353) & 7677;
        lllll[402] = (((82 ^ 4) + (((57 + 118) - 26) + 40)) - (49 ^ 98)) + (11 ^ 20);
        lllll[403] = ((63 + 118) - 52) + 95;
        lllll[404] = ((80 + 104) - 86) + 127;
        lllll[405] = (((((60 + 34) - 31) + 76) + (((123 + 15) - 12) + 18)) - ((-24649) & 24911)) + ((43 + 126) - 100) + 137;
        lllll[406] = (((((40 + 17) - 23) + 184) + (66 ^ 25)) - (((203 + 36) - 203) + 212)) + ((72 + 61) - 91) + 124;
        lllll[407] = ((169 + 137) - 83) + 5;
        lllll[408] = ((2 + 95) - (-46)) + 86;
        lllll[409] = (-((-431) & 29615)) & (-70) & 32765;
        lllll[410] = (-((-7486) & 23999)) & (-321) & 19931;
        lllll[411] = (-35) & 3311;
        lllll[412] = ((73 + 156) - 214) + 215;
        lllll[413] = (((((35 + 118) - 103) + 112) + (((159 + 81) - 200) + 167)) - (((89 + 238) - 310) + 231)) + (111 ^ 1);
        lllll[414] = (((98 ^ 108) + (((2 + 62) - (-13)) + 131)) - (126 ^ 92)) + (15 ^ 35);
        lllll[415] = ((153 + 31) - 21) + 70;
        lllll[416] = (((((46 + 99) - (-9)) + 10) + (((199 + 164) - 196) + 39)) - (((21 + 112) - 59) + 108)) + (181 ^ 155);
        lllll[417] = (((((149 + 89) - 43) + 3) + (168 ^ 196)) - ((-12001) & 12283)) + ((104 + 79) - 3) + 32;
        lllll[418] = ((193 + 97) - 86) + 32;
        lllll[419] = ((144 + 163) - 109) + 39;
        lllll[420] = (-16387) & 28574;
        lllll[421] = (-((-19089) & 23199)) & (-17409) & 24542;
        lllll[422] = ((214 + 96) - 152) + 80;
        lllll[423] = ((19 + 169) - (-39)) + 12;
        lllll[424] = (((129 ^ 135) + (72 ^ 29)) - (198 ^ 151)) + ((104 + 210) - 243) + 159;
        lllll[425] = (((213 ^ 145) + (((40 + 44) - 56) + 159)) - (((249 + 119) - 228) + 110)) + ((207 + 110) - 252) + 171;
        lllll[426] = (((231 ^ 193) + "   ".length()) - (-(186 ^ 136))) + ((88 + 16) - (-34)) + 13;
        lllll[427] = (((((132 + 44) - 44) + 43) + (((133 + 191) - 312) + 220)) - ((-18565) & 18852)) + (39 ^ 91);
        lllll[428] = (((((147 + 74) - 149) + 104) + (((20 + 33) - 13) + 118)) - (((108 + 107) - 153) + 67)) + (111 ^ 72);
        lllll[429] = (-((-2531) & 31223)) & (-2) & 32191;
        lllll[430] = (-((-17039) & 22159)) & (-16417) & 24575;
        lllll[431] = (-((-2207) & 22751)) & (-673) & 24559;
        lllll[432] = (((62 ^ 0) + (((27 + 91) - (-93)) + 20)) - (253 ^ 189)) + (56 ^ 40);
        lllll[433] = ((28 + 112) - (-79)) + 27;
        lllll[434] = (((((162 + 141) - 173) + 51) + (17 ^ 67)) - (78 ^ 14)) + (55 ^ 7);
        lllll[435] = ((176 + 193) - 269) + 148;
        lllll[436] = (((((87 + 10) - (-44)) + 89) + (48 ^ 83)) - ((-8865) & 9146)) + ((143 + 110) - 203) + 152;
        lllll[437] = ((69 + 32) - (-145)) + 4;
        lllll[438] = (-((-6673) & 32312)) & (-193) & 28655;
        lllll[439] = (-24582) & 28023;
        lllll[440] = (((165 ^ 188) + (86 ^ 73)) - (-(83 ^ 117))) + ((14 + 23) - (-46)) + 74;
        lllll[441] = (((70 ^ 8) + "   ".length()) - (-(69 ^ 98))) + ((59 + 118) - 55) + 10;
        lllll[442] = ((202 + 136) - 337) + 252;
        lllll[443] = ((20 + 193) - 27) + 68;
        lllll[444] = ((242 + 137) - 250) + 126;
        lllll[445] = (-((-4866) & 32709)) & (-4633) & 32731;
        lllll[446] = (-19483) & 19739;
        lllll[447] = (-9259) & 11966;
        lllll[448] = (-17041) & 17298;
        lllll[449] = (-13381) & 13639;
        lllll[450] = (-((-2957) & 32749)) & (-2177) & 32228;
        lllll[451] = (-((-3077) & 15543)) & (-1545) & 14271;
        lllll[452] = (-((-8450) & 32027)) & (-8705) & 32543;
        lllll[453] = (-11921) & 12183;
        lllll[454] = (-16967) & 17230;
        lllll[455] = (-21789) & 24479;
        lllll[456] = (-1125) & 4095;
        lllll[457] = (-20615) & 23999;
        lllll[458] = (-((-4367) & 15775)) & (-16391) & 28063;
        lllll[459] = (-((-17955) & 26355)) & (-16902) & 25567;
        lllll[460] = (-28309) & 28575;
        lllll[461] = (-((-8998) & 31655)) & (-1) & 22925;
        lllll[462] = (-((-28861) & 30463)) & (-4257) & 6127;
        lllll[463] = (-((-1469) & 28669)) & (-177) & 27646;
        lllll[464] = (-8337) & 8607;
        lllll[465] = (-9217) & 11903;
        lllll[466] = (-12365) & 15615;
        lllll[467] = (-((-6139) & 30715)) & (-4644) & 32639;
        lllll[468] = (-4137) & 4408;
        lllll[469] = (-(170 ^ 175)) & (-16003) & 16279;
        lllll[470] = (-((-8467) & 30495)) & (-161) & 22462;
        lllll[471] = (-((-1) & 28909)) & (-3585) & 32767;
        lllll[472] = (-6305) & 6580;
        lllll[473] = (-22529) & 22805;
        lllll[474] = (-((-79) & 30319)) & (-202) & 30719;
        lllll[475] = (-24593) & 27286;
        lllll[476] = (-29793) & 32762;
        lllll[477] = (-((-8647) & 25559)) & (-257) & 20479;
        lllll[478] = (-((-4523) & 22507)) & (-129) & 18391;
        lllll[479] = (-((-1) & 24134)) & (-161) & 24573;
        lllll[480] = (-31329) & 31609;
        lllll[481] = (-((-9995) & 30539)) & (-549) & 21374;
        lllll[482] = (-((-8477) & 28573)) & (-8193) & 28571;
        lllll[483] = (-14050) & 14333;
        lllll[484] = (-4621) & 8127;
        lllll[485] = (-((-17009) & 29557)) & (-16385) & 31740;
        lllll[486] = (-((-2321) & 28659)) & (-6145) & 32767;
        lllll[487] = (-((-8286) & 32383)) & (-8257) & 32639;
        lllll[488] = (-31777) & 32063;
        lllll[489] = (-13514) & 13801;
        lllll[490] = (-29843) & 30131;
        lllll[491] = (-4294) & 4583;
        lllll[492] = (-((-4393) & 16253)) & (-4097) & 16247;
        lllll[493] = (-((-19841) & 32205)) & (-3) & 15871;
        lllll[494] = (-((-19165) & 31741)) & (-129) & 15357;
        lllll[495] = (-25093) & 28413;
        lllll[496] = (-3732) & 4023;
        lllll[497] = (-31811) & 32103;
        lllll[498] = (-11921) & 12214;
        lllll[499] = (-9737) & 10031;
        lllll[500] = (-24067) & 24362;
        lllll[501] = (-16583) & 16879;
        lllll[502] = (-1670) & 1967;
        lllll[503] = (-4102) & 23919;
        lllll[504] = (-(43 ^ 12)) & (-10241) & 12023;
        lllll[505] = (-((-18561) & 31374)) & (-16449) & 32751;
        lllll[506] = (-24081) & 24379;
        lllll[507] = (-((-4678) & 12871)) & (-5139) & 13631;
        lllll[508] = (-((-3045) & 31735)) & (-3777) & 32767;
        lllll[509] = (-(((32 + 121) - 36) + 92)) & (-1025) & 1534;
        lllll[510] = (-14545) & 14847;
        lllll[511] = (-195) & 498;
        lllll[512] = (-23687) & 23991;
        lllll[513] = (-((-7245) & 15469)) & (-4161) & 15099;
        lllll[514] = (-((-3343) & 8015)) & (-24609) & 32751;
        lllll[515] = (-((-277) & 3030)) & (-25613) & 28671;
        lllll[516] = (-((-17535) & 26239)) & (-16461) & 25471;
        lllll[517] = (-1226) & 1533;
        lllll[518] = (-715) & 1023;
        lllll[519] = (-((-8711) & 26319)) & (-1) & 17918;
        lllll[520] = (-((-10147) & 32747)) & (-641) & 23551;
        lllll[521] = (-19526) & 19837;
        lllll[522] = (-16517) & 19445;
        lllll[523] = (-29189) & 32757;
        lllll[524] = (-((-8241) & 29363)) & (-69) & 21503;
        lllll[525] = (-6850) & 7163;
        lllll[526] = (-((-9259) & 25775)) & (-15873) & 32703;
        lllll[527] = (-((-8333) & 29390)) & (-2179) & 23551;
        lllll[528] = (-((-2335) & 24479)) & (-10307) & 32767;
        lllll[529] = (-10818) & 11135;
        lllll[530] = (-((-75) & 23627)) & (-8193) & 32063;
        lllll[531] = (-11964) & 12283;
        lllll[532] = (-20549) & 23517;
        lllll[533] = (-((-1053) & 25693)) & (-802) & 28655;
        lllll[534] = (-((-21125) & 24215)) & (-28833) & 32243;
        lllll[535] = (-23053) & 23374;
        lllll[536] = (-((-1475) & 12287)) & (-17537) & 28671;
        lllll[537] = (-24250) & 24573;
        lllll[538] = (-18443) & 18767;
        lllll[539] = (-31273) & 31598;
        lllll[540] = (-3209) & 3535;
        lllll[541] = (-20559) & 32750;
        lllll[542] = (-((-9153) & 29691)) & (-1) & 23550;
        lllll[543] = (-((-9041) & 29525)) & (-8977) & 32638;
        lllll[544] = (-((-6403) & 32695)) & (-4098) & 30717;
        lllll[545] = (-8457) & 11759;
        lllll[546] = (-29573) & 32695;
        lllll[547] = (-((-4491) & 15259)) & (-5125) & 16221;
        lllll[548] = (-((-3426) & 32231)) & (-545) & 29679;
        lllll[549] = (-17557) & 17887;
        lllll[550] = (-3092) & 3423;
        lllll[551] = (-1059) & 1391;
        lllll[552] = (-26113) & 26446;
        lllll[553] = (-((-4553) & 7113)) & (-1201) & 4095;
        lllll[554] = (-((-1317) & 19751)) & (-4133) & 22902;
        lllll[555] = (-23183) & 23519;
        lllll[556] = (-((-549) & 28333)) & (-5) & 28126;
        lllll[557] = (-((-6469) & 7533)) & (-2177) & 3579;
        lllll[558] = (-((-4857) & 14329)) & (-1) & 32635;
        lllll[559] = (-97) & 3068;
        lllll[560] = (-((-2521) & 23519)) & (-265) & 24575;
        lllll[561] = (-(((31 + 0) - (-74)) + 66)) & (-30721) & 31230;
        lllll[562] = (-((-431) & 30639)) & (-163) & 30711;
        lllll[563] = (-29313) & 29654;
        lllll[564] = (-((-8261) & 32461)) & (-8225) & 32767;
        lllll[565] = (-1411) & 4091;
        lllll[566] = (-((-143) & 29423)) & (-17) & 32511;
        lllll[567] = (-1153) & 1496;
        lllll[568] = (-(((32 + 33) - (-45)) + 23)) & (-13315) & 13791;
        lllll[569] = (-((-491) & 24559)) & (-34) & 24447;
        lllll[570] = (-26785) & 27131;
        lllll[571] = (-12300) & 32127;
        lllll[572] = (-((-6295) & 16031)) & (-16449) & 28671;
        lllll[573] = (-((-393) & 25003)) & (-133) & 28151;
        lllll[574] = (-25122) & 25469;
        lllll[575] = (-23587) & 23935;
        lllll[576] = (-((-8601) & 16313)) & (-16385) & 24446;
        lllll[577] = (-32257) & 32607;
        lllll[578] = (-((-11137) & 27569)) & (-1282) & 20415;
        lllll[579] = (-((-8786) & 13143)) & (-33) & 7149;
        lllll[580] = (-(83 ^ 74)) & (-32388) & 32763;
        lllll[581] = (-((-21271) & 29471)) & (-19605) & 28157;
        lllll[582] = (-((-47) & 13615)) & (-19) & 16279;
        lllll[583] = (-((-17577) & 21743)) & (-33) & 16367;
        lllll[584] = (-28674) & 31715;
        lllll[585] = (-585) & 3966;
        lllll[586] = (-4233) & 4590;
        lllll[587] = (-((-6309) & 32437)) & (-9) & 26495;
        lllll[588] = (-28680) & 29039;
        lllll[589] = (-((-18361) & 22457)) & (-16421) & 32703;
        lllll[590] = (-((-925) & 25503)) & (-4113) & 31670;
        lllll[591] = (-644) & 4079;
        lllll[592] = (-17542) & 17903;
        lllll[593] = (-((-361) & 15341)) & (-16401) & 31743;
        lllll[594] = (-((-8493) & 9135)) & (-27666) & 28671;
        lllll[595] = (-19) & 383;
        lllll[596] = (-((-12941) & 14302)) & (-16421) & 20479;
        lllll[597] = (-8209) & 11159;
        lllll[598] = (-3586) & 3951;
        lllll[599] = (-((-61) & 31933)) & (-1) & 32239;
        lllll[600] = (-((-307) & 31163)) & (-519) & 31742;
        lllll[601] = (-31875) & 32243;
        lllll[602] = (-391) & 23551;
        lllll[603] = (-18531) & 20351;
        lllll[604] = (-24725) & 28414;
        lllll[605] = (-((-257) & 15753)) & (-5) & 15870;
        lllll[606] = (-((-16739) & 32231)) & (-16905) & 32767;
        lllll[607] = (-11266) & 11637;
        lllll[608] = (-((-4973) & 16239)) & (-137) & 11775;
        lllll[609] = (-24691) & 27391;
        lllll[610] = (-((-3761) & 32436)) & (-257) & 31735;
        lllll[611] = (-((-1094) & 32463)) & (-1) & 31743;
        lllll[612] = (-3721) & 4095;
        lllll[613] = (-((-8632) & 13759)) & (-27137) & 32639;
        lllll[614] = (-((-19809) & 32743)) & (-19457) & 32767;
        lllll[615] = (-((-107) & 17515)) & (-8245) & 28351;
        lllll[616] = (-24585) & 27469;
        lllll[617] = (-27138) & 27515;
        lllll[618] = (-13313) & 13691;
        lllll[619] = (-21635) & 22014;
        lllll[620] = (-515) & 895;
        lllll[621] = (-((-2587) & 10911)) & (-5377) & 16383;
        lllll[622] = (-((-3161) & 32126)) & (-513) & 32765;
        lllll[623] = (-((-13193) & 29577)) & (-12426) & 31999;
        lllll[624] = (-4098) & 4479;
        lllll[625] = (-((-1347) & 32195)) & (-1) & 31231;
        lllll[626] = (-((-6705) & 32318)) & (-4625) & 30621;
        lllll[627] = (-13873) & 14257;
        lllll[628] = (-((-3458) & 32249)) & (-1281) & 32767;
        lllll[629] = (-12297) & 15343;
        lllll[630] = (-25414) & 28669;
        lllll[631] = (-((-18715) & 24447)) & (-26649) & 32766;
        lllll[632] = (-31817) & 32203;
        lllll[633] = (-((-16978) & 30675)) & (-16385) & 32767;
        lllll[634] = (-12802) & 16027;
        lllll[635] = (-130) & 3527;
        lllll[636] = (-10330) & 10717;
        lllll[637] = (-((-1193) & 30379)) & (-3169) & 32743;
        lllll[638] = (-((-2823) & 23399)) & (-3) & 32759;
        lllll[639] = (-((-12301) & 29743)) & (-12353) & 32767;
        lllll[640] = (-24641) & 28023;
        lllll[641] = (-((-18725) & 20342)) & (-26665) & 28671;
        lllll[642] = (-((-8451) & 15195)) & (-9249) & 16383;
        lllll[643] = (-(114 ^ 99)) & (-1607) & 2014;
        lllll[644] = (-((-1297) & 30549)) & (-33) & 29677;
        lllll[645] = (-31269) & 31662;
        lllll[646] = (-12297) & 32126;
        lllll[647] = (-((-21507) & 30551)) & (-2) & 12277;
        lllll[648] = (-17189) & 20415;
        lllll[649] = (-581) & 975;
        lllll[650] = (-28676) & 29071;
        lllll[651] = (-21585) & 21981;
        lllll[652] = (-29698) & 30095;
        lllll[653] = (-((-3787) & 12238)) & (-1) & 31615;
        lllll[654] = (-((-18537) & 31342)) & (-257) & 16343;
        lllll[655] = (-((-6425) & 7065)) & (-8229) & 12198;
        lllll[656] = (-((-2063) & 20031)) & (-2049) & 20415;
        lllll[657] = (-31278) & 31677;
        lllll[658] = (-7753) & 8153;
        lllll[659] = (-((-50) & 15923)) & (-16393) & 32667;
        lllll[660] = (-((-8837) & 13030)) & (-5) & 16383;
        lllll[661] = (-259) & 3551;
        lllll[662] = (-2593) & 2995;
        lllll[663] = (-((-8222) & 15967)) & (-35) & 8183;
        lllll[664] = (-3115) & 3519;
        lllll[665] = (-((-9138) & 16379)) & (-24609) & 32255;
        lllll[666] = (-((-6209) & 14534)) & (-4097) & 32245;
        lllll[667] = (-((-10605) & 15725)) & (-24625) & 32764;
        lllll[668] = (-((-16667) & 29051)) & (-513) & 16127;
        lllll[669] = (-2593) & 2999;
        lllll[670] = (-19460) & 19867;
        lllll[671] = (-((-917) & 23543)) & (-8193) & 31227;
        lllll[672] = (-21061) & 21470;
        lllll[673] = (-((-29925) & 30453)) & (-129) & 20479;
        lllll[674] = (-((-17116) & 29407)) & (-193) & 15839;
        lllll[675] = (-20481) & 20891;
        lllll[676] = (-((-390) & 32743)) & (-1) & 32765;
        lllll[677] = (-4737) & 24557;
        lllll[678] = (-((-1413) & 32214)) & (-1) & 32639;
        lllll[679] = (-16386) & 20171;
        lllll[680] = (-13857) & 14269;
        lllll[681] = (-21537) & 21950;
        lllll[682] = (-18977) & 19391;
        lllll[683] = (-12302) & 12717;
        lllll[684] = (-17511) & 20207;
        lllll[685] = (-((-67) & 16743)) & (-4225) & 23999;
        lllll[686] = (-25090) & 28347;
        lllll[687] = (-((-8353) & 15599)) & (-25105) & 32767;
        lllll[688] = (-((-2082) & 10807)) & (-16385) & 25527;
        lllll[689] = (-((-97) & 24189)) & (-65) & 24575;
        lllll[690] = (-6674) & 7093;
        lllll[691] = (-((-18754) & 26947)) & (-5379) & 16255;
        lllll[692] = (-8467) & 11742;
        lllll[693] = (-((-22651) & 31099)) & (-513) & 12151;
        lllll[694] = (-((-5265) & 29913)) & (-2577) & 27645;
        lllll[695] = (-20050) & 20471;
        lllll[696] = (-17409) & 17831;
        lllll[697] = (-20501) & 20924;
        lllll[698] = (-((-2289) & 15091)) & (-17) & 32634;
        lllll[699] = (-((-8305) & 8565)) & (-16451) & 26623;
        lllll[700] = (-((-19373) & 32751)) & (-16913) & 30715;
        lllll[701] = (-((-4387) & 30583)) & (-2050) & 28671;
        lllll[702] = (-((-4905) & 22317)) & (-6737) & 24575;
        lllll[703] = (-((-29101) & 31743)) & (-9218) & 12287;
        lllll[704] = (-4211) & 16383;
        lllll[705] = (-((-4851) & 13307)) & (-16385) & 27919;
        lllll[706] = (-((-913) & 32659)) & (-1) & 32175;
        lllll[707] = (-2561) & 2990;
        lllll[708] = (-((-17315) & 32739)) & (-16385) & 32239;
        lllll[709] = (-((-2225) & 28404)) & (-9) & 26619;
        lllll[710] = (-12295) & 32119;
        lllll[711] = (-30817) & 32509;
        lllll[712] = (-21029) & 24550;
        lllll[713] = (-((-11281) & 28183)) & (-5121) & 22455;
        lllll[714] = (-((-12897) & 14950)) & (-9801) & 12287;
        lllll[715] = (-((-25862) & 30093)) & (-10337) & 16375;
        lllll[716] = (-((-6834) & 31733)) & (-4105) & 30715;
        lllll[717] = (-((-3137) & 27741)) & (-4099) & 32223;
        lllll[718] = (-14653) & 16382;
        lllll[719] = (-20482) & 24049;
        lllll[720] = (-((-29275) & 29531)) & (-12353) & 14335;
        lllll[721] = (-16914) & 20473;
        lllll[722] = (-26882) & 28607;
        lllll[723] = (-20513) & 24063;
        lllll[724] = (-((-1671) & 30351)) & (-33) & 32255;
        lllll[725] = (-((-17) & 18451)) & (-8210) & 28371;
        lllll[726] = (-((-19533) & 28285)) & (-20481) & 32767;
        lllll[727] = (-(164 ^ 173)) & (-273) & 2012;
        lllll[728] = (-28705) & 32233;
        lllll[729] = (-((-17029) & 27549)) & (-4129) & 16383;
        lllll[730] = (-((-7425) & 23869)) & (-4097) & 24063;
        lllll[731] = (-12289) & 15805;
        lllll[732] = (-((-17587) & 18163)) & (-28681) & 32767;
        lllll[733] = (-22837) & 24565;
        lllll[734] = (-12551) & 14271;
        lllll[735] = (-((-657) & 27285)) & (-1) & 28348;
        lllll[736] = (-12616) & 14319;
        lllll[737] = (-12547) & 14247;
        lllll[738] = (-28731) & 32255;
        lllll[739] = (-((-115) & 29819)) & (-2049) & 32187;
        lllll[740] = (-5642) & 6077;
        lllll[741] = (-((-8645) & 28615)) & (-12289) & 32695;
        lllll[742] = (-((-3375) & 16175)) & (-133) & 32749;
        lllll[743] = (-20485) & 23677;
        lllll[744] = (-8721) & 12123;
        lllll[745] = (-1033) & 1470;
        lllll[746] = (-(6 ^ 15)) & (-1089) & 1535;
        lllll[747] = (-((-2469) & 14823)) & (-3074) & 15867;
        lllll[748] = (-19969) & 20409;
        lllll[749] = (-130) & 23295;
        lllll[750] = (-((-1939) & 26555)) & (-513) & 28527;
        lllll[751] = (-((-578) & 19015)) & (-1025) & 19903;
        lllll[752] = (-10821) & 11263;
        lllll[753] = (-20486) & 32669;
        lllll[754] = (-((-10755) & 15019)) & (-25601) & 32764;
        lllll[755] = (-16899) & 20326;
        lllll[756] = (-22530) & 22973;
        lllll[757] = (-((-8853) & 32471)) & (-8705) & 32767;
        lllll[758] = (-7681) & 8126;
        lllll[759] = (-((-8533) & 32085)) & (-8769) & 32767;
        lllll[760] = (-(174 ^ 188)) & (-4097) & 23935;
        lllll[761] = (-((-14386) & 31797)) & (-12417) & 32759;
        lllll[762] = (-((-4290) & 32511)) & (-1) & 28669;
        lllll[763] = (-((-17729) & 32075)) & (-1569) & 16363;
        lllll[764] = (-((-5313) & 32497)) & (-4098) & 31731;
        lllll[765] = (-14893) & 15343;
        lllll[766] = (-4225) & 24044;
        lllll[767] = (-31026) & 32759;
        lllll[768] = (-12296) & 15871;
        lllll[769] = (-((-8462) & 32047)) & (-11) & 24047;
        lllll[770] = (-10809) & 11261;
        lllll[771] = (-((-1095) & 15959)) & (-1025) & 16342;
        lllll[772] = (-7169) & 7623;
        lllll[773] = (-16489) & 28670;
        lllll[774] = (-((-834) & 21331)) & (-1025) & 24509;
        lllll[775] = (-28707) & 32047;
        lllll[776] = (-32262) & 32717;
        lllll[777] = (-10775) & 11231;
        lllll[778] = (-((-7089) & 15287)) & (-17442) & 28599;
        lllll[779] = (-16933) & 20263;
        lllll[780] = (-8196) & 11187;
        lllll[781] = (-21046) & 21503;
        lllll[782] = (-12821) & 13279;
        lllll[783] = (-((-16837) & 25543)) & (-65) & 12283;
        lllll[784] = (-21509) & 24245;
        lllll[785] = (-28674) & 32251;
        lllll[786] = (-((-588) & 26239)) & (-6145) & 32255;
        lllll[787] = (-30259) & 30719;
        lllll[788] = (-26658) & 27119;
        lllll[789] = (-15361) & 15823;
        lllll[790] = (-9219) & 32383;
        lllll[791] = (-16517) & 19447;
        lllll[792] = (-((-3154) & 27743)) & (-515) & 28639;
        lllll[793] = (-12296) & 12759;
        lllll[794] = (-10791) & 11255;
        lllll[795] = (-8742) & 9207;
        lllll[796] = (-((-329) & 4937)) & (-8193) & 13267;
        lllll[797] = (-((-14382) & 30831)) & (-4097) & 32735;
        lllll[798] = (-((-4617) & 13978)) & (-16387) & 28671;
        lllll[799] = (-((-12741) & 13807)) & (-25090) & 26623;
        lllll[800] = (-24073) & 24541;
        lllll[801] = (-((-3103) & 20031)) & (-4105) & 21502;
        lllll[802] = (-21025) & 21495;
        lllll[803] = (-(((87 + 122) - 114) + 34)) & (-8213) & 28159;
        lllll[804] = (-((-18575) & 30975)) & (-16395) & 31739;
        lllll[805] = (-((-19813) & 32253)) & (-513) & 16287;
        lllll[806] = (-(130 ^ 166)) & (-21509) & 22015;
        lllll[807] = (-12805) & 13277;
        lllll[808] = (-((-16641) & 32550)) & (-1) & 16383;
        lllll[809] = (-((-6555) & 31675)) & (-2053) & 27647;
        lllll[810] = (-(48 ^ 121)) & (-16385) & 28639;
        lllll[811] = (-16905) & 20283;
        lllll[812] = (-546) & 1021;
        lllll[813] = (-10275) & 10751;
        lllll[814] = (-11298) & 11775;
        lllll[815] = (-((-469) & 20981)) & (-10753) & 31743;
        lllll[816] = (-29185) & 32698;
        lllll[817] = (-833) & 4052;
        lllll[818] = (-((-18702) & 20239)) & (-20481) & 22497;
        lllll[819] = (-((-723) & 18139)) & (-10245) & 28141;
        lllll[820] = (-((-8225) & 11821)) & (-28689) & 32766;
        lllll[821] = (-3093) & 3575;
        lllll[822] = (-8453) & 31614;
        lllll[823] = (-((-2254) & 7167)) & (-24577) & 32757;
        lllll[824] = (-24092) & 24575;
        lllll[825] = (-6155) & 6639;
        lllll[826] = (-28674) & 29159;
        lllll[827] = (-((-21283) & 30507)) & (-23057) & 32767;
        lllll[828] = (-((-5514) & 14239)) & (-4099) & 16319;
        lllll[829] = (-((-915) & 6043)) & (-1) & 8154;
        lllll[830] = (-4195) & 7411;
        lllll[831] = (-19975) & 20462;
        lllll[832] = (-((-18513) & 32343)) & (-16401) & 30719;
        lllll[833] = (-((-2689) & 6801)) & (-1) & 4602;
        lllll[834] = (-18949) & 19439;
        lllll[835] = (-1293) & 24447;
        lllll[836] = (-((-2317) & 23837)) & (-65) & 24575;
        lllll[837] = (-6657) & 7148;
        lllll[838] = (-10241) & 10733;
        lllll[839] = (-((-2387) & 12115)) & (-4114) & 14335;
        lllll[840] = (-((-1231) & 3807)) & (-16385) & 19455;
        lllll[841] = (-24577) & 25072;
        lllll[842] = (-((-337) & 32605)) & (-3) & 32767;
        lllll[843] = (-((-5347) & 30447)) & (-1026) & 26623;
        lllll[844] = (-((-16563) & 23219)) & (-1033) & 8187;
        lllll[845] = (-2564) & 3063;
        lllll[846] = (-((-69) & 22087)) & (-9) & 22527;
        lllll[847] = (-((-17486) & 23631)) & (-25089) & 31735;
        lllll[848] = (-1418) & 24575;
        lllll[849] = (-7169) & 7671;
        lllll[850] = (-9218) & 9721;
        lllll[851] = (-23553) & 24057;
        lllll[852] = (-((-5933) & 24366)) & (-517) & 19455;
        lllll[853] = (-18437) & 18943;
        lllll[854] = (-31748) & 32255;
        lllll[855] = (-8193) & 8701;
        lllll[856] = (-16385) & 16894;
        lllll[857] = (-15873) & 16383;
        lllll[858] = (-2201) & 2712;
        lllll[859] = (-9489) & 10001;
        lllll[860] = (-(154 ^ 144)) & (-3) & 23167;
        lllll[861] = (-((-12313) & 31166)) & (-9241) & 28607;
        lllll[862] = (-((-6159) & 32255)) & (-9) & 26619;
        lllll[863] = (-11595) & 12110;
        lllll[864] = (-17603) & 18119;
        lllll[865] = (-((-8405) & 31222)) & (-1169) & 24503;
        lllll[866] = (-((-16425) & 30057)) & (-2057) & 16207;
        lllll[867] = (-4519) & 5038;
        lllll[868] = (-27043) & 27563;
        lllll[869] = (-24710) & 25231;
        lllll[870] = (-23745) & 24267;
        lllll[871] = (-1033) & 24191;
        lllll[872] = (-((-645) & 11190)) & (-5121) & 16189;
        lllll[873] = (-23635) & 24159;
        lllll[874] = (-27122) & 27647;
        lllll[875] = (-((-10793) & 27561)) & (-7217) & 24511;
        lllll[876] = (-4101) & 4628;
        lllll[877] = (-30117) & 30645;
        lllll[878] = (-((-577) & 32745)) & (-69) & 32766;
        lllll[879] = (-5349) & 5879;
        lllll[880] = (-((-321) & 7531)) & (-8641) & 16382;
        lllll[881] = (-7369) & 7901;
        lllll[882] = (-((-16917) & 31677)) & (-1089) & 16382;
        lllll[883] = (-136) & 23295;
        lllll[884] = (-8617) & 9151;
        lllll[885] = (-((-26759) & 32231)) & (-18437) & 24444;
        lllll[886] = (-4483) & 5019;
        lllll[887] = (-((-8993) & 30629)) & (-8225) & 30398;
        lllll[888] = (-((-25171) & 30711)) & (-8257) & 14335;
        lllll[889] = (-25635) & 26174;
        lllll[890] = (-((-665) & 18171)) & (-4481) & 22527;
        lllll[891] = (-22561) & 23102;
        lllll[892] = (-24929) & 25471;
        lllll[893] = (-20820) & 21363;
        lllll[894] = (-4231) & 4775;
        lllll[895] = (-3) & 23159;
        lllll[896] = (-16405) & 16950;
        lllll[897] = (-((-14097) & 16349)) & (-8465) & 11263;
        lllll[898] = (-((-18598) & 28143)) & (-4243) & 14335;
        lllll[899] = (-((-6629) & 32255)) & (-4545) & 30719;
        lllll[900] = (-((-5685) & 24510)) & (-12289) & 31663;
        lllll[901] = (-26889) & 27439;
        lllll[902] = (-3079) & 3630;
        lllll[903] = (-4165) & 4717;
        lllll[904] = (-14785) & 15338;
        lllll[905] = (-(157 ^ 188)) & (-4098) & 14335;
        lllll[906] = (-((-17141) & 26357)) & (-18473) & 28328;
        lllll[907] = (-((-8429) & 9709)) & (-16931) & 22510;
        lllll[908] = (-((-7897) & 24283)) & (-2665) & 24575;
        lllll[909] = (-((-26626) & 32183)) & (-16385) & 24575;
        lllll[910] = (-4742) & 8127;
        lllll[911] = (-14353) & 14909;
        lllll[912] = (-42) & 10239;
        lllll[913] = (-31026) & 31679;
        lllll[914] = (-25653) & 26495;
        lllll[915] = (-24969) & 28127;
        lllll[916] = (-((-10002) & 26399)) & (-8705) & 28399;
        lllll[917] = (-((-4559) & 30175)) & (-4418) & 30591;
        lllll[918] = (-16513) & 19709;
        lllll[919] = (-13105) & 16382;
        lllll[920] = (-785) & 3967;
        lllll[921] = (-20483) & 23767;
        lllll[922] = (-20521) & 30702;
        lllll[923] = (-20869) & 22005;
        lllll[924] = (-14617) & 16255;
        lllll[925] = (-28689) & 29693;
        lllll[926] = (-28755) & 31867;
        lllll[927] = (-((-20057) & 24411)) & (-24578) & 32127;
        lllll[928] = (-((-45) & 15869)) & (-16385) & 32767;
        lllll[929] = (-((-25302) & 27351)) & (-16387) & 28643;
        lllll[930] = (-((-65) & 31307)) & (-17) & 32415;
        lllll[931] = (-9089) & 10207;
        lllll[932] = (-4743) & 5823;
        lllll[933] = (-((-2543) & 27135)) & (-1035) & 28671;
        lllll[934] = (-((-2921) & 7151)) & (-73) & 7678;
        lllll[935] = (-11717) & 12276;
        lllll[936] = (-((-8642) & 31203)) & (-17) & 32767;
        lllll[937] = (-13317) & 14335;
        lllll[938] = (-16553) & 17647;
        lllll[939] = (-31311) & 32734;
        lllll[940] = (-(219 ^ 136)) & (-21505) & 24575;
        lllll[941] = (-((-4885) & 29534)) & (-897) & 28655;
        lllll[942] = (-20939) & 21499;
        lllll[943] = (-4097) & 7044;
        lllll[944] = (-((-1953) & 10161)) & (-16899) & 28415;
        lllll[945] = (-1) & 2947;
        lllll[946] = (-24865) & 28159;
        lllll[947] = (-((-4891) & 30523)) & (-75) & 30206;
        lllll[948] = (-2076) & 12255;
        lllll[949] = (-((-8837) & 25295)) & (-15105) & 32767;
        lllll[950] = (-10809) & 11961;
        lllll[951] = (-2445) & 4079;
        lllll[952] = (-20751) & 23919;
        lllll[953] = (-((-314) & 5631)) & (-10497) & 16375;
        lllll[954] = (-((-9901) & 30463)) & (-1) & 32726;
        lllll[955] = (-((-8593) & 11157)) & (-24577) & 28413;
        lllll[956] = (-((-12389) & 30823)) & (-5017) & 24575;
        lllll[957] = (-18945) & 20135;
        lllll[958] = (-((-514) & 31501)) & (-1089) & 32639;
        lllll[959] = (-22529) & 32760;
        lllll[960] = (-((-8293) & 27639)) & (-33) & 20479;
        lllll[961] = (-((-19525) & 28525)) & (-22535) & 32703;
        lllll[962] = (-16649) & 19962;
        lllll[963] = (-((-1799) & 20367)) & (-12355) & 31487;
        lllll[964] = (-((-9381) & 31911)) & (-1) & 32746;
        lllll[965] = (-((-9823) & 28639)) & (-4113) & 24061;
        lllll[966] = (-4745) & 5819;
        lllll[967] = (-28677) & 30055;
        lllll[968] = (-337) & 2943;
        lllll[969] = (-4234) & 4799;
        lllll[970] = (-4227) & 24059;
        lllll[971] = (-((-849) & 27505)) & (-577) & 32759;
        lllll[972] = (-6281) & 7663;
        lllll[973] = (-521) & 3773;
        lllll[974] = (-(105 ^ 94)) & (-21121) & 24575;
        lllll[975] = (-6465) & 7031;
        lllll[976] = (-((-8449) & 28962)) & (-2049) & 32749;
        lllll[977] = (-10645) & 11711;
        lllll[978] = (-((-8777) & 9849)) & (-14339) & 16255;
        lllll[979] = (-((-423) & 24999)) & (-2311) & 28582;
        lllll[980] = (-4103) & 6831;
        lllll[981] = (-673) & 4021;
        lllll[982] = (-10371) & 10938;
        lllll[983] = (-((-6914) & 23323)) & (-6145) & 32767;
        lllll[984] = (-((-5425) & 23991)) & (-8273) & 28671;
        lllll[985] = (-((-3717) & 28631)) & (-3106) & 28667;
        lllll[986] = (-((-17993) & 20075)) & (-17045) & 20479;
        lllll[987] = (-((-6659) & 32523)) & (-33) & 28655;
        lllll[988] = (-((-4487) & 29063)) & (-139) & 28159;
        lllll[989] = (-30021) & 30589;
        lllll[990] = (-6154) & 16379;
        lllll[991] = (-14849) & 16015;
        lllll[992] = (-((-227) & 22783)) & (-131) & 23263;
        lllll[993] = (-10321) & 11643;
        lllll[994] = (-((-1793) & 18251)) & (-13569) & 32767;
        lllll[995] = (-17670) & 18239;
        lllll[996] = (-((-9269) & 15415)) & (-16402) & 32731;
        lllll[997] = (-2577) & 3673;
        lllll[998] = (-10321) & 11615;
        lllll[999] = (-((-4227) & 20903)) & (-4113) & 23871;
        lllll[1000] = (-((-29235) & 31671)) & (-65) & 3071;
        lllll[1001] = (-16470) & 28631;
        lllll[1002] = (-((-9651) & 32191)) & (-161) & 24061;
        lllll[1003] = (-26647) & 28287;
        lllll[1004] = (-16897) & 20359;
        lllll[1005] = (-((-30839) & 32247)) & (-14340) & 16319;
        lllll[1006] = (-((-9324) & 31871)) & (-1) & 32767;
        lllll[1007] = (-((-10374) & 31207)) & (-2049) & 24575;
        lllll[1008] = (-25217) & 26319;
        lllll[1009] = (-((-24067) & 32579)) & (-20610) & 31731;
        lllll[1010] = (-29377) & 32767;
        lllll[1011] = (-((-16481) & 26849)) & (-5379) & 16319;
        lllll[1012] = (-((-11771) & 32251)) & (-2049) & 32746;
        lllll[1013] = (-((-6161) & 32094)) & (-4129) & 30719;
        lllll[1014] = (-((-21017) & 30333)) & (-257) & 10214;
        lllll[1015] = (-((-1797) & 30551)) & (-1025) & 32759;
        lllll[1016] = (-((-8865) & 29346)) & (-1025) & 22079;
        lllll[1017] = (-4100) & 14295;
        lllll[1018] = (-((-1105) & 32593)) & (-165) & 32767;
        lllll[1019] = (-14617) & 15771;
        lllll[1020] = (-((-19714) & 28495)) & (-20643) & 32511;
        lllll[1021] = (-((-713) & 25293)) & (-4274) & 32189;
        lllll[1022] = (-8449) & 9023;
        lllll[1023] = (-((-193) & 22721)) & (-2) & 32751;
        lllll[1024] = (-13137) & 14195;
        lllll[1025] = (-5379) & 8135;
        lllll[1026] = (-21951) & 22526;
        lllll[1027] = (-20485) & 30694;
        lllll[1028] = (-((-23115) & 23551)) & (-19457) & 20471;
        lllll[1029] = (-(((0 + 11) - (-103)) + 19)) & (-6689) & 8127;
        lllll[1030] = (-17922) & 22231;
        lllll[1031] = (-24650) & 28127;
        lllll[1032] = (-(218 ^ 198)) & (-16385) & 26623;
        lllll[1033] = (-8449) & 10655;
        lllll[1034] = (-((-6005) & 32764)) & (-33) & 31743;
        lllll[1035] = (-22801) & 23378;
        lllll[1036] = (-7442) & 8021;
        lllll[1037] = (-((-25265) & 27326)) & (-3) & 12287;
        lllll[1038] = (-5507) & 8182;
        lllll[1039] = (-((-585) & 28251)) & (-4521) & 32767;
        lllll[1040] = (-2081) & 2662;
        lllll[1041] = (-((-2791) & 24303)) & (-2481) & 24575;
        lllll[1042] = (-6147) & 16350;
        lllll[1043] = (-21889) & 22526;
        lllll[1044] = (-6849) & 8183;
        lllll[1045] = (-((-5721) & 24543)) & (-2) & 19407;
        lllll[1046] = (-33) & 10232;
        lllll[1047] = (-14353) & 15989;
        lllll[1048] = (-((-325) & 11725)) & (-20497) & 32735;
        lllll[1049] = (-((-16937) & 21099)) & (-16913) & 24183;
        lllll[1050] = (-((-12022) & 16375)) & (-1) & 7647;
        lllll[1051] = (-((-1753) & 32731)) & (-1205) & 32767;
        lllll[1052] = (-6153) & 16382;
        lllll[1053] = (-((-1193) & 32173)) & (-1) & 32111;
        lllll[1054] = (-4233) & 5583;
        lllll[1055] = (-((-7679) & 24575)) & (-12309) & 32511;
        lllll[1056] = (-5253) & 5838;
        lllll[1057] = (-18434) & 28661;
        lllll[1058] = (-((-23093) & 32566)) & (-6155) & 16255;
        lllll[1059] = (-4739) & 8099;
        lllll[1060] = (-24593) & 27931;
        lllll[1061] = (-((-4893) & 32701)) & (-257) & 28651;
        lllll[1062] = (-6190) & 16383;
        lllll[1063] = (-16851) & 17911;
        lllll[1064] = (-18595) & 19182;
        lllll[1065] = (-42) & 10233;
        lllll[1066] = (-27461) & 28543;
        lllll[1067] = (-10375) & 12030;
        lllll[1068] = (-8451) & 11687;
        lllll[1069] = (-((-10849) & 31485)) & (-8195) & 32511;
        lllll[1070] = (-((-4615) & 6951)) & (-4241) & 7165;
        lllll[1071] = (-((-8841) & 28346)) & (-12417) & 32511;
        lllll[1072] = (-16422) & 26623;
        lllll[1073] = (-18442) & 20095;
        lllll[1074] = (-25379) & 26615;
        lllll[1075] = (-28686) & 31661;
        lllll[1076] = (-((-3742) & 16095)) & (-17169) & 32759;
        lllll[1077] = (-((-525) & 32573)) & (-1) & 32639;
        lllll[1078] = (-1) & 19831;
        lllll[1079] = (-18441) & 19453;
        lllll[1080] = (-30977) & 31612;
        lllll[1081] = (-((-1161) & 9963)) & (-18433) & 32767;
        lllll[1082] = (-((-14495) & 14783)) & (-20995) & 24447;
        lllll[1083] = (-8769) & 12235;
        lllll[1084] = (-((-25169) & 30711)) & (-2049) & 8182;
        lllll[1085] = (-2054) & 12239;
        lllll[1086] = (-((-2193) & 31641)) & (-2049) & 32765;
        lllll[1087] = (-15235) & 16375;
        lllll[1088] = (-146) & 3517;
        lllll[1089] = (-(((55 + 71) - 10) + 45)) & (-4365) & 5117;
        lllll[1090] = (-((-5785) & 30715)) & (-1025) & 28670;
        lllll[1091] = (-((-4681) & 12873)) & (-4865) & 16346;
        lllll[1092] = (-((-1301) & 30678)) & (-17) & 32767;
        lllll[1093] = (-19462) & 20055;
        lllll[1094] = (-65) & 1016;
        lllll[1095] = (-24621) & 25215;
        lllll[1096] = (-(((14 + 77) - 48) + 94)) & (-4610) & 24559;
        lllll[1097] = (-((-399) & 29103)) & (-265) & 32189;
        lllll[1098] = (-17417) & 18012;
        lllll[1099] = (-13451) & 14047;
        lllll[1100] = (-(102 ^ 92)) & (-17153) & 24445;
        lllll[1101] = (-((-2023) & 18415)) & (-8225) & 28031;
        lllll[1102] = (-6273) & 6870;
        lllll[1103] = (-((-14035) & 16115)) & (-9353) & 12031;
        lllll[1104] = (-((-22685) & 24063)) & (-28673) & 32763;
        lllll[1105] = (-((-4493) & 29581)) & (-130) & 28383;
        lllll[1106] = (-24839) & 25438;
        lllll[1107] = (-18727) & 19327;
        lllll[1108] = (-2628) & 28415;
        lllll[1109] = (-8241) & 9658;
        lllll[1110] = (-8321) & 11911;
        lllll[1111] = (-((-19587) & 31883)) & (-16481) & 30591;
        lllll[1112] = (-12315) & 15999;
        lllll[1113] = (-((-1285) & 32149)) & (-2) & 32671;
        lllll[1114] = (-9477) & 10078;
        lllll[1115] = (-18565) & 19167;
        lllll[1116] = (-20481) & 32659;
        lllll[1117] = (-((-11306) & 32061)) & (-8713) & 32767;
        lllll[1118] = (-513) & 3803;
        lllll[1119] = (-7457) & 8060;
        lllll[1120] = (-((-3073) & 23683)) & (-9249) & 30463;
        lllll[1121] = (-((-9001) & 11051)) & (-8197) & 32247;
        lllll[1122] = (-((-23713) & 32427)) & (-1045) & 12287;
        lllll[1123] = (-((-16789) & 26037)) & (-4098) & 16183;
        lllll[1124] = (-9250) & 9855;
        lllll[1125] = (-6401) & 7007;
        lllll[1126] = (-4609) & 8126;
        lllll[1127] = (-((-26713) & 31743)) & (-16385) & 24566;
        lllll[1128] = (-((-22754) & 30955)) & (-1303) & 10111;
        lllll[1129] = (-((-2837) & 8095)) & (-2069) & 7935;
        lllll[1130] = (-4181) & 16350;
        lllll[1131] = (-28038) & 28647;
        lllll[1132] = (-((-3) & 18463)) & (-9473) & 28543;
        lllll[1133] = (-16450) & 19965;
        lllll[1134] = (-((-6545) & 23964)) & (-385) & 20415;
        lllll[1135] = (-((-2314) & 26927)) & (-4673) & 32767;
        lllll[1136] = (-30732) & 31343;
        lllll[1137] = (-((-15569) & 32471)) & (-4177) & 23551;
        lllll[1138] = (-((-19617) & 27830)) & (-33) & 16255;
        lllll[1139] = (-11265) & 11877;
        lllll[1140] = (-((-18979) & 24115)) & (-2305) & 8054;
        lllll[1141] = (-((-6287) & 31983)) & (-4353) & 32767;
        lllll[1142] = (-((-18185) & 30493)) & (-1033) & 16383;
        lllll[1143] = (-1305) & 1919;
        lllll[1144] = (-29848) & 30463;
        lllll[1145] = (-((-17453) & 26157)) & (-16458) & 28671;
        lllll[1146] = (-4162) & 6619;
        lllll[1147] = (-((-25195) & 29695)) & (-2049) & 7165;
        lllll[1148] = (-31749) & 32366;
        lllll[1149] = (-4098) & 23923;
        lllll[1150] = (-389) & 4061;
        lllll[1151] = (-((-16467) & 22743)) & (-16657) & 23551;
        lllll[1152] = (-((-1113) & 30170)) & (-1041) & 30717;
        lllll[1153] = (-((-17517) & 31981)) & (-1297) & 16381;
        lllll[1154] = (-((-8454) & 28935)) & (-145) & 21247;
        lllll[1155] = (-16513) & 17135;
        lllll[1156] = (-24971) & 25594;
        lllll[1157] = (-17797) & 18421;
        lllll[1158] = (-((-1082) & 15807)) & (-17409) & 32759;
        lllll[1159] = (-((-19) & 31007)) & (-129) & 31743;
        lllll[1160] = (-14601) & 15229;
        lllll[1161] = (-26626) & 27255;
        lllll[1162] = (-11521) & 12151;
        lllll[1163] = (-((-17385) & 28655)) & (-16385) & 28286;
        lllll[1164] = (-10375) & 11007;
        lllll[1165] = (-((-2137) & 14558)) & (-1) & 13055;
        lllll[1166] = (-14725) & 15359;
        lllll[1167] = (-((-17419) & 29707)) & (-16403) & 32255;
        lllll[1168] = (-9475) & 10111;
        lllll[1169] = (-20562) & 23903;
        lllll[1170] = (-((-6443) & 22895)) & (-4097) & 23807;
        lllll[1171] = (-27777) & 28415;
        lllll[1172] = (-((-2769) & 7157)) & (-18523) & 23551;
        lllll[1173] = (-4321) & 7420;
        lllll[1174] = (-((-7169) & 31857)) & (-3081) & 28411;
        lllll[1175] = (-27730) & 28373;
        lllll[1176] = (-((-20525) & 29807)) & (-1) & 9927;
        lllll[1177] = (-((-8483) & 11563)) & (-34) & 3759;
        lllll[1178] = (-((-16385) & 31865)) & (-16385) & 32511;
        lllll[1179] = (-12631) & 13279;
        lllll[1180] = (-12354) & 13003;
        lllll[1181] = (-((-24995) & 29171)) & (-37) & 4863;
        lllll[1182] = (-((-9) & 28795)) & (-258) & 29695;
        lllll[1183] = (-8257) & 8909;
        lllll[1184] = (-6257) & 6911;
        lllll[1185] = (-((-665) & 32478)) & (-3) & 32471;
        lllll[1186] = (-22593) & 23249;
        lllll[1187] = (-17509) & 18167;
        lllll[1188] = (-((-12471) & 15615)) & (-257) & 4060;
        lllll[1189] = (-16594) & 19191;
        lllll[1190] = (-((-17367) & 26615)) & (-20489) & 30397;
        lllll[1191] = (-((-13214) & 32767)) & (-9) & 20223;
        lllll[1192] = (-14401) & 15063;
        lllll[1193] = (-21763) & 22426;
        lllll[1194] = (-12551) & 13215;
    }
}
