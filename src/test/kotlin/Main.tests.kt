import io.github.pyandr3w.codestyletransformer.transformString
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MainTests {
    @Test
    fun testCamelCaseTransform() {
        assertEquals("storeUint", transformString("store_uint", 1))
        assertEquals("receiveInternalMessage", transformString("recv_internal", 1))
        assertEquals("isNull", transformString("null?", 1))
        assertEquals("forceCheck", transformString("check!", 1))
        assertEquals("modifiedSlice", transformString("slice'", 1))
        assertEquals("~loadUint", transformString("~load_uint", 1))
        assertEquals("op::transferNotification", transformString("op::transfer_notification", 1))
        assertEquals("resultTrue", transformString("result_true?", 1))
        assertEquals("~tryIdictReplaceGetBuilder", transformString("~idict_replace_get_builder?", 1))
        assertEquals("", transformString("", 1))
    }

    @Test
    fun testSnakeCaseTransform() {
        assertEquals("store_uint", transformString("storeUint", 2))
        assertEquals("recv_internal", transformString("receiveInternalMessage", 2))
        assertEquals("null?", transformString("isNull", 2))
        assertEquals("check!", transformString("forceCheck", 2))
        assertEquals("slice'", transformString("modifiedSlice", 2))
        assertEquals("~load_uint", transformString("~loadUint", 2))
        assertEquals("op::transfer_notification", transformString("op::transferNotification", 2))
        assertEquals("result_true", transformString("resultTrue", 2))
        assertEquals("~idict_replace_get_builder?", transformString("~tryIdictReplaceGetBuilder", 2))
        assertEquals("", transformString("", 2))
    }
}
