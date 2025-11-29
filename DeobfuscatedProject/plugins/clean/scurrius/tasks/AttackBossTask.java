/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.scurrius.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.Players;
import gg.squire.scurrius.tasks.ScurriusTaskBase;
import gg.squire.scurrius.tasks.BHelper;

@TaskDesc(name="Attack Boss", priority=4000, blocking=true)
public class AttackBossTask
extends ScurriusTaskBase {
    private  List<Widget> X;
    
    private static  int W;

    private static boolean lIlIllIIlIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean a() {
        m var1;
        int var2;
        int n2;
        Actor actor = Players.getLocal().getInteracting();
        if (m.lIlIllIIlIIIIll(actor) && m.lIlIllIIlIIIlII(actor.hasAction(lIIlIlIllllII[lIIlIlIllllIl[0]]::equals) ? 1 : 0)) {
            n2 = lIIlIlIllllIl[1];

            }
        } else {
            n2 = lIIlIlIllllIl[0];
        }
        if (m.lIlIllIIlIIIlII(var2 = n2)) {
            return lIIlIlIllllIl[0];
        }
        if (m.lIlIllIIlIIIlII(var1.f.isDead() ? 1 : 0)) {
            return lIIlIlIllllIl[0];
        }
        this.f.interact(lIIlIlIllllII[lIIlIlIllllIl[1]]);
        return lIIlIlIllllIl[1];
    }

    private static boolean lIlIllIIlIIIIll(Object object) {
        return object != null;
    }

    static {
        m.lIlIllIIlIIIIlI();
        m.lIlIllIIlIIIIIl();
        W = lIIlIlIllllIl[2];
    }

    @Inject
    protected AttackBossTask(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig, b b2, Client client) {
        super(squireScurrius, squireScurriusConfig, b2, client);
        this.X = new ArrayList<Widget>();
    }

    private static void lIlIllIIlIIIIIl() {
        lIIlIlIllllII = new String[lIIlIlIllllIl[3]];
        m.lIIlIlIllllII[m.lIIlIlIllllIl[0]] = "Attack";
        m.lIIlIlIllllII[m.lIIlIlIllllIl[1]] = "Attack";
    }

        return String.valueOf(var3);
    }

    private static boolean lIlIllIIlIIIlII(int n2) {
        return n2 != 0;
    }
}

