@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class CapsuleShape : Shape {
    constructor() : super("CapsuleShape")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: Shape): CapsuleShape = CapsuleShape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): CapsuleShape = CapsuleShape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): CapsuleShape = CapsuleShape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): CapsuleShape = CapsuleShape("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): CapsuleShape = fromVariant(CapsuleShape(""), other)


        // Constants


    }


    // Properties
    open var radius: Double
        get() = _icall_Double(getRadiusMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setRadiusMethodBind, this.rawMemory, value)


    open var height: Double
        get() = _icall_Double(getHeightMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setHeightMethodBind, this.rawMemory, value)




    // Methods
    private val setRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("CapsuleShape", "set_radius") }
    open fun setRadius(radius: Double) {
        _icall_Unit_Double(setRadiusMethodBind, this.rawMemory, radius)
    }


    private val getRadiusMethodBind: CPointer<godot_method_bind> by lazy { getMB("CapsuleShape", "get_radius") }
    open fun getRadius(): Double {
        return _icall_Double(getRadiusMethodBind, this.rawMemory)
    }


    private val setHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("CapsuleShape", "set_height") }
    open fun setHeight(height: Double) {
        _icall_Unit_Double(setHeightMethodBind, this.rawMemory, height)
    }


    private val getHeightMethodBind: CPointer<godot_method_bind> by lazy { getMB("CapsuleShape", "get_height") }
    open fun getHeight(): Double {
        return _icall_Double(getHeightMethodBind, this.rawMemory)
    }


}
