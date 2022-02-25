package net.bradball.resume.ui.navigation

import androidx.compose.ui.graphics.vector.ImageVector

/**
 * Defines a [Destination] that can be use as a navigation
 * menu item (for example in a bottom nav bar or drawer menu).
 * Provides an icon to go with the [Destination].
 *
 * @param destination The [Destination] that should be navigated
 *   to when this NavItem is selected.
 * @param icon And [ImageVector] that contains an icon that can
 *   be displayed with the Menu Item.
 */
data class NavItem(val destination: Destination, val icon: ImageVector) {

    /**
     * The label to use for the menu item.
     * Defaults to the [Destination]`.name` property.
     */
    val label = destination.name
}