package CommandManager;

import net.dv8tion.jda.api.events.interaction.component.SelectMenuInteractionEvent;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class SlashCommandListener extends ListenerAdapter
{
    private final SlashCommandManager commandManager;
    
    public SlashCommandListener() {
        this.commandManager = new SlashCommandManager();
    }
    
    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        try {
            this.commandManager.run(event);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void onButtonInteraction(ButtonInteractionEvent event) {
        try {
            this.commandManager.run(event);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void onSelectMenuInteraction(SelectMenuInteractionEvent event) {
        try {
            this.commandManager.run(event);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
