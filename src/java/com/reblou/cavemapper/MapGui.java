package com.reblou.cavemapper;

import java.io.IOException;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

public class MapGui extends GuiScreen {
	private GuiButton testButton;
	
	
	@Override
	public void initGui() {
		super.initGui();
		this.buttonList.add(testButton = new GuiButton(0, this.width/2, this.height/2, "Foo"));
	}

	@Override
	protected void actionPerformed(GuiButton button) {
		if (button == testButton) {
			System.out.println("testButton pressed");
			mc.thePlayer.closeScreen();
		}
	}
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		this.drawDefaultBackground();
		super.drawScreen(mouseX, mouseY, partialTicks);
	}
	
	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}
}
