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
        v.lIlIIIllIlllI[v.lIlIIIllIllll[1]] = v."Magic Instructor";
        v.lIlIIIllIlllI[v.lIlIIIllIllll[0]] = v."walkign closer";
    }

    private static void lIlllIIIIlllIlI() {
        lIlIIIllIllll = new int[8];
        v.lIlIIIllIllll[0] = 1;
        v.lIlIIIllIllll[1] = (0x64 ^ 0x53) & ~(0xB4 ^ 0x83);
        v.lIlIIIllIllll[2] = -1;
        v.lIlIIIllIllll[3] = 53 + 87 - 41 + 36 ^ 126 + 2 - 48 + 48;
        v.lIlIIIllIllll[4] = 1 ^ 5;
        v.lIlIIIllIllll[5] = 3;
        v.lIlIIIllIllll[6] = 2;
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
        void var4;
        v var1;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (v.lIlllIIIIllllII(nPC.getName().equals(this.aj) ? 1 : 0) && v.lIlllIIIIllllII(nPC.getWorldLocation().toWorldArea().hasLineOfSightTo(Static.getClient().getTopLevelWorldView(), Players.getLocal().getWorldLocation()) ? 1 : 0) && v.lIlllIIIIlllIll(nPC.getInteracting()) && v.lIlllIIIlIIIIII(nPC.isDead() ? 1 : 0)) {
                n2 = lIlIIIllIllll[0];
                0;
                if ((0x56 ^ 0x58 ^ (0xCB ^ 0xC1)) < 0) {
                    return ((0xF5 ^ 0x91 ^ (0x7B ^ 1)) & (0x41 ^ 0x50 ^ (0x7E ^ 0x71) ^ -1)) != 0;
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
                0;
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
        if (v.lIlllIIIlIIIIII(var1.al ? 1 : 0) && v.lIlllIIIlIIIIII(var1.am ? 1 : 0) && v.lIlllIIIlIIIIII(Reachable.isInteractable((Locatable)var4) ? 1 : 0)) {
            System.out.println(lIlIIIllIlllI[lIlIIIllIllll[0]]);
            var1.a((NPC)var4);
            return lIlIIIllIllll[0];
        }
        if (v.lIlllIIIlIIIIII(var1.am ? 1 : 0) && v.lIlllIIIIlllllI(var4.getWorldLocation().distanceTo((Locatable)Players.getLocal()), lIlIIIllIllll[3])) {
            var1.a((NPC)var4);
            return lIlIIIllIllll[0];
        }
        if (v.lIlllIIIIllllII(var1.am ? 1 : 0)) {
            Magic.cast((Spell)SpellBook.Standard.WIND_STRIKE, (NPC)var4);
            return lIlIIIllIllll[0];
        }
        nPC2.interact(this.ak);
        ah = M.a(lIlIIIllIllll[0], lIlIIIllIllll[4]);
        return lIlIIIllIllll[0];
    }

    private static String lIlllIIIIlllIII(String var13, String var16) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), lIlIIIllIllll[7]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lIlIIIllIllll[6], var15);
            return new String(var2.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
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

    private static String lIlllIIIIllIlll(String var5, String var7) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lIlIIIllIllll[6], var9);
            return new String(var6.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
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
        void var10;
        if (v.lIlllIIIIlllIll(nPC)) {
            return;
        }
        WorldPoint llllllllllllllIlllIIIlIIIIlIlllI = var10.getWorldLocation();
        Random var11 = new Random();
        int var12 = var11.nextInt(lIlIIIllIllll[3]) - lIlIIIllIllll[5];
        int var14 = var11.nextInt(lIlIIIllIllll[3]) - lIlIIIllIllll[5];
        if (v.lIlllIIIlIIIIII(var12) && v.lIlllIIIlIIIIII(var14)) {
            var12 = lIlIIIllIllll[0];
        }
        WorldPoint worldPoint = new WorldPoint(var2_2.getX() + var4_4, var2_2.getY() + var5_5, var2_2.getPlane());
        Walker.walkTo((WorldPoint)worldPoint);
        0;
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

