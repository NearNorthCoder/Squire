package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.loot.LooterConfig;
import gg.squire.basics.loot.SquireLooter;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
@TaskDesc(name = "Looting Valuables")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.aO  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/aO.class */
public class aO extends Task {
    private final /* synthetic */ SquireLooter eG;
    private static /* synthetic */ int[] lIlIlIIlI;
    private static /* synthetic */ String[] lIlIlIIIl;
    private final /* synthetic */ LooterConfig eH;

    private static boolean lIIlIlIlIIl(int i2) {
        return i2 == 0;
    }

    private boolean b(TileItem tileItem) {
        Static.getClient().getItemDefinition(tileItem.getId()).getName().toLowerCase();
        int itemPrice = Prices.getItemPrice(tileItem.getId()) * tileItem.getQuantity();
        return tileItem.getWorldLocation().equals(this.eG.cj());
    }

    private static String lIIlIlIIIll(String llIIIIIIIIlIlll, String llIIIIIIIIlIllI) {
        String str = new String(Base64.getDecoder().decode(llIIIIIIIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llIIIIIIIIlIllI.toCharArray();
        int llIIIIIIIIlIIll = lIlIlIIlI[0];
        char[] charArray2 = str.toCharArray();
        int llIIIIIIIIIllII = charArray2.length;
        int i2 = lIlIlIIlI[0];
        while (lIIlIlIlIll(i2, llIIIIIIIIIllII)) {
            char llIIIIIIIIIlIlI = charArray2[i2];
            sb.append((char) (llIIIIIIIIIlIlI ^ charArray[llIIIIIIIIlIIll % charArray.length]));
            "".length();
            llIIIIIIIIlIIll++;
            i2++;
            "".length();
            if (" ".length() >= (79 ^ 75)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Inject
    public aO(SquireLooter squireLooter, LooterConfig looterConfig) {
        this.eG = squireLooter;
        this.eH = looterConfig;
    }

    private static boolean lIIlIlIIllI(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    public boolean run() {
        if (lIIlIlIIllI(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lIlIlIIlI[0];
        } else if (lIIlIlIIllI(Players.getLocal().isMoving() ? 1 : 0)) {
            return lIlIlIIlI[0];
        } else {
            for (aH aHVar : this.eG.p()) {
                WorldPoint cd = aHVar.cd();
                int[] iArr = new int[lIlIlIIlI[1]];
                iArr[lIlIlIIlI[0]] = aHVar.P();
                TileItem firstAt = TileItems.getFirstAt(cd, iArr);
                if (lIIlIlIIlll(firstAt)) {
                    if (lIIlIlIlIII(firstAt.distanceTo(Players.getLocal().getWorldLocation()), this.eH.lootRange())) {
                        "".length();
                        if ((-(176 ^ 181)) >= 0) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                    } else {
                        if (lIIlIlIlIIl(Inventory.isFull() ? 1 : 0)) {
                            firstAt.interact(lIlIlIIIl[lIlIlIIlI[0]]);
                        }
                        if (lIIlIlIIllI(Inventory.isFull() ? 1 : 0)) {
                            if (lIIlIlIIllI(firstAt.isStackable() ? 1 : 0)) {
                                int[] iArr2 = new int[lIlIlIIlI[1]];
                                iArr2[lIlIlIIlI[0]] = firstAt.getId();
                                if (lIIlIlIIllI(Inventory.contains(iArr2) ? 1 : 0)) {
                                    firstAt.interact(lIlIlIIIl[lIlIlIIlI[1]]);
                                }
                            }
                            Item first = Inventory.getFirst(item -> {
                                String[] strArr = new String[lIlIlIIlI[1]];
                                strArr[lIlIlIIlI[0]] = lIlIlIIIl[lIlIlIIlI[3]];
                                return item.hasAction(strArr);
                            });
                            if (lIIlIlIlIlI(first)) {
                                return lIlIlIIlI[0];
                            }
                            first.interact(lIlIlIIIl[lIlIlIIlI[2]]);
                            return lIlIlIIlI[1];
                        }
                    }
                }
                "".length();
                if ("   ".length() > "   ".length()) {
                    return ((217 ^ 134) ^ (44 ^ 43)) & (((((104 + 208) - 83) + 13) ^ (((45 + 84) - 80) + 121)) ^ (-" ".length()));
                }
            }
            return lIlIlIIlI[1];
        }
    }

    private static void lIIlIlIIlII() {
        lIlIlIIIl = new String[lIlIlIIlI[4]];
        lIlIlIIIl[lIlIlIIlI[0]] = lIIlIlIIIlI("s1D7E65CRBs=", "VZdrz");
        lIlIlIIIl[lIlIlIIlI[1]] = lIIlIlIIIll("Bws9Kw==", "SjVNI");
        lIlIlIIIl[lIlIlIIlI[2]] = lIIlIlIIIlI("XlsAFtsXegw=", "VyeJP");
        lIlIlIIIl[lIlIlIIlI[3]] = lIIlIlIIIll("Azk+", "FXJol");
    }

    private static String lIIlIlIIIlI(String llIIIIIIIIIIIlI, String llIIIIIIIIIIIIl) {
        try {
            SecretKeySpec llIIIIIIIIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIIIIIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIIlI[2], llIIIIIIIIIIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIIIIIIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIIIIIIIIIll) {
            llIIIIIIIIIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIlll(Object obj) {
        return obj != null;
    }

    private static void lIIlIlIIlIl() {
        lIlIlIIlI = new int[5];
        lIlIlIIlI[0] = ((((215 + 210) - 390) + 187) ^ (((149 + 134) - 111) + 21)) & (((((7 + 36) - (-86)) + 19) ^ (((23 + 2) - (-46)) + 68)) ^ (-" ".length()));
        lIlIlIIlI[1] = " ".length();
        lIlIlIIlI[2] = "  ".length();
        lIlIlIIlI[3] = "   ".length();
        lIlIlIIlI[4] = 191 ^ 187;
    }

    private static boolean lIIlIlIlIII(int i2, int i3) {
        return i2 > i3;
    }

    static {
        lIIlIlIIlIl();
        lIIlIlIIlII();
    }

    private static boolean lIIlIlIlIll(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIIlIlIlIlI(Object obj) {
        return obj == null;
    }
}
