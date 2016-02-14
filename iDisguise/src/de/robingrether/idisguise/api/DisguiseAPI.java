package de.robingrether.idisguise.api;

import org.bukkit.entity.Player;

import de.robingrether.idisguise.disguise.Disguise;
import de.robingrether.idisguise.disguise.DisguiseType;
import de.robingrether.idisguise.management.Sounds;

/**
 * The API to hook into iDisguise. The following code returns an object:<br>
 * <code>Bukkit.getServicesManager().getRegistration(DisguiseAPI.class).getProvider();</code>
 * 
 * @since 2.1.3
 * @author RobinGrether
 */
public interface DisguiseAPI {
	
	/**
	 * Disguises a player.
	 * 
	 * @since 3.0.1
	 * @param player the player to disguise
	 * @param disguise the disguise
	 */
	public void disguiseToAll(Player player, Disguise disguise);
	
	/**
	 * Undisguises a player.
	 * 
	 * @since 2.1.3
	 * @param player the player to undisguise
	 */
	public void undisguiseToAll(Player player);
	
	/**
	 * Undisguises all players.
	 * 
	 * @since 2.1.3
	 */
	public void undisguiseAll();
	
	/**
	 * Checks whether a player is disguised.
	 * 
	 * @since 2.1.3
	 * @param player the player to check
	 * @return true if disguised, false if not
	 */
	public boolean isDisguised(Player player);
	
	/**
	 * Gets a copy of a player's disguise.
	 * 
	 * @since 2.1.3
	 * @param player the player
	 * @return the disguise or null if not disguised
	 */
	public Disguise getDisguise(Player player);
	
	/**
	 * Counts the amount of online players who are disguised.
	 * 
	 * @since 2.1.3
	 * @return the counted amount
	 */
	public int getOnlineDisguiseCount();
	
	/**
	 * Gets the {@link Sounds} for a specific entity type.
	 * 
	 * @since 5.1.1
	 * @param type the entity/disguise type
	 * @return the sounds for the given entity/disguise type
	 */
	public Sounds getSoundsForEntity(DisguiseType type);
	
	/**
	 * Sets the {@link Sounds} for a specific entity type.
	 * 
	 * @since 5.1.1
	 * @param type the entity/disguise type
	 * @param sounds the sounds
	 * @return <code>true</code>, if the sounds have been set
	 */
	public boolean setSoundsForEntity(DisguiseType type, Sounds sounds);
	
	/**
	 * Indicates whether the disguised players' sounds are currently replaced.
	 * 
	 * @since 5.1.1
	 * @return <code>true</code>, if they are replaced
	 */
	public boolean isSoundsEnabled();
	
	/**
	 * Sets whether the disguised players' sounds are replaced.
	 * 
	 * @since 5.1.1
	 * @param enabled <code>true</code>, if they shall be replaced
	 */
	public void setSoundsEnabled(boolean enabled);
	
}