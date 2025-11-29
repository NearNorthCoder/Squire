package u.l.n.q.r.p.p000.u.r.d.i.e.e.s;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.events.ItemSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Looting Sceptre", priority = 650, register = true, blocking = true)
/* renamed from: u.l.n.q.r.p.-.u.r.d.i.e.e.s.f  reason: invalid package */
/* loaded from: squire-plunder-0.1.0.jar:u/l/n/q/r/p/-/u/r/d/i/e/e/s/f.class */
public class f extends Task {
    private final /* synthetic */ a y;
    private static /* synthetic */ int[] llllllIlllIl;
    private final /* synthetic */ Client z;
    private static /* synthetic */ String[] llllllIlllII;

    private static String lIIlIlIIlIIlllI(String lllllllllllllllIIlIIllIlIlIlIIlI, String lllllllllllllllIIlIIllIlIlIlIIIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllIlIlIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIlIlIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllllIlllIl[2], lllllllllllllllIIlIIllIlIlIlIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIlIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIllIlIlIlIIll) {
            lllllllllllllllIIlIIllIlIlIlIIll.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlIIlIlIIIl() {
        llllllIlllIl = new int[11];
        llllllIlllIl[0] = ((((31 + 115) - (-63)) + 9) ^ (((80 + 55) - 78) + 75)) & (((((104 + 184) - 165) + 82) ^ (((103 + 26) - 120) + 138)) ^ (-" ".length()));
        llllllIlllIl[1] = " ".length();
        llllllIlllIl[2] = "  ".length();
        llllllIlllIl[3] = "   ".length();
        llllllIlllIl[4] = (195 ^ 165) ^ (206 ^ 172);
        llllllIlllIl[5] = 127 ^ 122;
        llllllIlllIl[6] = 162 ^ 164;
        llllllIlllIl[7] = 138 ^ 141;
        llllllIlllIl[8] = 100 ^ 108;
        llllllIlllIl[9] = 183 ^ 190;
        llllllIlllIl[10] = 82 ^ 88;
    }

    private static void lIIlIlIIlIlIIII() {
        llllllIlllII = new String[llllllIlllIl[10]];
        llllllIlllII[llllllIlllIl[0]] = lIIlIlIIlIIllIl("AzsmOQ==", "GIIIt");
        llllllIlllII[llllllIlllIl[1]] = lIIlIlIIlIIlllI("KEWTQBiXcv0=", "lyWEP");
        llllllIlllII[llllllIlllIl[2]] = lIIlIlIIlIIllll("Co+GxIm5G8M=", "Wuagp");
        llllllIlllII[llllllIlllIl[3]] = lIIlIlIIlIIllll("zqn2xI2Z3oQ=", "RiYxv");
        llllllIlllII[llllllIlllIl[4]] = lIIlIlIIlIIllll("CDEwjoRibwOt21hLQOZxYEZFoWcdF2mc", "Xebxq");
        llllllIlllII[llllllIlllIl[5]] = lIIlIlIIlIIlllI("UBUdGI+pCDx6ZCu8NIhzqD27L7SjiHMj", "oBZGx");
        llllllIlllII[llllllIlllIl[6]] = lIIlIlIIlIIllll("Xmy0UBYREho=", "aXyAI");
        llllllIlllII[llllllIlllIl[7]] = lIIlIlIIlIIllll("qpkyw0tFE/c=", "cXvdE");
        llllllIlllII[llllllIlllIl[8]] = lIIlIlIIlIIllll("yyPIEOjWD1A=", "CSMlC");
        llllllIlllII[llllllIlllIl[9]] = lIIlIlIIlIIllIl("Bw0SFCk4DVQVaCQGFhY8JQA=", "WesfH");
    }

    private static boolean lIIlIlIIlIlIlII(Object obj) {
        return obj != null;
    }

    private static String lIIlIlIIlIIllIl(String lllllllllllllllIIlIIllIlIIllIlIl, String lllllllllllllllIIlIIllIlIIllIlII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIllIlIIllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIIllIlIIllIlII.toCharArray();
        int lllllllllllllllIIlIIllIlIIllIIIl = llllllIlllIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llllllIlllIl[0];
        while (lIIlIlIIlIlIlIl(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIlIIllIlIIllIIIl % charArray.length]));
            "".length();
            lllllllllllllllIIlIIllIlIIllIIIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean run() {
        if (lIIlIlIIlIlIIlI(TileItems.getNearest(tileItem -> {
            return tileItem.getName().contains(llllllIlllII[llllllIlllIl[9]]);
        }))) {
            return llllllIlllIl[0];
        }
        if (!lIIlIlIIlIlIIll(Inventory.isFull() ? 1 : 0)) {
            TileItems.getNearest(tileItem2 -> {
                return tileItem2.getName().contains(llllllIlllII[llllllIlllIl[5]]);
            }).interact(llllllIlllII[llllllIlllIl[3]]);
            return llllllIlllIl[1];
        }
        Item first = Inventory.getFirst(item -> {
            return item.getName().contains(llllllIlllII[llllllIlllIl[8]]);
        });
        if (lIIlIlIIlIlIlII(first)) {
            first.interact(llllllIlllII[llllllIlllIl[0]]);
            return llllllIlllIl[1];
        }
        Item first2 = Inventory.getFirst(item2 -> {
            return item2.getName().contains(llllllIlllII[llllllIlllIl[7]]);
        });
        if (lIIlIlIIlIlIlII(first2)) {
            first2.interact(llllllIlllII[llllllIlllIl[1]]);
            return llllllIlllIl[1];
        }
        Item first3 = Inventory.getFirst(item3 -> {
            String[] strArr = new String[llllllIlllIl[1]];
            strArr[llllllIlllIl[0]] = llllllIlllII[llllllIlllIl[6]];
            return item3.hasAction(strArr);
        });
        if (lIIlIlIIlIlIlII(first3)) {
            first3.interact(llllllIlllII[llllllIlllIl[2]]);
            return llllllIlllIl[1];
        }
        return llllllIlllIl[0];
    }

    private static boolean lIIlIlIIlIlIIll(int i) {
        return i != 0;
    }

    private static boolean lIIlIlIIlIlIIlI(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIlIIlIlIlIl(int i, int i2) {
        return i < i2;
    }

    private static String lIIlIlIIlIIllll(String lllllllllllllllIIlIIllIlIlIIIIll, String lllllllllllllllIIlIIllIlIlIIIlII) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllIlIlIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIlIlIIIlII.getBytes(StandardCharsets.UTF_8)), llllllIlllIl[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllllIlllIl[2], lllllllllllllllIIlIIllIlIlIIlIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIlIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIllIlIlIIIllI) {
            lllllllllllllllIIlIIllIlIlIIIllI.printStackTrace();
            return null;
        }
    }

    @Subscribe
    private void a(ItemSpawned itemSpawned) {
        if (lIIlIlIIlIlIIll(itemSpawned.getItem().getName().contains(llllllIlllII[llllllIlllIl[4]]) ? 1 : 0)) {
            this.y.b(this.y.e() + llllllIlllIl[1]);
        }
    }

    static {
        lIIlIlIIlIlIIIl();
        lIIlIlIIlIlIIII();
    }

    @Inject
    public f(a aVar, Client client) {
        this.y = aVar;
        this.z = client;
    }
}
