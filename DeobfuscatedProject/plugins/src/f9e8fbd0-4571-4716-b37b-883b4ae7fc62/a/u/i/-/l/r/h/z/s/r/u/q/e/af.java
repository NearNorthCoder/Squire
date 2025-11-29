/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.ag;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Looting items", priority=10, blocking=true)
public class af
extends ag {
    private static /* synthetic */ String[] lIllIlIIIIlII;
    private static /* synthetic */ int[] lIllIlIIIlIII;

    private static String llIIIlllIlIIlll(String llllllllllllllIllIIIllllllIlllIl, String llllllllllllllIllIIIllllllIlllII) {
        llllllllllllllIllIIIllllllIlllIl = new String(Base64.getDecoder().decode(llllllllllllllIllIIIllllllIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIIlllllllIIIII = new StringBuilder();
        char[] llllllllllllllIllIIIllllllIlllll = llllllllllllllIllIIIllllllIlllII.toCharArray();
        int llllllllllllllIllIIIllllllIllllI = lIllIlIIIlIII[0];
        char[] llllllllllllllIllIIIllllllIllIII = llllllllllllllIllIIIllllllIlllIl.toCharArray();
        int llllllllllllllIllIIIllllllIlIlll = llllllllllllllIllIIIllllllIllIII.length;
        int llllllllllllllIllIIIllllllIlIllI = lIllIlIIIlIII[0];
        while (af.llIIIlllIllIllI(llllllllllllllIllIIIllllllIlIllI, llllllllllllllIllIIIllllllIlIlll)) {
            char llllllllllllllIllIIIlllllllIIIll = llllllllllllllIllIIIllllllIllIII[llllllllllllllIllIIIllllllIlIllI];
            llllllllllllllIllIIIlllllllIIIII.append((char)(llllllllllllllIllIIIlllllllIIIll ^ llllllllllllllIllIIIllllllIlllll[llllllllllllllIllIIIllllllIllllI % llllllllllllllIllIIIllllllIlllll.length]));
            "".length();
            ++llllllllllllllIllIIIllllllIllllI;
            ++llllllllllllllIllIIIllllllIlIllI;
            "".length();
            if (((98 + 65 - 56 + 51 ^ 56 + 63 - 111 + 160) & (0xAE ^ 0x97 ^ (0xC8 ^ 0xC7) ^ -" ".length())) == 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIIlllllllIIIII);
    }

    private static boolean llIIIlllIllIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIIlllIllIIII() {
        lIllIlIIIIlII = new String[lIllIlIIIlIII[3]];
        af.lIllIlIIIIlII[af.lIllIlIIIlIII[0]] = af.llIIIlllIlIIlll("CjAY", "OQlGQ");
        af.lIllIlIIIIlII[af.lIllIlIIIlIII[1]] = af.llIIIlllIlIlIII("9RbNNQ8bjw8=", "dQdcj");
        af.lIllIlIIIIlII[af.lIllIlIIIlIII[2]] = af.llIIIlllIlIIlll("ACMM", "EBxgJ");
    }

    private static boolean llIIIlllIllIlII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIlllIllIlIl(Object object) {
        return object == null;
    }

    private static void llIIIlllIllIIll() {
        lIllIlIIIlIII = new int[4];
        af.lIllIlIIIlIII[0] = (0x9E ^ 0x91 ^ (0xE1 ^ 0x8D)) & (0x1E ^ 0xD ^ (0xFD ^ 0x8D) ^ -" ".length());
        af.lIllIlIIIlIII[1] = " ".length();
        af.lIllIlIIIlIII[2] = "  ".length();
        af.lIllIlIIIlIII[3] = "   ".length();
    }

    @Override
    public boolean ac() {
        List list = TileItems.getAll();
        if (af.llIIIlllIllIlII(list.isEmpty() ? 1 : 0)) {
            return lIllIlIIIlIII[0];
        }
        if (af.llIIIlllIllIlII(Inventory.isFull() ? 1 : 0)) {
            Item llllllllllllllIllIIIlllllllIllIl = Inventory.getFirst(item -> item.hasAction(lIllIlIIIIlII[lIllIlIIIlIII[2]]::equals));
            if (af.llIIIlllIllIlIl(llllllllllllllIllIIIlllllllIllIl)) {
                return lIllIlIIIlIII[0];
            }
            llllllllllllllIllIIIlllllllIllIl.interact(lIllIlIIIIlII[lIllIlIIIlIII[0]]);
        }
        ((TileItem)list.get(lIllIlIIIlIII[0])).interact(lIllIlIIIIlII[lIllIlIIIlIII[1]]);
        return lIllIlIIIlIII[1];
    }

    private static String llIIIlllIlIlIII(String llllllllllllllIllIIIllllllIIllIl, String llllllllllllllIllIIIllllllIIllII) {
        try {
            SecretKeySpec llllllllllllllIllIIIllllllIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIllllllIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIIllllllIIllll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIIllllllIIllll.init(lIllIlIIIlIII[2], llllllllllllllIllIIIllllllIlIIII);
            return new String(llllllllllllllIllIIIllllllIIllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIllllllIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIllllllIIlllI) {
            llllllllllllllIllIIIllllllIIlllI.printStackTrace();
            return null;
        }
    }

    @Inject
    protected af(Client client, SquireZulrahConfig squireZulrahConfig) {
        super(client, squireZulrahConfig);
    }

    static {
        af.llIIIlllIllIIll();
        af.llIIIlllIllIIII();
    }
}

