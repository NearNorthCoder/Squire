package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Prep Withdraw Olm Gear", priority = 20999, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.bh  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/bh.class */
public class bh extends bg {
    private static /* synthetic */ int[] lIIlllllIlIl;
    private static /* synthetic */ String[] lIIlllllIlII;

    private static boolean llIlIIlIlIIlll(int i, int i2) {
        return i >= i2;
    }

    private static void llIlIIlIlIIllI() {
        lIIlllllIlIl = new int[13];
        lIIlllllIlIl[0] = (242 ^ 170) & ((218 ^ 130) ^ (-1));
        lIIlllllIlIl[1] = "  ".length();
        lIIlllllIlIl[2] = " ".length();
        lIIlllllIlIl[3] = (-9425) & 9695;
        lIIlllllIlIl[4] = (225 ^ 137) ^ (8 ^ 102);
        lIIlllllIlIl[5] = "   ".length();
        lIIlllllIlIl[6] = (90 ^ 81) ^ (128 ^ 143);
        lIIlllllIlIl[7] = 186 ^ 191;
        lIIlllllIlIl[8] = (187 ^ 146) ^ (36 ^ 10);
        lIIlllllIlIl[9] = 207 ^ 199;
        lIIlllllIlIl[10] = 124 ^ 117;
        lIIlllllIlIl[11] = (76 ^ 73) ^ (72 ^ 71);
        lIIlllllIlIl[12] = 152 ^ 147;
    }

    private static boolean llIlIIlIlIlIII(int i, int i2) {
        return i < i2;
    }

    private static String llIlIIlIlIIIll(String lllllllllllllllIlllIlIIIIllIIIII, String lllllllllllllllIlllIlIIIIlIlllll) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIIIllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIIIlIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIIIIllIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIIIIllIIIlI.init(lIIlllllIlIl[1], lllllllllllllllIlllIlIIIIllIIIll);
            return new String(lllllllllllllllIlllIlIIIIllIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIIIIllIIIIl) {
            lllllllllllllllIlllIlIIIIllIIIIl.printStackTrace();
            return null;
        }
    }

    @Inject
    protected bh(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static String llIlIIlIlIIIlI(String lllllllllllllllIlllIlIIIIlIIIIll, String lllllllllllllllIlllIlIIIIlIIIIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIIlIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIlIIIIlIIIIIl = new StringBuilder();
        char[] charArray = lllllllllllllllIlllIlIIIIlIIIIlI.toCharArray();
        int lllllllllllllllIlllIlIIIIIllllll = lIIlllllIlIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIlllllIlIl[0];
        while (llIlIIlIlIlIII(i, length)) {
            lllllllllllllllIlllIlIIIIlIIIIIl.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlllIlIIIIIllllll % charArray.length]));
            "".length();
            lllllllllllllllIlllIlIIIIIllllll++;
            i++;
            "".length();
            if (" ".length() == ((((67 + 174) - 152) + 87) ^ (((35 + 93) - 88) + 140))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlllIlIIIIlIIIIIl);
    }

    private static boolean llIlIIlIlIllII(Object obj) {
        return obj == null;
    }

    private static void llIlIIlIlIIlIl() {
        lIIlllllIlII = new String[lIIlllllIlIl[12]];
        lIIlllllIlII[lIIlllllIlIl[0]] = llIlIIlIlIIIlI("Dg4tKj0gDi0kbjgVJjM=", "HgCCN");
        lIIlllllIlII[lIIlllllIlIl[2]] = llIlIIlIlIIIlI("NA84JVgxBzg1WCQbJiE0Lm4hODwwCyI=", "wNvqx");
        lIIlllllIlII[lIIlllllIlIl[1]] = llIlIIlIlIIIll("JOCUpFhjnESMgg5BGMZdBg==", "DmqUz");
        lIIlllllIlII[lIIlllllIlIl[5]] = llIlIIlIlIIlII("Zd+dcba6EXp8i25PHcbr6HvyhjJOyxbQ", "cIEwg");
        lIIlllllIlII[lIIlllllIlIl[6]] = llIlIIlIlIIIlI("EwE8MSM3Fg==", "CsUGB");
        lIIlllllIlII[lIIlllllIlIl[7]] = llIlIIlIlIIIll("KOFu6VN5nkw=", "PuVsY");
        lIIlllllIlII[lIIlllllIlIl[4]] = llIlIIlIlIIlII("yDFP+dpScVY=", "ytQSv");
        lIIlllllIlII[lIIlllllIlIl[8]] = llIlIIlIlIIIlI("OScZDCEEMg==", "jSxaH");
        lIIlllllIlII[lIIlllllIlIl[9]] = llIlIIlIlIIlII("KiUuvQdj00W8klWP6B6xgg==", "BYOvG");
        lIIlllllIlII[lIIlllllIlIl[10]] = llIlIIlIlIIIlI("HBw2Bxo8Czc=", "SjSuv");
        lIIlllllIlII[lIIlllllIlIl[11]] = llIlIIlIlIIIlI("BwMtPBo6FmwhHCAeIz8=", "TwLQs");
    }

    private static boolean llIlIIlIlIlIlI(int i) {
        return i != 0;
    }

    private static String llIlIIlIlIIlII(String lllllllllllllllIlllIlIIIIlIlIIll, String lllllllllllllllIlllIlIIIIlIlIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIIIlIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIIIlIlIIlI.getBytes(StandardCharsets.UTF_8)), lIIlllllIlIl[9]), "DES");
            Cipher lllllllllllllllIlllIlIIIIlIlIlIl = Cipher.getInstance("DES");
            lllllllllllllllIlllIlIIIIlIlIlIl.init(lIIlllllIlIl[1], lllllllllllllllIlllIlIIIIlIlIllI);
            return new String(lllllllllllllllIlllIlIIIIlIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlIIIIlIlIlII) {
            lllllllllllllllIlllIlIIIIlIlIlII.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIlIlIlIll(int i) {
        return i <= 0;
    }

    static {
        llIlIIlIlIIllI();
        llIlIIlIlIIlIl();
    }

    private static boolean llIlIIlIlIlIIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v104, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v106, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v95, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.bg
    public boolean dY() {
        if (!llIlIIlIlIIlll(cp(), ee()) || llIlIIlIlIlIII(cq(), this.el)) {
            return lIIlllllIlIl[0];
        }
        System.out.println("Inv: " + Bank.Inventory.getAll().size());
        HashSet<Integer> el = el();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(el);
        "".length();
        int[] iArr = new int[el.size()];
        int i = lIIlllllIlIl[0];
        while (llIlIIlIlIlIII(i, iArr.length)) {
            iArr[i] = ((Integer) arrayList.get(i)).intValue();
            i++;
            "".length();
            if ((((31 ^ 33) ^ (176 ^ 187)) & (((((8 + 2) - (-102)) + 58) ^ (((67 + 10) - (-42)) + 40)) ^ (-" ".length()))) != 0) {
                return ((((81 + 43) - 59) + 76) ^ (((37 + 134) - 125) + 124)) & (((15 ^ 25) ^ (40 ^ 25)) ^ (-" ".length()));
            }
        }
        List<Item> c2 = D.bC().c(iArr);
        List<Item> a = D.bC().a(item -> {
            return item.getName().startsWith(lIIlllllIlII[lIIlllllIlIl[11]]);
        });
        List<Item> a2 = D.bC().a(item2 -> {
            return item2.getName().startsWith(lIIlllllIlII[lIIlllllIlIl[10]]);
        });
        if (llIlIIlIlIlIIl(a2.isEmpty() ? 1 : 0) && llIlIIlIlIlIIl(Inventory.contains(item3 -> {
            return item3.getName().startsWith(lIIlllllIlII[lIIlllllIlIl[9]]);
        }) ? 1 : 0)) {
            c2.add(a2.get(lIIlllllIlIl[0]));
            "".length();
        }
        int count = lIIlllllIlIl[1] - Inventory.getCount(item4 -> {
            return item4.getName().startsWith(lIIlllllIlII[lIIlllllIlIl[8]]);
        });
        Iterator<Item> it = a.iterator();
        while (true) {
            if (!llIlIIlIlIlIlI(it.hasNext() ? 1 : 0)) {
                break;
            }
            Item next = it.next();
            if (llIlIIlIlIlIll(count)) {
                "".length();
                if (((105 ^ 59) & ((206 ^ 156) ^ (-1))) > 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else if (llIlIIlIlIllII(next)) {
                "".length();
                if ("   ".length() <= (((126 ^ 32) ^ (79 ^ 88)) & (((((67 + 52) - (-5)) + 15) ^ (((44 + 9) - (-99)) + 42)) ^ (-" ".length())))) {
                    return ((((129 + 223) - 121) + 22) ^ (((52 + 13) - (-123)) + 9)) & (((75 ^ 53) ^ (88 ^ 30)) ^ (-" ".length()));
                }
            } else {
                c2.add(next);
                "".length();
                count -= next.getQuantity();
                "".length();
                if (((52 ^ 17) & ((30 ^ 59) ^ (-1))) >= " ".length()) {
                    return "   ".length() & ("   ".length() ^ (-1));
                }
            }
        }
        if (llIlIIlIlIlIlI(c2.isEmpty() ? 1 : 0)) {
            if (llIlIIlIlIlIlI(Movement.getDestination().equals(this.al.bs) ? 1 : 0)) {
                return lIIlllllIlIl[0];
            }
            System.out.println(lIIlllllIlII[lIIlllllIlIl[0]]);
            Movement.setDestination(this.al.bs);
            return lIIlllllIlIl[2];
        } else if (!llIlIIlIlIlIlI(D.bJ() ? 1 : 0)) {
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (llIlIIlIlIlIlI(tileObject.getName().toLowerCase().contains(lIIlllllIlII[lIIlllllIlIl[7]]) ? 1 : 0)) {
                    String[] strArr = new String[lIIlllllIlIl[2]];
                    strArr[lIIlllllIlIl[0]] = lIIlllllIlII[lIIlllllIlIl[4]];
                    if (llIlIIlIlIlIlI(tileObject.hasAction(strArr) ? 1 : 0) && llIlIIlIlIlIlI(this.ak.a((Locatable) tileObject) ? 1 : 0)) {
                        ?? r0 = lIIlllllIlIl[2];
                        "".length();
                        return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return lIIlllllIlIl[0];
            });
            if (llIlIIlIlIllII(nearest)) {
                System.out.println(lIIlllllIlII[lIIlllllIlIl[5]]);
                return lIIlllllIlIl[0];
            }
            nearest.interact(lIIlllllIlII[lIIlllllIlIl[6]]);
            return lIIlllllIlIl[2];
        } else if (llIlIIlIlIlIlI(Inventory.isFull() ? 1 : 0) && llIlIIlIlIlIlI(D.bC().e(iArr) ? 1 : 0)) {
            return lIIlllllIlIl[2];
        } else {
            for (Item item5 : c2) {
                if (llIlIIlIlIllII(item5)) {
                    "".length();
                    if (" ".length() < 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else {
                    Widget widget = Widgets.get(lIIlllllIlIl[3], lIIlllllIlIl[4], item5.getSlot());
                    if (llIlIIlIlIllII(widget)) {
                        System.out.println(lIIlllllIlII[lIIlllllIlIl[2]]);
                    }
                    widget.interact(lIIlllllIlII[lIIlllllIlIl[1]]);
                    "".length();
                    if (((185 ^ 176) ^ (138 ^ 135)) <= "  ".length()) {
                        return ((44 ^ 23) ^ (121 ^ 81)) & (((9 ^ 37) ^ (6 ^ 57)) ^ (-" ".length()));
                    }
                }
            }
            return lIIlllllIlIl[2];
        }
    }
}
