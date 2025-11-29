/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxTaskBase;
import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Configure Party", priority=0x7FFFFF99, blocking=true)
public class ConfigurePartyTask
extends CoxTaskBase {
    private final  SquireChambersConfig du;
    
    private final  SquireChambersPlugin dt;

    private static boolean llIlIIllIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIIlIllllll(int n2) {
        return n2 == 0;
    }

    static {
        av.llIlIIlIlllllI();
        av.llIlIIlIllllIl();
    }

    private static void llIlIIlIllllIl() {
        lIIlllllllII = new String[lIIlllllllIl[5]];
        av.lIIlllllllII[av.lIIlllllllIl[0]] = "Waiting for pin input";
        av.lIIlllllllII[av.lIIlllllllIl[1]] = "No, I'll go raiding another time.";
        av.lIIlllllllII[av.lIIlllllllIl[2]] = "Enter";
        av.lIIlllllllII[av.lIIlllllllIl[3]] = "Chambers of Xeric";
        av.lIIlllllllII[av.lIIlllllllIl[4]] = "Enter";
    }

    private static boolean llIlIIllIIIIIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var1_1;
        if (av.llIlIIlIllllll(c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u.bn() ? 1 : 0)) {
            return lIIlllllllIl[0];
        }
        if (av.llIlIIllIIIIII(Bank.isPinWindowOpen() ? 1 : 0)) {
            System.out.println(lIIlllllllII[lIIlllllllIl[0]]);
            return lIIlllllllIl[1];
        }
        if (av.llIlIIllIIIIII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lIIlllllllIl[1];
        }
        if (av.llIlIIllIIIIII(Dialog.isViewingOptions() ? 1 : 0) && av.llIlIIllIIIIII(Dialog.hasOption((String)lIIlllllllII[lIIlllllllIl[1]]) ? 1 : 0)) {
            Game.logout();
            return lIIlllllllIl[1];
        }
        TileObject var1 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (av.llIlIIllIIIIII(tileObject.getName().equals(lIIlllllllII[lIIlllllllIl[3]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIlllllllIl[1]];
                stringArray[av.lIIlllllllIl[0]] = lIIlllllllII[lIIlllllllIl[4]];
                if (av.llIlIIllIIIIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIlllllllIl[1];

                    if ((0xFB ^ 0x93 ^ (0xCA ^ 0xA6)) != 3) return n2 != 0;
                    return ((105 + 39 - 70 + 60 ^ 68 + 123 - 183 + 128) & (9 ^ 0x1F ^ (0x73 ^ 0x6B) ^ -1)) != 0;
                }
            }
            n2 = lIIlllllllIl[0];
            return n2 != 0;
        });
        if (av.llIlIIllIIIIIl(var1)) {
            return lIIlllllllIl[0];
        }
        if (av.llIlIIllIIIIII(Players.getLocal().isMoving() ? 1 : 0)) {
            return lIIlllllllIl[0];
        }
        var1_1.interact(lIIlllllllII[lIIlllllllIl[2]]);
        return lIIlllllllIl[1];
    }

    private static boolean llIlIIllIIIIII(int n2) {
        return n2 != 0;
    }

        return String.valueOf(var2);
    }

    @Inject
    public ConfigurePartyTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.dt = squireChambersPlugin;
        this.du = squireChambersConfig;
    }
}

