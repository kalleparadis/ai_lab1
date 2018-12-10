package main;

import com.eudycontreras.othello.capsules.AgentMove;
import com.eudycontreras.othello.controllers.AgentController;
import com.eudycontreras.othello.controllers.Agent;
import com.eudycontreras.othello.enumerations.PlayerTurn;
import com.eudycontreras.othello.models.GameBoardState;

/**
 * <H2>Created by</h2> Eudy Contreras
 * <h4> Mozilla Public License 2.0 </h4>
 * Licensed under the Mozilla Public License 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <a href="https://www.mozilla.org/en-US/MPL/2.0/">visit Mozilla Public Lincense Version 2.0</a>
 * <H2>Class description</H2>
 * 
 * @author Eudy Contreras
 */
public class MinimaxAgent extends Agent{
	
	
	public MinimaxAgent() {
		this(PlayerTurn.PLAYER_ONE);
	}
	
	public MinimaxAgent(String name) {
		super(name, PlayerTurn.PLAYER_ONE);
	}
	
	public MinimaxAgent(PlayerTurn playerTurn) {
		super(playerTurn);
	
	}

	@Override
	public AgentMove getMove(GameBoardState gameState) {
		return AgentController.getMinimaxMove(gameState, playerTurn);
	}

}
