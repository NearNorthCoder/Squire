/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.client.Static
 */
package gg.squire.hunter.tasks;

import gg.squire.hunter.tasks.HunterManager;
import gg.squire.hunter.tasks.GameEnum16;
import gg.squire.hunter.tasks.GameEnum28;
import gg.squire.hunter.tasks.HunterTaskBase;
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
import net.runelite.api.ChatMessageType;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;

@TaskDesc(name="Hunting kebbits", register=true)
public class HuntingKebbitsTask
extends HunterTaskBase {
    
    private static final  RectangularArea B;
    private static final  WorldPoint C;
    private  boolean D;
    
    private  int F;
    private  int E;

    @Inject
    public HuntingKebbitsTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.FALCONRY);
        this.E = lllIllllIllI[0];
        this.F = lllIllllIllI[1];
    }

    private static boolean lIIIlllIIIlIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private boolean C() {
        if (o.lIIIlllIIIIllll(Dialog.getText()) && o.lIIIlllIIIIlllI(Dialog.getText().contains(lllIllllIIll[lllIllllIllI[9]]) ? 1 : 0)) {
            this.D = lllIllllIllI[2];
            return lllIllllIllI[3];
        }
        if (o.lIIIlllIIIIlllI(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lllIllllIllI[3];
        }
        if (o.lIIIlllIIIIlllI(Dialog.isViewingOptions() ? 1 : 0)) {
            Dialog.chooseOption(string -> string.contains(lllIllllIIll[lllIllllIllI[13]]));

            return lllIllllIllI[3];
        }
        String[] stringArray = new String[lllIllllIllI[3]];
        stringArray[o.lllIllllIllI[2]] = lllIllllIIll[lllIllllIllI[10]];
        NPC var1 = NPCs.getNearest((String[])stringArray);
        if (o.lIIIlllIIIIllll(var1)) {
            var1.interact(lllIllllIIll[lllIllllIllI[11]]);
            return lllIllllIllI[3];
        }
        if (o.lIIIlllIIIlIIIl(C.distanceTo((Locatable)Players.getLocal()), lllIllllIllI[7])) {
            Movement.walkTo((WorldPoint)C);

            return lllIllllIllI[3];
        }
        return lllIllllIllI[3];
    }

    @Override
    protected boolean x() {
        NPC var2;
        List var3;
        o var4;
        if (o.lIIIlllIIIIllIl((Object)this.z().method(), (Object)e.FALCONRY)) {
            return lllIllllIllI[2];
        }
        if (o.lIIIlllIIIIlllI(var4.D ? 1 : 0)) {
            return var4.C();
        }
        if (o.lIIIlllIIIIlllI(var4.B() ? 1 : 0)) {
            return lllIllllIllI[3];
        }
        if (o.lIIIlllIIIIlllI(var4.z().buryBones() ? 1 : 0)) {
            String[] stringArray = new String[lllIllllIllI[3]];
            stringArray[o.lllIllllIllI[2]] = lllIllllIIll[lllIllllIllI[2]];
            var3 = Inventory.getFirst((String[])stringArray);
            if (o.lIIIlllIIIIllll(var3)) {
                var3.interact(lllIllllIIll[lllIllllIllI[3]]);
            }
        }
        var3 = Inventory.getAll(item -> item.getName().contains(lllIllllIIll[lllIllllIllI[15]]));
        if (o.lIIIlllIIIlIIII(var4.z().buryBones() ? 1 : 0)) {
            String[] stringArray = new String[lllIllllIllI[3]];
            stringArray[o.lllIllllIllI[2]] = lllIllllIIll[lllIllllIllI[1]];
            var3.addAll(Inventory.getAll((String[])stringArray));

        }
        if (o.lIIIlllIIIlIIIl(var3.size(), var4.F)) {
            var4.F = Rand.nextInt((int)lllIllllIllI[3], (int)lllIllllIllI[4]);
            var3.forEach(item -> item.interact(lllIllllIIll[lllIllllIllI[14]]));
        }
        if (o.lIIIlllIIIIllll(var2 = Static.getClient().getHintArrowNpc())) {
            String[] stringArray = new String[lllIllllIllI[3]];
            stringArray[o.lllIllllIllI[2]] = lllIllllIIll[lllIllllIllI[5]];
            if (o.lIIIlllIIIIlllI(var2.hasAction(stringArray) ? 1 : 0)) {
                var2.interact(lllIllllIIll[lllIllllIllI[6]]);
                return lllIllllIllI[3];
            }
        }
        if (o.lIIIlllIIIlIIIl(B.getCenter().distanceTo((Locatable)Players.getLocal()), lllIllllIllI[7])) {
            Movement.setDestination((WorldPoint)B.getCenter());
            return lllIllllIllI[3];
        }
        NPC var5 = h.s();
        if (o.lIIIlllIIIIllll(var5)) {
            var5.interact(lllIllllIIll[lllIllllIllI[4]]);
            return lllIllllIllI[3];
        }
        return lllIllllIllI[3];
    }

    private static boolean lIIIlllIIIIlllI(int n2) {
        return n2 != 0;
    }

    private boolean B() {
        if (o.lIIIlllIIIlIIII(Movement.isRunEnabled() ? 1 : 0) && o.lIIIlllIIIlIIIl(Movement.getRunEnergy(), this.E)) {
            this.E = Rand.nextInt((int)lllIllllIllI[4], (int)lllIllllIllI[8]);
            Movement.toggleRun();
            return lllIllllIllI[3];
        }
        return lllIllllIllI[2];
    }

        return String.valueOf(var6);
    }

    private static boolean lIIIlllIIIlIIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIlllIIIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlllIIIIllll(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var7;
        if (o.lIIIlllIIIIllIl(chatMessage.getType(), ChatMessageType.PUBLICCHAT) && o.lIIIlllIIIIlllI(chatMessage.getMessage().contains(lllIllllIIll[lllIllllIllI[12]]) ? 1 : 0)) {
            this.D = lllIllllIllI[3];
        }
        if (o.lIIIlllIIIIllIl(var7.getType(), ChatMessageType.PUBLICCHAT) && o.lIIIlllIIIIlllI(var7.getMessage().contains(lllIllllIIll[lllIllllIllI[7]]) ? 1 : 0)) {
            var8.D = lllIllllIllI[3];
        }
    }

    private static void lIIIlllIIIIlIII() {
        lllIllllIIll = new String[lllIllllIllI[22]];
        o.lllIllllIIll[o.lllIllllIllI[2]] = "Bones";
        o.lllIllllIIll[o.lllIllllIllI[3]] = "Bury";
        o.lllIllllIIll[o.lllIllllIllI[1]] = "Bones";
        o.lllIllllIIll[o.lllIllllIllI[5]] = "Retrieve";
        o.lllIllllIIll[o.lllIllllIllI[6]] = "Retrieve";
        o.lllIllllIIll[o.lllIllllIllI[4]] = "Catch";
        o.lllIllllIIll[o.lllIllllIllI[9]] = "Right, try to be a bit more careful";
        o.lllIllllIIll[o.lllIllllIllI[10]] = "Matthias";
        o.lllIllllIIll[o.lllIllllIllI[11]] = "Talk-to";
        o.lllIllllIIll[o.lllIllllIllI[12]] = "Your falcon has left";
        o.lllIllllIIll[o.lllIllllIllI[7]] = "You try to catch the creature but it is too quick for you";
        o.lllIllllIIll[o.lllIllllIllI[13]] = "Yes, please";
        o.lllIllllIIll[o.lllIllllIllI[14]] = "Drop";
        o.lllIllllIIll[o.lllIllllIllI[15]] = "fur";
    }

    private static boolean lIIIlllIIIIllIl(Object object, Object object2) {
        return object != object2;
    }

    static {
        o.lIIIlllIIIIllII();
        o.lIIIlllIIIIlIII();
        B = new RectangularArea(new WorldPoint(lllIllllIllI[16], lllIllllIllI[17], lllIllllIllI[2]), new WorldPoint(lllIllllIllI[18], lllIllllIllI[19], lllIllllIllI[2]));
        C = new WorldPoint(lllIllllIllI[20], lllIllllIllI[21], lllIllllIllI[2]);
    }

}

