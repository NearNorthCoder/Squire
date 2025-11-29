/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.ZulrahTaskBase;
import gg.squire.zulrah.tasks.GameEnum21;
import gg.squire.zulrah.tasks.GameEnum16;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Teleporting out", priority=1)
public class TeleportingOutTask
extends ZulrahTaskBase {

    private static boolean llIIIllllIllIlI(int n2) {
        return n2 == 0;
    }

    @Inject
    protected TeleportingOutTask(Client client, SquireZulrahConfig squireZulrahConfig) {
        super(client, squireZulrahConfig);
    }

    private static boolean llIIIllllIlllIl(int n2) {
        return n2 != 0;
    }

    private static void llIIIllllIllIII() {
        lIllIlIIlIllI = new String[lIllIlIIlIlll[1]];
        ai.lIllIlIIlIllI[ai.lIllIlIIlIlll[0]] = "Eat";
    }

    @Override
    public boolean ac() {
        int var1;
        int n2;
        ai var2;
        if (ai.llIIIllllIllIlI(this.E.e() ? 1 : 0)) {
            return lIllIlIIlIlll[0];
        }
        int var3 = Inventory.getCount(item -> {
            String[] stringArray = new String[lIllIlIIlIlll[1]];
            stringArray[ai.lIllIlIIlIlll[0]] = lIllIlIIlIllI[lIllIlIIlIlll[0]];
            return item.hasAction(stringArray);
        });
        if (!ai.llIIIllllIllIlI(Inventory.contains(item -> item.getName().startsWith(this.aC.cure().k())) ? 1 : 0) || ai.llIIIllllIllIll((Object)var2.aC.cure(), (Object)o.IGNORE)) {
            n2 = lIllIlIIlIlll[1];

            if (-(0x52 ^ 0x57) >= 0) {
                return false;
            }
        } else {
            n2 = var1 = lIllIlIIlIlll[0];
        }
        if (ai.llIIIllllIlllII(var3, var2.aC.multiple()) && ai.llIIIllllIlllIl(var2.aC.multiple()) && ai.llIIIllllIlllIl(var1)) {
            return lIllIlIIlIlll[0];
        }
        var2.E.a(lIllIlIIlIlll[1]);
        b var4 = var2.aC.bankTeleportItem();
        Item var5 = Inventory.getFirst(item -> item.getName().startsWith(var4.k()));
        if (ai.llIIIllllIllllI(var5)) {
            var4.l().accept(var5);
            return lIllIlIIlIlll[1];
        }
        return this.aC.bankLocation().f().getAsBoolean();
    }

    private static boolean llIIIllllIlllII(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        ai.llIIIllllIllIIl();
        ai.llIIIllllIllIII();
    }

    private static boolean llIIIllllIllIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIIIllllIllllI(Object object) {
        return object != null;
    }

}

