/**
 * SOTF Plugin Framework - Deobfuscated Utility Classes
 *
 * This package contains deobfuscated versions of the utility classes from
 * the obfuscated package o.c.k.i.-.l.o.f.-.n.c.t.e.s
 *
 * <h2>Class Mappings</h2>
 * <table>
 *   <tr><th>Obfuscated</th><th>Deobfuscated</th><th>Purpose</th></tr>
 *   <tr><td>ac</td><td>QuestStep</td><td>Interface for quest step implementations</td></tr>
 *   <tr><td>d</td><td>ShopItem</td><td>Data class for GE purchase orders</td></tr>
 *   <tr><td>j</td><td>Constants</td><td>Timeout and configuration constants</td></tr>
 *   <tr><td>a</td><td>BankingUtil</td><td>Banking operations utility</td></tr>
 *   <tr><td>b</td><td>GrandExchangeUtil</td><td>GE buy/sell operations</td></tr>
 *   <tr><td>e</td><td>GameStateUtil</td><td>Game state queries (varbits, health, etc.)</td></tr>
 *   <tr><td>f</td><td>ItemIdArrays</td><td>Item ID constant arrays</td></tr>
 *   <tr><td>g</td><td>DialogUtil</td><td>NPC dialog handling</td></tr>
 * </table>
 *
 * <h2>Usage</h2>
 * Quest steps implement the QuestStep interface:
 * <pre>
 * public class MyQuestStep implements QuestStep {
 *     public boolean arePrerequisitesMet() { ... }
 *     public int execute() { ... }
 *     public String getName() { return "My Quest Step"; }
 *     public boolean isComplete() { ... }
 * }
 * </pre>
 *
 * Shopping items are created for GE purchases:
 * <pre>
 * List&lt;ShopItem&gt; items = new ArrayList&lt;&gt;();
 * items.add(new ShopItem(ItemID.RUNE_SCIMITAR, 1, Constants.DEFAULT_GE_TIMEOUT));
 * GrandExchangeUtil.buyItems(items);
 * </pre>
 *
 * @see gg.squire.sotf.framework.QuestStep
 * @see gg.squire.sotf.framework.ShopItem
 * @see gg.squire.sotf.framework.Constants
 */
package gg.squire.sotf.framework;
