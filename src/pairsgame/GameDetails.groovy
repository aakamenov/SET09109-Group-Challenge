package pairsgame

import java.io.Serializable;

class GameDetails implements Serializable {
	def gameId
	def playerDetails = null
	def pairsSpecification = null
	def playerTurn
}
