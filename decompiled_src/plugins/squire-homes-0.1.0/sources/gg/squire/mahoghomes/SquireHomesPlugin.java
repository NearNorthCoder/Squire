package gg.squire.mahoghomes;

import com.google.inject.Provides;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.mahoghomes.model.Contract;
import gg.squire.mahoghomes.model.Home;
import gg.squire.mahoghomes.model.Hotspot;
import gg.squire.mahoghomes.model.PlankSack;
import gg.squire.mahoghomes.model.RequiredMaterials;
import gg.squire.mahoghomes.overlay.HomesInfoBox;
import gg.squire.mahoghomes.tasks.BankTask;
import gg.squire.mahoghomes.tasks.CheckSack;
import gg.squire.mahoghomes.tasks.CompleteTask;
import gg.squire.mahoghomes.tasks.DialogSpacebar;
import gg.squire.mahoghomes.tasks.EmptySack;
import gg.squire.mahoghomes.tasks.GetAssignment;
import gg.squire.mahoghomes.tasks.HandleStairs;
import gg.squire.mahoghomes.tasks.TravelToHouse;
import gg.squire.mahoghomes.tasks.furniture.CreationMenuTask;
import gg.squire.mahoghomes.tasks.furniture.FurnitureTask;
import java.time.Instant;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.GameState;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.VarbitChanged;
import net.runelite.api.events.WidgetLoaded;
import net.runelite.api.util.Text;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@PluginDescriptor(name = "Squire Mahogany Homes", enabledByDefault = false)
@SquireUtil
/* loaded from: squire-homes-0.1.0.jar:gg/squire/mahoghomes/SquireHomesPlugin.class */
public class SquireHomesPlugin extends SquirePlugin {
    private static final Logger log = LoggerFactory.getLogger(SquireHomesPlugin.class);
    private static final Pattern CONTRACT_PATTERN = Pattern.compile("(Please could you g|G)o see (\\w*)[ ,][\\w\\s,-]*[?.] You can get another job once you have furnished \\w* home\\.");
    private static final Pattern CONTRACT_CHAT_MESSAGE = Pattern.compile("\"(?<rank>\\\\w+) Contract: Go see (?<npc>\\\\w+), (?<location>.+)\"");
    private static final Pattern REMINDER_PATTERN = Pattern.compile("You're currently on an? (\\w*) Contract\\. Go see (\\w*)[ ,][\\w\\s,-]*\\. You can get another job once you have furnished \\w* home\\.");
    private static final Pattern CONTRACT_FINISHED = Pattern.compile("You have completed [\\d,]* contract(s)? with a total of [\\d,]* points?\\.");
    private static final RequiredMaterials DEFAULT_REQUIRED_MATERIALS = new RequiredMaterials(0, 17, 0, 1);
    @Inject
    private SquireHomesConfig config;
    @Inject
    private OverlayManager overlayManager;
    @Inject
    private PlankSack plankSack;
    @Inject
    private EventBus eventBus;
    @Inject
    private HomesInfoBox paint;
    private Instant started;
    private Instant lastChanged;
    private Home currentHome;
    private int sessionContracts;
    private int sessionPoints;
    private boolean varbChange;
    private int planksBanked;
    private final HashMap<Integer, Integer> varbMap = new HashMap<>();
    private int lastCompletedCount = -1;

    public SquireHomesConfig getConfig() {
        return this.config;
    }

    public Instant getStarted() {
        return this.started;
    }

    public Instant getLastChanged() {
        return this.lastChanged;
    }

    public int getLastCompletedCount() {
        return this.lastCompletedCount;
    }

    public Home getCurrentHome() {
        return this.currentHome;
    }

    public void setCurrentHome(Home currentHome) {
        this.currentHome = currentHome;
    }

    public int getSessionContracts() {
        return this.sessionContracts;
    }

    public void setSessionContracts(int sessionContracts) {
        this.sessionContracts = sessionContracts;
    }

    public int getSessionPoints() {
        return this.sessionPoints;
    }

    public void setSessionPoints(int sessionPoints) {
        this.sessionPoints = sessionPoints;
    }

    public boolean isVarbChange() {
        return this.varbChange;
    }

    public void setVarbChange(boolean varbChange) {
        this.varbChange = varbChange;
    }

    public int getPlanksBanked() {
        return this.planksBanked;
    }

    public void setPlanksBanked(int planksBanked) {
        this.planksBanked = planksBanked;
    }

    protected Class<?>[] tasks() {
        return new Class[]{FurnitureTask.class, CreationMenuTask.class, HandleStairs.class, CompleteTask.class, TravelToHouse.class, GetAssignment.class, BankTask.class, CheckSack.class, EmptySack.class, DialogSpacebar.class};
    }

    protected void onStart() {
        this.plankSack.init();
        this.eventBus.register(this.plankSack);
        this.overlayManager.add(this.paint);
        this.started = Instant.now();
        if (Static.getClient().getGameState() == GameState.LOGGED_IN) {
            Static.getClientThread().invoke(this::updateVarbMap);
        }
        this.lastChanged = Instant.now();
        this.lastCompletedCount = 0;
        this.currentHome = null;
    }

    protected void onStop() {
        this.eventBus.unregister(this.plankSack);
        this.overlayManager.remove(this.paint);
        this.currentHome = null;
        this.lastChanged = null;
        this.lastCompletedCount = -1;
        this.varbMap.clear();
    }

    @Provides
    SquireHomesConfig getConfig(ConfigManager configManager) {
        return (SquireHomesConfig) configManager.getConfig(SquireHomesConfig.class);
    }

    public RequiredMaterials getRequiredMaterials() {
        Home currentHome = getCurrentHome();
        if (currentHome == null) {
            return DEFAULT_REQUIRED_MATERIALS;
        }
        return currentHome.getRequiredMaterialsByTier().getByTier(this.config.contract().getDialogOption());
    }

    public int getTotalPlanks() {
        Contract contract = this.config.contract();
        String itemName = contract.getItemName();
        int planks = Inventory.getCount(new String[]{itemName});
        if (this.config.sack()) {
            planks += this.plankSack.getPlanks(contract);
        }
        return planks;
    }

    public boolean hasItems() {
        RequiredMaterials requiredMaterials = getRequiredMaterials();
        int ourBarAmount = Inventory.getCount(new int[]{2353});
        int ourPlankAmount = getTotalPlanks();
        return ourBarAmount >= requiredMaterials.getMaxSteelBars() && ourPlankAmount >= requiredMaterials.getMaxPlanks();
    }

    public InventorySetup getInventorySetup() {
        InventorySetup inventorySetup = new InventorySetup();
        inventorySetup.add(2353, 2);
        inventorySetup.add(this.config.contract().getItemName(), 24);
        inventorySetup.add(2347, 1);
        inventorySetup.add(8794, 1);
        return inventorySetup;
    }

    private void updateVarbMap() {
        Hotspot[] values;
        this.varbMap.clear();
        for (Hotspot spot : Hotspot.values()) {
            this.varbMap.put(Integer.valueOf(spot.getVarb()), Integer.valueOf(Static.getClient().getVarbitValue(spot.getVarb())));
        }
    }

    @Subscribe
    public void onVarbitChanged(VarbitChanged event) {
        updateVarbMap();
        int completed = getCompletedCount();
        if (completed != this.lastCompletedCount) {
            this.lastCompletedCount = completed;
            this.lastChanged = Instant.now();
        }
    }

    @Subscribe
    public void onChatMessage(ChatMessage e) {
        if (!e.getType().equals(ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (e.getMessage().contains("Your sack is full")) {
            this.plankSack.add(this.config.contract().ordinal(), 28);
        }
        String input = Text.removeTags(e.getMessage());
        if (CONTRACT_FINISHED.matcher(input).matches()) {
            setCurrentHome(null);
            this.sessionContracts++;
            this.sessionPoints += getPointsForCompletingTask();
        }
        getHomeFrom(input);
    }

    public boolean checkForAssignmentDialog(String text) {
        Home[] values;
        String npcText = net.runelite.client.util.Text.sanitizeMultilineText(text);
        Matcher startContractMatcher = CONTRACT_PATTERN.matcher(npcText);
        Matcher reminderContract = REMINDER_PATTERN.matcher(npcText);
        String name = null;
        if (startContractMatcher.matches()) {
            name = startContractMatcher.group(2);
        } else if (reminderContract.matches()) {
            name = reminderContract.group(2);
            getTierByText(reminderContract.group(1));
        }
        if (name != null) {
            for (Home h : Home.values()) {
                if (h.getName().equalsIgnoreCase(name) && this.currentHome != h) {
                    setCurrentHome(h);
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private int getTierByText(String tierText) {
        boolean z = true;
        switch (tierText.hashCode()) {
            case -1955763274:
                if (tierText.equals("Novice")) {
                    z = true;
                    break;
                }
                break;
            case 63108614:
                if (tierText.equals("Adept")) {
                    z = true;
                    break;
                }
                break;
            case 1554081906:
                if (tierText.equals("Beginner")) {
                    z = false;
                    break;
                }
                break;
            case 2089671242:
                if (tierText.equals("Expert")) {
                    z = true;
                    break;
                }
                break;
        }
        switch (z) {
            case false:
                return 1;
            case true:
                return 2;
            case true:
                return 3;
            case true:
                return 4;
            default:
                return -1;
        }
    }

    public boolean getHomeFrom(String text) {
        Home[] values;
        String text2 = Text.removeTags(text).split("\\. ")[1];
        int goSeeIndex = text2.indexOf("Go see");
        if (goSeeIndex == -1) {
            log.info("Cannot get home, 'Go see' not found in text");
            return false;
        }
        String subString = text2.substring(goSeeIndex + "Go see".length()).trim();
        String npc = subString.split(" ")[0];
        if (npc.contains(",")) {
            npc = npc.split(",")[0].trim();
        }
        if (npc.contains("along")) {
            npc = npc.replace("along", "").trim();
        }
        for (Home h : Home.values()) {
            if (h.getName().equalsIgnoreCase(npc.trim())) {
                setCurrentHome(h);
                return true;
            }
        }
        return false;
    }

    public boolean isWorkFinished() {
        return Stream.of((Object[]) Hotspot.values()).flatMap(h -> {
            return h.getObjectIds().stream();
        }).noneMatch((v0) -> {
            return Hotspot.requiresAttention(v0);
        });
    }

    int getPointsForCompletingTask() {
        int tier = 0;
        for (Integer num : this.varbMap.values()) {
            int val = num.intValue();
            tier = Math.max(tier, val);
        }
        int tier2 = tier - 4;
        if (tier2 < 0) {
            return 0;
        }
        return tier2 + 1;
    }

    int getCompletedCount() {
        Hotspot[] values;
        if (this.currentHome == null) {
            return -1;
        }
        int count = 0;
        for (Hotspot hotspot : Hotspot.values()) {
            boolean requiresAttention = doesHotspotRequireAttention(hotspot.getVarb());
            if (requiresAttention) {
                count++;
            }
        }
        return count;
    }

    public boolean doesHotspotRequireAttention(int varb) {
        Integer val = this.varbMap.get(Integer.valueOf(varb));
        if (val == null) {
            return false;
        }
        return val.intValue() == 1 || val.intValue() == 3 || val.intValue() == 4;
    }

    @Subscribe
    private void onWidgetLoaded(WidgetLoaded widget) {
        if (Bank.isOpen()) {
            setPlanksBanked(Bank.getCount(true, new String[]{this.config.contract().getItemName()}));
        }
    }
}
