/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.DialogOption
 *  net.runelite.api.Locatable
 *  net.runelite.api.MenuAction
 *  net.runelite.api.NPC
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.magic.SpellBook
 *  net.unethicalite.api.magic.SpellBook$Lunar
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.runecrafting.tasks;

import com.google.inject.Inject;
import gg.squire.runecrafting.tasks.GameEnum14;
import gg.squire.runecrafting.tasks.GameEnum16;
import gg.squire.runecrafting.tasks.RunecraftingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.ChatMessageType;
import net.runelite.api.DialogOption;
import net.runelite.api.Locatable;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

@TaskDesc(name="Repairing Pouches", priority=13, blocking=true, register=true)
public class RepairingPouchesTask
extends RunecraftingTaskBase {
    private  int bm;
    
    private  boolean bj;
    private  int bn;
    private  int bl;
    
    private  int bk;

    private static boolean llllllIIllIlll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llllllIIllIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llllllIIlllIII(Object object) {
        return object == null;
    }

    private static boolean llllllIIlllIIl(Object object, Object object2) {
        return object != object2;
    }

    private static void llllllIIlIllIl() {
        llIIllIIllll = new String[llIIllIlIIII[7]];
        C.llIIllIIllll[C.llIIllIlIIII[0]] = "Talk-to";
        C.llIIllIIllll[C.llIIllIlIIII[1]] = "What do you want?";
        C.llIIllIIllll[C.llIIllIlIIII[2]] = "Can you repair my pouches?";
        C.llIIllIIllll[C.llIIllIlIIII[6]] = "Your pouch has decayed";
    }

    private boolean am() {
        C var1;
        if (C.llllllIIllIIIl(this.bm, llIIllIlIIII[2])) {
            return llIIllIlIIII[0];
        }
        int[] nArray = new int[llIIllIlIIII[1]];
        nArray[C.llIIllIlIIII[0]] = llIIllIlIIII[3];
        NPC var2 = NPCs.getNearest((int[])nArray);
        if (!C.llllllIIllIIlI(var2) || C.llllllIIlIllll(Reachable.isInteractable((Locatable)var2) ? 1 : 0)) {
            return llIIllIlIIII[0];
        }
        if (C.llllllIIllIIll(Static.getClient().getTickCount() - var1.bn, llIIllIlIIII[4])) {
            return llIIllIlIIII[1];
        }
        if (C.llllllIIllIIII(Dialog.isOpen() ? 1 : 0) && C.llllllIIlIllll(var1.bm)) {
            DialogOption[] dialogOptionArray = new DialogOption[llIIllIlIIII[5]];
            dialogOptionArray[C.llIIllIlIIII[0]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[C.llIIllIlIIII[1]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[C.llIIllIlIIII[2]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[C.llIIllIlIIII[6]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[C.llIIllIlIIII[7]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            var1.bm = llIIllIlIIII[1];
            var1.bn = Static.getClient().getTickCount();

            if (((0x90 ^ 0x9F) & ~(0x96 ^ 0x99)) >= (1 ^ 5)) {
                return false;
            }
        } else if (C.llllllIIllIIII(Dialog.isOpen() ? 1 : 0) && C.llllllIIllIIIl(var1.bm, llIIllIlIIII[1])) {
            DialogOption[] dialogOptionArray = new DialogOption[llIIllIlIIII[8]];
            dialogOptionArray[C.llIIllIlIIII[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[C.llIIllIlIIII[1]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[C.llIIllIlIIII[2]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[C.llIIllIlIIII[6]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[C.llIIllIlIIII[7]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[C.llIIllIlIIII[5]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[C.llIIllIlIIII[9]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[C.llIIllIlIIII[10]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[C.llIIllIlIIII[4]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            var1.bm = llIIllIlIIII[2];
            e[] var3 = e.values();
            int var4 = var3.length;
            int var5 = llIIllIlIIII[0];
            while (C.llllllIIllIlII(var5, var4)) {
                e var6 = var3[var5];
                var6.a(llIIllIlIIII[0]);
                ++var5;

                if ((0x82 ^ 0x86) >= ((0x3B ^ 2) & ~(0xE ^ 0x37))) continue;
                return false;
            }

            if (((115 + 99 - 158 + 119 ^ 32 + 47 - 35 + 139) & (58 + 52 - 63 + 113 ^ 28 + 58 - -75 + 23 ^ -1)) != 0) {
                return ((162 + 31 - 26 + 18 ^ 150 + 171 - 284 + 140) & (0x64 ^ 0x2C ^ (0xC2 ^ 0x82) ^ -1)) != 0;
            }
        } else if (C.llllllIIlIllll(Dialog.isOpen() ? 1 : 0)) {
            var2.interact(llIIllIIllll[llIIllIlIIII[0]]);
        }
        return llIIllIlIIII[1];
    }

    private static boolean llllllIIllIIIl(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var7;
        if (C.llllllIIlllIIl(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (C.llllllIIlIllll(var7.getMessage().contains(llIIllIIllll[llIIllIlIIII[6]]) ? 1 : 0)) {
            return;
        }
        this.bm = llIIllIlIIII[0];
        this.bj = llIIllIlIIII[0];
    }

    private static boolean llllllIIllIlIl(int n2) {
        return n2 > 0;
    }

    public boolean d(String string) {
        Widget widget = Widgets.get((WidgetInfo)WidgetInfo.DIALOG_NPC_TEXT);
        if (C.llllllIIlllIII(widget)) {
            return llIIllIlIIII[0];
        }
        return widget.getText().contains(string);
    }

    /*
     * WARNING - void declaration
     */
    private boolean ao() {
        void var8;
        e[] eArray = e.values();
        int n2 = eArray.length;
        int var9 = llIIllIlIIII[0];
        while (C.llllllIIllIlII(var9, (int)var8)) {
            void var10;
            void var11 = var10[var9];
            if (C.llllllIIllIIII(var11.af() ? 1 : 0)) {
                return llIIllIlIIII[1];
            }
            ++var9;

            if (2 <= (0xAB ^ 0xAF)) continue;
            return false;
        }
        return llIIllIlIIII[0];
    }

    @Inject
    public RepairingPouchesTask(SquireGOTRPlugin squireGOTRPlugin) {
        super(squireGOTRPlugin, new c[llIIllIlIIII[0]]);
        this.bj = llIIllIlIIII[1];
        this.bm = llIIllIlIIII[2];
    }

    @Override
    protected boolean aj() {
        return llIIllIlIIII[1];
    }

    private static boolean llllllIIlIllll(int n2) {
        return n2 == 0;
    }

    private static boolean llllllIIllIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllllIIllIIII(int n2) {
        return n2 != 0;
    }

    private static boolean llllllIIllIIll(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean an() {
        void var3_7;
        void var4_10;
        C var12;
        if (C.llllllIIllIlIl(this.bk)) {
            this.bk -= llIIllIlIIII[1];
            return llIIllIlIIII[1];
        }
        int var13 = Static.getClient().getTickCount();
        if (C.llllllIIllIIII(var12.d(llIIllIIllll[llIIllIlIIII[1]]) ? 1 : 0)) {
            DialogOption[] dialogOptionArray = new DialogOption[llIIllIlIIII[9]];
            dialogOptionArray[C.llIIllIlIIII[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[C.llIIllIlIIII[1]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[C.llIIllIlIIII[2]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[C.llIIllIlIIII[6]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[C.llIIllIlIIII[7]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[C.llIIllIlIIII[5]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            e[] var14 = e.values();
            int var15 = var14.length;
            int var16 = llIIllIlIIII[0];
            while (C.llllllIIllIlII(var16, var15)) {
                e var17 = var14[var16];
                var17.a(llIIllIlIIII[0]);
                ++var16;

                if (((0xE3 ^ 0xAE) & ~(0xD6 ^ 0x9B)) == ((0xFE ^ 0xA4) & ~(0x54 ^ 0xE))) continue;
                return false;
            }
            var12.bj = llIIllIlIIII[1];
            var12.bl = var13;
            return llIIllIlIIII[1];
        }
        if (C.llllllIIllIIII(var12.bj ? 1 : 0) && C.llllllIIllIllI(var13 - var12.bl, llIIllIlIIII[11]) && C.llllllIIllIlll((Object)var12.aV.m(), (Object)c.ACTIVATING)) {
            var12.bj = llIIllIlIIII[0];
            return llIIllIlIIII[1];
        }
        if (C.llllllIIllIIII(var12.bj ? 1 : 0)) {
            return llIIllIlIIII[0];
        }
        if (C.llllllIIllIIII(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray = new String[llIIllIlIIII[1]];
            stringArray[C.llIIllIlIIII[0]] = llIIllIIllll[llIIllIlIIII[2]];
            Dialog.chooseOption((String[])stringArray);

            e[] var14 = e.values();
            int var15 = var14.length;
            int var16 = llIIllIlIIII[0];
            while (C.llllllIIllIlII(var16, var15)) {
                e var17 = var14[var16];
                var17.a(llIIllIlIIII[0]);
                ++var16;

                if (2 == 2) continue;
                return false;
            }
            var12.bj = llIIllIlIIII[1];
            var12.bl = var13;
            return llIIllIlIIII[1];
        }
        SpellBook.Lunar var14 = SpellBook.Lunar.NPC_CONTACT;
        if (!C.llllllIIllIlll(SpellBook.getCurrent(), SpellBook.LUNAR) || C.llllllIIlIllll(var14.canCast() ? 1 : 0)) {
            return llIIllIlIIII[0];
        }
        if (C.llllllIIllIIIl(Players.getLocal().getAnimation(), llIIllIlIIII[12])) {
            return llIIllIlIIII[1];
        }
        int var15 = var14.getWidget().getId();
        Widget var16 = Widgets.get((WidgetInfo)var14.getWidget());
        if (C.llllllIIlllIII(var16)) {
            return llIIllIlIIII[0];
        }
        var4_10.interact(llIIllIlIIII[2], MenuAction.CC_OP.getId(), llIIllIlIIII[13], (int)var3_7);
        this.bk = llIIllIlIIII[9];
        return llIIllIlIIII[1];
    }

    public boolean e(String string) {
        Widget widget = Widgets.get((WidgetInfo)WidgetInfo.DIALOG_PLAYER_TEXT);
        if (C.llllllIIlllIII(widget)) {
            return llIIllIlIIII[0];
        }
        return widget.getText().contains(string);
    }

    private static boolean llllllIIllIIlI(Object object) {
        return object != null;
    }

    static {
        C.llllllIIlIlllI();
        C.llllllIIlIllIl();
    }

    @Override
    protected boolean ak() {
        C var18;
        if (C.llllllIIlIllll(this.aV.w().repairPouches() ? 1 : 0)) {
            return llIIllIlIIII[0];
        }
        if (C.llllllIIllIIII(var18.ao() ? 1 : 0) && C.llllllIIllIIIl(var18.bm, llIIllIlIIII[2])) {
            var18.bm = llIIllIlIIII[0];
            return llIIllIlIIII[0];
        }
        if (C.llllllIIllIIII(var18.aV.w().usePearls() ? 1 : 0)) {
            if (C.llllllIIlIllll(var18.ao() ? 1 : 0)) {
                var18.bm = llIIllIlIIII[2];
                return llIIllIlIIII[0];
            }
            return var18.am();
        }
        return this.an();
    }
}

