package de.robingrether.idisguise.disguise;

import java.util.Locale;

import org.bukkit.DyeColor;

/**
 * Represents a disguise as a sheep.
 * 
 * @since 5.1.1
 * @author RobinGrether
 */
public class SheepDisguise extends AgeableDisguise {
	
	private static final long serialVersionUID = -8390096252207373283L;
	private DyeColor color;
	
	/**
	 * Creates an instance.
	 * 
	 * @since 5.1.1
	 */
	public SheepDisguise() {
		this(true, DyeColor.WHITE);
	}
	
	/**
	 * Creates an instance.
	 * 
	 * @since 5.1.1
	 * @param adult should the disguise be an adult
	 * @param color the color of the wool
	 */
	public SheepDisguise(boolean adult, DyeColor color) {
		super(DisguiseType.SHEEP, adult);
		this.color = color;
	}
	
	/**
	 * Returns the color.
	 * 
	 * @since 5.1.1
	 * @return the wool color
	 */
	public DyeColor getColor() {
		return color;
	}
	
	/**
	 * Sets the color.
	 * 
	 * @param color the wool color
	 */
	public void setColor(DyeColor color) {
		this.color = color;
	}
	
	/**
	 * {@inheritDoc}
	 */
	public SheepDisguise clone() {
		SheepDisguise clone = new SheepDisguise(adult, color);
		clone.setCustomName(customName);
		return clone;
	}
	
	/**
	 * {@inheritDoc}
	 */
	public boolean equals(Object object) {
		return super.equals(object) && object instanceof SheepDisguise && ((SheepDisguise)object).color.equals(color);
	}
	
	/**
	 * {@inheritDoc}
	 */
	public boolean applySubtype(String argument) {
		if(super.applySubtype(argument)) {
			return true;
		} else {
			try {
				DyeColor color = DyeColor.valueOf(argument.replace('-', '_').toUpperCase(Locale.ENGLISH));
				setColor(color);
				return true;
			} catch(IllegalArgumentException e) {
				return false;
			}
		}
	}
	
}