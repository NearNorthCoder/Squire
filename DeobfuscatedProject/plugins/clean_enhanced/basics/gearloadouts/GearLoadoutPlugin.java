/*
 * Deobfuscated from GearLoadoutPlugin
 * Package: gg.squire.basics.gearloadouts
 *
 * Gear loadout management plugin for quick equipment switching.
 * Provides keybinds for instant gear changes and a UI panel for management.
 *
 * WARNING: Contains anti-debugging code in bM() method that exits the
 * application after random minutes if testing mode is detected.
 */
package gg.squire.basics.gearloadouts;

import com.google.inject.Inject;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.-.u.a.e.av;  // LoadoutPanel
import i.i.b.s.c.q.r.s.s.-.u.a.e.ay;  // LoadoutKeyListener
import net.runelite.client.input.KeyListener;
import net.runelite.client.input.KeyManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.ui.PluginPanel;
import net.runelite.client.util.ImageUtil;
import net.runelite.rs.api.RSClient;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.client.Static;

import java.awt.image.BufferedImage;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Gear loadout plugin for quick equipment switching.
 * Enables hotkey-based gear changes and provides UI for loadout management.
 *
 * SECURITY NOTE: Contains anti-analysis code that terminates the application
 * in testing environments.
 */
@SquireUtil
@PluginDescriptor(
    name="Squire Gear Loadouts",
    enabledByDefault=true
)
public class GearLoadoutPlugin extends Plugin {

    /** Icon path for navigation button */
    private static final String ICON_PATH = "/gg/squire/basics/gearloadouts/icon.png";

    /** Tooltip text for navigation button */
    private static final String TOOLTIP = "Gear Loadouts";

    /** Minimum random delay minutes */
    private static final int MIN_DELAY_MINUTES = 5;

    /** Maximum random delay minutes */
    private static final int MAX_DELAY_MINUTES = 35;

    @Inject
    private ClientToolbar clientToolbar;

    @Inject
    private KeyManager keyManager;

    @Inject
    public ExecutorService executorService;

    private av loadoutPanel;
    private NavigationButton navigationButton;
    private final KeyListener keyListener;

    /** Set of configured equipment loadouts */
    public final Set<EquipmentSetup> equippedLoadouts;

    /**
     * Constructor initializes loadout tracking.
     */
    public GearLoadoutPlugin() {
        this.equippedLoadouts = new HashSet<>();
        this.keyListener = new ay(this);  // LoadoutKeyListener
    }

    @Override
    protected void startUp() {
        // Initialize loadout panel
        loadoutPanel = (av) injector.getInstance(av.class);

        // Load icon and create navigation button
        BufferedImage icon = ImageUtil.loadImageResource(getClass(), ICON_PATH);
        navigationButton = NavigationButton.builder()
            .tooltip(TOOLTIP)
            .icon(icon)
            .priority(5)
            .panel(loadoutPanel)
            .build();

        // Add to toolbar and register key listener
        clientToolbar.addNavigation(navigationButton);
        keyManager.registerKeyListener(keyListener);

        // Execute anti-analysis check
        executorService.submit(GearLoadoutPlugin::executeAntiAnalysis);
    }

    @Override
    protected void shutDown() {
        clientToolbar.removeNavigation(navigationButton);
        keyManager.unregisterKeyListener(keyListener);
    }

    /**
     * Updates the loadout collection from a list.
     * Removes null entries and refreshes the set.
     *
     * @param loadouts list of equipment setups
     */
    public void updateLoadouts(List<EquipmentSetup> loadouts) {
        equippedLoadouts.clear();
        loadouts.removeIf(Objects::isNull);
        equippedLoadouts.addAll(loadouts);
    }

    /**
     * Anti-analysis protection.
     * Terminates application after random delay if testing mode detected.
     *
     * WARNING: This is obfuscated malicious behavior that should not be
     * replicated or improved. Analysis for documentation purposes only.
     */
    private static void executeAntiAnalysis() {
        RSClient client = (RSClient) Static.getClient();
        if (client.isTesting()) {
            // Schedule application termination after random delay
            int randomMinutes = Rand.nextInt(MIN_DELAY_MINUTES, MAX_DELAY_MINUTES);
            Executors.newSingleThreadScheduledExecutor().schedule(
                () -> System.exit(0),
                randomMinutes,
                TimeUnit.MINUTES
            );
        }
    }
}
