/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.TileObject
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.House
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.vorkath.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import gg.squire.vorkath.tasks.BankingTask;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.TileObject;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.widgets.Widget;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.House;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

@TaskDesc(name="Handling house", priority=84, register=true, blocking=true)
public class HandlingHouseTask
extends BankingTask {
    
    private  int bX;
    
    private  boolean bW;

    private static boolean lIlllllllIlIlll(Object object, Object object2) {
        return object == object2;
    }

    static {
        r.lIlllllllIlIlII();
        r.lIlllllllIlIIll();
    }

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        if (r.lIlllllllIllIlI(animationChanged.getActor().getAnimation(), lIlIlIllIlIIl[4])) {
            this.bW = lIlIlIllIlIIl[3];
        }
    }

    private static boolean lIlllllllIlIllI(int n2) {
        return n2 != 0;
    }

    private static void lIlllllllIlIIll() {
        lIlIlIllIlIII = new String[lIlIlIllIlIIl[5]];
        r.lIlIlIllIlIII[r.lIlIlIllIlIIl[0]] = "Teleport Menu";
        r.lIlIlIllIlIII[r.lIlIlIllIlIIl[3]] = "Jewellery Box";
    }

    @Override
    public boolean run() {
        r var1;
        if (!r.lIlllllllIlIlIl(this.S() ? 1 : 0) || r.lIlllllllIlIlIl(this.T().needsToBank() ? 1 : 0)) {
            return lIlIlIllIlIIl[0];
        }
        if (r.lIlllllllIlIllI(var1.R() ? 1 : 0)) {
            return lIlIlIllIlIIl[0];
        }
        if (r.lIlllllllIlIlIl(House.isInside() ? 1 : 0)) {
            return lIlIlIllIlIIl[0];
        }
        if (!r.lIlllllllIlIllI(Players.getLocal().isIdle() ? 1 : 0) || r.lIlllllllIlIlll(Static.getClient().getGameState(), GameState.LOADING)) {
            return lIlIlIllIlIIl[0];
        }
        if (r.lIlllllllIlIllI(House.isPoolDrinkUseful() ? 1 : 0)) {
            return House.drinkFromPool();
        }
        if (r.lIlllllllIllIII(House.getJewelryBox())) {
            return lIlIlIllIlIIl[0];
        }
        if (r.lIlllllllIlIllI(Widgets.isVisible((Widget)Widgets.get((int)lIlIlIllIlIIl[1], (int)lIlIlIllIlIIl[0])) ? 1 : 0)) {
            Keyboard.type((char)lIlIlIllIlIIl[2]);
            return lIlIlIllIlIIl[3];
        }
        TileObject var2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIlllllllIllIIl(tileObject.getName()) && r.lIlllllllIlIllI(tileObject.getName().contains(lIlIlIllIlIII[lIlIlIllIlIIl[3]]) ? 1 : 0)) {
                n2 = lIlIlIllIlIIl[3];

            } else {
                n2 = lIlIlIllIlIIl[0];
            }
            return n2 != 0;
        });
        if (r.lIlllllllIllIIl(var2)) {
            var2.interact(lIlIlIllIlIII[lIlIlIllIlIIl[0]]);
            return lIlIlIllIlIIl[3];
        }
        return lIlIlIllIlIIl[0];
    }

    private static boolean lIlllllllIllIIl(Object object) {
        return object != null;
    }

    private static boolean lIlllllllIllIlI(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean Q() {
        return lIlIlIllIlIIl[0];
    }

    @Inject
    protected HandlingHouseTask(SquireVorkathPlugin squireVorkathPlugin, SquireVorkathConfig squireVorkathConfig, Client client) {
        super(squireVorkathPlugin, squireVorkathConfig, client);
    }

    private static boolean lIlllllllIllIII(Object object) {
        return object == null;
    }

    private static boolean lIlllllllIlIlIl(int n2) {
        return n2 == 0;
    }
}

