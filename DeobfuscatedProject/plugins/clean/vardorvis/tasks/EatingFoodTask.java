/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.vardorvis.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import gg.squire.vardorvis.tasks.VardorvisTaskBase;
import gg.squire.vardorvis.tasks.VardorvisManager;
import gg.squire.vardorvis.tasks.VardorvisManager;

@TaskDesc(name="Eating food", priority=10000)
public class EatingFoodTask
extends VardorvisTaskBase {

    static {
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlllllIIlIIllI();
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlllllIIlIIlIl();
    }

    private static boolean lIlllllIIlIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlllllIIlIIlIl() {
        lIlIlIIllIIlI = new String[lIlIlIIlllllI[4]];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlIlIIllIIlI[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlIlIIlllllI[1]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."No food";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlIlIIllIIlI[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlIlIIlllllI[0]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."Eat";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlIlIIllIIlI[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlIlIIlllllI[3]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."Eat";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlIlIIllIIlI[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlIlIIlllllI[2]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e."Eat";
    }

    @Inject
    protected EatingFoodTask(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, e e2, b b2, Client client) {
        super(squireVardorvis, squireVardorvisConfig, e2, b2, client);
    }

    private static boolean lIlllllIIlIlIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlllllIIlIIlll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean l() {
        void var1_2;
        z var1;
        int n2;
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlllllIIlIIlll(this.t.earlyBank() ? 1 : 0) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlllllIIlIlIII(n2 = Inventory.getCount(item -> {
            String[] stringArray = new String[lIlIlIIlllllI[0]];
            stringArray[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlIlIIlllllI[1]] = lIlIlIIllIIlI[lIlIlIIlllllI[2]];
            return item.hasAction(stringArray);
        }), lIlIlIIlllllI[0])) {
            this.s.c(lIlIlIIlllllI[0]);
            return lIlIlIIlllllI[1];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlllllIIlIlIIl(Combat.getCurrentHealth(), var1.t.eatAt())) {
            return lIlIlIIlllllI[1];
        }
        Item var2 = Inventory.getFirst(item -> {
            String[] stringArray = new String[lIlIlIIlllllI[0]];
            stringArray[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlIlIIlllllI[1]] = lIlIlIIllIIlI[lIlIlIIlllllI[3]];
            return item.hasAction(stringArray);
        });
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlllllIIlIlIlI(var2)) {
            Log.error((String)lIlIlIIllIIlI[lIlIlIIlllllI[1]]);
            var1.s.c(lIlIlIIlllllI[0]);
            return lIlIlIIlllllI[1];
        }
        var1_2.interact(lIlIlIIllIIlI[lIlIlIIlllllI[0]]);
        this.sleep(lIlIlIIlllllI[2]);
        return lIlIlIIlllllI[0];
    }

    private static boolean lIlllllIIlIlIII(int n2, int n3) {
        return n2 <= n3;
    }

        return String.valueOf(var3);
    }

    private static boolean lIlllllIIlIlIlI(Object object) {
        return object == null;
    }
}

