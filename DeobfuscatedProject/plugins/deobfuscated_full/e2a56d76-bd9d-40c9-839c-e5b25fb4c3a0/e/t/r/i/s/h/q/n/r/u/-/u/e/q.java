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
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;

/* TASK: Looting items from a failed trap -> LootingitemsfromafailedtrapTask */
@TaskDesc(name="Looting items from a failed trap", priority=50, blocking=true)
public class q
extends j {
    private static /* synthetic */ String[] lllIlllIIIlI;
    private static /* synthetic */ int[] lllIlllIIllI;

    @Override
    public boolean x() {
        int[] nArray = new int[lllIlllIIllI[1]];
        nArray[q.lllIlllIIllI[2]] = lllIlllIIllI[3];
        nArray[q.lllIlllIIllI[4]] = lllIlllIIllI[5];
        List list = TileItems.getSurrounding((WorldPoint)Players.getLocal().getWorldLocation(), (int)lllIlllIIllI[0], (int[])nArray);
        if (!q.lIIIllIllIllllI(list) || q.lIIIllIlllIIIIl(list.isEmpty() ? 1 : 0)) {
            return lllIlllIIllI[2];
        }
        list.stream().findFirst().ifPresent(tileItem -> tileItem.interact(lllIlllIIIlI[lllIlllIIllI[2]]));
        return lllIlllIIllI[4];
    }

    private static void lIIIllIllIllIlI() {
        lllIlllIIIlI = new String[lllIlllIIllI[4]];
        q.lllIlllIIIlI[q.lllIlllIIllI[2]] = q."Take";
    }

    private static boolean lIIIllIlllIIIIl(int n2) {
        return n2 != 0;
    }

    @Inject
    public q(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.SALLIES);
    }

    static {
        q.lIIIllIllIlllIl();
        q.lIIIllIllIllIlI();
    }

    private static boolean lIIIllIllIllllI(Object object) {
        return object != null;
    }

    private static void lIIIllIllIlllIl() {
        lllIlllIIllI = new int[7];
        q.lllIlllIIllI[0] = 0x7C ^ 0x70;
        q.lllIlllIIllI[1] = 2;
        q.lllIlllIIllI[2] = (147 + 88 - 218 + 169 ^ 97 + 140 - 175 + 102) & (11 + 42 - -1 + 87 ^ 132 + 25 - 81 + 71 ^ -1);
        q.lllIlllIIllI[3] = -(0xFFFFBDED & 0x4E17) & (0xFFFFAFFE & 0x5FBF);
        q.lllIlllIIllI[4] = 1;
        q.lllIlllIIllI[5] = 0xFFFFC96F & 0x37BF;
        q.lllIlllIIllI[6] = 0x85 ^ 0x8C ^ 1;
    }

    private static String lIIIllIllIllIIl(String var3, String var5) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lllIlllIIllI[6]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(lllIlllIIllI[1], var4);
            return new String(var1.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }
}

