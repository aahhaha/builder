Author: Aibyn Samat

Title: Add Factory Method layer on top of existing Builder; introduce registry and presets

Summary:

Retained the existing Builder implementation for GameCharacter.

Added factories (Warrior Factory, ArcherFactory) and the CharacterFactories registry (Map).

Main now creates characters via CharacterFactories.get(type).create().

Why:

Remove new and long initialization from the client code.

It's easy to expand the set of characters with new presets.

A clear demonstration of the two generative patterns together.

How to test:

Run Main and check the output of toString() for WARRIOR and ARCHER.

(Optional) Add a MageFactory, register it in the registry and run it.
