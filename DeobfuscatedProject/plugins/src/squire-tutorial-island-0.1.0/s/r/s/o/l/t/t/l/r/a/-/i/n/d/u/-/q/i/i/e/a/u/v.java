/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.client.Static
 */
package s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.client.Static;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.M;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.l;

public class v
implements l {
    private final /* synthetic */ String ak;
    private static /* synthetic */ int[] lIlIIIllIllll;
    private final /* synthetic */ boolean al;
    private final /* synthetic */ boolean am;
    private final /* synthetic */ String aj;
    private static /* synthetic */ int ah;
    private static /* synthetic */ String[] lIlIIIllIlllI;

    private static void lIlllIIIIlllIIl() {
        lIlIIIllIlllI = new String[lIlIIIllIllll[6]];
        v.lIlIIIllIlllI[v.lIlIIIllIllll[1]] = v.lIlllIIIIllIlll("hQaQGkj8h8sQBcbOxRbJTy8AyZEjQO8Z", "IQiTk");
        v.lIlIIIllIlllI[v.lIlIIIllIllll[0]] = v.lIlllIIIIlllIII("ibLD2+ToTM3imvGRPAq8Xw==", "hZZBx");
    }

    private static void lIlllIIIIlllIlI() {
        lIlIIIllIllll = new int[8];
        v.lIlIIIllIllll[0] = " ".length();
        v.lIlIIIllIllll[1] = (0x64 ^ 0x53) & ~(0xB4 ^ 0x83);
        v.lIlIIIllIllll[2] = -" ".length();
        v.lIlIIIllIllll[3] = 53 + 87 - 41 + 36 ^ 126 + 2 - 48 + 48;
        v.lIlIIIllIllll[4] = 1 ^ 5;
        v.lIlIIIllIllll[5] = "   ".length();
        v.lIlIIIllIllll[6] = "  ".length();
        v.lIlIIIllIllll[7] = 0xAB ^ 0xA3;
    }

    private static boolean lIlllIIIIllllll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlllIIIIllllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllIIIIlllllI(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean D() {
        void llllllllllllllIlllIIIlIIIIllIllI;
        v llllllllllllllIlllIIIlIIIIllIlll;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (v.lIlllIIIIllllII(nPC.getName().equals(this.aj) ? 1 : 0) && v.lIlllIIIIllllII(nPC.getWorldLocation().toWorldArea().hasLineOfSightTo(Static.getClient().getTopLevelWorldView(), Players.getLocal().getWorldLocation()) ? 1 : 0) && v.lIlllIIIIlllIll(nPC.getInteracting()) && v.lIlllIIIlIIIIII(nPC.isDead() ? 1 : 0)) {
                n2 = lIlIIIllIllll[0];
                "".length();
                if ((0x56 ^ 0x58 ^ (0xCB ^ 0xC1)) < 0) {
                    return ((0xF5 ^ 0x91 ^ (0x7B ^ 1)) & (0x41 ^ 0x50 ^ (0x7E ^ 0x71) ^ -" ".length())) != 0;
                }
            } else {
                n2 = lIlIIIllIllll[1];
            }
            return n2 != 0;
        });
        if (v.lIlllIIIIlllIll(nPC2)) {
            if (v.lIlllIIIIllllII(this.am ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIllIllll[0]];
                stringArray[v.lIlIIIllIllll[1]] = lIlIIIllIlllI[lIlIIIllIllll[1]];
                Movement.walkTo((Locatable)NPCs.getNearest((String[])stringArray));
                "".length();
                return lIlIIIllIllll[1];
            }
            return lIlIIIllIllll[1];
        }
        if (v.lIlllIIIIllllIl(Players.getLocal().getInteracting())) {
            return lIlIIIllIllll[1];
        }
        if (v.lIlllIIIIlllllI(ah, lIlIIIllIllll[0])) {
            ah -= lIlIIIllIllll[0];
            return lIlIIIllIllll[1];
        }
        if (v.lIlllIIIIllllll(Players.getLocal().getAnimation(), lIlIIIllIllll[2])) {
            return lIlIIIllIllll[1];
        }
        if (v.lIlllIIIlIIIIII(Movement.shouldWalk() ? 1 : 0)) {
            return lIlIIIllIllll[1];
        }
        if (v.lIlllIIIlIIIIII(llllllllllllllIlllIIIlIIIIllIlll.al ? 1 : 0) && v.lIlllIIIlIIIIII(llllllllllllllIlllIIIlIIIIllIlll.am ? 1 : 0) && v.lIlllIIIlIIIIII(Reachable.isInteractable((Locatable)llllllllllllllIlllIIIlIIIIllIllI) ? 1 : 0)) {
            System.out.println(lIlIIIllIlllI[lIlIIIllIllll[0]]);
            llllllllllllllIlllIIIlIIIIllIlll.a((NPC)llllllllllllllIlllIIIlIIIIllIllI);
            return lIlIIIllIllll[0];
        }
        if (v.lIlllIIIlIIIIII(llllllllllllllIlllIIIlIIIIllIlll.am ? 1 : 0) && v.lIlllIIIIlllllI(llllllllllllllIlllIIIlIIIIllIllI.getWorldLocation().distanceTo((Locatable)Players.getLocal()), lIlIIIllIllll[3])) {
            llllllllllllllIlllIIIlIIIIllIlll.a((NPC)llllllllllllllIlllIIIlIIIIllIllI);
            return lIlIIIllIllll[0];
        }
        if (v.lIlllIIIIllllII(llllllllllllllIlllIIIlIIIIllIlll.am ? 1 : 0)) {
            Magic.cast((Spell)SpellBook.Standard.WIND_STRIKE, (NPC)llllllllllllllIlllIIIlIIIIllIllI);
            return lIlIIIllIllll[0];
        }
        nPC2.interact(this.ak);
        ah = M.a(lIlIIIllIllll[0], lIlIIIllIllll[4]);
        return lIlIIIllIllll[0];
    }

    private static String lIlllIIIIlllIII(String llllllllllllllIlllIIIlIIIIIlllII, String llllllllllllllIlllIIIlIIIIIlllIl) {
        try {
            SecretKeySpec llllllllllllllIlllIIIlIIIIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIlIIIIIlllIl.getBytes(StandardCharsets.UTF_8)), lIlIIIllIllll[7]), "DES");
            Cipher llllllllllllllIlllIIIlIIIIlIIIII = Cipher.getInstance("DES");
            llllllllllllllIlllIIIlIIIIlIIIII.init(lIlIIIllIllll[6], llllllllllllllIlllIIIlIIIIlIIIIl);
            return new String(llllllllllllllIlllIIIlIIIIlIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIlIIIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIIlIIIIIlllll) {
            llllllllllllllIlllIIIlIIIIIlllll.printStackTrace();
            return null;
        }
    }

    static {
        v.lIlllIIIIlllIlI();
        v.lIlllIIIIlllIIl();
    }

    private static boolean lIlllIIIIlllIll(Object object) {
        return object == null;
    }

    private static boolean lIlllIIIIllllIl(Object object) {
        return object != null;
    }

    private static String lIlllIIIIllIlll(String llllllllllllllIlllIIIlIIIIIlIIIl, String llllllllllllllIlllIIIlIIIIIlIIII) {
        try {
            SecretKeySpec llllllllllllllIlllIIIlIIIIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIlIIIIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIIlIIIIIlIIll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIIlIIIIIlIIll.init(lIlIIIllIllll[6], llllllllllllllIlllIIIlIIIIIlIlII);
            return new String(llllllllllllllIlllIIIlIIIIIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIlIIIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIIlIIIIIlIIlI) {
            llllllllllllllIlllIIIlIIIIIlIIlI.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void a(NPC nPC) {
        void var5_5;
        void var4_4;
        void var2_2;
        void llllllllllllllIlllIIIlIIIIlIllll;
        if (v.lIlllIIIIlllIll(nPC)) {
            return;
        }
        WorldPoint llllllllllllllIlllIIIlIIIIlIlllI = llllllllllllllIlllIIIlIIIIlIllll.getWorldLocation();
        Random llllllllllllllIlllIIIlIIIIlIllIl = new Random();
        int llllllllllllllIlllIIIlIIIIlIllII = llllllllllllllIlllIIIlIIIIlIllIl.nextInt(lIlIIIllIllll[3]) - lIlIIIllIllll[5];
        int llllllllllllllIlllIIIlIIIIlIlIll = llllllllllllllIlllIIIlIIIIlIllIl.nextInt(lIlIIIllIllll[3]) - lIlIIIllIllll[5];
        if (v.lIlllIIIlIIIIII(llllllllllllllIlllIIIlIIIIlIllII) && v.lIlllIIIlIIIIII(llllllllllllllIlllIIIlIIIIlIlIll)) {
            llllllllllllllIlllIIIlIIIIlIllII = lIlIIIllIllll[0];
        }
        WorldPoint worldPoint = new WorldPoint(var2_2.getX() + var4_4, var2_2.getY() + var5_5, var2_2.getPlane());
        Walker.walkTo((WorldPoint)worldPoint);
        "".length();
        ah = M.a(lIlIIIllIllll[0], lIlIIIllIllll[4]);
    }

    private static boolean lIlllIIIlIIIIII(int n2) {
        return n2 == 0;
    }

    @Override
    public String y() {
        return this.aj;
    }

    @Override
    public String z() {
        return this.ak;
    }

    public v(String string, String string2, boolean bl, boolean bl2) {
        this.aj = string;
        this.ak = string2;
        this.al = bl;
        this.am = bl2;
    }
}

