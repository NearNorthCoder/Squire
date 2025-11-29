/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.k;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating food", priority=30000)
public class ae
extends Task {
    private final /* synthetic */ SquireChambersPlugin cH;
    private static /* synthetic */ String[] lIlIIIIIIlIl;
    private static /* synthetic */ int[] lIlIIIIIIllI;
    /* synthetic */ boolean cE;
    /* synthetic */ int cD;
    private final /* synthetic */ k cG;

    private static String llIlIIllllIllI(String lllllllllllllllIlllIIlIIllllllll, String lllllllllllllllIlllIIlIIlllllllI) {
        try {
            SecretKeySpec lllllllllllllllIlllIIlIlIIIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlIIlllllllI.getBytes(StandardCharsets.UTF_8)), lIlIIIIIIllI[10]), "DES");
            Cipher lllllllllllllllIlllIIlIlIIIIIIIl = Cipher.getInstance("DES");
            lllllllllllllllIlllIIlIlIIIIIIIl.init(lIlIIIIIIllI[7], lllllllllllllllIlllIIlIlIIIIIIlI);
            return new String(lllllllllllllllIlllIIlIlIIIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlIIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIlIlIIIIIIII) {
            lllllllllllllllIlllIIlIlIIIIIIII.printStackTrace();
            return null;
        }
    }

    private boolean ct() {
        if (ae.llIlIIllllllll(u.be() ? 1 : 0)) {
            return lIlIIIIIIllI[0];
        }
        Player lllllllllllllllIlllIIlIlIIlIIIll = Players.getLocal();
        if (!ae.llIlIIlllllllI(u.bg(), lIlIIIIIIllI[4]) || ae.llIlIIlllllIlI(lllllllllllllllIlllIIlIlIIlIIIll.getPlane())) {
            return lIlIIIIIIllI[0];
        }
        TileObject lllllllllllllllIlllIIlIlIIlIIIlI = TileObjects.getNearest(tileObject -> {
            int n2;
            if (ae.llIlIIlllllIlI(tileObject.getName().contains(lIlIIIIIIlIl[lIlIIIIIIllI[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIIIIllI[2]];
                stringArray[ae.lIlIIIIIIllI[0]] = lIlIIIIIIlIl[lIlIIIIIIllI[4]];
                if (ae.llIlIIlllllIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIIIIIllI[2];
                    "".length();
                    if (("  ".length() & ~"  ".length()) != -" ".length()) return n2 != 0;
                    return ((0x68 ^ 0x76) & ~(0x18 ^ 6)) != 0;
                }
            }
            n2 = lIlIIIIIIllI[0];
            return n2 != 0;
        });
        if (ae.llIlIlIIIIIIII(lllllllllllllllIlllIIlIlIIlIIIlI)) {
            return lIlIIIIIIllI[0];
        }
        if (ae.llIlIlIIIIIIIl(lllllllllllllllIlllIIlIlIIlIIIll.getWorldY(), lllllllllllllllIlllIIlIlIIlIIIlI.getWorldY())) {
            return lIlIIIIIIllI[0];
        }
        return lIlIIIIIIllI[2];
    }

    private static boolean llIlIIllllllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIlIIllllIlll() {
        lIlIIIIIIlIl = new String[lIlIIIIIIllI[14]];
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[0]] = ae.llIlIIllllIlII("NT8gDB0=", "qMIbv");
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[2]] = ae.llIlIIllllIlIl("cEKhvso+FQI=", "fbUKN");
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[7]] = ae.llIlIIllllIlII("FA0aJQ==", "BliDM");
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[1]] = ae.llIlIIllllIlIl("FZDS7L+AcwVWcMmOpvPCkp/umsmikDN3", "iUGsn");
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[4]] = ae.llIlIIllllIllI("EUWrxjwAluDqMupEHOuAmg==", "dbYtB");
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[3]] = ae.llIlIIllllIlII("KSYgHytaITUJLRUhNQ==", "zSPzY");
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[8]] = ae.llIlIIllllIlIl("HuRH4QMOEdRmwq3YRBLL6w==", "tZNLj");
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[9]] = ae.llIlIIllllIlIl("I6A8bMC47JQ=", "wCyLe");
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[10]] = ae.llIlIIllllIlIl("ncSqJxj9TUnr0T9Sw2Cnog==", "TAFFA");
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[11]] = ae.llIlIIllllIlII("HgAhGz4=", "ZrHuU");
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[12]] = ae.llIlIIllllIlII("KxYxCwVUAGMDDxc=", "ssCbf");
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[13]] = ae.llIlIIllllIlII("Mj4rHww=", "vLBqg");
    }

    private static String llIlIIllllIlIl(String lllllllllllllllIlllIIlIlIIIIllII, String lllllllllllllllIlllIIlIlIIIIlIll) {
        try {
            SecretKeySpec lllllllllllllllIlllIIlIlIIIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlIlIIIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIIlIlIIIIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIIlIlIIIIlllI.init(lIlIIIIIIllI[7], lllllllllllllllIlllIIlIlIIIIllll);
            return new String(lllllllllllllllIlllIIlIlIIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlIlIIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIlIlIIIIllIl) {
            lllllllllllllllIlllIIlIlIIIIllIl.printStackTrace();
            return null;
        }
    }

    protected boolean cx() {
        boolean bl2;
        if (ae.llIlIIlllllllI(Skills.getBoostedLevel((Skill)Skill.ATTACK) + lIlIIIIIIllI[3], Skills.getLevel((Skill)Skill.ATTACK))) {
            bl2 = lIlIIIIIIllI[2];
            "".length();
            if ((0x67 ^ 0x63) < -" ".length()) {
                return (" ".length() & ~" ".length()) != 0;
            }
        } else {
            bl2 = lIlIIIIIIllI[0];
        }
        return bl2;
    }

    private static boolean llIlIlIIIIIIII(Object object) {
        return object == null;
    }

    private static boolean llIlIlIIIIIIll(Object object, Object object2) {
        return object == object2;
    }

    private static void llIlIIlllllIII() {
        lIlIIIIIIllI = new int[15];
        ae.lIlIIIIIIllI[0] = (55 + 24 - 29 + 140 ^ 128 + 84 - 182 + 124) & (2 + 35 - -49 + 90 ^ 133 + 38 - 95 + 72 ^ -" ".length());
        ae.lIlIIIIIIllI[1] = "   ".length();
        ae.lIlIIIIIIllI[2] = " ".length();
        ae.lIlIIIIIIllI[3] = 121 + 8 - 103 + 102 ^ 2 + 89 - -24 + 18;
        ae.lIlIIIIIIllI[4] = 0x10 ^ 0x14;
        ae.lIlIIIIIIllI[5] = 77 + 95 - 76 + 145 ^ 113 + 181 - 174 + 75;
        ae.lIlIIIIIIllI[6] = 0x57 ^ 0x43;
        ae.lIlIIIIIIllI[7] = "  ".length();
        ae.lIlIIIIIIllI[8] = 0x9F ^ 0x99;
        ae.lIlIIIIIIllI[9] = 0xE6 ^ 0xB8 ^ (0xFB ^ 0xA2);
        ae.lIlIIIIIIllI[10] = 133 + 134 - 137 + 8 ^ 24 + 52 - -30 + 24;
        ae.lIlIIIIIIllI[11] = 0x2C ^ 0x25;
        ae.lIlIIIIIIllI[12] = 0x68 ^ 0x62;
        ae.lIlIIIIIIllI[13] = 16 + 86 - 101 + 145 ^ 140 + 151 - 146 + 8;
        ae.lIlIIIIIIllI[14] = 0x5A ^ 0x56;
    }

    private static boolean llIlIIlllllIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIIllllllll(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIlIIIIIIlI(Object object) {
        return object != null;
    }

    private static boolean llIlIIllllllII(int n2) {
        return n2 < 0;
    }

    private static boolean llIlIIlllllIll(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void lllllllllllllllIlllIIlIlIIlIlllI;
        ae lllllllllllllllIlllIIlIlIIlIllll;
        int n2 = this.cA();
        if (ae.llIlIIlllllIlI(this.ct() ? 1 : 0) && ae.llIlIIlllllIlI(this.cx() ? 1 : 0) && ae.llIlIIlllllIll(Combat.getCurrentHealth(), n2) && ae.llIlIIllllllII(ae.llIlIIlllllIIl(Combat.getHealthPercent(), 95.0)) && ae.llIlIIllllllIl(this.cG.aJ(), lIlIIIIIIllI[1]) && ae.llIlIIlllllIll(this.cG.aK(), lIlIIIIIIllI[2])) {
            this.cy();
            "".length();
            return lIlIIIIIIllI[2];
        }
        if (ae.llIlIIlllllIlI(lllllllllllllllIlllIIlIlIIlIllll.cx() ? 1 : 0) && ae.llIlIIlllllllI(lllllllllllllllIlllIIlIlIIlIllll.cD, lIlIIIIIIllI[1])) {
            lllllllllllllllIlllIIlIlIIlIllll.cE = lIlIIIIIIllI[0];
        }
        if (ae.llIlIIllllllIl(Combat.getCurrentHealth(), (int)lllllllllllllllIlllIIlIlIIlIlllI)) {
            if (ae.llIlIIllllllll(lllllllllllllllIlllIIlIlIIlIllll.cE ? 1 : 0)) {
                lllllllllllllllIlllIIlIlIIlIllll.cD = lIlIIIIIIllI[0];
            }
            lllllllllllllllIlllIIlIlIIlIllll.cE = lIlIIIIIIllI[2];
        }
        if (ae.llIlIIllllllll(lllllllllllllllIlllIIlIlIIlIllll.cE ? 1 : 0)) {
            return lIlIIIIIIllI[0];
        }
        if (ae.llIlIIllllllIl(lllllllllllllllIlllIIlIlIIlIllll.cD, lIlIIIIIIllI[1])) {
            lllllllllllllllIlllIIlIlIIlIllll.cy();
            "".length();
            lllllllllllllllIlllIIlIlIIlIllll.cD += lIlIIIIIIllI[2];
            return lIlIIIIIIllI[2];
        }
        this.cz();
        "".length();
        return lIlIIIIIIllI[2];
    }

    private static boolean llIlIIlllllllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIlIlIIIIIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        ae.llIlIIlllllIII();
        ae.llIlIIllllIlll();
    }

    protected boolean cy() {
        Item lllllllllllllllIlllIIlIlIIlIlIlI;
        Item item2 = Inventory.getFirst(item -> {
            int n2;
            if (ae.llIlIIlllllIlI(item.getName().startsWith(lIlIIIIIIlIl[lIlIIIIIIllI[12]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIIIIllI[2]];
                stringArray[ae.lIlIIIIIIllI[0]] = lIlIIIIIIlIl[lIlIIIIIIllI[13]];
                if (ae.llIlIIlllllIlI(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIIIIIllI[2];
                    "".length();
                    if (((0x85 ^ 0xAD) & ~(0x26 ^ 0xE)) > -" ".length()) return n2 != 0;
                    return ((2 ^ 0x2A) & ~(1 ^ 0x29)) != 0;
                }
            }
            n2 = lIlIIIIIIllI[0];
            return n2 != 0;
        });
        if (ae.llIlIlIIIIIIII(item2)) {
            lllllllllllllllIlllIIlIlIIlIlIlI = Inventory.getFirst(item -> {
                int n2;
                if (ae.llIlIIlllllIlI(item.getName().startsWith(lIlIIIIIIlIl[lIlIIIIIIllI[10]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIlIIIIIIllI[2]];
                    stringArray[ae.lIlIIIIIIllI[0]] = lIlIIIIIIlIl[lIlIIIIIIllI[11]];
                    if (ae.llIlIIlllllIlI(item.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIlIIIIIIllI[2];
                        "".length();
                        if (" ".length() < "   ".length()) return n2 != 0;
                        return ((0x2B ^ 0x7D ^ (0x76 ^ 0x6B)) & (0x4C ^ 7 ^ (0xFD ^ 0xB4) & ~(0xFD ^ 0xB4) ^ -" ".length())) != 0;
                    }
                }
                n2 = lIlIIIIIIllI[0];
                return n2 != 0;
            });
        }
        if (ae.llIlIlIIIIIIII(lllllllllllllllIlllIIlIlIIlIlIlI)) {
            return lIlIIIIIIllI[0];
        }
        item2.interact(lIlIIIIIIlIl[lIlIIIIIIllI[0]]);
        this.sleep(lIlIIIIIIllI[1]);
        return lIlIIIIIIllI[2];
    }

    protected boolean cz() {
        Item item2 = Inventory.getFirst(item -> {
            int n2;
            if (!ae.llIlIIllllllll(item.getName().startsWith(lIlIIIIIIlIl[lIlIIIIIIllI[3]]) ? 1 : 0) || ae.llIlIIlllllIlI(item.getName().startsWith(lIlIIIIIIlIl[lIlIIIIIIllI[8]]) ? 1 : 0)) {
                Item lllllllllllllllIlllIIlIlIIIllIII;
                String[] stringArray = new String[lIlIIIIIIllI[2]];
                stringArray[ae.lIlIIIIIIllI[0]] = lIlIIIIIIlIl[lIlIIIIIIllI[9]];
                if (ae.llIlIIlllllIlI(lllllllllllllllIlllIIlIlIIIllIII.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIIIIIllI[2];
                    "".length();
                    if (-"  ".length() <= 0) return n2 != 0;
                    return ((0x65 ^ 0x71 ^ (0x17 ^ 0x32)) & (0x50 ^ 0x6F ^ (0x40 ^ 0x4E) ^ -" ".length())) != 0;
                }
            }
            n2 = lIlIIIIIIllI[0];
            return n2 != 0;
        });
        if (ae.llIlIlIIIIIIII(item2)) {
            return lIlIIIIIIllI[0];
        }
        item2.interact(lIlIIIIIIlIl[lIlIIIIIIllI[2]]);
        this.sleep(lIlIIIIIIllI[1]);
        return lIlIIIIIIllI[2];
    }

    /*
     * WARNING - void declaration
     */
    private int cA() {
        void lllllllllllllllIlllIIlIlIIIlllIl;
        n n2 = this.cH.L();
        if (!ae.llIlIlIIIIIIlI(n2) || ae.llIlIIllllllll(n2.a((Locatable)Players.getLocal()) ? 1 : 0)) {
            return lIlIIIIIIllI[5];
        }
        N lllllllllllllllIlllIIlIlIIIlllII = lllllllllllllllIlllIIlIlIIIlllIl.aM();
        if (ae.llIlIlIIIIIIll((Object)lllllllllllllllIlllIIlIlIIIlllII, (Object)N.VASA) && ae.llIlIlIIIIIIlI(NPCs.getNearest(nPC -> nPC.getName().contains(lIlIIIIIIlIl[lIlIIIIIIllI[7]])))) {
            return lIlIIIIIIllI[6];
        }
        if (ae.llIlIlIIIIIIll((Object)lllllllllllllllIlllIIlIlIIIlllII, (Object)N.VESPULA)) {
            return lIlIIIIIIllI[0];
        }
        return lIlIIIIIIllI[5];
    }

    private static int llIlIIlllllIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Inject
    public ae(SquireChambersPlugin squireChambersPlugin) {
        this.cD = lIlIIIIIIllI[0];
        this.cE = lIlIIIIIIllI[0];
        this.cG = squireChambersPlugin.A();
        this.cH = squireChambersPlugin;
    }

    private static String llIlIIllllIlII(String lllllllllllllllIlllIIlIIlllIlIlI, String lllllllllllllllIlllIIlIIlllIlllI) {
        lllllllllllllllIlllIIlIIlllIlIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIlIIlllIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIIlIIlllIllIl = new StringBuilder();
        char[] lllllllllllllllIlllIIlIIlllIllII = lllllllllllllllIlllIIlIIlllIlllI.toCharArray();
        int lllllllllllllllIlllIIlIIlllIlIll = lIlIIIIIIllI[0];
        char[] lllllllllllllllIlllIIlIIlllIIlIl = lllllllllllllllIlllIIlIIlllIlIlI.toCharArray();
        int lllllllllllllllIlllIIlIIlllIIlII = lllllllllllllllIlllIIlIIlllIIlIl.length;
        int lllllllllllllllIlllIIlIIlllIIIll = lIlIIIIIIllI[0];
        while (ae.llIlIIllllllIl(lllllllllllllllIlllIIlIIlllIIIll, lllllllllllllllIlllIIlIIlllIIlII)) {
            char lllllllllllllllIlllIIlIIllllIIII = lllllllllllllllIlllIIlIIlllIIlIl[lllllllllllllllIlllIIlIIlllIIIll];
            lllllllllllllllIlllIIlIIlllIllIl.append((char)(lllllllllllllllIlllIIlIIllllIIII ^ lllllllllllllllIlllIIlIIlllIllII[lllllllllllllllIlllIIlIIlllIlIll % lllllllllllllllIlllIIlIIlllIllII.length]));
            "".length();
            ++lllllllllllllllIlllIIlIIlllIlIll;
            ++lllllllllllllllIlllIIlIIlllIIIll;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIIlIIlllIllIl);
    }
}

