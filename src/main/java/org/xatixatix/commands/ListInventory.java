package org.xatixatix.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ListInventory implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player;
        sender.sendMessage(sender.toString());

        if(sender instanceof Player){
            player = (Player) sender;
        } else{
            sender.sendMessage("This command can only be called by players!");
            return true;
        }

        Map<String, Integer> items = new HashMap<>();
        PlayerInventory inventory = player.getInventory();
        StringBuilder stringBuilder = new StringBuilder();

        inventory.forEach(itemStack -> {
            if (itemStack != null) {
                if (items.containsKey(itemStack.getType().toString())) {
                    items.put(itemStack.getType().toString(), items.get(itemStack.getType().toString()) + itemStack.getAmount());
                } else {
                    items.put(itemStack.getType().toString(), itemStack.getAmount());
                }
            }
        });

        items.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(entry -> stringBuilder.append(entry.getKey()).append("*").append(entry.getValue()).append("\n"));

        sender.sendMessage(stringBuilder.toString());
        return true;
    }
}
