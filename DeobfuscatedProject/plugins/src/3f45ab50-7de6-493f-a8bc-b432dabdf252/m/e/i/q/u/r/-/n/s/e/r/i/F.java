/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import m.e.i.q.u.r.-.n.s.e.r.i.C;
import m.e.i.q.u.r.-.n.s.e.r.i.T;
import m.e.i.q.u.r.-.n.s.e.r.i.d;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Walking to veins", priority=10, blocking=true)
public class F
extends C {
    private static /* synthetic */ String[] llllllIIIIII;
    private static /* synthetic */ int[] llllllIIIIIl;
    private static final /* synthetic */ RectangularArea ac;

    @Inject
    public F(SquireMinerConfig squireMinerConfig, SquireMiner squireMiner, T t2) {
        super(squireMinerConfig, squireMiner, t2);
    }

    static {
        F.lIIlIlIIIIlIIIl();
        F.lIIlIlIIIIlIIII();
        ac = new RectangularArea(llllllIIIIIl[8], llllllIIIIIl[9], llllllIIIIIl[10], llllllIIIIIl[11]);
    }

    private static boolean lIIlIlIIIIlIlll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIlIlIIIIlIlII(int n2) {
        return n2 != 0;
    }

    private static void lIIlIlIIIIlIIIl() {
        llllllIIIIIl = new int[13];
        F.llllllIIIIIl[0] = (0x4E ^ 0x15 ^ (0x37 ^ 0x57)) & (0xC5 ^ 0xAA ^ (0x27 ^ 0x73) ^ -" ".length());
        F.llllllIIIIIl[1] = 127 + 0 - 6 + 64 ^ 112 + 65 - 40 + 45;
        F.llllllIIIIIl[2] = 156 + 47 - 36 + 16 ^ 44 + 19 - -10 + 96;
        F.llllllIIIIIl[3] = -(0xFFFFF7FF & 0x7B99) & (0xFFFFFBFF & 0x7FBE);
        F.llllllIIIIIl[4] = " ".length();
        F.llllllIIIIIl[5] = -(0xFFFFD65B & 0x3DAF) & (0xFFFFDEFE & 0x7F6F);
        F.llllllIIIIIl[6] = 0xC2 ^ 0xC6;
        F.llllllIIIIIl[7] = "  ".length();
        F.llllllIIIIIl[8] = 0xFFFFEFFE & 0x1E9D;
        F.llllllIIIIIl[9] = -(0xFFFFBC5F & 0x63B6) & (0xFFFFB67F & 0x7FBD);
        F.llllllIIIIIl[10] = -(0xFFFFFBFF & 0x4511) & (0xFFFFDFBF & 0x6FFF);
        F.llllllIIIIIl[11] = 0xFFFFDFFE & 0x361D;
        F.llllllIIIIIl[12] = 0x1B ^ 0x68 ^ (0x55 ^ 0x2E);
    }

    private static boolean lIIlIlIIIIlIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIlIIIIlIIll(int n2) {
        return n2 == 0;
    }

    private static String lIIlIlIIIIIllll(String lllllllllllllllIIlIIIllllllIllll, String lllllllllllllllIIlIIIlllllllIIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIlllllllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIlllllllIIII.getBytes(StandardCharsets.UTF_8)), llllllIIIIIl[12]), "DES");
            Cipher lllllllllllllllIIlIIIlllllllIIll = Cipher.getInstance("DES");
            lllllllllllllllIIlIIIlllllllIIll.init(llllllIIIIIl[7], lllllllllllllllIIlIIIlllllllIlII);
            return new String(lllllllllllllllIIlIIIlllllllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIllllllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIIlllllllIIlI) {
            lllllllllllllllIIlIIIlllllllIIlI.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean t() {
        void lllllllllllllllIIlIIIllllllllIll;
        F lllllllllllllllIIlIIIlllllllllII;
        Player player = Players.getLocal();
        if (!F.lIIlIlIIIIlIIlI(player) || !F.lIIlIlIIIIlIIll(player.isAnimating() ? 1 : 0) || F.lIIlIlIIIIlIlII(this.Z.I() ? 1 : 0)) {
            return llllllIIIIIl[0];
        }
        if (!F.lIIlIlIIIIlIIll(lllllllllllllllIIlIIIlllllllllII.Z.G() ? 1 : 0) || F.lIIlIlIIIIlIlII(lllllllllllllllIIlIIIlllllllllII.Z.F() ? 1 : 0)) {
            return llllllIIIIIl[0];
        }
        TileObject lllllllllllllllIIlIIIllllllllIlI = lllllllllllllllIIlIIIlllllllllII.u();
        if (F.lIIlIlIIIIlIIlI(lllllllllllllllIIlIIIllllllllIlI) && F.lIIlIlIIIIlIlIl(lllllllllllllllIIlIIIllllllllIlI.getWorldLocation().distanceTo((Locatable)lllllllllllllllIIlIIIllllllllIll), llllllIIIIIl[1]) && F.lIIlIlIIIIlIlII(Reachable.isInteractable((Locatable)lllllllllllllllIIlIIIllllllllIlI) ? 1 : 0)) {
            return llllllIIIIIl[0];
        }
        if (F.lIIlIlIIIIlIIll(Movement.shouldWalk() ? 1 : 0)) {
            return llllllIIIIIl[0];
        }
        if (F.lIIlIlIIIIlIIll(Movement.isRunEnabled() ? 1 : 0) && F.lIIlIlIIIIlIllI(Movement.getRunEnergy(), llllllIIIIIl[2])) {
            Movement.toggleRun();
        }
        if (F.lIIlIlIIIIlIlll((Object)lllllllllllllllIIlIIIlllllllllII.X.mlmArea(), (Object)d.UPPER_FLOOR) && (!F.lIIlIlIIIIlIIll(ac.contains((Locatable)lllllllllllllllIIlIIIllllllllIll) ? 1 : 0) || F.lIIlIlIIIIlIIll(Vars.getBit((int)llllllIIIIIl[3])))) {
            int[] nArray = new int[llllllIIIIIl[4]];
            nArray[F.llllllIIIIIl[0]] = llllllIIIIIl[5];
            TileObject lllllllllllllllIIlIIIllllllllIIl = TileObjects.getNearest((int[])nArray);
            lllllllllllllllIIlIIIllllllllIIl.interact(llllllIIIIII[llllllIIIIIl[0]]);
            lllllllllllllllIIlIIIlllllllllII.sleep(llllllIIIIIl[6]);
            return llllllIIIIIl[4];
        }
        Movement.walkTo((WorldPoint)this.X.mlmArea().g()[llllllIIIIIl[0]]);
        "".length();
        this.sleep(llllllIIIIIl[7]);
        return llllllIIIIIl[4];
    }

    private static boolean lIIlIlIIIIlIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIlIlIIIIlIIlI(Object object) {
        return object != null;
    }

    private static void lIIlIlIIIIlIIII() {
        llllllIIIIII = new String[llllllIIIIIl[4]];
        F.llllllIIIIII[F.llllllIIIIIl[0]] = F.lIIlIlIIIIIllll("2Hd3K2QX63o=", "IrRFv");
    }
}

