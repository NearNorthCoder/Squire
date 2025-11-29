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
import gg.squire.runecrafting.tasks.GameEnum2;
import gg.squire.runecrafting.tasks.GameEnum3;
import gg.squire.runecrafting.tasks.RunecraftingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
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

    private boolean am() {
        C var3;
        if (this.bm == 2) {
            return 0;
        }
        int[] nArray = new int[1];
        nArray[0] = 3;
        NPC var4 = NPCs.getNearest((int[])nArray);
        if (!var4 != null || (Reachable.isInteractable((Locatable == 0)var4) ? 1 : 0)) {
            return 0;
        }
        if ((Static.getClient().getTickCount() - var3.bn <= 4)) {
            return 1;
        }
        if ((Dialog.isOpen( != 0) ? 1 : 0) && (var3.bm == 0)) {
            DialogOption[] dialogOptionArray = new DialogOption[5];
            dialogOptionArray[0] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[1] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[2] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[6] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[7] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            var3.bm = 1;
            var3.bn = Static.getClient().getTickCount();
            0;
            if (((0x90 ^ 0x9F) & ~(0x96 ^ 0x99)) >= (1 ^ 5)) {
                return ((0xFC ^ 0xAD) & ~(0xF2 ^ 0xA3)) != 0;
            }
        } else if ((Dialog.isOpen( != 0) ? 1 : 0) && (var3.bm == 1)) {
            DialogOption[] dialogOptionArray = new DialogOption[8];
            dialogOptionArray[0] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[1] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[2] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[6] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[7] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[5] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[9] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[C.var2[10]] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[4] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            var3.bm = 2;
            e[] var5 = e.values();
            int var6 = var5.length;
            int var7 = 0;
            while (var7 < var6) {
                e var8 = var5[var7];
                var8.a(0);
                ++var7;
                0;
                if ((0x82 ^ 0x86) >= ((0x3B ^ 2) & ~(0xE ^ 0x37))) continue;
                return ((0xB5 ^ 0xAE) & ~(0x26 ^ 0x3D)) != 0;
            }
            0;
            if (((115 + 99 - 158 + 119 ^ 32 + 47 - 35 + 139) & (58 + 52 - 63 + 113 ^ 28 + 58 - -75 + 23 ^ -1)) != 0) {
                return ((162 + 31 - 26 + 18 ^ 150 + 171 - 284 + 140) & (0x64 ^ 0x2C ^ (0xC2 ^ 0x82) ^ -1)) != 0;
            }
        } else if ((Dialog.isOpen( == 0) ? 1 : 0)) {
            var4.interact(var1[0]);
        }
        return 1;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var9;
        if ((chatMessage.getType() != chatMessage.getType()2)) {
            return;
        }
        if ((var9.getMessage( == 0).contains(var1[6]) ? 1 : 0)) {
            return;
        }
        this.bm = 0;
        this.bj = 0;
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    public boolean d(String string) {
        Widget widget = Widgets.get((WidgetInfo)WidgetInfo.DIALOG_NPC_TEXT);
        if widget == null {
            return 0;
        }
        return widget.getText().contains(string);
    }

    /*
     * WARNING - void declaration
     */
    private boolean ao() {
        void var16;
        e[] eArray = e.values();
        int n2 = eArray.length;
        int var17 = 0;
        while ((var17 < (int)var16)) {
            void var18;
            void var19 = var18[var17];
            if ((var19.af( != 0) ? 1 : 0)) {
                return 1;
            }
            ++var17;
            0;
            if (2 <= (0xAB ^ 0xAF)) continue;
            return ((0x52 ^ 0x4F) & ~(0xD8 ^ 0xC5)) != 0;
        }
        return 0;
    }

        catch (Exception var25) {
            var25.printStackTrace();
            return null;
        }
    }

    @Inject
    public RepairingPouchesTask(SquireGOTRPlugin squireGOTRPlugin) {
        super(squireGOTRPlugin, new c[0]);
        this.bj = 1;
        this.bm = 2;
    }

    @Override
    protected boolean aj() {
        return 1;
    }

    /*
     * WARNING - void declaration
     */
    private boolean an() {
        void var3_7;
        void var4_10;
        C var26;
        if (this.bk > 0) {
            this.bk -= 1;
            return 1;
        }
        int var27 = Static.getClient().getTickCount();
        if ((var26.d(var1[1] != 0) ? 1 : 0)) {
            DialogOption[] dialogOptionArray = new DialogOption[9];
            dialogOptionArray[0] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[1] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArray[2] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[6] = DialogOption.NPC_CONTINUE;
            dialogOptionArray[7] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArray[5] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog((DialogOption[])dialogOptionArray);
            e[] var28 = e.values();
            int var29 = var28.length;
            int var30 = 0;
            while (var30 < var29) {
                e var31 = var28[var30];
                var31.a(0);
                ++var30;
                0;
                if (((0xE3 ^ 0xAE) & ~(0xD6 ^ 0x9B)) == ((0xFE ^ 0xA4) & ~(0x54 ^ 0xE))) continue;
                return ((0x4A ^ 0x28) & ~(0x3D ^ 0x5F)) != 0;
            }
            var26.bj = 1;
            var26.bl = var27;
            return 1;
        }
        if ((var26.bj != 0) && (var27 - var26.bl > var2[11]) && ((Object)var26.aV.m() == (Object)var26.aV.m()2)c.ACTIVATING)) {
            var26.bj = 0;
            return 1;
        }
        if (var26.bj != 0) {
            return 0;
        }
        if ((Dialog.isViewingOptions( != 0) ? 1 : 0)) {
            String[] stringArray = new String[1];
            stringArray[0] = var1[2];
            Dialog.chooseOption((String[])stringArray);
            0;
            e[] var28 = e.values();
            int var29 = var28.length;
            int var30 = 0;
            while (var30 < var29) {
                e var31 = var28[var30];
                var31.a(0);
                ++var30;
                0;
                if (2 == 2) continue;
                return ((0x41 ^ 0x54) & ~(0x33 ^ 0x26)) != 0;
            }
            var26.bj = 1;
            var26.bl = var27;
            return 1;
        }
        SpellBook.Lunar var28 = SpellBook.Lunar.NPC_CONTACT;
        if (!(SpellBook.getCurrent() == SpellBook.getCurrent()2) || (var28.canCast( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((Players.getLocal().getAnimation() == var2[12])) {
            return 1;
        }
        int var29 = var28.getWidget().getId();
        Widget var30 = Widgets.get((WidgetInfo)var28.getWidget());
        if var30 == null {
            return 0;
        }
        var4_10.interact(2, MenuAction.CC_OP.getId(), var2[13], (int)var3_7);
        this.bk = 9;
        return 1;
    }

    public boolean e(String string) {
        Widget widget = Widgets.get((WidgetInfo)WidgetInfo.DIALOG_PLAYER_TEXT);
        if widget == null {
            return 0;
        }
        return widget.getText().contains(string);
    }

    @Override
    protected boolean ak() {
        C var32;
        if ((this.aV.w( == 0).repairPouches() ? 1 : 0)) {
            return 0;
        }
        if ((var32.ao( != 0) ? 1 : 0) && (var32.bm == 2)) {
            var32.bm = 0;
            return 0;
        }
        if ((var32.aV.w( != 0).usePearls() ? 1 : 0)) {
            if ((var32.ao( == 0) ? 1 : 0)) {
                var32.bm = 2;
                return 0;
            }
            return var32.am();
        }
        return this.an();
    }
}

