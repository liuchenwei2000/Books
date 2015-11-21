/**
 * 
 */
package principle.DIP.v1;

/**
 * 层次化演示类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2010-10-31
 */
public class LayerDemo {
}

/**
 * 商业策略层
 * <p>
 * 这样的设计导致PolicyLayer依赖于MechanismLayer
 * 而MechanismLayer依赖于UtilityLayer，进而PolicyLayer也依赖于UtilityLayer
 * 导致PolicyLayer对于其下一直到UtilityLayer的改动都是敏感的
 */
class PolicyLayer {

	// 依赖于低层的 MechanismLayer
	private MechanismLayer mechanismLayer;

	public MechanismLayer getMechanismLayer() {
		return mechanismLayer;
	}

	public void setMechanismLayer(MechanismLayer mechanismLayer) {
		this.mechanismLayer = mechanismLayer;
	}
}

/**
 * 机制层
 */
class MechanismLayer {

	// 依赖于低层的 UtilityLayer
	private UtilityLayer utilityLayer;

	public UtilityLayer getUtilityLayer() {
		return utilityLayer;
	}

	public void setUtilityLayer(UtilityLayer utilityLayer) {
		this.utilityLayer = utilityLayer;
	}
}

/**
 * 工具层
 */
class UtilityLayer {

	// some codes
}
