package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;
import Entities.Game;

public class CampaignManager implements ICampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getDiscountRate() + " indirimle oran�yla " + campaign.getName() + " adl� kampanya olu�turuldu." );
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " adl� kampanya g�ncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " adl� kampanya silindi.");
		
	}

	@Override
	public void sale(Campaign campaign, Game game) {
		System.out.println("Kullan�lan Kampanya: " + campaign.getName() + '\n' +
							"Oyun �smi: " + game.getName() + '\n' +
					"Kampanya Oran�: " + campaign.getDiscountRate() + "%" + '\n' +
					"Kampanya �ncesi Oyun Fiyat�: " + game.getPrice() + "$" + '\n' + 
					"Kampanya Sonras� Oyun Fiyat�: " + (game.getPrice() / campaign.getDiscountRate()) + "$" + '\n' 
					
					
						 );
		
	}

	

}
