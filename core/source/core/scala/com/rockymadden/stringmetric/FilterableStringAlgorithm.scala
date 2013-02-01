package com.rockymadden.stringmetric

/** Trait for all string based [[com.rockymadden.stringmetric.FilterableAlgorithm]]. */
trait FilterableStringAlgorithm extends FilterableAlgorithm[String, StringFilter] with StringAlgorithm {
	def compute(charArray: Array[Char])(implicit stringFilter: StringFilter): Option[Array[_]]
}
