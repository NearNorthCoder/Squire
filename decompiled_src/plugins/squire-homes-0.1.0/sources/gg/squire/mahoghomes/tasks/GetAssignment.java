package gg.squire.mahoghomes.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mahoghomes.SquireHomesConfig;
import gg.squire.mahoghomes.SquireHomesPlugin;
import gg.squire.mahoghomes.model.Agency;
import gg.squire.mahoghomes.model.BankMethod;
import javax.inject.Inject;
import net.runelite.api.DialogOption;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Getting Assignment", priority = 30, blocking = true)
/* loaded from: squire-homes-0.1.0.jar:gg/squire/mahoghomes/tasks/GetAssignment.class */
public class GetAssignment extends Task {
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
        if (!Dialog.isOpen()) {
            return this.config.contact() ? npcContact() : walkToContractNpc();
        }
        String text = Dialog.getText();
        if (Dialog.canContinuePlayer() && text.contains("my current")) {
            Dialog.continueSpace();
            return true;
        } else if (Dialog.canContinueNPC() && this.plugin.checkForAssignmentDialog(text)) {
            return true;
        } else {
            if (Dialog.canLevelUpContinue()) {
                Dialog.continueSpace();
                return true;
            }
            Dialog.invokeDialog(new DialogOption[]{DialogOption.PLAYER_CONTINUE, DialogOption.NPC_CONTINUE, getContractOption(), DialogOption.PLAYER_CONTINUE, DialogOption.NPC_CONTINUE});
            this.plugin.setCurrentHome(null);
            return true;
        }
    }

    private boolean walkToContractNpc() {
        if (this.config.bankMethod() == BankMethod.CLOSEST) {
            return walkToClosestAgency();
        }
        return walkToAmy();
    }

    private boolean walkToClosestAgency() {
        Player local = Players.getLocal();
        if (local == null) {
            return false;
        }
        Agency closest = Agency.getNearestTo(local.getWorldLocation());
        NPC npc = NPCs.getNearest(new String[]{closest.getNpc()});
        if (npc == null || !Reachable.isInteractable(npc)) {
            Movement.walkTo(closest.getLocation());
            return true;
        }
        npc.interact("Contract");
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
        Magic.cast(SpellBook.Lunar.NPC_CONTACT, 1, MenuAction.CC_OP.getId());
        sleep(5);
        return true;
    }

    private boolean walkToAmy() {
        if (!Movement.shouldWalk()) {
            return true;
        }
        NPC amy = NPCs.getNearest(new String[]{"Amy"});
        if (amy == null || !Reachable.isInteractable(amy)) {
            Movement.walkTo(Agency.AMY.getLocation());
            return true;
        }
        amy.interact("Contract");
        return true;
    }

    private DialogOption getContractOption() {
        switch (this.config.contract()) {
            case NOVICE:
                return DialogOption.CHAT_OPTION_TWO;
            case ADEPT:
                return DialogOption.CHAT_OPTION_THREE;
            case EXPERT:
                return DialogOption.CHAT_OPTION_FOUR;
            default:
                return DialogOption.CHAT_OPTION_ONE;
        }
    }
}
