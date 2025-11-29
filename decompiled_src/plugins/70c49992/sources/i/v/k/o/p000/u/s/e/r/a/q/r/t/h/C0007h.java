package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import com.google.gson.Gson;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Item;
import net.runelite.client.config.ConfigManager;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;
import org.jetbrains.annotations.Nullable;
@Singleton
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.h  reason: invalid package and case insensitive filesystem */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/h.class */
public class C0007h {
    private static final /* synthetic */ Gson S;
    private final /* synthetic */ ConfigManager T;
    private static /* synthetic */ int[] lIlIlIlIllIII;
    private /* synthetic */ boolean U;
    private static /* synthetic */ String[] lIlIlIlIlIlll;

    private static boolean lIllllllIlIIIII(Object obj) {
        return obj == null;
    }

    public Item a(Predicate<Item> predicate) {
        int[] iArr = new int[lIlIlIlIllIII[1]];
        iArr[lIlIlIlIllIII[2]] = lIlIlIlIllIII[3];
        if (lIllllllIIllllI(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIlIlIlIllIII[1]];
            iArr2[lIlIlIlIllIII[2]] = lIlIlIlIllIII[3];
            return Inventory.getFirst(iArr2);
        }
        return (Item) Inventory.getAll().stream().filter(predicate).filter((v0) -> {
            return v0.isTradable();
        }).min(Comparator.comparingInt(item -> {
            return item.getQuantity() * Prices.getItemPrice(item.getId());
        })).orElse(null);
    }

    @Nullable
    public static Item a(List<C0010k> list) {
        Item item = null;
        int i2 = lIlIlIlIllIII[0];
        for (Item item2 : Inventory.getAll()) {
            Iterator<C0010k> it = list.iterator();
            while (true) {
                if (!lIllllllIIllllI(it.hasNext() ? 1 : 0)) {
                    break;
                }
                C0010k next = it.next();
                if (lIllllllIIllllI(next.M().equals(item2.getName()) ? 1 : 0) && lIllllllIIllllI(next.O() ? 1 : 0)) {
                    int itemPrice = Prices.getItemPrice(item2.getId()) * item2.getQuantity();
                    if (lIllllllIIlllll(itemPrice, i2)) {
                        item = item2;
                        i2 = itemPrice;
                        "".length();
                        if ("  ".length() == " ".length()) {
                            return null;
                        }
                    }
                } else {
                    "".length();
                    if ("   ".length() <= 0) {
                        return null;
                    }
                }
            }
            "".length();
            if ((((31 ^ 35) ^ (161 ^ 192)) & (((144 ^ 176) ^ (97 ^ 28)) ^ (-" ".length()))) > ((99 ^ 127) ^ (118 ^ 110))) {
                return null;
            }
        }
        return item;
    }

    private static void lIllllllIIlllII() {
        lIlIlIlIlIlll = new String[lIlIlIlIllIII[5]];
        lIlIlIlIlIlll[lIlIlIlIllIII[2]] = lIllllllIIllIIl("Ezc8CBogZTEOVCEsKwVUJmUhBBciKzFBHTMgKEEAKGUhExs3aWUDATNlJgAaKSox", "GEEat");
        lIlIlIlIlIlll[lIlIlIlIllIII[1]] = lIllllllIIllIlI("QTbO4rNL/lM=", "GOvzV");
        lIlIlIlIlIlll[lIlIlIlIllIII[4]] = lIllllllIIllIll("Za8E1dfkbxA=", "VuWlo");
    }

    private static String lIllllllIIllIll(String llllllllllllllIllIlIlIlIIIlIIIlI, String llllllllllllllIllIlIlIlIIIlIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIlIIIlIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIlIllIII[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIlIIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIlIlIIIlIIIll) {
            llllllllllllllIllIlIlIlIIIlIIIll.printStackTrace();
            return null;
        }
    }

    private static String lIllllllIIllIlI(String llllllllllllllIllIlIlIlIIIlIllll, String llllllllllllllIllIlIlIlIIIlIlllI) {
        try {
            SecretKeySpec llllllllllllllIllIlIlIlIIIllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIlIIIlIlllI.getBytes(StandardCharsets.UTF_8)), lIlIlIlIllIII[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIlIllIII[4], llllllllllllllIllIlIlIlIIIllIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIlIIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIlIlIIIllIIII) {
            llllllllllllllIllIlIlIlIIIllIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllllIIllllI(int i2) {
        return i2 != 0;
    }

    @Inject
    public C0007h(ConfigManager configManager) {
        this.T = configManager;
    }

    public void K() {
        Item a = a(item -> {
            String[] strArr = new String[lIlIlIlIllIII[1]];
            strArr[lIlIlIlIllIII[2]] = lIlIlIlIlIlll[lIlIlIlIllIII[4]];
            return item.hasAction(strArr);
        });
        if (lIllllllIlIIIII(a)) {
            a = a(item2 -> {
                return lIlIlIlIllIII[1];
            });
            if (lIllllllIlIIIII(a)) {
                Log.info(lIlIlIlIlIlll[lIlIlIlIllIII[2]]);
                return;
            }
        }
        a.interact(lIlIlIlIlIlll[lIlIlIlIllIII[1]]);
    }

    private static boolean lIllllllIIlllll(int i2, int i3) {
        return i2 < i3;
    }

    private static void lIllllllIIlllIl() {
        lIlIlIlIllIII = new int[7];
        lIlIlIlIllIII[0] = (-" ".length()) & (-1) & Integer.MAX_VALUE;
        lIlIlIlIllIII[1] = " ".length();
        lIlIlIlIllIII[2] = (222 ^ 197) & ((114 ^ 105) ^ (-1));
        lIlIlIlIllIII[3] = (-((-7) & 31015)) & (-1) & 32759;
        lIlIlIlIllIII[4] = "  ".length();
        lIlIlIlIllIII[5] = "   ".length();
        lIlIlIlIllIII[6] = (112 ^ 123) ^ "   ".length();
    }

    private static String lIllllllIIllIIl(String llllllllllllllIllIlIlIlIIIllllll, String llllllllllllllIllIlIlIlIIlIIIIll) {
        String llllllllllllllIllIlIlIlIIIllllll2 = new String(Base64.getDecoder().decode(llllllllllllllIllIlIlIlIIIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllIlIlIlIIlIIIIll.toCharArray();
        int llllllllllllllIllIlIlIlIIlIIIIII = lIlIlIlIllIII[2];
        char[] charArray2 = llllllllllllllIllIlIlIlIIIllllll2.toCharArray();
        int length = charArray2.length;
        int i2 = lIlIlIlIllIII[2];
        while (lIllllllIIlllll(i2, length)) {
            char llllllllllllllIllIlIlIlIIlIIIlIl = charArray2[i2];
            sb.append((char) (llllllllllllllIllIlIlIlIIlIIIlIl ^ charArray[llllllllllllllIllIlIlIlIIlIIIIII % charArray.length]));
            "".length();
            llllllllllllllIllIlIlIlIIlIIIIII++;
            i2++;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIllllllIIlllIl();
        lIllllllIIlllII();
        S = new Gson();
    }

    public void d(boolean z) {
        this.U = z;
    }

    public boolean L() {
        return this.U;
    }
}
