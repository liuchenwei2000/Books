/**
 * 
 */
package principle.DIP.v2;

/**
 * ��λ���ʾ��
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2010-10-31
 */
public class LayerDemo {
}

/**
 * ��ҵ���Բ�
 * <p>
 * ͨ������������ϵ��ʹ�ø߲�͵Ͳ㶼�����ڳ��󣬴Ӷ�����˸�����������ϵ��
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
 * ��ҵ���Բ�����Ҫ�ĵͲ����ӿ�
 */
interface PolicyLayerService {
}

/**
 * ���Ʋ�
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
 * ���Ʋ�����Ҫ�ĵͲ����ӿ�
 */
interface MechanismLayerService {
}

/**
 * ���߲�
 */
class UtilityLayer implements MechanismLayerService {

	// some codes
}