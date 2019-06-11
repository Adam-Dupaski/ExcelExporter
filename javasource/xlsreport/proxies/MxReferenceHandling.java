// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package xlsreport.proxies;

public class MxReferenceHandling
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject mxReferenceHandlingMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "XLSReport.MxReferenceHandling";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Reference("Reference"),
		JoinType("JoinType"),
		MxReferenceHandling_MxSheet("XLSReport.MxReferenceHandling_MxSheet");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public MxReferenceHandling(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "XLSReport.MxReferenceHandling"));
	}

	protected MxReferenceHandling(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mxReferenceHandlingMendixObject)
	{
		if (mxReferenceHandlingMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("XLSReport.MxReferenceHandling", mxReferenceHandlingMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a XLSReport.MxReferenceHandling");

		this.mxReferenceHandlingMendixObject = mxReferenceHandlingMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'MxReferenceHandling.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static xlsreport.proxies.MxReferenceHandling initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return xlsreport.proxies.MxReferenceHandling.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static xlsreport.proxies.MxReferenceHandling initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new xlsreport.proxies.MxReferenceHandling(context, mendixObject);
	}

	public static xlsreport.proxies.MxReferenceHandling load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return xlsreport.proxies.MxReferenceHandling.initialize(context, mendixObject);
	}

	public static java.util.List<xlsreport.proxies.MxReferenceHandling> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<xlsreport.proxies.MxReferenceHandling> result = new java.util.ArrayList<xlsreport.proxies.MxReferenceHandling>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//XLSReport.MxReferenceHandling" + xpathConstraint))
			result.add(xlsreport.proxies.MxReferenceHandling.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Reference
	 */
	public final java.lang.String getReference()
	{
		return getReference(getContext());
	}

	/**
	 * @param context
	 * @return value of Reference
	 */
	public final java.lang.String getReference(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Reference.toString());
	}

	/**
	 * Set value of Reference
	 * @param reference
	 */
	public final void setReference(java.lang.String reference)
	{
		setReference(getContext(), reference);
	}

	/**
	 * Set value of Reference
	 * @param context
	 * @param reference
	 */
	public final void setReference(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String reference)
	{
		getMendixObject().setValue(context, MemberNames.Reference.toString(), reference);
	}

	/**
	 * Set value of JoinType
	 * @param jointype
	 */
	public final xlsreport.proxies.JOINType getJoinType()
	{
		return getJoinType(getContext());
	}

	/**
	 * @param context
	 * @return value of JoinType
	 */
	public final xlsreport.proxies.JOINType getJoinType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.JoinType.toString());
		if (obj == null)
			return null;

		return xlsreport.proxies.JOINType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of JoinType
	 * @param jointype
	 */
	public final void setJoinType(xlsreport.proxies.JOINType jointype)
	{
		setJoinType(getContext(), jointype);
	}

	/**
	 * Set value of JoinType
	 * @param context
	 * @param jointype
	 */
	public final void setJoinType(com.mendix.systemwideinterfaces.core.IContext context, xlsreport.proxies.JOINType jointype)
	{
		if (jointype != null)
			getMendixObject().setValue(context, MemberNames.JoinType.toString(), jointype.toString());
		else
			getMendixObject().setValue(context, MemberNames.JoinType.toString(), null);
	}

	/**
	 * @return value of MxReferenceHandling_MxSheet
	 */
	public final xlsreport.proxies.MxSheet getMxReferenceHandling_MxSheet() throws com.mendix.core.CoreException
	{
		return getMxReferenceHandling_MxSheet(getContext());
	}

	/**
	 * @param context
	 * @return value of MxReferenceHandling_MxSheet
	 */
	public final xlsreport.proxies.MxSheet getMxReferenceHandling_MxSheet(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		xlsreport.proxies.MxSheet result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MxReferenceHandling_MxSheet.toString());
		if (identifier != null)
			result = xlsreport.proxies.MxSheet.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MxReferenceHandling_MxSheet
	 * @param mxreferencehandling_mxsheet
	 */
	public final void setMxReferenceHandling_MxSheet(xlsreport.proxies.MxSheet mxreferencehandling_mxsheet)
	{
		setMxReferenceHandling_MxSheet(getContext(), mxreferencehandling_mxsheet);
	}

	/**
	 * Set value of MxReferenceHandling_MxSheet
	 * @param context
	 * @param mxreferencehandling_mxsheet
	 */
	public final void setMxReferenceHandling_MxSheet(com.mendix.systemwideinterfaces.core.IContext context, xlsreport.proxies.MxSheet mxreferencehandling_mxsheet)
	{
		if (mxreferencehandling_mxsheet == null)
			getMendixObject().setValue(context, MemberNames.MxReferenceHandling_MxSheet.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MxReferenceHandling_MxSheet.toString(), mxreferencehandling_mxsheet.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return mxReferenceHandlingMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final xlsreport.proxies.MxReferenceHandling that = (xlsreport.proxies.MxReferenceHandling) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "XLSReport.MxReferenceHandling";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
