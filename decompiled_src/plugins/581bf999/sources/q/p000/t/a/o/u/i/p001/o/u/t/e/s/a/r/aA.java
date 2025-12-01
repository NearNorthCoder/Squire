package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Grabbing Pickaxe", priority = 100, blocking = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aA  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/aA.class */
public class aA extends AbstractC0026az {
    private static /* synthetic */ String[] llIIIlllIII;
    private static /* synthetic */ int[] llIIIlllIIl;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bl() {
        if (lIIlllllIlIIIl(Vars.getBit(llIIIlllIIl[0]))) {
            return llIIIlllIIl[1];
        }
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (lIIlllllIlIlIl(tileObject.getId(), llIIIlllIIl[9]) && lIIlllllIlIIll(Reachable.isInteractable(tileObject) ? 1 : 0)) {
                ?? r0 = llIIIlllIIl[3];
                "".length();
                return "  ".length() <= 0 ? ((((215 + 12) - 73) + 76) ^ (((152 + 90) - 105) + 43)) & (((201 ^ 166) ^ (255 ^ 194)) ^ (-" ".length())) : r0;
            }
            return llIIIlllIIl[1];
        });
        if (lIIlllllIlIIlI(nearest)) {
            return llIIIlllIIl[1];
        }
        if (lIIlllllIlIIll(Inventory.isFull() ? 1 : 0)) {
            int i = llIIIlllIIl[1];
            List all = Inventory.getAll(item -> {
                String str = llIIIlllIII[llIIIlllIIl[7]];
                if (lIIlllllIlIIll(item.hasAction((v1) -> {
                    return r1.equals(v1);
                }) ? 1 : 0)) {
                    String str2 = llIIIlllIII[llIIIlllIIl[8]];
                    if (lIIlllllIlIIll(item.hasAction((v1) -> {
                        return r1.equals(v1);
                    }) ? 1 : 0)) {
                        ?? r0 = llIIIlllIIl[3];
                        "".length();
                        return (-(19 ^ 23)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return llIIIlllIIl[1];
            });
            if (lIIlllllIlIIIl(all.isEmpty() ? 1 : 0)) {
                int i2 = llIIIlllIIl[1];
                while (lIIlllllIlIlII(i2, Math.min(llIIIlllIIl[2], all.size() - llIIIlllIIl[3]))) {
                    ((Item) all.get(i2)).interact(llIIIlllIII[llIIIlllIIl[1]]);
                    i = llIIIlllIIl[3];
                    String str = llIIIlllIII[llIIIlllIIl[3]];
                    Object[] objArr = new Object[llIIIlllIIl[3]];
                    objArr[llIIIlllIIl[1]] = ((Item) all.get(i2)).getName();
                    Log.info(str, objArr);
                    i2++;
                    "".length();
                    if (0 != 0) {
                        return " ".length() & (" ".length() ^ (-" ".length()));
                    }
                }
            }
            if (lIIlllllIlIIll(i)) {
                return llIIIlllIIl[3];
            }
            List all2 = Inventory.getAll(item2 -> {
                String str2 = llIIIlllIII[llIIIlllIIl[5]];
                if (lIIlllllIlIIll(item2.hasAction((v1) -> {
                    return r1.equals(v1);
                }) ? 1 : 0)) {
                    String str3 = llIIIlllIII[llIIIlllIIl[6]];
                    if (lIIlllllIlIIll(item2.hasAction((v1) -> {
                        return r1.equals(v1);
                    }) ? 1 : 0)) {
                        ?? r0 = llIIIlllIIl[3];
                        "".length();
                        return "  ".length() < 0 ? ((((51 + 18) - (-45)) + 13) ^ (167 ^ 193)) & (((67 ^ 84) ^ (58 ^ 52)) ^ (-" ".length())) : r0;
                    }
                }
                return llIIIlllIIl[1];
            });
            if (lIIlllllIlIIIl(all2.isEmpty() ? 1 : 0)) {
                int i3 = llIIIlllIIl[1];
                while (lIIlllllIlIlII(i3, Math.min(llIIIlllIIl[2], all2.size() - llIIIlllIIl[3]))) {
                    ((Item) all2.get(i3)).interact(llIIIlllIII[llIIIlllIIl[4]]);
                    i3++;
                    "".length();
                    if ("  ".length() == " ".length()) {
                        return ((((2 + 45) - 32) + 141) ^ (((158 + 121) - 255) + 152)) & (((((21 + 50) - (-21)) + 79) ^ (((17 + 122) - 17) + 13)) ^ (-" ".length()));
                    }
                }
                return llIIIlllIIl[3];
            }
        }
        nearest.interact(llIIIlllIII[llIIIlllIIl[2]]);
        return llIIIlllIIl[3];
    }

    private static boolean lIIlllllIlIIIl(int i) {
        return i == 0;
    }

    private static boolean lIIlllllIlIlII(int i, int i2) {
        return i < i2;
    }

    private static String lIIlllllIIlllI(String llllllllllllllllIlIIIIlIlllllIll, String llllllllllllllllIlIIIIlIlllllIlI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIlIIIIlIlllllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIlIIIIlIlllllIlI.toCharArray();
        int llllllllllllllllIlIIIIlIllllIlll = llIIIlllIIl[1];
        char[] charArray2 = str.toCharArray();
        int llllllllllllllllIlIIIIlIllllIIII = charArray2.length;
        int i = llIIIlllIIl[1];
        while (lIIlllllIlIlII(i, llllllllllllllllIlIIIIlIllllIIII)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllllIlIIIIlIllllIlll % charArray.length]));
            "".length();
            llllllllllllllllIlIIIIlIllllIlll++;
            i++;
            "".length();
            if (((true ^ true) ^ (true ^ true)) != ((true ^ true) ^ (true ^ true))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIlllllIlIIlI(Object obj) {
        return obj == null;
    }

    private static void lIIlllllIIllll() {
        llIIIlllIII = new String[llIIIlllIIl[10]];
        llIIIlllIII[llIIIlllIIl[1]] = lIIlllllIIllII("d2KaTLuo08w=", "zITKL");
        llIIIlllIII[llIIIlllIIl[3]] = lIIlllllIIllII("V3z1hgYmq9W7sNMLGABX3Q==", "DXaVT");
        llIIIlllIII[llIIIlllIIl[4]] = lIIlllllIIllIl("hKqEO/LV8M4=", "aEvpH");
        llIIIlllIII[llIIIlllIIl[2]] = lIIlllllIIllII("3UZeFq9glWAKdK3aOH9EtQ==", "imqtH");
        llIIIlllIII[llIIIlllIIl[5]] = lIIlllllIIlllI("EBUWNj8=", "UxfBF");
        llIIIlllIII[llIIIlllIIl[6]] = lIIlllllIIllII("GEScUlxf1DI=", "MbHAR");
        llIIIlllIII[llIIIlllIIl[7]] = lIIlllllIIllII("/FIlQFiQ+eI=", "nCKmo");
        llIIIlllIII[llIIIlllIIl[8]] = lIIlllllIIlllI("KDQXCg==", "lFxzl");
    }

    private static String lIIlllllIIllII(String llllllllllllllllIlIIIIlIllIllIIl, String llllllllllllllllIlIIIIlIllIllIII) {
        try {
            SecretKeySpec llllllllllllllllIlIIIIlIllIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIIlIllIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIlllIIl[4], llllllllllllllllIlIIIIlIllIlllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIIlIllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIIIlIllIllIlI) {
            llllllllllllllllIlIIIIlIllIllIlI.printStackTrace();
            return null;
        }
    }

    private static String lIIlllllIIllIl(String llllllllllllllllIlIIIIlIlllIIllI, String llllllllllllllllIlIIIIlIlllIIlIl) {
        try {
            SecretKeySpec llllllllllllllllIlIIIIlIlllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIIlIlllIIlIl.getBytes(StandardCharsets.UTF_8)), llIIIlllIIl[10]), "DES");
            Cipher llllllllllllllllIlIIIIlIlllIlIII = Cipher.getInstance("DES");
            llllllllllllllllIlIIIIlIlllIlIII.init(llIIIlllIIl[4], llllllllllllllllIlIIIIlIlllIlIIl);
            return new String(llllllllllllllllIlIIIIlIlllIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIIlIlllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIIIlIlllIIlll) {
            llllllllllllllllIlIIIIlIlllIIlll.printStackTrace();
            return null;
        }
    }

    private static void lIIlllllIlIIII() {
        llIIIlllIIl = new int[11];
        llIIIlllIIl[0] = (-((-21035) & 21438)) & (-17925) & 32767;
        llIIIlllIIl[1] = ((((121 + 103) - 174) + 148) ^ (((93 + 60) - 12) + 18)) & (((34 ^ 19) ^ (5 ^ 109)) ^ (-" ".length()));
        llIIIlllIIl[2] = "   ".length();
        llIIIlllIIl[3] = " ".length();
        llIIIlllIIl[4] = "  ".length();
        llIIIlllIIl[5] = (((81 + 12) - 56) + 125) ^ (((135 + 97) - 117) + 51);
        llIIIlllIIl[6] = (((145 + 120) - 209) + 126) ^ (((120 + 133) - 206) + 132);
        llIIIlllIIl[7] = (79 ^ 101) ^ (65 ^ 109);
        llIIIlllIIl[8] = 145 ^ 150;
        llIIIlllIIl[9] = (-((-8670) & 28127)) & (-33) & 64957;
        llIIIlllIIl[10] = (164 ^ 148) ^ (184 ^ 128);
    }

    private static boolean lIIlllllIlIIll(int i) {
        return i != 0;
    }

    @Inject
    protected aA(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    static {
        lIIlllllIlIIII();
        lIIlllllIIllll();
    }

    private static boolean lIIlllllIlIlIl(int i, int i2) {
        return i == i2;
    }
}
