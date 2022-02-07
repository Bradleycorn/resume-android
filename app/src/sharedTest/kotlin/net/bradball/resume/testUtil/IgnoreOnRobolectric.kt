package net.bradball.resume.testUtil

/**
 * Marker class that can be used on test classes that
 * won't work with Robolectric.
 *
 * To use, annotate your test clas with
 * @Category(IgnoreOnRobolectric::class)
 */
interface IgnoreOnRobolectric
