package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.World;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
@TaskDesc(name = "Boarding boat", priority = 10)
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.aj  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/aj.class */
public class aj extends am {
    private static final /* synthetic */ int aF;
    private static /* synthetic */ String[] lIllIllllIIlI;
    private static final /* synthetic */ int aE;
    private final /* synthetic */ SquireZulrah aG;
    private static /* synthetic */ int[] lIllIllllIIll;

    private static boolean llIIlIIlllIIIII(Object obj) {
        return obj != null;
    }

    private static void llIIlIIllIllllI() {
        lIllIllllIIll = new int[5];
        lIllIllllIIll[0] = (6 ^ 2) & ((19 ^ 23) ^ (-1));
        lIllIllllIIll[1] = " ".length();
        lIllIllllIIll[2] = (-6153) & 16220;
        lIllIllllIIll[3] = (-((-585) & 25176)) & (-2177) & 32767;
        lIllIllllIIll[4] = "  ".length();
    }

    private static String llIIlIIllIllIll(String llllllllllllllIllIIIlIIIlIIIIIlI, String llllllllllllllIllIIIlIIIlIIIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIIIlIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIllllIIll[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIIIlIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIlIIIlIIIIIll) {
            llllllllllllllIllIIIlIIIlIIIIIll.printStackTrace();
            return null;
        }
    }

    @Inject
    protected aj(Client client, SquireZulrahConfig squireZulrahConfig, SquireZulrah squireZulrah) {
        super(client, squireZulrahConfig);
        this.aG = squireZulrah;
    }

    private static boolean llIIlIIlllIIIlI(int i, int i2) {
        return i > i2;
    }

    private static boolean llIIlIIlllIIIll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    @Override // a.u.i.p000.l.r.h.z.s.r.u.q.e.am
    public boolean ac() {
        if (llIIlIIllIlllll(this.aG.a(), EnumC0002c.DONE)) {
            return lIllIllllIIll[0];
        }
        int[] iArr = new int[lIllIllllIIll[1]];
        iArr[lIllIllllIIll[0]] = lIllIllllIIll[2];
        TileObject nearest = TileObjects.getNearest(iArr);
        if (!llIIlIIlllIIIII(nearest) || llIIlIIlllIIIIl(Movement.shouldWalk() ? 1 : 0)) {
            return lIllIllllIIll[0];
        }
        int tickCount = Static.getClient().getTickCount();
        if (!llIIlIIlllIIIlI(tickCount - this.aG.c(), lIllIllllIIll[3]) || !llIIlIIlllIIIll(this.aJ.hop() ? 1 : 0)) {
            nearest.interact(lIllIllllIIlI[lIllIllllIIll[0]]);
            return lIllIllllIIll[1];
        }
        if (llIIlIIlllIIIll(Worlds.isHopperOpen() ? 1 : 0)) {
            this.aG.a(tickCount);
        }
        World currentWorld = Worlds.getCurrentWorld();
        Worlds.hopTo(Worlds.getRandom(world -> {
            if (llIIlIIllIlllll(world, currentWorld) && llIIlIIlllIIIll(world.isNormal() ? 1 : 0) && llIIlIIlllIIIll(world.isMembers() ? 1 : 0) && llIIlIIlllIIlII(world.getLocation(), currentWorld.getLocation())) {
                ?? r0 = lIllIllllIIll[1];
                "".length();
                return ((((125 + 136) - 222) + 120) ^ (((76 + 30) - (-14)) + 35)) <= 0 ? ((((95 + 28) - 16) + 35) ^ (((53 + 164) - 93) + 52)) & (((((95 + 38) - 71) + 108) ^ (((2 + 102) - 55) + 99)) ^ (-" ".length())) : r0;
            }
            return lIllIllllIIll[0];
        }));
        return lIllIllllIIll[1];
    }

    private static boolean llIIlIIllIlllll(Object obj, Object obj2) {
        return obj != obj2;
    }

    static {
        llIIlIIllIllllI();
        llIIlIIllIlllII();
        aE = lIllIllllIIll[2];
        aF = lIllIllllIIll[3];
    }

    private static boolean llIIlIIlllIIlII(int i, int i2) {
        return i == i2;
    }

    private static boolean llIIlIIlllIIIIl(int i) {
        return i == 0;
    }

    private static void llIIlIIllIlllII() {
        lIllIllllIIlI = new String[lIllIllllIIll[1]];
        lIllIllllIIlI[lIllIllllIIll[0]] = llIIlIIllIllIll("2/ivD0BcZZpYz1pOovz5JA==", "XQfyI");
    }
}
