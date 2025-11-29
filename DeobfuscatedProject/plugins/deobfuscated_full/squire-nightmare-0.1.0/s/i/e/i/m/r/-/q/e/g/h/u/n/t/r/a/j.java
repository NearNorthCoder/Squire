/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Singleton
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import com.google.inject.Singleton;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.k;

@Singleton
public class j {
    private static /* synthetic */ int[] llllIIlllIll;
    private static /* synthetic */ String[] llllIIlllIIl;
    public /* synthetic */ List<WorldPoint> bI;
    public /* synthetic */ NPC bK;
    public /* synthetic */ WorldPoint bN;
    private static final /* synthetic */ int[] bE;
    private static final /* synthetic */ int[] bD;
    private static final /* synthetic */ int bH;
    private static final /* synthetic */ int bB;
    private static final /* synthetic */ int[] bF;
    private static final /* synthetic */ int bC;
    private static final /* synthetic */ Map<Integer, Integer> bG;
    private static final /* synthetic */ Logger bA;
    private /* synthetic */ LinkedList<WorldPoint> bO;
    public /* synthetic */ boolean bL;
    public /* synthetic */ WorldPoint bJ;
    public /* synthetic */ WorldPoint bM;

    public NPC aY() {
        return NPCs.getNearest(nPC -> {
            int n2;
            if (j.lIIlIIIIIIlIIll(nPC.getName().equalsIgnoreCase(llllIIlllIIl[llllIIlllIll[1]]) ? 1 : 0) && j.lIIlIIIIIIIllll(nPC.isDead() ? 1 : 0)) {
                n2 = llllIIlllIll[1];
                0;
                if (3 <= ((0x16 ^ 0x41) & ~(0xFC ^ 0xAB))) {
                    return false;
                }
            } else {
                n2 = llllIIlllIll[2];
            }
            return n2 != 0;
        });
    }

    public static TileObject aV() {
        return TileObjects.getNearest((int[])bD);
    }

    private static void lIIlIIIIIIIlIII() {
        llllIIlllIIl = new String[llllIIlllIll[18]];
        j.llllIIlllIIl[j.llllIIlllIll[2]] = j."sleepwalker";
        j.llllIIlllIIl[j.llllIIlllIll[1]] = j."husk";
        j.llllIIlllIIl[j.llllIIlllIll[7]] = j."parasite";
    }

    public WorldPoint bb() {
        return this.bJ;
    }

    protected boolean a(Object object) {
        return object instanceof j;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        block50: {
            block51: {
                LinkedList<WorldPoint> var33;
                LinkedList<WorldPoint> var22;
                block49: {
                    j var8;
                    j var29;
                    block47: {
                        block48: {
                            WorldPoint var3;
                            WorldPoint var18;
                            block46: {
                                block44: {
                                    block45: {
                                        WorldPoint var30;
                                        WorldPoint var1;
                                        block43: {
                                            block41: {
                                                block42: {
                                                    NPC var32;
                                                    NPC var14;
                                                    block40: {
                                                        block38: {
                                                            block39: {
                                                                WorldPoint var19;
                                                                WorldPoint var31;
                                                                block37: {
                                                                    block35: {
                                                                        block36: {
                                                                            List<WorldPoint> var10;
                                                                            List<WorldPoint> var15;
                                                                            block34: {
                                                                                void var16;
                                                                                if (j.lIIlIIIIIIIlllI(object, this)) {
                                                                                    return llllIIlllIll[1];
                                                                                }
                                                                                if (j.lIIlIIIIIIIllll(var16 instanceof j)) {
                                                                                    return llllIIlllIll[2];
                                                                                }
                                                                                var29 = (j)var16;
                                                                                if (j.lIIlIIIIIIIllll(var29.a(var8) ? 1 : 0)) {
                                                                                    return llllIIlllIll[2];
                                                                                }
                                                                                if (j.lIIlIIIIIIlIIII(var8.bd() ? 1 : 0, var29.bd() ? 1 : 0)) {
                                                                                    return llllIIlllIll[2];
                                                                                }
                                                                                var15 = var8.ba();
                                                                                var10 = var29.ba();
                                                                                if (!j.lIIlIIIIIIlIIIl(var15)) break block34;
                                                                                if (!j.lIIlIIIIIIlIIlI(var10)) break block35;
                                                                                0;
                                                                                if ((0xB1 ^ 0xA2 ^ (0x6B ^ 0x7C)) < 1) {
                                                                                    return ((0x53 ^ 0x4A ^ (0x61 ^ 0x38)) & (0xC3 ^ 0x90 ^ (0xB9 ^ 0xAA) ^ -1)) != 0;
                                                                                }
                                                                                break block36;
                                                                            }
                                                                            if (!j.lIIlIIIIIIIllll(((Object)var15).equals(var10) ? 1 : 0)) break block35;
                                                                        }
                                                                        return llllIIlllIll[2];
                                                                    }
                                                                    var31 = var8.bb();
                                                                    var19 = var29.bb();
                                                                    if (!j.lIIlIIIIIIlIIIl(var31)) break block37;
                                                                    if (!j.lIIlIIIIIIlIIlI(var19)) break block38;
                                                                    0;
                                                                    if ((0x41 ^ 0x45) <= 0) {
                                                                        return false;
                                                                    }
                                                                    break block39;
                                                                }
                                                                if (!j.lIIlIIIIIIIllll(var31.equals(var19) ? 1 : 0)) break block38;
                                                            }
                                                            return llllIIlllIll[2];
                                                        }
                                                        var14 = var8.bc();
                                                        var32 = var29.bc();
                                                        if (!j.lIIlIIIIIIlIIIl(var14)) break block40;
                                                        if (!j.lIIlIIIIIIlIIlI(var32)) break block41;
                                                        0;
                                                        if (1 < 0) {
                                                            return false;
                                                        }
                                                        break block42;
                                                    }
                                                    if (!j.lIIlIIIIIIIllll(var14.equals(var32) ? 1 : 0)) break block41;
                                                }
                                                return llllIIlllIll[2];
                                            }
                                            var1 = var8.be();
                                            var30 = var29.be();
                                            if (!j.lIIlIIIIIIlIIIl(var1)) break block43;
                                            if (!j.lIIlIIIIIIlIIlI(var30)) break block44;
                                            0;
                                            if (1 <= 0) {
                                                return ((0xAD ^ 0x81 ^ (0x20 ^ 0x19)) & (0x29 ^ 0x6D ^ (0x74 ^ 0x25) ^ -1)) != 0;
                                            }
                                            break block45;
                                        }
                                        if (!j.lIIlIIIIIIIllll(var1.equals(var30) ? 1 : 0)) break block44;
                                    }
                                    return llllIIlllIll[2];
                                }
                                var18 = var8.bf();
                                var3 = var29.bf();
                                if (!j.lIIlIIIIIIlIIIl(var18)) break block46;
                                if (!j.lIIlIIIIIIlIIlI(var3)) break block47;
                                0;
                                if (1 < 0) {
                                    return ((0x4D ^ 0x65 ^ (0xDE ^ 0xB6)) & (54 + 94 - 53 + 33 ^ 93 + 87 - 12 + 24 ^ -1)) != 0;
                                }
                                break block48;
                            }
                            if (!j.lIIlIIIIIIIllll(var18.equals(var3) ? 1 : 0)) break block47;
                        }
                        return llllIIlllIll[2];
                    }
                    var22 = var8.bg();
                    var33 = var29.bg();
                    if (!j.lIIlIIIIIIlIIIl(var22)) break block49;
                    if (!j.lIIlIIIIIIlIIlI(var33)) break block50;
                    0;
                    
                    }
                    break block51;
                }
                if (!j.lIIlIIIIIIIllll(((Object)var22).equals(var33) ? 1 : 0)) break block50;
            }
            return llllIIlllIll[2];
        }
        return llllIIlllIll[1];
    }

    public void e(NPC nPC) {
        this.bK = nPC;
    }

    public void v(boolean bl) {
        this.bL = bl;
    }

    private static boolean lIIlIIIIIIIllll(int n2) {
        return n2 == 0;
    }

    private static String lIIlIIIIIIIIIIl(String var23, String var24) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), llllIIlllIll[20]), "DES");
            Cipher var4 = Cipher.getInstance("DES");
            var4.init(llllIIlllIll[7], var2);
            return new String(var4.doFinal(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIIIlIIIl(Object object) {
        return object == null;
    }

    public static boolean aU() {
        boolean bl;
        if (j.lIIlIIIIIIIllIl(Static.getClient().getVarbitValue(llllIIlllIll[0]), llllIIlllIll[1])) {
            bl = llllIIlllIll[1];
            0;
            if (-1 > 2) {
                return false;
            }
        } else {
            bl = llllIIlllIll[2];
        }
        return bl;
    }

    private static boolean lIIlIIIIIIIlllI(Object object, Object object2) {
        return object == object2;
    }

    public NPC aZ() {
        return this.a(Collections.emptySet());
    }

    public boolean bd() {
        return this.bL;
    }

    public List<WorldPoint> ba() {
        return this.bI;
    }

    static {
        j.lIIlIIIIIIIllII();
        j.lIIlIIIIIIIlIII();
        bH = llllIIlllIll[8];
        bC = llllIIlllIll[9];
        bB = llllIIlllIll[0];
        bA = LoggerFactory.getLogger(j.class);
        int[] nArray = new int[llllIIlllIll[7]];
        nArray[j.llllIIlllIll[2]] = llllIIlllIll[10];
        nArray[j.llllIIlllIll[1]] = llllIIlllIll[11];
        bD = nArray;
        int[] nArray2 = new int[llllIIlllIll[7]];
        nArray2[j.llllIIlllIll[2]] = llllIIlllIll[12];
        nArray2[j.llllIIlllIll[1]] = llllIIlllIll[13];
        bE = nArray2;
        int[] nArray3 = new int[llllIIlllIll[14]];
        nArray3[j.llllIIlllIll[2]] = llllIIlllIll[15];
        nArray3[j.llllIIlllIll[1]] = llllIIlllIll[16];
        nArray3[j.llllIIlllIll[7]] = llllIIlllIll[17];
        nArray3[j.llllIIlllIll[18]] = llllIIlllIll[19];
        bF = nArray3;
        bG = new k();
    }

    public LinkedList<WorldPoint> bg() {
        return this.bO;
    }

    private static boolean lIIlIIIIIIlIIII(int n2, int n3) {
        return n2 != n3;
    }

    public static List<TileObject> aW() {
        return TileObjects.getAll((int[])bD);
    }

    private static String lIIlIIIIIIIIIlI(String var28, String var25) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var25.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(llllIIlllIll[7], var13);
            return new String(var5.doFinal(Base64.getDecoder().decode(var28.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    public String toString() {
        return "NightmareManager(path=" + this.ba() + ", lastMeleeLocation=" + this.bb() + ", lastTotem=" + this.bc() + ", meleeShroomDodged=" + this.bd() + ", previousMeleeShroomLocation=" + this.be() + ", previousFinalPhaseLocation=" + this.bf() + ", meleeShroomAvoidancePath=" + this.bg() + ")";
    }

    public NPC aX() {
        return NPCs.getNearest(nPC -> {
            int n2;
            if (j.lIIlIIIIIIlIIll(nPC.getName().equalsIgnoreCase(llllIIlllIIl[llllIIlllIll[7]]) ? 1 : 0) && j.lIIlIIIIIIIllll(nPC.isDead() ? 1 : 0)) {
                n2 = llllIIlllIll[1];
                0;
                if ((0xA2 ^ 0xA6 ^ 1) == 0) {
                    return ((0xD9 ^ 0x85 ^ (0x1A ^ 6)) & (0xCA ^ 0xC6 ^ (0x40 ^ 0xC) ^ -1)) != 0;
                }
            } else {
                n2 = llllIIlllIll[2];
            }
            return n2 != 0;
        });
    }

    public j() {
        this.bI = null;
        this.bJ = null;
        this.bK = null;
        this.bL = llllIIlllIll[2];
        this.bM = null;
        this.bN = null;
        this.bO = new LinkedList();
    }

    private static boolean lIIlIIIIIIIllIl(int n2, int n3) {
        return n2 == n3;
    }

    public void g(WorldPoint worldPoint) {
        this.bN = worldPoint;
    }

    public void f(WorldPoint worldPoint) {
        this.bM = worldPoint;
    }

    public NPC a(Set<NPC> set) {
        return NPCs.getNearest(nPC -> {
            int n2;
            if (j.lIIlIIIIIIlIIll(nPC.getName().equalsIgnoreCase(llllIIlllIIl[llllIIlllIll[2]]) ? 1 : 0) && j.lIIlIIIIIIIllll(nPC.isDead() ? 1 : 0) && j.lIIlIIIIIIIllll(set.contains(nPC) ? 1 : 0)) {
                n2 = llllIIlllIll[1];
                0;
                if (((87 + 147 - 185 + 106 ^ 79 + 21 - -6 + 32) & (0x30 ^ 0x26 ^ (1 ^ 6) ^ -1)) == 2) {
                    return ((0xC6 ^ 0xA6 ^ (0x66 ^ 0x2F)) & (0xE5 ^ 0x8F ^ (0x3E ^ 0x7D) ^ -1)) != 0;
                }
            } else {
                n2 = llllIIlllIll[2];
            }
            return n2 != 0;
        });
    }

    public void a(LinkedList<WorldPoint> linkedList) {
        this.bO = linkedList;
    }

    private static void lIIlIIIIIIIllII() {
        llllIIlllIll = new int[21];
        j.llllIIlllIll[0] = -(0xFFFFCEFD & 0x3D7F) & (0xFFFFBDFD & 0x7EFE);
        j.llllIIlllIll[1] = 1;
        j.llllIIlllIll[2] = (0x41 ^ 0x5B) & ~(0xBB ^ 0xA1);
        j.llllIIlllIll[3] = 54 + 12 - -48 + 67 ^ 35 + 80 - 21 + 48;
        j.llllIIlllIll[4] = 0xC9 ^ 0x86;
        j.llllIIlllIll[5] = 0xDC ^ 0xBD;
        j.llllIIlllIll[6] = 0xA5 ^ 0x8E;
        j.llllIIlllIll[7] = 2;
        j.llllIIlllIll[8] = -(0xFFFFFEF7 & 0x794B) & (0xFFFFFFDF & 0x79FF);
        j.llllIIlllIll[9] = 0xFFFFA7FF & 0x7FA6;
        j.llllIIlllIll[10] = 0xFFFFDF77 & 0xB3F9;
        j.llllIIlllIll[11] = 0xFFFFF7F8 & 0x9B77;
        j.llllIIlllIll[12] = -(0xFFFFECFD & 0x7F97) & (0xFFFFFFFF & 0xFFFF);
        j.llllIIlllIll[13] = 0xFFFFDF7B & 0xB3EE;
        j.llllIIlllIll[14] = 1 ^ 8 ^ (0xC9 ^ 0xC4);
        j.llllIIlllIll[15] = 0xA7 ^ 0xAE;
        j.llllIIlllIll[16] = 0x33 ^ 0x3C;
        j.llllIIlllIll[17] = (0xD5 ^ 0xB6) & ~(0x41 ^ 0x22) ^ (0x99 ^ 0x8C);
        j.llllIIlllIll[18] = 3;
        j.llllIIlllIll[19] = 0x46 ^ 0x5D;
        j.llllIIlllIll[20] = 0x9A ^ 0x92;
    }

    public void e(WorldPoint worldPoint) {
        this.bJ = worldPoint;
    }

    public WorldPoint bf() {
        return this.bN;
    }

    public void d(List<WorldPoint> list) {
        this.bI = list;
    }

    private static boolean lIIlIIIIIIlIIll(int n2) {
        return n2 != 0;
    }

    public List<TileObject> ax() {
        return TileObjects.getAll((int[])bE);
    }

    public int hashCode() {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        j var11;
        int n8;
        int n9 = llllIIlllIll[3];
        int n10 = llllIIlllIll[1];
        int n11 = n10 * llllIIlllIll[3];
        if (j.lIIlIIIIIIlIIll(this.bd() ? 1 : 0)) {
            n8 = llllIIlllIll[4];
            0;
            if (3 == 0) {
                return (8 ^ 0x1A) & ~(0x60 ^ 0x72);
            }
        } else {
            n8 = llllIIlllIll[5];
        }
        int var21 = n11 + n8;
        List<WorldPoint> var6 = var11.ba();
        int n12 = var21 * llllIIlllIll[3];
        if (j.lIIlIIIIIIlIIIl(var6)) {
            n7 = llllIIlllIll[6];
            0;
            if (-3 > 0) {
                return (0x7E ^ 0x1B ^ (0x12 ^ 0x32)) & (84 + 93 - 151 + 185 ^ 45 + 75 - -27 + 3 ^ -1);
            }
        } else {
            n7 = ((Object)var6).hashCode();
        }
        var21 = n12 + n7;
        WorldPoint var26 = var11.bb();
        int n13 = var21 * llllIIlllIll[3];
        if (j.lIIlIIIIIIlIIIl(var26)) {
            n6 = llllIIlllIll[6];
            0;
            if (((0x6C ^ 0x73) & ~(8 ^ 0x17)) != 0) {
                return (0x97 ^ 0xA0) & ~(0x4C ^ 0x7B);
            }
        } else {
            n6 = var26.hashCode();
        }
        var21 = n13 + n6;
        NPC var12 = var11.bc();
        int n14 = var21 * llllIIlllIll[3];
        if (j.lIIlIIIIIIlIIIl(var12)) {
            n5 = llllIIlllIll[6];
            0;
            if (1 <= 0) {
                return (0xA8 ^ 0xB7) & ~(0x95 ^ 0x8A);
            }
        } else {
            n5 = var12.hashCode();
        }
        var21 = n14 + n5;
        WorldPoint var9 = var11.be();
        int n15 = var21 * llllIIlllIll[3];
        if (j.lIIlIIIIIIlIIIl(var9)) {
            n4 = llllIIlllIll[6];
            0;
            if (1 != 1) {
                return 2 & (2 ^ -1);
            }
        } else {
            n4 = var9.hashCode();
        }
        var21 = n15 + n4;
        WorldPoint var20 = var11.bf();
        int n16 = var21 * llllIIlllIll[3];
        if (j.lIIlIIIIIIlIIIl(var20)) {
            n3 = llllIIlllIll[6];
            0;
            if (-(0xA2 ^ 0xA7) >= 0) {
                return (0x60 ^ 0x27) & ~(0x56 ^ 0x11);
            }
        } else {
            n3 = var20.hashCode();
        }
        var21 = n16 + n3;
        LinkedList<WorldPoint> var17 = var11.bg();
        int n17 = var21 * llllIIlllIll[3];
        if (j.lIIlIIIIIIlIIIl(var17)) {
            n2 = llllIIlllIll[6];
            0;
            if (((0xDC ^ 0xAF ^ (0xA2 ^ 0xB2)) & (0x84 ^ 0xA3 ^ (0xD6 ^ 0x92) ^ -1)) != ((0x9B ^ 0xBB ^ (0x36 ^ 0x77)) & (0x49 ^ 5 ^ (0x21 ^ 0xC) ^ -1))) {
                return (0xFC ^ 0x85 ^ (0x16 ^ 0x56)) & (0x7F ^ 0x4E ^ (0x18 ^ 0x10) ^ -1);
            }
        } else {
            n2 = ((Object)var17).hashCode();
        }
        n10 = n17 + n2;
        return n10;
    }

    public NPC bc() {
        return this.bK;
    }

    private static boolean lIIlIIIIIIlIIlI(Object object) {
        return object != null;
    }

    public WorldPoint be() {
        return this.bM;
    }
}

