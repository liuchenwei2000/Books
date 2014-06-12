/**
 * 
 */
package principle.DIP.v2;

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
 * 通过倒置依赖关系，使得高层和低层都依赖于抽象，从而解除了各层间的依赖关系。
 */
class PolicyLayer {

	private PolicyLayerService policyLayerService;

	public PolicyLayerService getPolicyLayerService() {
		return policyLayerService;
	}

	public void setPolicyLayerService(PolicyLayerService policyLayerService) {
		this.policyLayerService = policyLayerService;
	}
}

/**
 * 商业策略层所需要的低层服务接口
 */
interface PolicyLayerService {
}

/**
 * 机制层
 */
class MechanismLayer implements PolicyLayerService {

	private MechanismLayerService mechanismLayerService;

	public MechanismLayerService getMechanismLayerService() {
		return mechanismLayerService;
	}

	public void setMechanismLayerService(
			MechanismLayerService mechanismLayerService) {
		this.mechanismLayerService = mechanismLayerService;
	}
}

/**
 * 机制层所需要的低层服务接口
 */
interface MechanismLayerService {
}

/**
 * 工具层
 */
class UtilityLayer implements MechanismLayerService {

	// some codes
}