package pairsgame

import java.io.Serializable

class TileChosen implements Serializable {
    int gameId
    int id
	def color
	def pos
	def value//could calculate it using the pairsMap 
    //def tileData //<int[posx, posy]: int[value, color]>
	 
}
