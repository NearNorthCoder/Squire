package f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n;

import gg.squire.account.AccBuilderRogues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.J  reason: invalid package */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/J.class */
public class J implements G {
    static /* synthetic */ WorldArea iz;
    public static /* synthetic */ int iy;
    public static /* synthetic */ int iw;
    private static /* synthetic */ String[] lIIllIllII;
    private static /* synthetic */ WorldPoint iC;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ WorldArea iA;
    private static /* synthetic */ int[] lIIllIllll;
    static /* synthetic */ WorldArea iB;
    public static /* synthetic */ List<C0003d> bv;
    public static /* synthetic */ int ix;

    private static void lIIIIIlIllllI() {
        lIIllIllII = new String[lIIllIllll[238]];
        lIIllIllII[lIIllIllll[0]] = lIIIIIlIlIlll("5ndZ8aj4MukkQWTgzhvQjQ==", "CtJRf");
        lIIllIllII[lIIllIllll[1]] = lIIIIIlIllIII("7kz4FpunzOCusM9lcex2XtWryWIr1Pu9mUcZeeJJ69vaQx6eAE9fVNF01q/8qzpCtyYOE369rkw=", "xVNVu");
        lIIllIllII[lIIllIllll[3]] = lIIIIIlIlIlll("Q9i1FH6ovuSn3mxksaeCQND61ap3jy4b", "TJuox");
        lIIllIllII[lIIllIllll[10]] = lIIIIIlIllIII("Xx2w+8ifqa4CoJpzWA6vNv0mZlkeDD6N", "IFQeV");
        lIIllIllII[lIIllIllll[17]] = lIIIIIlIllIIl("NARaKhgGQRciGRAIFCxKEhQfOB5DEg87Gg8IHzhGQxINIh4ACRMlDUMVFWsoNjgzBS0=", "cazKj");
        lIIllIllII[lIIllIllll[19]] = lIIIIIlIlIlll("xlHDOS88Dqo=", "aIBYc");
        lIIllIllII[lIIllIllll[21]] = lIIIIIlIllIII("GVbk9mCMC74=", "dApHL");
        lIIllIllII[lIIllIllll[23]] = lIIIIIlIlIlll("dPWIfPIWSe0=", "kXcHO");
        lIIllIllII[lIIllIllll[25]] = lIIIIIlIllIII("6gQ6sV0Hdt4=", "bWCxI");
        lIIllIllII[lIIllIllll[27]] = lIIIIIlIllIII("l6aAAoaH7B0=", "YHdgv");
        lIIllIllII[lIIllIllll[12]] = lIIIIIlIllIII("F6AVb3AsTQ13u08Hp/b/AdLtQrMSrTbs", "dpkXs");
        lIIllIllII[lIIllIllll[49]] = lIIIIIlIlIlll("2Doe6jG9gGRfMhOHMvR7jw==", "BfJzS");
        lIIllIllII[lIIllIllll[63]] = lIIIIIlIlIlll("Zvuuaz30g/QgIzFgVwtdwQ==", "HFMeJ");
        lIIllIllII[lIIllIllll[64]] = lIIIIIlIllIIl("DRUJM2I7Fxc3PCk=", "ZteXO");
        lIIllIllII[lIIllIllll[53]] = lIIIIIlIlIlll("KoQ17g8ELe8KeMfepbzZDg==", "YzLRO");
        lIIllIllII[lIIllIllll[39]] = lIIIIIlIllIII("i67THZU+346tqoJZcYIfnQ==", "luvUu");
        lIIllIllII[lIIllIllll[65]] = lIIIIIlIllIIl("AC8cFC1uLAMcPQ==", "CCuyO");
        lIIllIllII[lIIllIllll[66]] = lIIIIIlIllIIl("EDYZPzM6NBdyMyE7HjE5", "SZpRQ");
        lIIllIllII[lIIllIllll[54]] = lIIIIIlIllIII("B6OAKkyr1MhsPtpm9QyzqQ==", "BuaWs");
        lIIllIllII[lIIllIllll[67]] = lIIIIIlIllIIl("MQknOjU=", "reNWW");
        lIIllIllII[lIIllIllll[40]] = lIIIIIlIllIII("HLB5FyHkg+11/b9ZRbuVIA==", "npOOG");
        lIIllIllII[lIIllIllll[68]] = lIIIIIlIllIIl("Jy4iBT8GJiADcRcgPgE=", "eONdQ");
        lIIllIllII[lIIllIllll[61]] = lIIIIIlIlIlll("zy8XAKT0luA=", "MrsgF");
        lIIllIllII[lIIllIllll[69]] = lIIIIIlIllIIl("JRg+ACgPGjBNLgkDOQ==", "ftWmJ");
        lIIllIllII[lIIllIllll[70]] = lIIIIIlIllIII("5MBjRUBDvU3CRLvS6FUimg==", "yXpGX");
        lIIllIllII[lIIllIllll[41]] = lIIIIIlIlIlll("BhUbcg7o6j3irMs2RL3e2A==", "FZBJe");
        lIIllIllII[lIIllIllll[71]] = lIIIIIlIllIIl("LBQHLioGFgljJgoM", "oxnCH");
        lIIllIllII[lIIllIllll[72]] = lIIIIIlIllIIl("Ny4XDjAbIAFaPx04", "xLdzQ");
        lIIllIllII[lIIllIllll[73]] = lIIIIIlIllIIl("Jyk9OBJJKiIwAg==", "dETUp");
        lIIllIllII[lIIllIllll[74]] = lIIIIIlIllIIl("ARoIJDwrBgB3PysYAg==", "BhgWO");
        lIIllIllII[lIIllIllll[42]] = lIIIIIlIlIlll("p/oTCT52o5hSuJtadfNVZA==", "vbQjY");
        lIIllIllII[lIIllIllll[75]] = lIIIIIlIllIIl("BTUgIDYsIXgxOyQrICI7", "VDUES");
        lIIllIllII[lIIllIllll[95]] = lIIIIIlIlIlll("a8ZisfaGufGD0lMKjvri0w==", "JBAyj");
        lIIllIllII[lIIllIllll[97]] = lIIIIIlIllIIl("Bwg2AW8lD2QNPSsKIQ==", "JiDjO");
        lIIllIllII[lIIllIllll[98]] = lIIIIIlIllIII("yhXdm3YPPWqkxmalcuZeOQ==", "hqqjh");
        lIIllIllII[lIIllIllll[99]] = lIIIIIlIlIlll("+kqd1A8qhip4fhBsGhN+mfzG6ndTL99V", "ldmHO");
        lIIllIllII[lIIllIllll[100]] = lIIIIIlIllIII("BfLJrYBJn3I=", "yNNJL");
        lIIllIllII[lIIllIllll[101]] = lIIIIIlIlIlll("KNZJhkYqznWrQaPF9rtv4A==", "rJRJr");
        lIIllIllII[lIIllIllll[102]] = lIIIIIlIllIII("LbUPANI5+rKzd0HdnfjHtA==", "fkDkF");
        lIIllIllII[lIIllIllll[103]] = lIIIIIlIllIIl("FAUIOSo=", "WiaTH");
        lIIllIllII[lIIllIllll[38]] = lIIIIIlIllIIl("DQsjIjYnFytxJiIWODkgPVkgOCsr", "NyLQE");
        lIIllIllII[lIIllIllll[105]] = lIIIIIlIllIIl("Lw4eDD4JEVEUPwIH", "lbqxV");
        lIIllIllII[lIIllIllll[106]] = lIIIIIlIlIlll("y0PUuGvPfgM=", "jFrgy");
        lIIllIllII[lIIllIllll[107]] = lIIIIIlIllIII("E/Lx5Nfu1Mw=", "JpXSC");
        lIIllIllII[lIIllIllll[108]] = lIIIIIlIllIIl("Hzgb", "XYkVa");
        lIIllIllII[lIIllIllll[109]] = lIIIIIlIlIlll("EhiMKa2VwNo=", "tBkyE");
        lIIllIllII[lIIllIllll[110]] = lIIIIIlIllIIl("ERMVFjkwGxcQ", "SrywW");
        lIIllIllII[lIIllIllll[111]] = lIIIIIlIllIII("VBjpF+rf0Kg=", "GWZEz");
        lIIllIllII[lIIllIllll[112]] = lIIIIIlIlIlll("RO9eXwJGxsw=", "wRAYq");
        lIIllIllII[lIIllIllll[113]] = lIIIIIlIllIIl("HgIEOjg6EEktMCQ=", "TwiJQ");
        lIIllIllII[lIIllIllll[2]] = lIIIIIlIllIII("j1R+P/8+3Bw=", "UpINe");
        lIIllIllII[lIIllIllll[7]] = lIIIIIlIllIII("kk8mWxiJAQo=", "kLwcB");
        lIIllIllII[lIIllIllll[114]] = lIIIIIlIllIII("Oye/8q1t5QOwgOSCmndBDw==", "pgXqZ");
        lIIllIllII[lIIllIllll[116]] = lIIIIIlIllIII("HFM2FTtfzxE=", "cSXed");
        lIIllIllII[lIIllIllll[117]] = lIIIIIlIllIII("p3pc7oBkmcItqlVbPpvK5w==", "ownrH");
        lIIllIllII[lIIllIllll[119]] = lIIIIIlIllIIl("GS0vNw==", "UHNGY");
        lIIllIllII[lIIllIllll[120]] = lIIIIIlIllIII("NDrnouDD3aHGvD9pi9itGQ==", "gVCxU");
        lIIllIllII[lIIllIllll[122]] = lIIIIIlIllIIl("HC8ZLgIx", "TZkJn");
        lIIllIllII[lIIllIllll[123]] = lIIIIIlIllIIl("Eig8AB48KDwOTTcuJxseMQ==", "TARim");
        lIIllIllII[lIIllIllll[124]] = lIIIIIlIllIIl("DDcgHA==", "ISGyY");
        lIIllIllII[lIIllIllll[44]] = lIIIIIlIllIIl("DhsPNnsrCAQ=", "DnbFV");
        lIIllIllII[lIIllIllll[140]] = lIIIIIlIllIII("GRa5pGID9ahGizb3pMpRMx/FbjGODOBz", "JoIuQ");
        lIIllIllII[lIIllIllll[6]] = lIIIIIlIllIII("jYESz8CLm3vAYadPDEWLKQ==", "syIea");
        lIIllIllII[lIIllIllll[141]] = lIIIIIlIllIII("z82NiNKfAeSdN5YLkoRUbQ==", "vWOBr");
        lIIllIllII[lIIllIllll[142]] = lIIIIIlIlIlll("iKJVs/r0zV45wxjV8PBrrw==", "wcaek");
        lIIllIllII[lIIllIllll[143]] = lIIIIIlIllIIl("DA8CHC4=", "OckqL");
        lIIllIllII[lIIllIllll[144]] = lIIIIIlIllIIl("JxYnGW4FEXUVPAsUMA==", "jwUrN");
        lIIllIllII[lIIllIllll[145]] = lIIIIIlIlIlll("RV2EMUNdN8oUxibvZsYgQQ==", "ajiul");
        lIIllIllII[lIIllIllll[146]] = lIIIIIlIllIII("5Qe7u31gLEFPedvqyaigwjJDCby2HTED", "rKeyd");
        lIIllIllII[lIIllIllll[147]] = lIIIIIlIllIII("d5ojfZRHzeA=", "PlvDu");
        lIIllIllII[lIIllIllll[148]] = lIIIIIlIlIlll("GU5UHYmM4WKl8rbMHhUH0Q==", "yoEKF");
        lIIllIllII[lIIllIllll[149]] = lIIIIIlIllIII("b6EUlV8XDbs=", "vgXIA");
        lIIllIllII[lIIllIllll[150]] = lIIIIIlIlIlll("4ZmLaY5BxOw6hd/73Fkq8Q==", "QOZIS");
        lIIllIllII[lIIllIllll[151]] = lIIIIIlIlIlll("IVX/sippKdc=", "Dfwwy");
        lIIllIllII[lIIllIllll[152]] = lIIIIIlIllIIl("PDQ7MzwYJnYkNAZhZQ==", "vAVCU");
        lIIllIllII[lIIllIllll[153]] = lIIIIIlIllIIl("Og0mBg==", "pxKvC");
        lIIllIllII[lIIllIllll[154]] = lIIIIIlIllIIl("ACIfGAwkMFIPBDp3Rg==", "JWrhe");
        lIIllIllII[lIIllIllll[155]] = lIIIIIlIlIlll("o6TJvCgG20k=", "DLTwZ");
        lIIllIllII[lIIllIllll[156]] = lIIIIIlIllIII("7FlDm4knDZklp79q+Sju9A==", "wgfRM");
        lIIllIllII[lIIllIllll[157]] = lIIIIIlIllIII("q7o48JbFtBs=", "gEURO");
        lIIllIllII[lIIllIllll[158]] = lIIIIIlIllIIl("DjsMOA0qKUEvBTRuVA==", "DNaHd");
        lIIllIllII[lIIllIllll[159]] = lIIIIIlIllIIl("ID4XPw==", "jKzOg");
        lIIllIllII[lIIllIllll[160]] = lIIIIIlIllIII("bjKEqHu1u02qUZO5yFeWMg==", "GNhOt");
        lIIllIllII[lIIllIllll[161]] = lIIIIIlIllIIl("PSwqBw==", "wYGwq");
        lIIllIllII[lIIllIllll[172]] = lIIIIIlIlIlll("bQlogGlz7H/ovBVmFGGUls3iZTJKcE1q", "HjxsK");
        lIIllIllII[lIIllIllll[173]] = lIIIIIlIllIIl("CDMGTj0pcgMaKDQm", "FRpnI");
        lIIllIllII[lIIllIllll[174]] = lIIIIIlIllIIl("PhUPBhEEDwlUBgIUHAcA", "mante");
        lIIllIllII[lIIllIllll[175]] = lIIIIIlIllIII("yjpJibdrdT4=", "vIDSP");
        lIIllIllII[lIIllIllll[36]] = lIIIIIlIlIlll("Qu2CL2mb+rSbLeoNRLgQcg==", "sWTRJ");
        lIIllIllII[lIIllIllll[176]] = lIIIIIlIllIIl("ICITMmwCJUE+PgwgBA==", "mCaYL");
        lIIllIllII[lIIllIllll[177]] = lIIIIIlIllIIl("MywDEB4AbQUYAgw=", "gMhyp");
        lIIllIllII[lIIllIllll[178]] = lIIIIIlIlIlll("YPbX7MAn7wJDm1PhSRzY13eP560tZykX", "mojep");
        lIIllIllII[lIIllIllll[179]] = lIIIIIlIllIIl("Hw0BLA==", "KljIz");
        lIIllIllII[lIIllIllll[180]] = lIIIIIlIllIII("8tLTSnLNhoU5xb7QyQQxVg==", "ErjcK");
        lIIllIllII[lIIllIllll[79]] = lIIIIIlIllIIl("MB85Jw==", "zjTWV");
        lIIllIllII[lIIllIllll[181]] = lIIIIIlIllIIl("MD4pGyVzPikYMw==", "SLFhV");
        lIIllIllII[lIIllIllll[182]] = lIIIIIlIllIII("+U6slGUKKKQ=", "dCDMs");
        lIIllIllII[lIIllIllll[183]] = lIIIIIlIllIIl("DSw/OjspPnItMzd5YQ==", "GYRJR");
        lIIllIllII[lIIllIllll[184]] = lIIIIIlIlIlll("Ot3QsTorjmo=", "IpYcB");
        lIIllIllII[lIIllIllll[185]] = lIIIIIlIllIII("1eQPtq9zovQSsDOsvHB8cA==", "EfwdY");
        lIIllIllII[lIIllIllll[186]] = lIIIIIlIllIII("K2kwDPDIBxA=", "ZvuZC");
        lIIllIllII[lIIllIllll[187]] = lIIIIIlIlIlll("rjeLYOJwpcQ9+fXySs9FGA==", "PbRZI");
        lIIllIllII[lIIllIllll[188]] = lIIIIIlIlIlll("KsR86vSuNXE=", "DHtsV");
        lIIllIllII[lIIllIllll[194]] = lIIIIIlIlIlll("Ka6+/lXZmEtu3WcsaV6JtUtFD/0qNNp4", "WmSso");
        lIIllIllII[lIIllIllll[203]] = lIIIIIlIlIlll("JfwuQj5UgPE=", "UGiEN");
        lIIllIllII[lIIllIllll[204]] = lIIIIIlIllIII("t5KtRg9amGg=", "RYlLI");
        lIIllIllII[lIIllIllll[205]] = lIIIIIlIllIIl("KS8hCS4+Kw==", "YNRzO");
        lIIllIllII[lIIllIllll[206]] = lIIIIIlIlIlll("gP/1UjdVGiM=", "jnRGN");
        lIIllIllII[lIIllIllll[207]] = lIIIIIlIllIIl("ETkrOSYGPQ==", "aXXJG");
        lIIllIllII[lIIllIllll[208]] = lIIIIIlIlIlll("hS87dNRoPNw=", "fLmSn");
        lIIllIllII[lIIllIllll[211]] = lIIIIIlIllIII("xEgktEmn9So=", "yoeCr");
        lIIllIllII[lIIllIllll[213]] = lIIIIIlIllIII("9f8q1G6GpnE=", "aJrLJ");
        lIIllIllII[lIIllIllll[216]] = lIIIIIlIllIII("UPmwcfvbuAN5PcdclP0G3w==", "ikhmy");
        lIIllIllII[lIIllIllll[218]] = lIIIIIlIllIIl("FCwG", "SMvAg");
        lIIllIllII[lIIllIllll[221]] = lIIIIIlIllIIl("PRAG", "zqvGO");
        lIIllIllII[lIIllIllll[224]] = lIIIIIlIllIII("WeK8OSNOAJM=", "TJpra");
        lIIllIllII[lIIllIllll[226]] = lIIIIIlIlIlll("JXmQwLPxaxKn4PDShK+bDQ==", "tYguf");
        lIIllIllII[lIIllIllll[227]] = lIIIIIlIllIII("QdsL2eqFuLg=", "tZQFb");
        lIIllIllII[lIIllIllll[230]] = lIIIIIlIlIlll("fWOQyV34Ex0=", "GTucq");
        lIIllIllII[lIIllIllll[232]] = lIIIIIlIlIlll("FZh/L0I7lb8=", "kLMTO");
        lIIllIllII[lIIllIllll[233]] = lIIIIIlIlIlll("513u5ymNdD8=", "hxCVu");
    }

    private static String lIIIIIlIlIlll(String lllllllllllllllllllllIIlIlIIIIII, String lllllllllllllllllllllIIlIIllllll) {
        try {
            SecretKeySpec lllllllllllllllllllllIIlIlIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllIIlIIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllIllll[3], lllllllllllllllllllllIIlIlIIIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllIIlIlIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllllIIlIlIIIIIl) {
            lllllllllllllllllllllIIlIlIIIIIl.printStackTrace();
            return null;
        }
    }

    private static void ct() {
        WorldArea worldArea = new WorldArea(lIIllIllll[162], lIIllIllll[163], lIIllIllll[111], lIIllIllll[111], lIIllIllll[0]);
        WorldArea worldArea2 = new WorldArea(lIIllIllll[162], lIIllIllll[163], lIIllIllll[111], lIIllIllll[111], lIIllIllll[1]);
        WorldArea worldArea3 = new WorldArea(lIIllIllll[162], lIIllIllll[163], lIIllIllll[111], lIIllIllll[111], lIIllIllll[3]);
        WorldArea worldArea4 = new WorldArea(lIIllIllll[162], lIIllIllll[163], lIIllIllll[111], lIIllIllll[111], lIIllIllll[10]);
        WorldArea worldArea5 = new WorldArea(lIIllIllll[164], lIIllIllll[133], lIIllIllll[64], lIIllIllll[12], lIIllIllll[10]);
        WorldArea worldArea6 = new WorldArea(lIIllIllll[165], lIIllIllll[139], lIIllIllll[39], lIIllIllll[53], lIIllIllll[3]);
        WorldArea worldArea7 = new WorldArea(lIIllIllll[166], lIIllIllll[134], lIIllIllll[49], lIIllIllll[27], lIIllIllll[3]);
        WorldArea worldArea8 = new WorldArea(lIIllIllll[167], lIIllIllll[136], lIIllIllll[70], lIIllIllll[64], lIIllIllll[10]);
        WorldArea worldArea9 = new WorldArea(lIIllIllll[168], lIIllIllll[169], lIIllIllll[54], lIIllIllll[63], lIIllIllll[3]);
        WorldPoint worldPoint = new WorldPoint(lIIllIllll[170], lIIllIllll[171], lIIllIllll[0]);
        if (lIIIIIlllllIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIIIIIlllllll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIIlllllll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIIlllllll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIIlllllll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIllIllII[lIIllIllll[172]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lIIllIllll[1]);
            "".length();
        }
        if (lIIIIIlllllIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIIIIlIIIIIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIllIllll[21])) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[173]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(lIIllIllll[1]);
                "".length();
            }
            if (lIIIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIllIllll[21])) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[174]];
                int experience = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[lIIllIllll[1]];
                strArr[lIIllIllll[0]] = lIIllIllII[lIIllIllll[175]];
                TileObjects.getNearest(strArr).interact(lIIllIllII[lIIllIllll[36]]);
                Time.sleepTicks(C0004e.c(lIIllIllll[1], lIIllIllll[3]));
                "".length();
                Time.sleepUntil(() -> {
                    if (lIIIIlIIIIIIl(Skills.getExperience(Skill.AGILITY), experience)) {
                        ?? r0 = lIIllIllll[1];
                        "".length();
                        return " ".length() == "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIllIllll[0];
                }, lIIllIllll[104]);
                "".length();
                Time.sleepTicks(lIIllIllll[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[lIIllIllll[1]];
        strArr2[lIIllIllll[0]] = lIIllIllII[lIIllIllll[176]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (lIIIIlIIIIIII(nearest) && lIIIIIlllllIl(cu() ? 1 : 0)) {
            AccBuilderRogues.c = lIIllIllII[lIIllIllll[177]];
            System.out.println(lIIllIllII[lIIllIllll[178]]);
            nearest.interact(lIIllIllII[lIIllIllll[179]]);
            Time.sleepTicks(lIIllIllll[10]);
            "".length();
        }
        if (lIIIIIlllllll(cu() ? 1 : 0)) {
            if (lIIIIIlllllIl(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (lIIIIIlllllIl(tileObject.getName().contains(lIIllIllII[lIIllIllll[218]]) ? 1 : 0) && lIIIIlIIIIlIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIllIllll[219], lIIllIllll[220], lIIllIllll[10])), lIIllIllll[3])) {
                        ?? r0 = lIIllIllll[1];
                        "".length();
                        return 0 != 0 ? ((((56 + 157) - 127) + 97) ^ (((91 + 164) - 185) + 109)) & (((((46 + 147) - 187) + 143) ^ (((39 + 125) - 70) + 51)) ^ (-" ".length())) : r0;
                    }
                    return lIIllIllll[0];
                });
                if (lIIIIlIIIIIII(nearest2)) {
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[180]];
                    nearest2.interact(lIIllIllII[lIIllIllll[79]]);
                    Time.sleepTicks(C0004e.c(lIIllIllll[1], lIIllIllll[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIIIlIIIIIIl(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = lIIllIllll[1];
                            "".length();
                            return "   ".length() == 0 ? ((221 ^ 135) ^ (221 ^ 190)) & (((205 ^ 187) ^ (122 ^ 53)) ^ (-" ".length())) : r0;
                        }
                        return lIIllIllll[0];
                    }, lIIllIllll[104]);
                    "".length();
                    Time.sleepTicks(lIIllIllll[1]);
                    "".length();
                }
            }
            if (lIIIIIlllllIl(cu() ? 1 : 0)) {
                return;
            }
            if (lIIIIIlllllIl(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (lIIIIIlllllIl(tileObject2.getName().contains(lIIllIllII[lIIllIllll[216]]) ? 1 : 0) && lIIIIlIIIIlIl(tileObject2.getWorldLocation().distanceTo(new WorldPoint(lIIllIllll[217], lIIllIllll[128], lIIllIllll[3])), lIIllIllll[3])) {
                        ?? r0 = lIIllIllll[1];
                        "".length();
                        return "   ".length() < "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIllIllll[0];
                });
                if (lIIIIlIIIIIII(nearest3)) {
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[181]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(lIIllIllII[lIIllIllll[182]]);
                    Time.sleepTicks(C0004e.c(lIIllIllll[1], lIIllIllll[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIIIlIIIIIIl(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = lIIllIllll[1];
                            "".length();
                            return (-" ".length()) > (-" ".length()) ? ((167 ^ 129) ^ (241 ^ 182)) & (((((59 + 131) - 164) + 134) ^ (((41 + 124) - (-14)) + 14)) ^ (-" ".length())) : r0;
                        }
                        return lIIllIllll[0];
                    }, lIIllIllll[104]);
                    "".length();
                    Time.sleepTicks(lIIllIllll[1]);
                    "".length();
                }
            }
            if (lIIIIIlllllIl(cu() ? 1 : 0)) {
                return;
            }
            if (lIIIIIlllllIl(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (lIIIIIlllllIl(tileObject3.getName().contains(lIIllIllII[lIIllIllll[213]]) ? 1 : 0) && lIIIIlIIIIlIl(tileObject3.getWorldLocation().distanceTo(new WorldPoint(lIIllIllll[214], lIIllIllll[215], lIIllIllll[3])), lIIllIllll[3])) {
                        ?? r0 = lIIllIllll[1];
                        "".length();
                        return 0 != 0 ? " ".length() & (" ".length() ^ (-1)) & (((97 ^ 54) & ((12 ^ 91) ^ (-1))) ^ (-1)) : r0;
                    }
                    return lIIllIllll[0];
                });
                if (lIIIIlIIIIIII(nearest4)) {
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[183]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(lIIllIllII[lIIllIllll[184]]);
                    Time.sleepTicks(C0004e.c(lIIllIllll[1], lIIllIllll[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIIIlIIIIIIl(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = lIIllIllll[1];
                            "".length();
                            return "  ".length() <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIllIllll[0];
                    }, lIIllIllll[104]);
                    "".length();
                    Time.sleepTicks(lIIllIllll[1]);
                    "".length();
                }
            }
            if (lIIIIIlllllIl(cu() ? 1 : 0)) {
                return;
            }
            if (lIIIIIlllllIl(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (lIIIIIlllllIl(tileObject4.getName().contains(lIIllIllII[lIIllIllll[211]]) ? 1 : 0) && lIIIIlIIIIlIl(tileObject4.getWorldLocation().distanceTo(new WorldPoint(lIIllIllll[209], lIIllIllll[212], lIIllIllll[10])), lIIllIllll[3])) {
                        ?? r0 = lIIllIllll[1];
                        "".length();
                        return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIllIllll[0];
                });
                if (lIIIIlIIIIIII(nearest5)) {
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[185]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(lIIllIllII[lIIllIllll[186]]);
                    Time.sleepTicks(C0004e.c(lIIllIllll[1], lIIllIllll[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIIIlIIIIIIl(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = lIIllIllll[1];
                            "".length();
                            return (-((((11 + 37) - 34) + 153) ^ (((153 + 110) - 212) + 112))) > 0 ? ((((64 + 64) - 118) + 158) ^ (((121 + 118) - 137) + 63)) & (((220 ^ 180) ^ (40 ^ 77)) ^ (-" ".length())) : r0;
                        }
                        return lIIllIllll[0];
                    }, lIIllIllll[104]);
                    "".length();
                    Time.sleepTicks(lIIllIllll[1]);
                    "".length();
                }
            }
            if (!lIIIIIlllllIl(cu() ? 1 : 0) && lIIIIIlllllIl(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (lIIIIIlllllIl(tileObject5.getName().contains(lIIllIllII[lIIllIllll[208]]) ? 1 : 0) && lIIIIlIIIIlIl(tileObject5.getWorldLocation().distanceTo(new WorldPoint(lIIllIllll[209], lIIllIllll[210], lIIllIllll[3])), lIIllIllll[3])) {
                        ?? r0 = lIIllIllll[1];
                        "".length();
                        return (-((((174 + 104) - 205) + 108) ^ (((12 + 166) - 52) + 51))) > 0 ? ((44 ^ 60) ^ (105 ^ 108)) & (((138 ^ 188) ^ (168 ^ 139)) ^ (-" ".length())) : r0;
                    }
                    return lIIllIllll[0];
                });
                if (lIIIIlIIIIIII(nearest6)) {
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[187]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(lIIllIllII[lIIllIllll[188]]);
                    Time.sleepTicks(C0004e.c(lIIllIllll[1], lIIllIllll[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIIIlIIIIIIl(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = lIIllIllll[1];
                            "".length();
                            return (-"  ".length()) > 0 ? ((((221 + 12) - 144) + 145) ^ (((128 + 137) - 193) + 90)) & (((18 ^ 102) ^ (103 ^ 91)) ^ (-" ".length())) : r0;
                        }
                        return lIIllIllll[0];
                    }, lIIllIllll[104]);
                    "".length();
                    Time.sleepTicks(lIIllIllll[1]);
                    "".length();
                }
            }
        }
    }

    private static boolean lIIIIIlllllll(int i) {
        return i == 0;
    }

    private static boolean lIIIIIllllllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIIlIIIIlIl(int i, int i2) {
        return i <= i2;
    }

    private static String lIIIIIlIllIIl(String lllllllllllllllllllllIIlIlIlIlIl, String lllllllllllllllllllllIIlIlIlIlII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllllllIIlIlIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllllllllIIlIlIlIIlI = lllllllllllllllllllllIIlIlIlIlII.toCharArray();
        int lllllllllllllllllllllIIlIlIlIIIl = lIIllIllll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int lllllllllllllllllllllIIlIlIIlIIl = lIIllIllll[0];
        while (lIIIIIllllllI(lllllllllllllllllllllIIlIlIIlIIl, length)) {
            sb.append((char) (charArray[lllllllllllllllllllllIIlIlIIlIIl] ^ lllllllllllllllllllllIIlIlIlIIlI[lllllllllllllllllllllIIlIlIlIIIl % lllllllllllllllllllllIIlIlIlIIlI.length]));
            "".length();
            lllllllllllllllllllllIIlIlIlIIIl++;
            lllllllllllllllllllllIIlIlIIlIIl++;
            "".length();
            if (" ".length() >= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIIIlIIIIIll(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIIIlIIIIlII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIIIIlllllIl(int i) {
        return i != 0;
    }

    private static boolean lIIIIlIIIIIlI(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v215, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v259, types: [boolean] */
    public static void cp() {
        if (lIIIIIlllllIl(bt ? 1 : 0)) {
            AccBuilderRogues.c = lIIllIllII[lIIllIllll[0]];
            C0001b.a(bv);
            if (lIIIIIllllllI(bv.size(), lIIllIllll[1])) {
                System.out.println(lIIllIllII[lIIllIllll[1]]);
                bt = lIIllIllll[0];
            }
        }
        if (lIIIIIlllllll(bt ? 1 : 0) && lIIIIIllllllI(Skills.getLevel(Skill.AGILITY), lIIllIllll[2])) {
            if (lIIIIIlllllll(ab() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIIIlIIIIIII(nearest) && lIIIIIlllllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[3]];
                    if (lIIIIIlllllIl(new WorldArea(lIIllIllll[4], lIIllIllll[5], lIIllIllll[6], lIIllIllll[7], lIIllIllll[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint worldPoint = new WorldPoint(lIIllIllll[8], lIIllIllll[9], lIIllIllll[0]);
                        if (lIIIIlIIIIIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIllIllll[10])) {
                            Movement.walkTo(worldPoint);
                            "".length();
                            Time.sleepTicks(lIIllIllll[1]);
                            "".length();
                        }
                    }
                    C0000a.a(nearest);
                }
                if (lIIIIlIIIIIII(nearest) && lIIIIIlllllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[10]];
                    if (lIIIIIlllllll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIllIllll[11]);
                        "".length();
                    }
                    if (lIIIIIlllllIl(Bank.isOpen() ? 1 : 0)) {
                        if (lIIIIlIIIIIlI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIllIllll[1]);
                            "".length();
                        }
                        if (lIIIIlIIIIIlI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIllIllll[3]);
                            "".length();
                        }
                    }
                    int[] iArr = new int[lIIllIllll[12]];
                    iArr[lIIllIllll[0]] = lIIllIllll[13];
                    iArr[lIIllIllll[1]] = lIIllIllll[14];
                    iArr[lIIllIllll[3]] = lIIllIllll[15];
                    iArr[lIIllIllll[10]] = lIIllIllll[16];
                    iArr[lIIllIllll[17]] = lIIllIllll[18];
                    iArr[lIIllIllll[19]] = lIIllIllll[20];
                    iArr[lIIllIllll[21]] = lIIllIllll[22];
                    iArr[lIIllIllll[23]] = lIIllIllll[24];
                    iArr[lIIllIllll[25]] = lIIllIllll[26];
                    iArr[lIIllIllll[27]] = lIIllIllll[28];
                    if (lIIIIIlllllll(C0004e.b(iArr) ? 1 : 0)) {
                        af();
                        System.out.println(lIIllIllII[lIIllIllll[17]]);
                        bt = lIIllIllll[1];
                        return;
                    }
                    int[] iArr2 = new int[lIIllIllll[12]];
                    iArr2[lIIllIllll[0]] = lIIllIllll[13];
                    iArr2[lIIllIllll[1]] = lIIllIllll[14];
                    iArr2[lIIllIllll[3]] = lIIllIllll[15];
                    iArr2[lIIllIllll[10]] = lIIllIllll[16];
                    iArr2[lIIllIllll[17]] = lIIllIllll[18];
                    iArr2[lIIllIllll[19]] = lIIllIllll[20];
                    iArr2[lIIllIllll[21]] = lIIllIllll[22];
                    iArr2[lIIllIllll[23]] = lIIllIllll[24];
                    iArr2[lIIllIllll[25]] = lIIllIllll[26];
                    iArr2[lIIllIllll[27]] = lIIllIllll[28];
                    if (lIIIIIlllllIl(C0004e.b(iArr2) ? 1 : 0)) {
                        C0000a.a(lIIllIllll[29], lIIllIllll[1]);
                        C0000a.a(lIIllIllll[30], lIIllIllll[1]);
                        C0000a.a(lIIllIllll[31], lIIllIllll[1]);
                        C0000a.a(lIIllIllll[32], lIIllIllll[1]);
                        C0000a.a(lIIllIllll[33], lIIllIllll[1]);
                        C0000a.a(lIIllIllll[34], lIIllIllll[1]);
                        C0000a.a(lIIllIllll[35], lIIllIllll[1]);
                        int[] iArr3 = new int[lIIllIllll[1]];
                        iArr3[lIIllIllll[0]] = lIIllIllll[29];
                        if (lIIIIIlllllll(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIIllIllll[1]];
                            iArr4[lIIllIllll[0]] = lIIllIllll[29];
                            if (lIIIIIlllllll(Equipment.contains(iArr4) ? 1 : 0)) {
                                int[] iArr5 = new int[lIIllIllll[1]];
                                iArr5[lIIllIllll[0]] = lIIllIllll[29];
                                if (lIIIIIlllllll(Bank.contains(iArr5) ? 1 : 0)) {
                                    C0000a.a(lIIllIllll[36], lIIllIllll[1]);
                                }
                            }
                        }
                        C0000a.a(lIIllIllll[18], lIIllIllll[1]);
                        C0004e.l(lIIllIllll[29]);
                        C0004e.l(lIIllIllll[30]);
                        C0004e.l(lIIllIllll[31]);
                        C0004e.l(lIIllIllll[32]);
                        C0004e.l(lIIllIllll[33]);
                        Time.sleepTicks(lIIllIllll[1]);
                        "".length();
                        C0004e.l(lIIllIllll[35]);
                        C0004e.l(lIIllIllll[37]);
                        C0004e.l(lIIllIllll[34]);
                        C0004e.l(lIIllIllll[36]);
                        C0004e.l(lIIllIllll[18]);
                        Time.sleepTicks(lIIllIllll[10]);
                        "".length();
                        if (lIIIIIlllllll(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(lIIllIllll[21]);
                            "".length();
                        }
                        if (lIIIIIlllllIl(Bank.isOpen() ? 1 : 0)) {
                            if (lIIIIIllllllI(Skills.getLevel(Skill.AGILITY), lIIllIllll[38])) {
                                C0000a.a(lIIllIllll[13], lIIllIllll[12]);
                                C0000a.a(lIIllIllll[14], lIIllIllll[12]);
                                C0000a.a(lIIllIllll[22], lIIllIllll[12]);
                                C0000a.a(lIIllIllll[15], lIIllIllll[12]);
                                C0000a.b(C0005f.bf, lIIllIllll[1]);
                                C0000a.a(lIIllIllll[28], lIIllIllll[1]);
                                C0000a.a(lIIllIllll[20], lIIllIllll[19]);
                                C0000a.a(lIIllIllll[24], lIIllIllll[39]);
                            }
                            if (lIIIIlIIIIIll(Skills.getLevel(Skill.AGILITY), lIIllIllll[38])) {
                                C0000a.a(lIIllIllll[13], lIIllIllll[12]);
                                C0000a.a(lIIllIllll[22], lIIllIllll[12]);
                                C0000a.a(lIIllIllll[26], lIIllIllll[12]);
                                C0000a.b(C0005f.bf, lIIllIllll[1]);
                                C0000a.a(lIIllIllll[28], lIIllIllll[1]);
                                C0000a.a(lIIllIllll[20], lIIllIllll[25]);
                                C0000a.a(lIIllIllll[24], lIIllIllll[12]);
                            }
                        }
                    }
                }
            }
            if (lIIIIIlllllIl(ab() ? 1 : 0)) {
                String[] strArr = new String[lIIllIllll[1]];
                strArr[lIIllIllll[0]] = lIIllIllII[lIIllIllll[19]];
                if (lIIIIIlllllIl(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lIIllIllll[1]];
                    strArr2[lIIllIllll[0]] = lIIllIllII[lIIllIllll[21]];
                    Inventory.getFirst(strArr2).interact(lIIllIllII[lIIllIllll[23]]);
                }
                if (lIIIIIlllllIl(Inventory.contains(C0005f.aV) ? 1 : 0) && lIIIIIllllllI(Movement.getRunEnergy(), lIIllIllll[2])) {
                    Inventory.getFirst(C0005f.aV).interact(lIIllIllII[lIIllIllll[25]]);
                    Time.sleepTicks(lIIllIllll[1]);
                    "".length();
                }
                if (lIIIIlIIIIIIl(Combat.getMissingHealth(), lIIllIllll[40])) {
                    int[] iArr6 = new int[lIIllIllll[1]];
                    iArr6[lIIllIllll[0]] = lIIllIllll[24];
                    if (lIIIIIlllllIl(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lIIllIllll[1]];
                        iArr7[lIIllIllll[0]] = lIIllIllll[24];
                        Inventory.getFirst(iArr7).interact(lIIllIllII[lIIllIllll[27]]);
                        Time.sleepTicks(lIIllIllll[3]);
                        "".length();
                    }
                }
                if (lIIIIlIIIIIIl(Movement.getRunEnergy(), lIIllIllll[41]) && lIIIIIlllllll(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (lIIIIIllllllI(Skills.getLevel(Skill.AGILITY), lIIllIllll[42])) {
                    cq();
                }
                if ((!lIIIIlIIIIIll(C0004e.j(lIIllIllll[43]), lIIllIllll[44]) || lIIIIIllllllI(C0004e.j(lIIllIllll[45]), lIIllIllll[19])) && lIIIIlIIIIIll(Skills.getLevel(Skill.AGILITY), lIIllIllll[42]) && lIIIIIllllllI(Skills.getLevel(Skill.AGILITY), lIIllIllll[44])) {
                    cr();
                }
                if (lIIIIlIIIIIll(C0004e.j(lIIllIllll[43]), lIIllIllll[44]) && lIIIIlIIIIIll(C0004e.j(lIIllIllll[45]), lIIllIllll[19])) {
                    if (lIIIIlIIIIIll(Skills.getLevel(Skill.AGILITY), lIIllIllll[42]) && lIIIIIllllllI(Skills.getLevel(Skill.AGILITY), lIIllIllll[38])) {
                        cr();
                    }
                    if (lIIIIlIIIIIll(Skills.getLevel(Skill.AGILITY), lIIllIllll[38]) && lIIIIIllllllI(Skills.getLevel(Skill.AGILITY), lIIllIllll[44])) {
                        cs();
                    }
                }
                if (lIIIIlIIIIIll(Skills.getLevel(Skill.AGILITY), lIIllIllll[44])) {
                    ct();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean S() {
        return lIIllIllll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    private static boolean cu() {
        WorldArea worldArea = new WorldArea(lIIllIllll[80], lIIllIllll[81], lIIllIllll[69], lIIllIllll[64], lIIllIllll[0]);
        WorldArea worldArea2 = new WorldArea(lIIllIllll[82], lIIllIllll[81], lIIllIllll[12], lIIllIllll[64], lIIllIllll[10]);
        WorldArea worldArea3 = new WorldArea(lIIllIllll[83], lIIllIllll[84], lIIllIllll[63], lIIllIllll[49], lIIllIllll[10]);
        WorldArea worldArea4 = new WorldArea(lIIllIllll[189], lIIllIllll[190], lIIllIllll[25], lIIllIllll[19], lIIllIllll[1]);
        WorldArea worldArea5 = new WorldArea(lIIllIllll[85], lIIllIllll[87], lIIllIllll[12], lIIllIllll[25], lIIllIllll[10]);
        WorldArea worldArea6 = new WorldArea(lIIllIllll[191], lIIllIllll[192], lIIllIllll[73], lIIllIllll[39], lIIllIllll[10]);
        WorldArea worldArea7 = new WorldArea(lIIllIllll[90], lIIllIllll[91], lIIllIllll[66], lIIllIllll[64], lIIllIllll[10]);
        WorldArea worldArea8 = new WorldArea(lIIllIllll[92], lIIllIllll[93], lIIllIllll[23], lIIllIllll[27], lIIllIllll[10]);
        WorldArea worldArea9 = new WorldArea(lIIllIllll[92], lIIllIllll[94], lIIllIllll[12], lIIllIllll[23], lIIllIllll[10]);
        WorldArea worldArea10 = new WorldArea(lIIllIllll[127], lIIllIllll[128], lIIllIllll[49], lIIllIllll[12], lIIllIllll[3]);
        WorldArea worldArea11 = new WorldArea(lIIllIllll[129], lIIllIllll[127], lIIllIllll[49], lIIllIllll[25], lIIllIllll[3]);
        WorldArea worldArea12 = new WorldArea(lIIllIllll[130], lIIllIllll[131], lIIllIllll[63], lIIllIllll[49], lIIllIllll[3]);
        WorldArea worldArea13 = new WorldArea(lIIllIllll[132], lIIllIllll[133], lIIllIllll[12], lIIllIllll[64], lIIllIllll[10]);
        WorldArea worldArea14 = new WorldArea(lIIllIllll[134], lIIllIllll[9], lIIllIllll[49], lIIllIllll[27], lIIllIllll[3]);
        WorldArea worldArea15 = new WorldArea(lIIllIllll[135], lIIllIllll[136], lIIllIllll[68], lIIllIllll[53], lIIllIllll[10]);
        WorldArea worldArea16 = new WorldArea(lIIllIllll[137], lIIllIllll[138], lIIllIllll[63], lIIllIllll[64], lIIllIllll[3]);
        WorldArea worldArea17 = new WorldArea(lIIllIllll[164], lIIllIllll[133], lIIllIllll[64], lIIllIllll[12], lIIllIllll[10]);
        WorldArea worldArea18 = new WorldArea(lIIllIllll[165], lIIllIllll[139], lIIllIllll[39], lIIllIllll[53], lIIllIllll[3]);
        WorldArea worldArea19 = new WorldArea(lIIllIllll[166], lIIllIllll[134], lIIllIllll[49], lIIllIllll[27], lIIllIllll[3]);
        WorldArea worldArea20 = new WorldArea(lIIllIllll[167], lIIllIllll[136], lIIllIllll[70], lIIllIllll[64], lIIllIllll[10]);
        WorldArea worldArea21 = new WorldArea(lIIllIllll[168], lIIllIllll[169], lIIllIllll[54], lIIllIllll[63], lIIllIllll[3]);
        WorldArea[] worldAreaArr = new WorldArea[lIIllIllll[68]];
        worldAreaArr[lIIllIllll[0]] = worldArea;
        worldAreaArr[lIIllIllll[1]] = worldArea2;
        worldAreaArr[lIIllIllll[3]] = worldArea3;
        worldAreaArr[lIIllIllll[10]] = worldArea4;
        worldAreaArr[lIIllIllll[17]] = worldArea5;
        worldAreaArr[lIIllIllll[19]] = worldArea6;
        worldAreaArr[lIIllIllll[21]] = worldArea7;
        worldAreaArr[lIIllIllll[23]] = worldArea8;
        worldAreaArr[lIIllIllll[25]] = worldArea9;
        worldAreaArr[lIIllIllll[27]] = worldArea10;
        worldAreaArr[lIIllIllll[12]] = worldArea11;
        worldAreaArr[lIIllIllll[49]] = worldArea12;
        worldAreaArr[lIIllIllll[63]] = worldArea13;
        worldAreaArr[lIIllIllll[64]] = worldArea14;
        worldAreaArr[lIIllIllll[53]] = worldArea15;
        worldAreaArr[lIIllIllll[39]] = worldArea16;
        worldAreaArr[lIIllIllll[65]] = worldArea17;
        worldAreaArr[lIIllIllll[66]] = worldArea18;
        worldAreaArr[lIIllIllll[54]] = worldArea19;
        worldAreaArr[lIIllIllll[67]] = worldArea20;
        worldAreaArr[lIIllIllll[40]] = worldArea21;
        int[] iArr = new int[lIIllIllll[1]];
        iArr[lIIllIllll[0]] = lIIllIllll[193];
        if (lIIIIlIIIIIII(TileItems.getNearest(iArr))) {
            System.out.println(lIIllIllII[lIIllIllll[194]]);
            int lllllllllllllllllllllIIllIllIlll = lIIllIllll[0];
            while (lIIIIIllllllI(lllllllllllllllllllllIIllIllIlll, worldAreaArr.length)) {
                WorldArea worldArea22 = worldAreaArr[lllllllllllllllllllllIIllIllIlll];
                int[] iArr2 = new int[lIIllIllll[1]];
                iArr2[lIIllIllll[0]] = lIIllIllll[193];
                if (lIIIIIlllllIl(worldArea22.contains(TileItems.getNearest(iArr2).getWorldLocation()) ? 1 : 0) && lIIIIIlllllIl(worldAreaArr[lllllllllllllllllllllIIllIllIlll].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return lIIllIllll[1];
                }
                lllllllllllllllllllllIIllIllIlll++;
                "".length();
                if ("   ".length() == ((163 ^ 194) & ((46 ^ 79) ^ (-1)))) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
        }
        return lIIllIllll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean V() {
        if (lIIIIlIIIIIll(Skills.getLevel(Skill.AGILITY), lIIllIllll[2])) {
            ?? r0 = lIIllIllll[1];
            "".length();
            return "  ".length() < (-" ".length()) ? ((188 ^ 194) ^ (105 ^ 24)) & (((((29 + 20) - 13) + 106) ^ (((66 + 113) - 51) + 1)) ^ (-" ".length())) : r0;
        }
        return lIIllIllll[0];
    }

    private static void cr() {
        WorldArea worldArea = new WorldArea(lIIllIllll[76], lIIllIllll[77], lIIllIllll[78], lIIllIllll[79], lIIllIllll[1]);
        WorldArea worldArea2 = new WorldArea(lIIllIllll[76], lIIllIllll[77], lIIllIllll[78], lIIllIllll[79], lIIllIllll[3]);
        WorldArea worldArea3 = new WorldArea(lIIllIllll[76], lIIllIllll[77], lIIllIllll[78], lIIllIllll[79], lIIllIllll[10]);
        WorldArea worldArea4 = new WorldArea(lIIllIllll[80], lIIllIllll[81], lIIllIllll[69], lIIllIllll[64], lIIllIllll[0]);
        WorldArea worldArea5 = new WorldArea(lIIllIllll[82], lIIllIllll[81], lIIllIllll[12], lIIllIllll[64], lIIllIllll[10]);
        WorldArea worldArea6 = new WorldArea(lIIllIllll[83], lIIllIllll[84], lIIllIllll[63], lIIllIllll[49], lIIllIllll[10]);
        WorldArea worldArea7 = new WorldArea(lIIllIllll[85], lIIllIllll[86], lIIllIllll[27], lIIllIllll[23], lIIllIllll[1]);
        WorldArea worldArea8 = new WorldArea(lIIllIllll[85], lIIllIllll[87], lIIllIllll[12], lIIllIllll[25], lIIllIllll[10]);
        WorldArea worldArea9 = new WorldArea(lIIllIllll[88], lIIllIllll[89], lIIllIllll[75], lIIllIllll[40], lIIllIllll[10]);
        WorldArea worldArea10 = new WorldArea(lIIllIllll[90], lIIllIllll[91], lIIllIllll[66], lIIllIllll[64], lIIllIllll[10]);
        WorldArea worldArea11 = new WorldArea(lIIllIllll[92], lIIllIllll[93], lIIllIllll[23], lIIllIllll[27], lIIllIllll[10]);
        WorldArea worldArea12 = new WorldArea(lIIllIllll[92], lIIllIllll[94], lIIllIllll[12], lIIllIllll[23], lIIllIllll[10]);
        if (lIIIIIlllllll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIIlllllll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIIlllllll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIIlllllll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIllIllII[lIIllIllll[95]];
            if (lIIIIIlllllIl(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (lIIIIIlllllIl(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(new WorldPoint(lIIllIllll[96], lIIllIllll[52], lIIllIllll[0]));
            "".length();
            Time.sleepTicks(lIIllIllll[1]);
            "".length();
        }
        if (lIIIIlIIIIlII(Players.getLocal().getAnimation(), lIIllIllll[62]) && lIIIIIlllllll(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] strArr = new String[lIIllIllll[1]];
            strArr[lIIllIllll[0]] = lIIllIllII[lIIllIllll[97]];
            TileItem nearest = TileItems.getNearest(strArr);
            if (lIIIIlIIIIIII(nearest) && lIIIIIlllllIl(cu() ? 1 : 0)) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[98]];
                System.out.println(lIIllIllII[lIIllIllll[99]]);
                nearest.interact(lIIllIllII[lIIllIllll[100]]);
                Time.sleepTicks(lIIllIllll[10]);
                "".length();
            }
            if (lIIIIIlllllll(cu() ? 1 : 0)) {
                if (lIIIIIlllllIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIIlllllll(cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[101]];
                    int experience = Skills.getExperience(Skill.AGILITY);
                    String[] strArr2 = new String[lIIllIllll[1]];
                    strArr2[lIIllIllll[0]] = lIIllIllII[lIIllIllll[102]];
                    TileObjects.getNearest(strArr2).interact(lIIllIllII[lIIllIllll[103]]);
                    Time.sleepUntil(() -> {
                        if (lIIIIlIIIIIIl(Skills.getExperience(Skill.AGILITY), experience)) {
                            ?? r0 = lIIllIllll[1];
                            "".length();
                            return 0 != 0 ? ((((173 + 1) - 13) + 91) ^ (((187 + 1) - 58) + 60)) & (((0 ^ 84) ^ (142 ^ 152)) ^ (-" ".length())) : r0;
                        }
                        return lIIllIllll[0];
                    }, lIIllIllll[104]);
                    "".length();
                    Time.sleepTicks(lIIllIllll[1]);
                    "".length();
                }
                if (lIIIIIlllllIl(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIIlllllll(cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[38]];
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr3 = new String[lIIllIllll[1]];
                    strArr3[lIIllIllll[0]] = lIIllIllII[lIIllIllll[105]];
                    TileObjects.getNearest(strArr3).interact(lIIllIllII[lIIllIllll[106]]);
                    Time.sleepUntil(() -> {
                        if (lIIIIlIIIIIIl(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = lIIllIllll[1];
                            "".length();
                            return ((241 ^ 188) ^ (13 ^ 68)) <= (-" ".length()) ? ((37 ^ 121) ^ (2 ^ 112)) & (((((95 + 129) - 177) + 117) ^ (((84 + 107) - 169) + 116)) ^ (-" ".length())) : r0;
                        }
                        return lIIllIllll[0];
                    }, lIIllIllll[104]);
                    "".length();
                    Time.sleepTicks(lIIllIllll[1]);
                    "".length();
                }
                if (lIIIIIlllllIl(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIIlllllll(cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[107]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr4 = new String[lIIllIllll[1]];
                    strArr4[lIIllIllll[0]] = lIIllIllII[lIIllIllll[108]];
                    TileObjects.getNearest(strArr4).interact(lIIllIllII[lIIllIllll[109]]);
                    Time.sleepUntil(() -> {
                        if (lIIIIlIIIIIIl(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = lIIllIllll[1];
                            "".length();
                            return " ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIllIllll[0];
                    }, lIIllIllll[104]);
                    "".length();
                    Time.sleepTicks(lIIllIllll[1]);
                    "".length();
                }
                if (lIIIIIlllllIl(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIIlllllll(cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[110]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr5 = new String[lIIllIllll[1]];
                    strArr5[lIIllIllll[0]] = lIIllIllII[lIIllIllll[111]];
                    TileObjects.getNearest(strArr5).interact(lIIllIllII[lIIllIllll[112]]);
                    Time.sleepUntil(() -> {
                        if (lIIIIlIIIIIIl(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = lIIllIllll[1];
                            "".length();
                            return "   ".length() <= 0 ? ((213 ^ 129) ^ (252 ^ 187)) & (((((143 + 111) - 102) + 16) ^ (((7 + 90) - (-74)) + 16)) ^ (-" ".length())) & ((((130 ^ 136) ^ (187 ^ 191)) & (((((30 + 66) - (-21)) + 49) ^ (((108 + 37) - 67) + 90)) ^ (-" ".length()))) ^ (-" ".length())) : r0;
                        }
                        return lIIllIllll[0];
                    }, lIIllIllll[104]);
                    "".length();
                    Time.sleepTicks(lIIllIllll[1]);
                    "".length();
                }
                if (lIIIIIlllllIl(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIIlllllll(cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[113]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr6 = new String[lIIllIllll[1]];
                    strArr6[lIIllIllll[0]] = lIIllIllII[lIIllIllll[2]];
                    TileObjects.getNearest(strArr6).interact(lIIllIllII[lIIllIllll[7]]);
                    Time.sleepUntil(() -> {
                        if (lIIIIlIIIIIIl(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = lIIllIllll[1];
                            "".length();
                            return (((((170 + 75) - 79) + 6) ^ (((16 + 28) - 37) + 134)) & (((16 ^ 2) ^ (179 ^ 128)) ^ (-" ".length()))) != (((((196 + 29) - 222) + 231) ^ (((162 + 20) - 68) + 60)) & (((88 ^ 111) ^ (111 ^ 28)) ^ (-" ".length()))) ? ((((104 + 86) - 180) + 117) ^ (249 ^ 176)) & (((((154 + 100) - 97) + 24) ^ (((123 + 95) - 137) + 50)) ^ (-" ".length())) : r0;
                        }
                        return lIIllIllll[0];
                    }, lIIllIllll[104]);
                    "".length();
                    Time.sleepTicks(lIIllIllll[1]);
                    "".length();
                }
                if (lIIIIIlllllIl(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIIlllllll(cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[114]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr = new int[lIIllIllll[1]];
                    iArr[lIIllIllll[0]] = lIIllIllll[115];
                    TileObjects.getNearest(iArr).interact(lIIllIllII[lIIllIllll[116]]);
                    Time.sleepUntil(() -> {
                        if (lIIIIlIIIIIIl(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = lIIllIllll[1];
                            "".length();
                            return "  ".length() < "  ".length() ? ((((77 + 89) - 95) + 88) ^ (((124 + 137) - 144) + 53)) & (((209 ^ 149) ^ (59 ^ 74)) ^ (-" ".length())) : r0;
                        }
                        return lIIllIllll[0];
                    }, lIIllIllll[104]);
                    "".length();
                    Time.sleepTicks(lIIllIllll[1]);
                    "".length();
                }
                if (lIIIIIlllllIl(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIIlllllll(cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[117]];
                    int experience7 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr2 = new int[lIIllIllll[1]];
                    iArr2[lIIllIllll[0]] = lIIllIllll[118];
                    TileObjects.getNearest(iArr2).interact(lIIllIllII[lIIllIllll[119]]);
                    Time.sleepUntil(() -> {
                        if (lIIIIlIIIIIIl(Skills.getExperience(Skill.AGILITY), experience7)) {
                            ?? r0 = lIIllIllll[1];
                            "".length();
                            return (("   ".length() ^ (108 ^ 88)) & (((230 ^ 160) ^ (193 ^ 176)) ^ (-" ".length()))) >= " ".length() ? ((((134 + 118) - 150) + 53) ^ (((65 + 72) - 31) + 26)) & (((133 ^ 143) ^ (36 ^ 49)) ^ (-" ".length())) : r0;
                        }
                        return lIIllIllll[0];
                    }, lIIllIllll[104]);
                    "".length();
                    Time.sleepTicks(lIIllIllll[1]);
                    "".length();
                }
                if (lIIIIIlllllIl(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIIlllllll(cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[120]];
                    int experience8 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr3 = new int[lIIllIllll[1]];
                    iArr3[lIIllIllll[0]] = lIIllIllll[121];
                    TileObjects.getNearest(iArr3).interact(lIIllIllII[lIIllIllll[122]]);
                    Time.sleepUntil(() -> {
                        if (lIIIIlIIIIIIl(Skills.getExperience(Skill.AGILITY), experience8)) {
                            ?? r0 = lIIllIllll[1];
                            "".length();
                            return (-" ".length()) > (((((79 + 87) - 134) + 192) ^ (((167 + 106) - 166) + 64)) & (((((220 + 44) - 105) + 87) ^ (((146 + 100) - 186) + 129)) ^ (-" ".length()))) ? ("   ".length() ^ (254 ^ 168)) & (((122 ^ 43) ^ (166 ^ 162)) ^ (-" ".length())) : r0;
                        }
                        return lIIllIllll[0];
                    }, lIIllIllll[104]);
                    "".length();
                    Time.sleepTicks(lIIllIllll[1]);
                    "".length();
                }
                if (lIIIIIlllllIl(worldArea12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIIlllllll(cu() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[123]];
                    int experience9 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr7 = new String[lIIllIllll[1]];
                    strArr7[lIIllIllll[0]] = lIIllIllII[lIIllIllll[124]];
                    TileObjects.getNearest(strArr7).interact(lIIllIllII[lIIllIllll[44]]);
                    Time.sleepUntil(() -> {
                        if (lIIIIlIIIIIIl(Skills.getExperience(Skill.AGILITY), experience9)) {
                            ?? r0 = lIIllIllll[1];
                            "".length();
                            return (((37 ^ 23) ^ (160 ^ 182)) & (((5 ^ 61) ^ (138 ^ 150)) ^ (-" ".length()))) == " ".length() ? ((((175 + 99) - 196) + 101) ^ (((50 + 137) - 46) + 33)) & (((((103 + 158) - 115) + 14) ^ (((34 + 15) - (-15)) + 125)) ^ (-" ".length())) & ((((((110 + 146) - 110) + 50) ^ (((60 + 118) - 155) + 105)) & (((39 ^ 20) ^ (224 ^ 151)) ^ (-" ".length()))) ^ (-" ".length())) : r0;
                        }
                        return lIIllIllll[0];
                    }, lIIllIllll[104]);
                    "".length();
                    Time.sleepTicks(lIIllIllll[1]);
                    "".length();
                }
            }
        }
    }

    private static void lIIIIIlllllII() {
        lIIllIllll = new int[239];
        lIIllIllll[0] = ((1 ^ 48) ^ (83 ^ 41)) & (((28 ^ 122) ^ (163 ^ 142)) ^ (-" ".length()));
        lIIllIllll[1] = " ".length();
        lIIllIllll[2] = (91 ^ 115) ^ (190 ^ 164);
        lIIllIllll[3] = "  ".length();
        lIIllIllll[4] = (-((-10503) & 14703)) & (-1) & 7663;
        lIIllIllll[5] = (-20521) & 23981;
        lIIllIllll[6] = (103 ^ 91) ^ "  ".length();
        lIIllIllll[7] = (148 ^ 146) ^ (133 ^ 176);
        lIIllIllll[8] = (-((-8131) & 16323)) & (-20549) & 32252;
        lIIllIllll[9] = (-28677) & 32156;
        lIIllIllll[10] = "   ".length();
        lIIllIllll[11] = (-27751) & 32750;
        lIIllIllll[12] = 130 ^ 136;
        lIIllIllll[13] = (-8369) & 16375;
        lIIllIllll[14] = (-8228) & 16235;
        lIIllIllll[15] = (-((-11587) & 28147)) & (-8193) & 32761;
        lIIllIllll[16] = (-4115) & 7967;
        lIIllIllll[17] = (((113 + 98) - 38) + 8) ^ (((6 + 136) - 42) + 77);
        lIIllIllll[18] = (-16643) & 28622;
        lIIllIllll[19] = (223 ^ 195) ^ (168 ^ 177);
        lIIllIllll[20] = (-17547) & 30171;
        lIIllIllll[21] = (((4 + 124) - 75) + 119) ^ (((141 + 91) - 64) + 2);
        lIIllIllll[22] = (-24754) & 32763;
        lIIllIllll[23] = 75 ^ 76;
        lIIllIllll[24] = (-((-2305) & 15743)) & (-18433) & 32255;
        lIIllIllll[25] = (249 ^ 129) ^ (13 ^ 125);
        lIIllIllll[26] = (-((-18627) & 31695)) & (-65) & 32751;
        lIIllIllll[27] = 145 ^ 152;
        lIIllIllll[28] = (-1057) & 22202;
        lIIllIllll[29] = (-16396) & 28255;
        lIIllIllll[30] = (-4520) & 16375;
        lIIllIllll[31] = (-((-2753) & 23537)) & (-1) & 32638;
        lIIllIllll[32] = (-((-325) & 20823)) & (-417) & 32766;
        lIIllIllll[33] = (-(7 ^ 38)) & (-394) & 12283;
        lIIllIllll[34] = (-4258) & 16107;
        lIIllIllll[35] = (-4395) & 16362;
        lIIllIllll[36] = 208 ^ 136;
        lIIllIllll[37] = (-((-20809) & 29165)) & (-4177) & 32767;
        lIIllIllll[38] = (((49 + 13) - 25) + 111) ^ (((80 + 20) - 6) + 94);
        lIIllIllll[39] = 85 ^ 90;
        lIIllIllll[40] = (12 ^ 38) ^ (112 ^ 78);
        lIIllIllll[41] = (155 ^ 191) ^ (87 ^ 106);
        lIIllIllll[42] = 160 ^ 190;
        lIIllIllll[43] = (-((-902) & 24535)) & (-641) & 24575;
        lIIllIllll[44] = (184 ^ 183) ^ (143 ^ 188);
        lIIllIllll[45] = (-((-2371) & 23495)) & (-1033) & 22463;
        lIIllIllll[46] = (-((-413) & 14237)) & (-16409) & 32701;
        lIIllIllll[47] = (-24721) & 28155;
        lIIllIllll[48] = (-((-6241) & 14968)) & (-20617) & 32767;
        lIIllIllll[49] = 71 ^ 76;
        lIIllIllll[50] = (-28833) & 32253;
        lIIllIllll[51] = (-25171) & 27635;
        lIIllIllll[52] = (-((-7491) & 24547)) & (-4097) & 24567;
        lIIllIllll[53] = 76 ^ 66;
        lIIllIllll[54] = (76 ^ 0) ^ (215 ^ 137);
        lIIllIllll[55] = (-((-59) & 30331)) & (-13) & 32767;
        lIIllIllll[56] = (-((-1874) & 30579)) & (-643) & 32763;
        lIIllIllll[57] = (-((-20083) & 28287)) & (-577) & 11262;
        lIIllIllll[58] = (-((-8473) & 25401)) & (-4229) & 24573;
        lIIllIllll[59] = (-(240 ^ 177)) & (-29187) & 31731;
        lIIllIllll[60] = (-13) & 3439;
        lIIllIllll[61] = 16 ^ 6;
        lIIllIllll[62] = -" ".length();
        lIIllIllll[63] = (141 ^ 146) ^ (64 ^ 83);
        lIIllIllll[64] = 180 ^ 185;
        lIIllIllll[65] = 96 ^ 112;
        lIIllIllll[66] = 156 ^ 141;
        lIIllIllll[67] = 182 ^ 165;
        lIIllIllll[68] = 107 ^ 126;
        lIIllIllll[69] = (((12 + 78) - 48) + 99) ^ (((54 + 40) - (-43)) + 17);
        lIIllIllll[70] = 72 ^ 80;
        lIIllIllll[71] = (237 ^ 186) ^ (249 ^ 180);
        lIIllIllll[72] = (124 ^ 35) ^ (193 ^ 133);
        lIIllIllll[73] = 120 ^ 100;
        lIIllIllll[74] = (43 ^ 31) ^ (144 ^ 185);
        lIIllIllll[75] = 63 ^ 32;
        lIIllIllll[76] = (-16929) & 20095;
        lIIllIllll[77] = (-((-27651) & 32483)) & (-24577) & 32758;
        lIIllIllll[78] = ((5 + 35) - (-24)) + 73;
        lIIllIllll[79] = 0 ^ 94;
        lIIllIllll[80] = (-17221) & 20439;
        lIIllIllll[81] = (-8845) & 12253;
        lIIllIllll[82] = (-((-21805) & 22399)) & (-24577) & 28382;
        lIIllIllll[83] = (-29058) & 32255;
        lIIllIllll[84] = (-((-3089) & 32306)) & (-131) & 32759;
        lIIllIllll[85] = (-13065) & 16254;
        lIIllIllll[86] = (-4137) & 7549;
        lIIllIllll[87] = (-8355) & 11755;
        lIIllIllll[88] = (-4353) & 7531;
        lIIllIllll[89] = (-((-901) & 13262)) & (-17025) & 32767;
        lIIllIllll[90] = (-25421) & 28637;
        lIIllIllll[91] = (-((-269) & 21438)) & (-3) & 24563;
        lIIllIllll[92] = (-((-17461) & 30077)) & (-16406) & 32255;
        lIIllIllll[93] = (-12950) & 16351;
        lIIllIllll[94] = (-(((51 + 46) - 48) + 117)) & (-20481) & 24055;
        lIIllIllll[95] = (((44 + 16) - (-31)) + 67) ^ (((110 + 173) - 182) + 89);
        lIIllIllll[96] = (-((-12457) & 29677)) & (-8193) & 28636;
        lIIllIllll[97] = (((14 + 96) - (-25)) + 22) ^ (((32 + 1) - (-1)) + 154);
        lIIllIllll[98] = (((203 + 210) - 244) + 56) ^ (((190 + 88) - 104) + 21);
        lIIllIllll[99] = (((215 + 26) - 20) + 4) ^ (((88 + 100) - 176) + 182);
        lIIllIllll[100] = (((19 + 110) - 72) + 123) ^ (((46 + 67) - 48) + 79);
        lIIllIllll[101] = 32 ^ 5;
        lIIllIllll[102] = 144 ^ 182;
        lIIllIllll[103] = 160 ^ 135;
        lIIllIllll[104] = (-((-5124) & 22223)) & (-1025) & 26623;
        lIIllIllll[105] = 51 ^ 26;
        lIIllIllll[106] = (68 ^ 38) ^ (83 ^ 27);
        lIIllIllll[107] = 164 ^ 143;
        lIIllIllll[108] = 187 ^ 151;
        lIIllIllll[109] = 43 ^ 6;
        lIIllIllll[110] = 238 ^ 192;
        lIIllIllll[111] = (190 ^ 166) ^ (61 ^ 10);
        lIIllIllll[112] = (((8 + 59) - 62) + 140) ^ (((64 + 12) - 73) + 158);
        lIIllIllll[113] = (31 ^ 34) ^ (44 ^ 32);
        lIIllIllll[114] = (201 ^ 199) ^ (6 ^ 60);
        lIIllIllll[115] = (-17929) & 32762;
        lIIllIllll[116] = 75 ^ 126;
        lIIllIllll[117] = (((64 + 16) - 35) + 91) ^ (((83 + 82) - 66) + 91);
        lIIllIllll[118] = (-1033) & 15867;
        lIIllIllll[119] = 27 ^ 44;
        lIIllIllll[120] = 68 ^ 124;
        lIIllIllll[121] = (-((-1494) & 17879)) & (-521) & 31741;
        lIIllIllll[122] = 129 ^ 184;
        lIIllIllll[123] = (100 ^ 36) ^ (39 ^ 93);
        lIIllIllll[124] = 190 ^ 133;
        lIIllIllll[125] = (-8225) & 11695;
        lIIllIllll[126] = (-((-3459) & 24535)) & (-33) & 24574;
        lIIllIllll[127] = (-((-3113) & 32378)) & (-1) & 32767;
        lIIllIllll[128] = (-25173) & 28662;
        lIIllIllll[129] = (-(198 ^ 143)) & (-29201) & 32767;
        lIIllIllll[130] = (-((-18715) & 31583)) & (-16417) & 32767;
        lIIllIllll[131] = (-((-7361) & 31957)) & (-1) & 28093;
        lIIllIllll[132] = (-21092) & 24563;
        lIIllIllll[133] = (-21079) & 24567;
        lIIllIllll[134] = (-((-3857) & 8025)) & (-33) & 7675;
        lIIllIllll[135] = (-25123) & 28607;
        lIIllIllll[136] = (-((-14477) & 31405)) & (-1) & 20395;
        lIIllIllll[137] = (-((-3205) & 28365)) & (-2) & 28667;
        lIIllIllll[138] = (-20997) & 24469;
        lIIllIllll[139] = (-((-3105) & 7777)) & (-1) & 8158;
        lIIllIllll[140] = (33 ^ 57) ^ (81 ^ 116);
        lIIllIllll[141] = (209 ^ 183) ^ (56 ^ 97);
        lIIllIllll[142] = 194 ^ 130;
        lIIllIllll[143] = (175 ^ 132) ^ (192 ^ 170);
        lIIllIllll[144] = (((127 + 110) - 211) + 175) ^ (((89 + 34) - 71) + 87);
        lIIllIllll[145] = 13 ^ 78;
        lIIllIllll[146] = (78 ^ 115) ^ (108 ^ 21);
        lIIllIllll[147] = 66 ^ 7;
        lIIllIllll[148] = 79 ^ 9;
        lIIllIllll[149] = 50 ^ 117;
        lIIllIllll[150] = 240 ^ 184;
        lIIllIllll[151] = 246 ^ 191;
        lIIllIllll[152] = 36 ^ 110;
        lIIllIllll[153] = 83 ^ 24;
        lIIllIllll[154] = 223 ^ 147;
        lIIllIllll[155] = (34 ^ 13) ^ (69 ^ 39);
        lIIllIllll[156] = 85 ^ 27;
        lIIllIllll[157] = (106 ^ 65) ^ (247 ^ 147);
        lIIllIllll[158] = 209 ^ 129;
        lIIllIllll[159] = 43 ^ 122;
        lIIllIllll[160] = (89 ^ 20) ^ (176 ^ 175);
        lIIllIllll[161] = 232 ^ 187;
        lIIllIllll[162] = (-((-2283) & 31211)) & (-1025) & 32639;
        lIIllIllll[163] = (-20609) & 24062;
        lIIllIllll[164] = (-4161) & 6879;
        lIIllIllll[165] = (-((-8533) & 25941)) & (-12401) & 32509;
        lIIllIllll[166] = (-16385) & 19091;
        lIIllIllll[167] = (-((-393) & 20987)) & (-9473) & 32763;
        lIIllIllll[168] = (-4176) & 6863;
        lIIllIllll[169] = (-4213) & 7669;
        lIIllIllll[170] = (-((-3905) & 24407)) & (-1281) & 24511;
        lIIllIllll[171] = (-(13 ^ 95)) & (-4623) & 8191;
        lIIllIllll[172] = 65 ^ 21;
        lIIllIllll[173] = 60 ^ 105;
        lIIllIllll[174] = (4 ^ 119) ^ (92 ^ 121);
        lIIllIllll[175] = 61 ^ 106;
        lIIllIllll[176] = 203 ^ 146;
        lIIllIllll[177] = (223 ^ 146) ^ (132 ^ 147);
        lIIllIllll[178] = (233 ^ 137) ^ (186 ^ 129);
        lIIllIllll[179] = 10 ^ 86;
        lIIllIllll[180] = 250 ^ 167;
        lIIllIllll[181] = 72 ^ 23;
        lIIllIllll[182] = 103 ^ 7;
        lIIllIllll[183] = 89 ^ 56;
        lIIllIllll[184] = (((184 + 169) - 240) + 104) ^ (((152 + 53) - 82) + 64);
        lIIllIllll[185] = 15 ^ 108;
        lIIllIllll[186] = 109 ^ 9;
        lIIllIllll[187] = (((109 + 155) - 189) + 176) ^ (((29 + 151) - 86) + 64);
        lIIllIllll[188] = 230 ^ 128;
        lIIllIllll[189] = (-513) & 3703;
        lIIllIllll[190] = (-12321) & 15734;
        lIIllIllll[191] = (-((-2606) & 7103)) & (-16897) & 24575;
        lIIllIllll[192] = (-((-5137) & 30421)) & (-1) & 28671;
        lIIllIllll[193] = (-((-3363) & 7479)) & (-385) & 16349;
        lIIllIllll[194] = 28 ^ 123;
        lIIllIllll[195] = (-((-4461) & 15343)) & (-2) & 16383;
        lIIllIllll[196] = (-1538) & 26537;
        lIIllIllll[197] = (-7276) & 8175;
        lIIllIllll[198] = (-((-4999) & 30607)) & (-2) & 26559;
        lIIllIllll[199] = (-((-5270) & 31927)) & (-1) & 28607;
        lIIllIllll[200] = (-((-1131) & 1387)) & (-20481) & 29686;
        lIIllIllll[201] = (-((-1034) & 21551)) & (-273) & 32767;
        lIIllIllll[202] = (-4609) & 30558;
        lIIllIllll[203] = (89 ^ 64) ^ (123 ^ 10);
        lIIllIllll[204] = 105 ^ 0;
        lIIllIllll[205] = 208 ^ 186;
        lIIllIllll[206] = (63 ^ 42) ^ (127 ^ 1);
        lIIllIllll[207] = (2 ^ 49) ^ (105 ^ 54);
        lIIllIllll[208] = 85 ^ 56;
        lIIllIllll[209] = (-25713) & 28415;
        lIIllIllll[210] = (-((-18409) & 22509)) & (-25153) & 32717;
        lIIllIllll[211] = (103 ^ 5) ^ (138 ^ 134);
        lIIllIllll[212] = (-((-20621) & 28863)) & (-16897) & 28607;
        lIIllIllll[213] = 5 ^ 106;
        lIIllIllll[214] = (-12353) & 15063;
        lIIllIllll[215] = (-8202) & 11677;
        lIIllIllll[216] = 182 ^ 198;
        lIIllIllll[217] = (-((-609) & 14186)) & (-16385) & 32671;
        lIIllIllll[218] = 60 ^ 77;
        lIIllIllll[219] = (-((-3749) & 28671)) & (-4101) & 31743;
        lIIllIllll[220] = (-12313) & 15805;
        lIIllIllll[221] = 204 ^ 190;
        lIIllIllll[222] = (-((-15377) & 31825)) & (-8706) & 28663;
        lIIllIllll[223] = (-((-11017) & 31498)) & (-97) & 24061;
        lIIllIllll[224] = (((32 + 67) - (-141)) + 2) ^ (((70 + 57) - 112) + 114);
        lIIllIllll[225] = (-((-5441) & 30017)) & (-577) & 28655;
        lIIllIllll[226] = 176 ^ 196;
        lIIllIllll[227] = 89 ^ 44;
        lIIllIllll[228] = (-4201) & 7678;
        lIIllIllll[229] = (-((-17699) & 22398)) & (-24577) & 32767;
        lIIllIllll[230] = (((96 + 31) - (-87)) + 29) ^ (((131 + 57) - 170) + 115);
        lIIllIllll[231] = (-12309) & 15807;
        lIIllIllll[232] = 79 ^ 56;
        lIIllIllll[233] = 100 ^ 28;
        lIIllIllll[234] = (-12367) & 15871;
        lIIllIllll[235] = (-((-2049) & 24073)) & (-8212) & 32703;
        lIIllIllll[236] = (-((-2073) & 32282)) & (-65) & 32747;
        lIIllIllll[237] = (-((-16389) & 29335)) & (-1) & 16383;
        lIIllIllll[238] = 53 ^ 76;
    }

    private static void cs() {
        WorldArea worldArea = new WorldArea(lIIllIllll[125], lIIllIllll[126], lIIllIllll[112], lIIllIllll[107], lIIllIllll[0]);
        WorldArea worldArea2 = new WorldArea(lIIllIllll[125], lIIllIllll[126], lIIllIllll[112], lIIllIllll[107], lIIllIllll[1]);
        WorldArea worldArea3 = new WorldArea(lIIllIllll[125], lIIllIllll[126], lIIllIllll[112], lIIllIllll[107], lIIllIllll[3]);
        WorldArea worldArea4 = new WorldArea(lIIllIllll[125], lIIllIllll[126], lIIllIllll[112], lIIllIllll[107], lIIllIllll[10]);
        WorldArea worldArea5 = new WorldArea(lIIllIllll[127], lIIllIllll[128], lIIllIllll[49], lIIllIllll[12], lIIllIllll[3]);
        WorldArea worldArea6 = new WorldArea(lIIllIllll[129], lIIllIllll[127], lIIllIllll[49], lIIllIllll[25], lIIllIllll[3]);
        WorldArea worldArea7 = new WorldArea(lIIllIllll[130], lIIllIllll[131], lIIllIllll[63], lIIllIllll[49], lIIllIllll[3]);
        WorldArea worldArea8 = new WorldArea(lIIllIllll[132], lIIllIllll[133], lIIllIllll[12], lIIllIllll[64], lIIllIllll[10]);
        WorldArea worldArea9 = new WorldArea(lIIllIllll[134], lIIllIllll[9], lIIllIllll[49], lIIllIllll[27], lIIllIllll[3]);
        WorldArea worldArea10 = new WorldArea(lIIllIllll[135], lIIllIllll[136], lIIllIllll[68], lIIllIllll[53], lIIllIllll[10]);
        WorldArea worldArea11 = new WorldArea(lIIllIllll[137], lIIllIllll[138], lIIllIllll[63], lIIllIllll[64], lIIllIllll[3]);
        WorldPoint worldPoint = new WorldPoint(lIIllIllll[137], lIIllIllll[139], lIIllIllll[0]);
        if (lIIIIIlllllIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIIIIIlllllll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIIlllllll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIIlllllll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIIlllllll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIllIllII[lIIllIllll[140]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lIIllIllll[1]);
            "".length();
        }
        if (lIIIIIlllllIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIIIIlIIIIIIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIllIllll[21])) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[6]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(lIIllIllll[1]);
                "".length();
            }
            if (lIIIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIllIllll[21])) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[141]];
                int experience = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[lIIllIllll[1]];
                strArr[lIIllIllll[0]] = lIIllIllII[lIIllIllll[142]];
                TileObjects.getNearest(strArr).interact(lIIllIllII[lIIllIllll[143]]);
                Time.sleepTicks(C0004e.c(lIIllIllll[1], lIIllIllll[3]));
                "".length();
                Time.sleepUntil(() -> {
                    if (lIIIIlIIIIIIl(Skills.getExperience(Skill.AGILITY), experience)) {
                        ?? r0 = lIIllIllll[1];
                        "".length();
                        return (((62 ^ 7) ^ (17 ^ 109)) & ((" ".length() ^ (9 ^ 77)) ^ (-" ".length()))) > ((237 ^ 175) ^ (60 ^ 122)) ? ((82 ^ 95) ^ (2 ^ 85)) & (((93 ^ 88) ^ (126 ^ 33)) ^ (-" ".length())) : r0;
                    }
                    return lIIllIllll[0];
                }, lIIllIllll[104]);
                "".length();
                Time.sleepTicks(lIIllIllll[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[lIIllIllll[1]];
        strArr2[lIIllIllll[0]] = lIIllIllII[lIIllIllll[144]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (lIIIIlIIIIIII(nearest) && lIIIIIlllllIl(cu() ? 1 : 0)) {
            AccBuilderRogues.c = lIIllIllII[lIIllIllll[145]];
            System.out.println(lIIllIllII[lIIllIllll[146]]);
            nearest.interact(lIIllIllII[lIIllIllll[147]]);
            Time.sleepTicks(lIIllIllll[10]);
            "".length();
        }
        if (lIIIIIlllllll(cu() ? 1 : 0)) {
            if (lIIIIIlllllIl(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (lIIIIIlllllIl(tileObject.getName().contains(lIIllIllII[lIIllIllll[233]]) ? 1 : 0) && lIIIIlIIIIlIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIllIllll[234], lIIllIllll[131], lIIllIllll[3])), lIIllIllll[3])) {
                        ?? r0 = lIIllIllll[1];
                        "".length();
                        return 0 != 0 ? ((171 ^ 155) ^ (113 ^ 78)) & (((((108 + 5) - 10) + 58) ^ (((131 + 139) - 190) + 94)) ^ (-" ".length())) : r0;
                    }
                    return lIIllIllll[0];
                });
                if (lIIIIlIIIIIII(nearest2)) {
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[148]];
                    nearest2.interact(lIIllIllII[lIIllIllll[149]]);
                    Time.sleepTicks(C0004e.c(lIIllIllll[1], lIIllIllll[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIIIlIIIIIIl(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = lIIllIllll[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIllIllll[0];
                    }, lIIllIllll[104]);
                    "".length();
                    Time.sleepTicks(lIIllIllll[1]);
                    "".length();
                }
            }
            if (lIIIIIlllllIl(cu() ? 1 : 0)) {
                return;
            }
            if (lIIIIIlllllIl(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (lIIIIIlllllIl(tileObject2.getName().contains(lIIllIllII[lIIllIllll[232]]) ? 1 : 0) && lIIIIlIIIIlIl(tileObject2.getWorldLocation().distanceTo(new WorldPoint(lIIllIllll[131], lIIllIllll[225], lIIllIllll[3])), lIIllIllll[3])) {
                        ?? r0 = lIIllIllll[1];
                        "".length();
                        return " ".length() != " ".length() ? ((94 ^ 59) ^ (115 ^ 87)) & (((((64 + 159) - 137) + 159) ^ (((149 + 13) - 140) + 158)) ^ (-" ".length())) : r0;
                    }
                    return lIIllIllll[0];
                });
                if (lIIIIlIIIIIII(nearest3)) {
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[150]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(lIIllIllII[lIIllIllll[151]]);
                    Time.sleepTicks(C0004e.c(lIIllIllll[1], lIIllIllll[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIIIlIIIIIIl(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = lIIllIllll[1];
                            "".length();
                            return ((((68 + 72) - 73) + 60) ^ (113 ^ 10)) != ((61 ^ 113) ^ (212 ^ 156)) ? ((((155 + 22) - 42) + 22) ^ (((57 + 51) - (-50)) + 30)) & (((116 ^ 91) ^ (175 ^ 161)) ^ (-" ".length())) : r0;
                        }
                        return lIIllIllll[0];
                    }, lIIllIllll[104]);
                    "".length();
                    Time.sleepTicks(lIIllIllll[1]);
                    "".length();
                }
            }
            if (lIIIIIlllllIl(cu() ? 1 : 0)) {
                return;
            }
            if (lIIIIIlllllIl(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (lIIIIIlllllIl(tileObject3.getName().contains(lIIllIllII[lIIllIllll[230]]) ? 1 : 0) && lIIIIlIIIIlIl(tileObject3.getWorldLocation().distanceTo(new WorldPoint(lIIllIllll[139], lIIllIllll[231], lIIllIllll[3])), lIIllIllll[3])) {
                        ?? r0 = lIIllIllll[1];
                        "".length();
                        return 0 != 0 ? ((63 ^ 13) ^ (23 ^ 5)) & (((246 ^ 196) ^ (148 ^ 134)) ^ (-" ".length())) : r0;
                    }
                    return lIIllIllll[0];
                });
                if (lIIIIlIIIIIII(nearest4)) {
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[152]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(lIIllIllII[lIIllIllll[153]]);
                    Time.sleepTicks(C0004e.c(lIIllIllll[1], lIIllIllll[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIIIlIIIIIIl(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = lIIllIllll[1];
                            "".length();
                            return "   ".length() <= 0 ? "   ".length() & ("   ".length() ^ (-1)) : r0;
                        }
                        return lIIllIllll[0];
                    }, lIIllIllll[104]);
                    "".length();
                    Time.sleepTicks(lIIllIllll[1]);
                    "".length();
                }
            }
            if (lIIIIIlllllIl(cu() ? 1 : 0)) {
                return;
            }
            if (lIIIIIlllllIl(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (lIIIIIlllllIl(tileObject4.getName().contains(lIIllIllII[lIIllIllll[227]]) ? 1 : 0) && lIIIIlIIIIlIl(tileObject4.getWorldLocation().distanceTo(new WorldPoint(lIIllIllll[228], lIIllIllll[229], lIIllIllll[10])), lIIllIllll[3])) {
                        ?? r0 = lIIllIllll[1];
                        "".length();
                        return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIllIllll[0];
                });
                if (lIIIIlIIIIIII(nearest5)) {
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[154]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(lIIllIllII[lIIllIllll[155]]);
                    Time.sleepTicks(C0004e.c(lIIllIllll[1], lIIllIllll[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIIIlIIIIIIl(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = lIIllIllll[1];
                            "".length();
                            return "  ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIllIllll[0];
                    }, lIIllIllll[104]);
                    "".length();
                    Time.sleepTicks(lIIllIllll[1]);
                    "".length();
                }
            }
            if (lIIIIIlllllIl(cu() ? 1 : 0)) {
                return;
            }
            if (lIIIIIlllllIl(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (lIIIIIlllllIl(tileObject5.getName().contains(lIIllIllII[lIIllIllll[226]]) ? 1 : 0) && lIIIIlIIIIlIl(tileObject5.getWorldLocation().distanceTo(new WorldPoint(lIIllIllll[9], lIIllIllll[130], lIIllIllll[3])), lIIllIllll[3])) {
                        ?? r0 = lIIllIllll[1];
                        "".length();
                        return "  ".length() <= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIllIllll[0];
                });
                if (lIIIIlIIIIIII(nearest6)) {
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[156]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(lIIllIllII[lIIllIllll[157]]);
                    Time.sleepTicks(C0004e.c(lIIllIllll[1], lIIllIllll[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIIIlIIIIIIl(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = lIIllIllll[1];
                            "".length();
                            return "   ".length() <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIllIllll[0];
                    }, lIIllIllll[104]);
                    "".length();
                    Time.sleepTicks(lIIllIllll[1]);
                    "".length();
                }
            }
            if (lIIIIIlllllIl(cu() ? 1 : 0)) {
                return;
            }
            if (lIIIIIlllllIl(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest7 = TileObjects.getNearest(tileObject6 -> {
                    if (lIIIIIlllllIl(tileObject6.getName().contains(lIIllIllII[lIIllIllll[224]]) ? 1 : 0) && lIIIIlIIIIlIl(tileObject6.getWorldLocation().distanceTo(new WorldPoint(lIIllIllll[225], lIIllIllll[215], lIIllIllll[10])), lIIllIllll[3])) {
                        ?? r0 = lIIllIllll[1];
                        "".length();
                        return (150 ^ 146) <= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIllIllll[0];
                });
                if (lIIIIlIIIIIII(nearest7)) {
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[158]];
                    int experience7 = Skills.getExperience(Skill.AGILITY);
                    nearest7.interact(lIIllIllII[lIIllIllll[159]]);
                    Time.sleepTicks(C0004e.c(lIIllIllll[1], lIIllIllll[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIIIlIIIIIIl(Skills.getExperience(Skill.AGILITY), experience7)) {
                            ?? r0 = lIIllIllll[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIllIllll[0];
                    }, lIIllIllll[104]);
                    "".length();
                    Time.sleepTicks(lIIllIllll[1]);
                    "".length();
                }
            }
            if (!lIIIIIlllllIl(cu() ? 1 : 0) && lIIIIIlllllIl(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest8 = TileObjects.getNearest(tileObject7 -> {
                    if (lIIIIIlllllIl(tileObject7.getName().contains(lIIllIllII[lIIllIllll[221]]) ? 1 : 0) && lIIIIlIIIIlIl(tileObject7.getWorldLocation().distanceTo(new WorldPoint(lIIllIllll[222], lIIllIllll[223], lIIllIllll[3])), lIIllIllll[3])) {
                        ?? r0 = lIIllIllll[1];
                        "".length();
                        return 0 != 0 ? ((103 ^ 122) ^ (57 ^ 19)) & (((230 ^ 175) ^ (205 ^ 179)) ^ (-" ".length())) : r0;
                    }
                    return lIIllIllll[0];
                });
                if (lIIIIlIIIIIII(nearest8)) {
                    AccBuilderRogues.c = lIIllIllII[lIIllIllll[160]];
                    int experience8 = Skills.getExperience(Skill.AGILITY);
                    nearest8.interact(lIIllIllII[lIIllIllll[161]]);
                    Time.sleepTicks(C0004e.c(lIIllIllll[1], lIIllIllll[3]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (lIIIIlIIIIIIl(Skills.getExperience(Skill.AGILITY), experience8)) {
                            ?? r0 = lIIllIllll[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIllIllll[0];
                    }, lIIllIllll[104]);
                    "".length();
                    Time.sleepTicks(lIIllIllll[1]);
                    "".length();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private static boolean ab() {
        if (lIIIIlIIIIIll(Skills.getBoostedLevel(Skill.AGILITY), lIIllIllll[38])) {
            int[] iArr = new int[lIIllIllll[1]];
            iArr[lIIllIllll[0]] = lIIllIllll[13];
            if (lIIIIIlllllIl(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIllIllll[1]];
                iArr2[lIIllIllll[0]] = lIIllIllll[26];
                if (lIIIIIlllllIl(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIIllIllll[1]];
                    iArr3[lIIllIllll[0]] = lIIllIllll[24];
                    if (lIIIIIlllllIl(Inventory.contains(iArr3) ? 1 : 0) && ((!lIIIIIlllllll(Inventory.contains(item -> {
                        return item.getName().contains(lIIllIllII[lIIllIllll[207]]);
                    }) ? 1 : 0) || lIIIIIlllllIl(Equipment.contains(item2 -> {
                        return item2.getName().contains(lIIllIllII[lIIllIllll[206]]);
                    }) ? 1 : 0)) && (!lIIIIIlllllll(Inventory.contains(C0005f.bf) ? 1 : 0) || lIIIIIlllllIl(Equipment.contains(C0005f.bf) ? 1 : 0)))) {
                        ?? r0 = lIIllIllll[1];
                        "".length();
                        return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
            }
            return lIIllIllll[0];
        }
        int[] iArr4 = new int[lIIllIllll[1]];
        iArr4[lIIllIllll[0]] = lIIllIllll[13];
        if (lIIIIIlllllIl(Inventory.contains(iArr4) ? 1 : 0)) {
            int[] iArr5 = new int[lIIllIllll[1]];
            iArr5[lIIllIllll[0]] = lIIllIllll[15];
            if (lIIIIIlllllIl(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lIIllIllll[1]];
                iArr6[lIIllIllll[0]] = lIIllIllll[14];
                if (lIIIIIlllllIl(Inventory.contains(iArr6) ? 1 : 0) && ((!lIIIIIlllllll(Inventory.contains(item3 -> {
                    return item3.getName().contains(lIIllIllII[lIIllIllll[205]]);
                }) ? 1 : 0) || lIIIIIlllllIl(Equipment.contains(item4 -> {
                    return item4.getName().contains(lIIllIllII[lIIllIllll[204]]);
                }) ? 1 : 0)) && (!lIIIIIlllllll(Inventory.contains(C0005f.bf) ? 1 : 0) || lIIIIIlllllIl(Equipment.contains(C0005f.bf) ? 1 : 0)))) {
                    ?? r02 = lIIllIllll[1];
                    "".length();
                    return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
                }
            }
        }
        return lIIllIllll[0];
    }

    private static String lIIIIIlIllIII(String lllllllllllllllllllllIIlIllIIlIl, String lllllllllllllllllllllIIlIllIIlII) {
        try {
            SecretKeySpec lllllllllllllllllllllIIlIllIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllIIlIllIIlII.getBytes(StandardCharsets.UTF_8)), lIIllIllll[25]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllIllll[3], lllllllllllllllllllllIIlIllIlIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllIIlIllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllllIIlIllIIllI) {
            lllllllllllllllllllllIIlIllIIllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0252, code lost:
        if (lIIIIIllllllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.J.lIIllIllll[12]) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x02da, code lost:
        if (lIIIIIllllllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.J.lIIllIllll[12]) != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void af() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4 = new int[lIIllIllll[1]];
        iArr4[lIIllIllll[0]] = lIIllIllll[16];
        if (lIIIIIlllllll(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIIllIllll[16], lIIllIllll[1], lIIllIllll[195]));
            "".length();
        }
        int[] iArr5 = new int[lIIllIllll[1]];
        iArr5[lIIllIllll[0]] = lIIllIllll[18];
        if (lIIIIIlllllll(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(lIIllIllll[18], lIIllIllll[3], lIIllIllll[196]));
            "".length();
        }
        int[] iArr6 = new int[lIIllIllll[1]];
        iArr6[lIIllIllll[0]] = lIIllIllll[28];
        if (lIIIIIlllllll(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0003d(lIIllIllll[28], lIIllIllll[3], lIIllIllll[196]));
            "".length();
        }
        int[] iArr7 = new int[lIIllIllll[1]];
        iArr7[lIIllIllll[0]] = lIIllIllll[13];
        if (lIIIIIlllllll(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0003d(lIIllIllll[13], lIIllIllll[12], lIIllIllll[197]));
            "".length();
        }
        int[] iArr8 = new int[lIIllIllll[1]];
        iArr8[lIIllIllll[0]] = lIIllIllll[22];
        if (lIIIIIlllllll(Bank.contains(iArr8) ? 1 : 0)) {
            bv.add(new C0003d(lIIllIllll[22], lIIllIllll[12], lIIllIllll[198]));
            "".length();
        }
        int[] iArr9 = new int[lIIllIllll[1]];
        iArr9[lIIllIllll[0]] = lIIllIllll[15];
        if (lIIIIIlllllll(Bank.contains(iArr9) ? 1 : 0)) {
            bv.add(new C0003d(lIIllIllll[15], lIIllIllll[12], lIIllIllll[198]));
            "".length();
        }
        int[] iArr10 = new int[lIIllIllll[1]];
        iArr10[lIIllIllll[0]] = lIIllIllll[14];
        if (lIIIIIlllllll(Bank.contains(iArr10) ? 1 : 0)) {
            bv.add(new C0003d(lIIllIllll[14], lIIllIllll[12], lIIllIllll[198]));
            "".length();
        }
        int[] iArr11 = new int[lIIllIllll[1]];
        iArr11[lIIllIllll[0]] = lIIllIllll[24];
        if (lIIIIIlllllIl(Bank.contains(iArr11) ? 1 : 0)) {
            int[] iArr12 = new int[lIIllIllll[1]];
            iArr12[lIIllIllll[0]] = lIIllIllll[24];
            if (lIIIIIlllllIl(Bank.contains(iArr12) ? 1 : 0)) {
                int[] iArr13 = new int[lIIllIllll[1]];
                iArr13[lIIllIllll[0]] = lIIllIllll[24];
            }
            iArr = new int[lIIllIllll[1]];
            iArr[lIIllIllll[0]] = lIIllIllll[26];
            if (lIIIIIlllllIl(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr14 = new int[lIIllIllll[1]];
                iArr14[lIIllIllll[0]] = lIIllIllll[26];
                if (lIIIIIlllllIl(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[lIIllIllll[1]];
                    iArr15[lIIllIllll[0]] = lIIllIllll[26];
                }
                iArr2 = new int[lIIllIllll[1]];
                iArr2[lIIllIllll[0]] = lIIllIllll[201];
                if (lIIIIIlllllll(Bank.contains(iArr2) ? 1 : 0)) {
                    bv.add(new C0003d(lIIllIllll[201], lIIllIllll[1], lIIllIllll[202]));
                    "".length();
                }
                iArr3 = new int[lIIllIllll[1]];
                iArr3[lIIllIllll[0]] = lIIllIllll[20];
                if (lIIIIIlllllll(Bank.contains(iArr3) ? 1 : 0)) {
                    bv.add(new C0003d(lIIllIllll[20], lIIllIllll[40], C0008i.bq));
                    "".length();
                    return;
                }
                return;
            }
            bv.add(new C0003d(lIIllIllll[26], lIIllIllll[12], lIIllIllll[200]));
            "".length();
            iArr2 = new int[lIIllIllll[1]];
            iArr2[lIIllIllll[0]] = lIIllIllll[201];
            if (lIIIIIlllllll(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[lIIllIllll[1]];
            iArr3[lIIllIllll[0]] = lIIllIllll[20];
            if (lIIIIIlllllll(Bank.contains(iArr3) ? 1 : 0)) {
            }
        }
        bv.add(new C0003d(ix, lIIllIllll[44], lIIllIllll[199]));
        "".length();
        iArr = new int[lIIllIllll[1]];
        iArr[lIIllIllll[0]] = lIIllIllll[26];
        if (lIIIIIlllllIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIllIllll[26], lIIllIllll[12], lIIllIllll[200]));
        "".length();
        iArr2 = new int[lIIllIllll[1]];
        iArr2[lIIllIllll[0]] = lIIllIllll[201];
        if (lIIIIIlllllll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lIIllIllll[1]];
        iArr3[lIIllIllll[0]] = lIIllIllll[20];
        if (lIIIIIlllllll(Bank.contains(iArr3) ? 1 : 0)) {
        }
    }

    private static boolean lIIIIlIIIIIIl(int i, int i2) {
        return i > i2;
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public String U() {
        return lIIllIllII[lIIllIllll[203]];
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public int T() {
        try {
            cp();
            "".length();
            if ("   ".length() <= " ".length()) {
                return (65 ^ 1) & ((226 ^ 162) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIllIllll[186];
    }

    private static void cq() {
        new WorldArea(lIIllIllll[46], lIIllIllll[47], lIIllIllll[12], lIIllIllll[21], lIIllIllll[0]);
        WorldArea worldArea = new WorldArea(lIIllIllll[46], lIIllIllll[48], lIIllIllll[49], lIIllIllll[25], lIIllIllll[0]);
        WorldArea worldArea2 = new WorldArea(lIIllIllll[46], lIIllIllll[50], lIIllIllll[49], lIIllIllll[25], lIIllIllll[1]);
        WorldArea worldArea3 = new WorldArea(lIIllIllll[51], lIIllIllll[52], lIIllIllll[53], lIIllIllll[54], lIIllIllll[3]);
        WorldArea worldArea4 = new WorldArea(lIIllIllll[55], lIIllIllll[56], lIIllIllll[25], lIIllIllll[12], lIIllIllll[3]);
        WorldArea worldArea5 = new WorldArea(lIIllIllll[57], lIIllIllll[58], lIIllIllll[49], lIIllIllll[12], lIIllIllll[0]);
        WorldArea worldArea6 = new WorldArea(lIIllIllll[59], lIIllIllll[60], lIIllIllll[12], lIIllIllll[21], lIIllIllll[0]);
        WorldArea worldArea7 = new WorldArea(lIIllIllll[46], lIIllIllll[47], lIIllIllll[61], lIIllIllll[21], lIIllIllll[0]);
        if (lIIIIIlllllll(iz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIIlllllll(iA.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIIlllllll(iB.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIllIllII[lIIllIllll[12]];
            C0004e.b(iC);
            Time.sleepTicks(lIIllIllll[1]);
            "".length();
        }
        if (!(lIIIIIlllllll(iz.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIIIlllllll(iA.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !lIIIIIlllllIl(iB.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && lIIIIlIIIIlII(Players.getLocal().getAnimation(), lIIllIllll[62]) && lIIIIIlllllll(Players.getLocal().isMoving() ? 1 : 0)) {
            if (lIIIIIlllllIl(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[49]];
                String[] strArr = new String[lIIllIllll[1]];
                strArr[lIIllIllll[0]] = lIIllIllII[lIIllIllll[63]];
                TileObjects.getNearest(strArr).interact(lIIllIllII[lIIllIllll[64]]);
                Time.sleepTicks(lIIllIllll[3]);
                "".length();
            }
            if (lIIIIIlllllIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[53]];
                String[] strArr2 = new String[lIIllIllll[1]];
                strArr2[lIIllIllll[0]] = lIIllIllII[lIIllIllll[39]];
                TileObjects.getNearest(strArr2).interact(lIIllIllII[lIIllIllll[65]]);
                Time.sleepTicks(lIIllIllll[3]);
                "".length();
            }
            if (lIIIIIlllllIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[66]];
                String[] strArr3 = new String[lIIllIllll[1]];
                strArr3[lIIllIllll[0]] = lIIllIllII[lIIllIllll[54]];
                TileObjects.getNearest(strArr3).interact(lIIllIllII[lIIllIllll[67]]);
                Time.sleepTicks(lIIllIllll[3]);
                "".length();
            }
            if (lIIIIIlllllIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[40]];
                String[] strArr4 = new String[lIIllIllll[1]];
                strArr4[lIIllIllll[0]] = lIIllIllII[lIIllIllll[68]];
                TileObjects.getNearest(strArr4).interact(lIIllIllII[lIIllIllll[61]]);
                Time.sleepTicks(lIIllIllll[19]);
                "".length();
            }
            if (lIIIIIlllllIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[69]];
                String[] strArr5 = new String[lIIllIllll[1]];
                strArr5[lIIllIllll[0]] = lIIllIllII[lIIllIllll[70]];
                TileObjects.getNearest(strArr5).interact(lIIllIllII[lIIllIllll[41]]);
                Time.sleepTicks(lIIllIllll[17]);
                "".length();
            }
            if (lIIIIIlllllIl(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[71]];
                String[] strArr6 = new String[lIIllIllll[1]];
                strArr6[lIIllIllll[0]] = lIIllIllII[lIIllIllll[72]];
                TileObjects.getNearest(strArr6).interact(lIIllIllII[lIIllIllll[73]]);
                Time.sleepTicks(lIIllIllll[10]);
                "".length();
            }
            if (lIIIIIlllllIl(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIllIllII[lIIllIllll[74]];
                String[] strArr7 = new String[lIIllIllll[1]];
                strArr7[lIIllIllll[0]] = lIIllIllII[lIIllIllll[42]];
                TileObjects.getNearest(strArr7).interact(lIIllIllII[lIIllIllll[75]]);
                Time.sleepTicks(lIIllIllll[17]);
                "".length();
            }
        }
    }

    private static boolean lIIIIlIIIIIII(Object obj) {
        return obj != null;
    }

    static {
        lIIIIIlllllII();
        lIIIIIlIllllI();
        bv = new ArrayList();
        iw = lIIllIllll[28];
        ix = lIIllIllll[24];
        iz = new WorldArea(lIIllIllll[235], lIIllIllll[52], lIIllIllll[69], lIIllIllll[72], lIIllIllll[0]);
        iA = new WorldArea(lIIllIllll[235], lIIllIllll[52], lIIllIllll[69], lIIllIllll[72], lIIllIllll[1]);
        iB = new WorldArea(lIIllIllll[235], lIIllIllll[52], lIIllIllll[69], lIIllIllll[72], lIIllIllll[3]);
        iC = new WorldPoint(lIIllIllll[236], lIIllIllll[237], lIIllIllll[0]);
    }
}
