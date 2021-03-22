package Controllers;

import Models.Campaign;
import View.AdAuctionGUI;

import javax.swing.*;

public class CampaignController {
    public static void main(String[] args) {
        // gui
        AdAuctionGUI adAuctionGUI = new AdAuctionGUI();
        Campaign campaign = new Campaign("src/Logs/impression_log.csv", "src/Logs/click_log.csv", "src/Logs/server_log.csv");

        SwingUtilities.invokeLater(adAuctionGUI::prepareGui);

        adAuctionGUI.createMetrics(campaign.createMetrics());
        adAuctionGUI.createCharts(campaign.createCharts());

        /*
         * to do:
         * blank gui
         * load metrics and default chart button
         * update commenting for GUI
         * improve file reading with anomalous data - test on large dataset
         * follow 2nd deliverable sprint plan
         */
    }
}
