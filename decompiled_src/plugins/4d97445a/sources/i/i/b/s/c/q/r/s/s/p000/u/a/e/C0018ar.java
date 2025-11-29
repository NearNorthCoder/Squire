package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.ectofuntus.SquireEcto;
import gg.squire.basics.ectofuntus.SquireEctoConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.events.InventoryChanged;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Collecting slime", priority = 10, blocking = true, register = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.ar  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/ar.class */
public class C0018ar extends AbstractC0019as {
    private static /* synthetic */ String[] lIIIIIIll;
    private static /* synthetic */ int[] lIIIIIlII;

    private static String lllIIIlllI(String llIIlllIIllIIIl, String llIIlllIIllIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIlllIIllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIIIlII[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIlllIIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIlllIIllIIlI) {
            llIIlllIIllIIlI.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(InventoryChanged inventoryChanged) {
        if (!lllIIlIlIl(EnumC0013am.SLIME_COLLECTION.bo() ? 1 : 0) && lllIIlIlll(inventoryChanged.getChangeType(), InventoryChanged.ChangeType.ITEM_ADDED) && lllIIllIII(inventoryChanged.getItemId(), lIIIIIlII[12])) {
            this.dd.s(this.dd.bn() + lIIIIIlII[1]);
        }
    }

    static {
        lllIIlIIlI();
        lllIIlIIIl();
    }

    private static boolean lllIIllIII(int i2, int i3) {
        return i2 == i3;
    }

    private static String lllIIlIIII(String llIIlllIIlIIlII, String llIIlllIIlIIIll) {
        try {
            SecretKeySpec llIIlllIIlIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIlllIIlIIIll.getBytes(StandardCharsets.UTF_8)), lIIIIIlII[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIIlII[4], llIIlllIIlIIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIlllIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIlllIIlIIlIl) {
            llIIlllIIlIIlIl.printStackTrace();
            return null;
        }
    }

    private static String lllIIIllll(String llIIlllIIIlIlII, String llIIlllIIIlIIll) {
        String str = new String(Base64.getDecoder().decode(llIIlllIIIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llIIlllIIIlIIll.toCharArray();
        int llIIlllIIIIlIll = lIIIIIlII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i2 = lIIIIIlII[0];
        while (lllIIllIIl(i2, length)) {
            char llIIlllIIIlIlIl = charArray2[i2];
            sb.append((char) (llIIlllIIIlIlIl ^ charArray[llIIlllIIIIlIll % charArray.length]));
            "".length();
            llIIlllIIIIlIll++;
            i2++;
            "".length();
            if ((((((231 + 242) - 458) + 234) ^ (((78 + 20) - 79) + 133)) & (((243 ^ 136) ^ (32 ^ 58)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lllIIlIlII(Object obj) {
        return obj != null;
    }

    private static boolean lllIIlIlIl(int i2) {
        return i2 == 0;
    }

    private static boolean lllIIlIIll(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    @Override // i.i.b.s.c.q.r.s.s.p000.u.a.e.AbstractC0019as
    public boolean bB() {
        if (lllIIlIIll(this.dd.r() ? 1 : 0)) {
            return lIIIIIlII[0];
        }
        int[] iArr = new int[lIIIIIlII[1]];
        iArr[lIIIIIlII[0]] = lIIIIIlII[2];
        if (lllIIlIIll(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIIIIIlII[1]];
            iArr2[lIIIIIlII[0]] = lIIIIIlII[3];
            if (!lllIIlIIll(Inventory.contains(iArr2) ? 1 : 0)) {
                TileObject nearest = TileObjects.getNearest(tileObject -> {
                    return tileObject.getName().equals(lIIIIIIll[lIIIIIlII[13]]);
                });
                if (lllIIlIIll(EnumC0013am.ECTOFUNTUS.bo() ? 1 : 0) && lllIIlIlII(nearest)) {
                    String[] strArr = new String[lIIIIIlII[1]];
                    strArr[lIIIIIlII[0]] = lIIIIIIll[lIIIIIlII[0]];
                    if (lllIIlIIll(nearest.hasAction(strArr) ? 1 : 0)) {
                        Log.info(lIIIIIIll[lIIIIIlII[1]]);
                        nearest.interact(lIIIIIIll[lIIIIIlII[4]]);
                        return lIIIIIlII[1];
                    }
                    String[] strArr2 = new String[lIIIIIlII[1]];
                    strArr2[lIIIIIlII[0]] = lIIIIIIll[lIIIIIlII[5]];
                    if (!lllIIlIIll(nearest.hasAction(strArr2) ? 1 : 0)) {
                        Log.info(lIIIIIIll[lIIIIIlII[8]]);
                        return lIIIIIlII[0];
                    }
                    Log.info(lIIIIIIll[lIIIIIlII[6]]);
                    nearest.interact(lIIIIIIll[lIIIIIlII[7]]);
                    return lIIIIIlII[1];
                } else if (lllIIlIlIl(EnumC0013am.SLIME_COLLECTION.bo() ? 1 : 0)) {
                    if (lllIIlIlIl(Movement.shouldWalk() ? 1 : 0)) {
                        return lIIIIIlII[0];
                    }
                    Log.info(lIIIIIIll[lIIIIIlII[9]]);
                    return Movement.walkTo(EnumC0013am.SLIME_COLLECTION.bp());
                } else {
                    String[] strArr3 = new String[lIIIIIlII[1]];
                    strArr3[lIIIIIlII[0]] = lIIIIIIll[lIIIIIlII[10]];
                    TileObject nearest2 = TileObjects.getNearest(strArr3);
                    if (lllIIlIllI(nearest2)) {
                        Log.info(lIIIIIIll[lIIIIIlII[11]]);
                        return lIIIIIlII[0];
                    }
                    int[] iArr3 = new int[lIIIIIlII[1]];
                    iArr3[lIIIIIlII[0]] = lIIIIIlII[2];
                    Item first = Inventory.getFirst(iArr3);
                    if (lllIIlIllI(first)) {
                        return lIIIIIlII[0];
                    }
                    first.useOn(nearest2);
                    return lIIIIIlII[1];
                }
            }
        }
        return lIIIIIlII[0];
    }

    private static boolean lllIIllIIl(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lllIIlIllI(Object obj) {
        return obj == null;
    }

    private static void lllIIlIIlI() {
        lIIIIIlII = new int[15];
        lIIIIIlII[0] = (187 ^ 176) & ((4 ^ 15) ^ (-1));
        lIIIIIlII[1] = " ".length();
        lIIIIIlII[2] = (-(82 ^ 73)) & (-20577) & 22527;
        lIIIIIlII[3] = (-((-21641) & 31929)) & (-20549) & 32767;
        lIIIIIlII[4] = "  ".length();
        lIIIIIlII[5] = "   ".length();
        lIIIIIlII[6] = 130 ^ 134;
        lIIIIIlII[7] = (((127 + 181) - 132) + 12) ^ (((180 + 81) - 223) + 147);
        lIIIIIlII[8] = (((69 + 0) - 55) + 131) ^ (((119 + 123) - 103) + 12);
        lIIIIIlII[9] = 90 ^ 93;
        lIIIIIlII[10] = 100 ^ 108;
        lIIIIIlII[11] = (((104 + 99) - 186) + 125) ^ (((124 + 95) - 102) + 18);
        lIIIIIlII[12] = (-25345) & 29630;
        lIIIIIlII[13] = 70 ^ 76;
        lIIIIIlII[14] = (131 ^ 189) ^ (50 ^ 7);
    }

    private static boolean lllIIlIlll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void lllIIlIIIl() {
        lIIIIIIll = new String[lIIIIIlII[14]];
        lIIIIIIll[lIIIIIlII[0]] = lllIIIlllI("e2XyBoe2lT0=", "asKAG");
        lIIIIIIll[lIIIIIlII[1]] = lllIIIllll("BDEyOD8lJnciJCoxMzk5OQ==", "KAWVV");
        lIIIIIIll[lIIIIIlII[4]] = lllIIIlllI("2JnlDf1sKA4=", "sDVyW");
        lIIIIIIll[lIIIIIlII[5]] = lllIIlIIII("vg8/MUMzF0RH937yETXA/A==", "kishb");
        lIIIIIIll[lIIIIIlII[6]] = lllIIIllll("DiElJgckIytrASI6ImsRPyw8LwoiPw==", "MMLKe");
        lIIIIIIll[lIIIIIlII[7]] = lllIIIllll("LiI9NDFAKjsuPQ==", "mNTYS");
        lIIIIIIll[lIIIIIlII[8]] = lllIIlIIII("RP/Zi+OSGzdmZp7SaEaQQajDnin1myYXETz/5chkcPk=", "dPwYu");
        lIIIIIIll[lIIIIIlII[9]] = lllIIIllll("ISk/CSQYL3MWIlY8OwdtBSQ6DyhWKzwOIRMrJwsiGGgyECgXZg==", "vHSbM");
        lIIIIIIll[lIIIIIlII[10]] = lllIIlIIII("kOv1Vo0XSWK7vY/y9uhMmA==", "anEXA");
        lIIIIIIll[lIIIIIlII[11]] = lllIIlIIII("9Hplgfixk7PS8etaihnduA==", "oRBWH");
        lIIIIIIll[lIIIIIlII[13]] = lllIIIlllI("JEvMcGyf5TutgTfjLQh2Ig==", "Axqsl");
    }

    @Inject
    public C0018ar(SquireEcto squireEcto, SquireEctoConfig squireEctoConfig) {
        super(squireEcto, squireEctoConfig);
    }
}
