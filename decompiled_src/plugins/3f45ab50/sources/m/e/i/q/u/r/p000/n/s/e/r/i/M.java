package m.e.i.q.u.r.p000.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.AnimationID;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Worlds;
@TaskDesc(name = "Hopping to avoid nearby player", priority = 10, blocking = true)
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.M  reason: invalid package */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/M.class */
public class M extends Task {
    private final /* synthetic */ SquireMinerConfig ap;
    private static /* synthetic */ String[] lllllIlIllll;
    private static /* synthetic */ int[] lllllIllIIII;

    static {
        lIIlIIlllIIIIIl();
        lIIlIIlllIIIIII();
    }

    @Inject
    public M(SquireMinerConfig squireMinerConfig) {
        this.ap = squireMinerConfig;
    }

    private static boolean lIIlIIlllIIIlIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    public boolean b(int i) {
        Field[] declaredFields = AnimationID.class.getDeclaredFields();
        int length = declaredFields.length;
        int i2 = lllllIllIIII[0];
        while (lIIlIIlllIIIIlI(i2, length)) {
            Field field = declaredFields[i2];
            if (lIIlIIlllIIIIll(field.getName().startsWith(lllllIlIllll[lllllIllIIII[0]]) ? 1 : 0)) {
                try {
                    if (lIIlIIlllIIIlII(field.getInt(null), i)) {
                        return lllllIllIIII[1];
                    }
                    "".length();
                    if ((-" ".length()) >= ((((7 + 56) - (-31)) + 47) ^ (((136 + 112) - 229) + 118))) {
                        return " ".length() & (" ".length() ^ (-" ".length()));
                    }
                } catch (IllegalAccessException e) {
                }
            }
            i2++;
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lllllIllIIII[0];
    }

    private static boolean lIIlIIlllIIIlll(int i, int i2) {
        return i != i2;
    }

    private static boolean lIIlIIlllIIIIll(int i) {
        return i != 0;
    }

    private static boolean lIIlIIlllIIIIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIIlllIIIlII(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    public boolean run() {
        if (!lIIlIIlllIIIlIl(this.ap.activity(), EnumC0000a.VOLCANIC_ASH) && !lIIlIIlllIIIllI(Players.getNearest(player -> {
            if (lIIlIIlllIIIlIl(player, Players.getLocal()) && lIIlIIlllIIIIll(b(player.getAnimation()) ? 1 : 0)) {
                ?? r0 = lllllIllIIII[1];
                "".length();
                return ((38 ^ 44) ^ (40 ^ 38)) == (((123 ^ 57) ^ (119 ^ 5)) & (((((35 + 58) - 78) + 116) ^ (((120 + 34) - 91) + 116)) ^ (-" ".length()))) ? ((((18 + 99) - 107) + 129) ^ (((6 + 17) - (-3)) + 172)) & (((((60 + 118) - 124) + 167) ^ (((127 + 142) - 130) + 5)) ^ (-" ".length())) : r0;
            }
            return lllllIllIIII[0];
        }))) {
            Worlds.hopTo(Worlds.getRandom(world -> {
                if (lIIlIIlllIIIIll(world.isNormal() ? 1 : 0) && lIIlIIlllIIIIll(world.isMembers() ? 1 : 0) && lIIlIIlllIIIlll(world.getId(), Worlds.getCurrentId())) {
                    ?? r0 = lllllIllIIII[1];
                    "".length();
                    return "  ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lllllIllIIII[0];
            }));
            sleep(lllllIllIIII[2]);
            return lllllIllIIII[1];
        }
        return lllllIllIIII[0];
    }

    private static void lIIlIIlllIIIIIl() {
        lllllIllIIII = new int[4];
        lllllIllIIII[0] = ((((18 + 66) - 61) + 112) ^ (((95 + 144) - 74) + 2)) & (((((82 + 109) - 146) + 140) ^ (((55 + 131) - 38) + 5)) ^ (-" ".length()));
        lllllIllIIII[1] = " ".length();
        lllllIllIIII[2] = (9 ^ 73) ^ (77 ^ 9);
        lllllIllIIII[3] = "  ".length();
    }

    private static String lIIlIIllIllllll(String lllllllllllllllIIlIIlIIlllIlllll, String lllllllllllllllIIlIIlIIlllIllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIIlllIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllllIllIIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIIlllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIlIIllllIIIII) {
            lllllllllllllllIIlIIlIIllllIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIlllIIIllI(Object obj) {
        return obj == null;
    }

    private static void lIIlIIlllIIIIII() {
        lllllIlIllll = new String[lllllIllIIII[1]];
        lllllIlIllll[lllllIllIIII[0]] = lIIlIIllIllllll("05dtB6OG4U4=", "nQGDm");
    }
}
