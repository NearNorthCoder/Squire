package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.CollisionMap;
import net.unethicalite.client.Static;
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.A  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/A.class */
public abstract class A extends C {
    protected /* synthetic */ C0008e br;
    protected /* synthetic */ CollisionMap cF;
    private static /* synthetic */ int[] llllIlIIIlll;
    private static /* synthetic */ String[] llllIlIIIlII;

    private static void lIIlIIIIIlllIII() {
        llllIlIIIlll = new int[4];
        llllIlIIIlll[0] = ((124 ^ 86) ^ (105 ^ 32)) & (((((115 + 65) - (-2)) + 33) ^ (((45 + 34) - (-89)) + 12)) ^ (-" ".length()));
        llllIlIIIlll[1] = " ".length();
        llllIlIIIlll[2] = "  ".length();
        llllIlIIIlll[3] = 70 ^ 78;
    }

    static {
        lIIlIIIIIlllIII();
        lIIlIIIIIllIllI();
    }

    private static String lIIlIIIIIllIlIl(String lllllllllllllllIIlIllIllIllIIIll, String lllllllllllllllIIlIllIllIllIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIllIllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllIllIllIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllIllIllIIlIl.init(llllIlIIIlll[2], secretKeySpec);
            return new String(lllllllllllllllIIlIllIllIllIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIllIllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIllIllIIlII) {
            lllllllllllllllIIlIllIllIllIIlII.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public A(C0013j c0013j, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0008e c0008e) {
        super(c0013j, client, squireNightmareConfig, squireNightmarePlugin);
        this.br = c0008e;
        this.cF = Static.getGlobalCollisionMap();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean j(WorldPoint worldPoint) {
        return a(worldPoint, List.of());
    }

    private static boolean lIIlIIIIIlllIlI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    protected boolean a(WorldPoint worldPoint, List<WorldPoint> list) {
        Player local = Players.getLocal();
        if (lIIlIIIIIlllIIl(local)) {
            return llllIlIIIlll[0];
        }
        WorldPoint worldLocation = local.getWorldLocation();
        if (!lIIlIIIIIlllIIl(worldPoint)) {
            Movement.setDestination(worldPoint);
            return llllIlIIIlll[1];
        }
        Log.error(llllIlIIIlII[llllIlIIIlll[0]]);
        if (lIIlIIIIIlllIlI(list.contains(worldLocation) ? 1 : 0)) {
            Log.error(llllIlIIIlII[llllIlIIIlll[1]]);
        }
        return llllIlIIIlll[0];
    }

    private static String lIIlIIIIIllIlII(String lllllllllllllllIIlIllIllIlIlIllI, String lllllllllllllllIIlIllIllIlIlIIll) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIllIlIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIllIlIlIIll.getBytes(StandardCharsets.UTF_8)), llllIlIIIlll[3]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIlIIIlll[2], lllllllllllllllIIlIllIllIlIllIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIllIlIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIllIlIlIlll) {
            lllllllllllllllIIlIllIllIlIlIlll.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIIIIllIllI() {
        llllIlIIIlII = new String[llllIlIIIlll[2]];
        llllIlIIIlII[llllIlIIIlll[0]] = lIIlIIIIIllIlII("EP4L4K7gTARtqqVy4TXgDfno2YbP2H0BKJ/A2sIG0UKHc7DWdfnALc/ThlpiD7I3ZN+dTgbz5Ss=", "djjdf");
        llllIlIIIlII[llllIlIIIlll[1]] = lIIlIIIIIllIlIl("NLtFvLUIov5b6V62O7cFkD802ryScuwBb0of7MlhBIy3IWbU2wLye5whSwBUqpP5RnCY9GcF626NHwicjsxxStidjlo4T6Qo0qULxvQiQ1m0uWKtZy8GQw==", "wdEEz");
    }

    private static boolean lIIlIIIIIlllIIl(Object obj) {
        return obj == null;
    }
}
