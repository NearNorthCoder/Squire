/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.DialogOption
 *  net.runelite.api.Locatable
 *  net.runelite.api.MenuAction
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Lunar
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Dialog
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.mahoghomes.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mahoghomes.SquireHomesConfig;
import gg.squire.mahoghomes.SquireHomesPlugin;
import gg.squire.mahoghomes.model.Agency;
import gg.squire.mahoghomes.model.BankMethod;
import javax.inject.Inject;
import net.runelite.api.DialogOption;
import net.runelite.api.Locatable;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* TASK: Getting Assignment -> GettingassignmentTask */
@TaskDesc(name="Getting Assignment", priority=30, blocking=true)
public class GetAssignment
extends Task {
    private static final Logger log = LoggerFactory.getLogger(GetAssignment.class);
    public static final int NPC_CONTACT_ANIMATION_ID = 4413;
    private final SquireHomesPlugin plugin;
    private final SquireHomesConfig config;

    @Inject
    public GetAssignment(SquireHomesPlugin plugin, SquireHomesConfig config) {
        this.plugin = plugin;
        this.config = config;
    }

    public boolean run() {
        if (this.plugin.getCurrentHome() != null || Bank.isOpen()) {
            return false;
        }
        if (Dialog.isOpen()) {
            String text = Dialog.getText();
            if (Dialog.canContinuePlayer() && text.contains("my current")) {
                Dialog.continueSpace();
                return true;
            }
            if (Dialog.canContinueNPC() && this.plugin.checkForAssignmentDialog(text)) {
                return true;
            }
            if (Dialog.canLevelUpContinue()) {
                Dialog.continueSpace();
            } else {
                Dialog.invokeDialog((DialogOption[])new DialogOption[]{DialogOption.PLAYER_CONTINUE, DialogOption.NPC_CONTINUE, this.getContractOption(), DialogOption.PLAYER_CONTINUE, DialogOption.NPC_CONTINUE});
                this.plugin.setCurrentHome(null);
            }
            return true;
        }
        return this.config.contact() ? this.npcContact() : this.walkToContractNpc();
    }

    private boolean walkToContractNpc() {
        if (this.config.bankMethod() == BankMethod.CLOSEST) {
            return this.walkToClosestAgency();
        }
        return this.walkToAmy();
    }

    private boolean walkToClosestAgency() {
        Player local = Players.getLocal();
        if (local == null) {
            return false;
        }
        Agency closest = Agency.getNearestTo(local.getWorldLocation());
        NPC npc = NPCs.getNearest((String[])new String[]{closest.getNpc()});
        if (npc == null || !Reachable.isInteractable((Locatable)npc)) {
            Movement.walkTo((WorldPoint)closest.getLocation());
        } else {
            npc.interact("Contract");
        }
        return true;
    }

    private boolean npcContact() {
        Player local = Players.getLocal();
        if (local == null) {
            return false;
        }
        if (local.getAnimation() == 4413) {
            return true;
        }
        Magic.cast((Spell)SpellBook.Lunar.NPC_CONTACT, (int)1, (int)MenuAction.CC_OP.getId());
        this.sleep(5);
        return true;
    }

    private boolean walkToAmy() {
        if (!Movement.shouldWalk()) {
            return true;
        }
        NPC amy = NPCs.getNearest((String[])new String[]{"Amy"});
        if (amy == null || !Reachable.isInteractable((Locatable)amy)) {
            Movement.walkTo((WorldPoint)Agency.AMY.getLocation());
        } else {
            amy.interact("Contract");
        }
        return true;
    }

    private DialogOption getContractOption() {
        switch (this.config.contract()) {
            case NOVICE: {
                return DialogOption.CHAT_OPTION_TWO;
            }
            case ADEPT: {
                return DialogOption.CHAT_OPTION_THREE;
            }
            case EXPERT: {
                return DialogOption.CHAT_OPTION_FOUR;
            }
        }
        return DialogOption.CHAT_OPTION_ONE;
    }
}

