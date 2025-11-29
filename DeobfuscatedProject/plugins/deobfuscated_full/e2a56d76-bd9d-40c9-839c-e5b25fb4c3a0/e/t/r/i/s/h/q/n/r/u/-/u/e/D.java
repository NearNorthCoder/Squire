/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 */
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import e.t.r.i.s.h.q.n.r.u.-.u.e.a;
import e.t.r.i.s.h.q.n.r.u.-.u.e.e;
import e.t.r.i.s.h.q.n.r.u.-.u.e.j;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;

/* TASK: Looting bird snare -> LootingbirdsnareTask */
@TaskDesc(name="Looting bird snare", priority=1)
public class D
extends j {
    private static /* synthetic */ int[] lllIllIllIll;
    private static /* synthetic */ String[] lllIllIllIlI;

    private static boolean lIIIllIllIIIIII(Object object) {
        return object != null;
    }

    static {
        D.lIIIllIlIllllll();
        D.lIIIllIlIlllllI();
    }

    private static void lIIIllIlIllllll() {
        lllIllIllIll = new int[5];
        D.lllIllIllIll[0] = 3;
        D.lllIllIllIll[1] = 1;
        D.lllIllIllIll[2] = (0xC3 ^ 0x8C) & ~(0x1D ^ 0x52);
        D.lllIllIllIll[3] = 0xFFFFBFBF & 0x6756;
        D.lllIllIllIll[4] = 2;
    }

    private static void lIIIllIlIlllllI() {
        lllIllIllIlI = new String[lllIllIllIll[1]];
        D.lllIllIllIlI[D.lllIllIllIll[2]] = D."Take";
    }

    private static String lIIIllIlIllllIl(String var3, String var5) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(lllIllIllIll[4], var4);
            return new String(var2.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean x() {
        int[] nArray = new int[lllIllIllIll[1]];
        nArray[D.lllIllIllIll[2]] = lllIllIllIll[3];
        List list = TileItems.getSurrounding((WorldPoint)Players.getLocal().getWorldLocation(), (int)lllIllIllIll[0], (int[])nArray);
        if (!D.lIIIllIllIIIIII(list) || D.lIIIllIllIIIIIl(list.isEmpty() ? 1 : 0)) {
            return lllIllIllIll[2];
        }
        if (D.lIIIllIllIIIIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
            return lllIllIllIll[2];
        }
        list.stream().findFirst().ifPresent(tileItem -> tileItem.interact(lllIllIllIlI[lllIllIllIll[2]]));
        return lllIllIllIll[1];
    }

    private static boolean lIIIllIllIIIIIl(int n2) {
        return n2 != 0;
    }

    @Inject
    public D(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.BIRDS);
    }
}

